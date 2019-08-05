package medicobackend;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TempServlet")
public class TempServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession();
        int flag = Integer.parseInt(req.getParameter("req"));
        res.setContentType("text/plain");
        res.setCharacterEncoding("UTF-8");
        PrintWriter pw = res.getWriter();
        if(flag == 1)
            session.setAttribute("loggedIn", false);
        else if(flag == 0)
            session.setAttribute("loggedIn", true);
        pw.print(session.getAttribute("loggedIn"));
        pw.flush();
        pw.close();
    }
    
}
