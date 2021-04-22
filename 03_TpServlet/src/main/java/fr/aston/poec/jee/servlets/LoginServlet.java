package fr.aston.poec.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.aston.poec.jee.models.Player;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String login=request.getParameter("login");
			String mdp=request.getParameter("mdp");
			
			if(login.equalsIgnoreCase("stagiaire") && mdp.equals("Aston123")) {
				
				Player player = new Player(login,mdp);
				HttpSession session = request.getSession();
				session.setAttribute("player", player);
				response.sendRedirect("game");
				// il est conduit sur la page de conversion
			}else {
				//il est reconduit sur la page login
				String message="Utilisateur inconnu. Identifiant ou mot de passe incorrect";
				request.setAttribute("msgError", message);
				response.sendRedirect("login");
		//doGet(request, response);
			}
	}

}
