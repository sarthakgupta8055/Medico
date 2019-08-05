package medicobackend;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import medicobackend.exception.InvalidURLException;

//WARNING : 
//THIS SERVLET ASSUMES THAT THE DATABASE PROVIDED IN THE ENV VARIABLE HAS BEEN SETUP
//RUN THE Medico.java AND FOLLOW THROUGH TO SETUP THE DB FIRST

@WebServlet("/DocSignUp")
public class DocSignUp extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //retrive data
        String fname,mname,lname,phone,email,passwd,licNo,dob,username;
        fname = req.getParameter("fname").trim();
        mname = req.getParameter("mname").trim();
        lname = req.getParameter("lname").trim();
        phone = req.getParameter("phone").trim();
        email = req.getParameter("email").trim();
        //username = req.getParameter("username").trim();
        passwd = req.getParameter("passwd").trim();
        licNo = req.getParameter("lic_no").trim();
        //dob = req.getParameter("dob").trim(); //yyyy-mm-dd
        
        List<String> errorList = signUp(fname,mname,lname,phone,email,passwd,licNo);
        
        //response
        String json = new Gson().toJson(errorList);
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        PrintWriter pw = res.getWriter();
        pw.write(json);
        pw.flush();
        pw.close();
    }
    
    public List<String> signUp(String fname, String mname, String lname, String phone, String email, String passwd, String licNo) {
        final List<String> errorList = new ArrayList<>();
        boolean valid = true;
        //validate data
        //TODO : licNo & dob Validator
        Validator validator = new Validator(Validator.DEFAULT_MIN, Validator.DEFAULT_MAX);
        if(!validator.validateName(fname)) {
            valid = false;
            errorList.add("fname");
        }
        if(!mname.isEmpty() && !validator.validateName(mname)) {
            valid = false;
            errorList.add("mname");
        }
        if(!lname.isEmpty() && !validator.validateName(lname)) {
            valid = false;
            errorList.add("lname");
        }
        if(!validator.validatePhone(phone)) {
            valid = false;
            errorList.add("phone");
        }
        if(!validator.validateEmail(email)) {
            valid = false;
            errorList.add("email");
        }
        /*
        if(!validator.validateUsername(username)) {
            valid = false;
            errorList.add("username");
        }*/
        if(!validator.validatePasswd(passwd)) {
            valid = false;
            errorList.add("passwd");
        }
        if(valid) {
            //store in db
            //get db env vars
            final String dbpath,dbuser,dbpasswd;
            dbpath = System.getenv("MEDICO_DB_PATH");
            dbuser = System.getenv("MEDICO_DB_USER");
            dbpasswd = System.getenv("MEDICO_DB_PASSWD");
            try {
                final DatabaseManager db = DatabaseManager.getInstance(dbpath, dbuser, dbpasswd);
                db.openConnection();
                //insert a new doc record
                //TODO : DRY RUN
                db.executeUpdate("INSERT INTO " + MedicoDBContract.DOC_TABLE + "(FNAME,MNAME,LNAME,PHONE,EMAIL,PASSWD,LIC_NO,CREATED_AT) VALUES('" + fname + "','" + mname + "','" + lname + "','" + phone + "','" + email + "','" + passwd + "','" + licNo + "',now());");
                db.closeConnection();
                errorList.add("RESULT_OK");
                //done!
            }
            catch(InvalidURLException | SQLException ex) {
                errorList.add(ex.toString());
            }
        }
        return errorList;
    }
    
}
