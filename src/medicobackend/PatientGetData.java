package medicobackend;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import medicobackend.exception.InvalidURLException;

//WARNING : 
//THIS SERVLET ASSUMES THAT THE DATABASE PROVIDED IN THE ENV VARIABLE HAS BEEN SETUP
//RUN THE Medico.java AND FOLLOW THROUGH TO SETUP THE DB FIRST

@WebServlet("/PatientGetDataServlet")
public class PatientGetData extends HttpServlet {
    
    final private List<String> ERROR_LIST = new ArrayList<>();
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //retrive data
        final String name,uid;
        boolean valid;
        uid = req.getParameter("uid").trim();
        name = req.getParameter("name").trim();
        
        Doctor doc = getData(uid,name);
        valid = doc != null;
        Map<String,Object> data = new LinkedHashMap<>();
        data.put("valid", valid);
        data.put("errors", ERROR_LIST);
        data.put("data", doc);
        //response
        String json = new Gson().toJson(data);
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        PrintWriter pw = res.getWriter();
        pw.write(json);
        pw.flush();
        pw.close();
    }
    
    public Doctor getData(String uid, String passwd) {
        //validate data
        //TODO : licNo & dob Validator
        Validator validator = new Validator(Validator.DEFAULT_MIN, Validator.DEFAULT_MAX);
        boolean valid = false;
        String key = "EMAIL";
        if(validator.validateEmail(uid)) {
            valid = true;
        }
        else if(validator.validatePhone(uid)) {
            valid = true;
            key = "PHONE";
        }
        if(!valid) {
            ERROR_LIST.add("Invalid UID passed!");
            return null;
        }
        final Doctor doc = new Doctor();
        final String dbpath,dbuser,dbpasswd;
        dbpath = System.getenv("MEDICO_DB_PATH");
        dbuser = System.getenv("MEDICO_DB_USER");
        dbpasswd = System.getenv("MEDICO_DB_PASSWD");
        try {
            int i = 0;
            DatabaseManager db = DatabaseManager.getInstance(dbpath, dbuser, dbpasswd);
            db.openConnection();
            //get the result set
            ResultSet set = db.executeQuery("SELECT FNAME,MNAME,LNAME,PHONE,EMAIL,DOB,LIC_NO,CREATED_AT FROM " + MedicoDBContract.DOC_TABLE + " WHERE " + key + " = " + uid + ";");
            while(set.next()) {
                doc.setFName(set.getString("FNAME"));
                doc.setMName(set.getString("MNAME"));
                doc.setLName(set.getString("LNAME"));
                doc.setPhone(set.getString("PHONE"));
                doc.setEmail(set.getString("EMAIL"));
                doc.setDOB(set.getString("DOB"));
                doc.setLicNo(set.getString("LIC_NO"));
                doc.setCreatedAt(set.getDate("CREATED_AT").getTime());
                i++;
            }
            if(i > 1) {
                ERROR_LIST.add("UNSUAL ERROR : More than 1 matches found! Returned none due to security.");
                return null;
            }
        } catch (InvalidURLException | SQLException ex) {
            ERROR_LIST.add(ex.toString());
        }
        return doc;
    }
    
}
