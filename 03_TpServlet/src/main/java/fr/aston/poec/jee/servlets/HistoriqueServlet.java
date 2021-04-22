package fr.aston.poec.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/historique")
public class HistoriqueServlet extends GameServlet{

	private static final long serialVersionUID = -5165610602513614378L;

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	request.getRequestDispatcher("/WEB-INF/pages/historique.jsp").forward(request, response);
}
}
