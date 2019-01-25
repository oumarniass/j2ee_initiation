import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        String password = request.getParameter("password");
        String username = request.getParameter("username");
        String adresse = request.getParameter("adresse");
        String contact = request.getParameter("contact");

        if(prenom.isEmpty() || nom.isEmpty() || password.isEmpty() || username.isEmpty() || adresse.isEmpty() || contact.isEmpty() )
        {
            this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
        }
        else
        {
            this.getServletContext().getRequestDispatcher("/WEB-INF/Control.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
    }
}
