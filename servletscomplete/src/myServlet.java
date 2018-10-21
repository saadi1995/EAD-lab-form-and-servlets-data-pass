import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;

@WebServlet(name = "myServlet")
public class myServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        response.setContentType("text/html");

        PrintWriter out = response.getWriter();




        String Name = request.getParameter("name");

        String Name2 = request.getParameter("name2");
        String pass = request.getParameter("pass");
        String gender = request.getParameter("gender");
        boolean agree = request.getParameter("agree") != null;
        String[] roles = request.getParameterValues("role");
        String countryCode = request.getParameter("countryCode");
        String[] animalIds = request.getParameterValues("animalId");
        String message = request.getParameter("message");


        out.println("Name "+  Name);

        out.println("<br>");


        out.println(" Last Name "+Name2);

       out.println("<br>");


        out.println("typed password is "+pass);
        out.println("<br>");


        out.println("Gender is "+gender);
        out.println("<br>");

        out.println("Approve "+agree);
        out.println("<br>");


        for(String s : roles)
        {
            out.println(s);
        }

        out.println("<br>");

        out.println("The country code is " + countryCode);


        out.println("<br>");


        for(String e : animalIds)
        {
            out.println("Animal selection is "+e);
        }

        out.println("<br>");

        out.println("Your message is "+message);
        out.println("<br>");

        out.println("It is working");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
