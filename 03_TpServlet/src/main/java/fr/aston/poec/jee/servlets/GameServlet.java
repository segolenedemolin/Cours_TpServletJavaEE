package fr.aston.poec.jee.servlets;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 


@WebServlet("/game")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private int nbJeux=1+(int)(Math.random()*10);
private int compteur=1;
private String message1;
private ArrayList<Integer> historique=new ArrayList<>();

public int getNbJeux() {
	return this.nbJeux;
}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("tentatives", compteur);
		request.getRequestDispatcher("/WEB-INF/pages/game.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("nombre a trouver -->"+nbJeux);
//		System.out.println("compteur -->"+compteur);
		String message2="";
		String nombre=request.getParameter("nombre");
		HttpSession session=request.getSession();
		try {	
		int nombreInt = Integer.parseInt(nombre);
			if(nombreInt<nbJeux) {
				compteur++;
				message1="trop petit";
				historique.add(nombreInt);
				message2="Non ce n'est pas le bon chiffre, retente! ";
			}else if(nombreInt>nbJeux) {
				compteur ++;
				message1="trop grand";
				historique.add(nombreInt);
				message2="Non ce n'est pas le bon chiffre, retente! ";
			}else {
				message1="Félicitations tu as trouvé le bon nombre en "+compteur+"coups";
			}
//			System.out.println("compteur -->"+compteur);
			request.setAttribute("msg", message1);
			request.setAttribute("tentatives", compteur);
			request.setAttribute("msg2", message2);
			setHistorique(historique);
			if(historique.size()==3) {
				// Pour pouvoir les récupérer dans la page historique, on les enregistre dans la session
			session.setAttribute("nb1", historique.get(0));
			session.setAttribute("nb2", historique.get(1));
			session.setAttribute("nb3", historique.get(2));
			session.setAttribute("nombre", nbJeux);}
		}
		catch (NumberFormatException e){
			String msgError = "Erreur de saisie... on demande un chiffre entier!";
			request.setAttribute("error", msgError);
		}
		
		finally {	
			doGet(request, response);}
			//System.out.println(historique);
		
	}
	
	protected void doStart(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("login");
	}
	
	public ArrayList<Integer> getHistorique() {
		return historique;
	}

	public void setHistorique(ArrayList<Integer> historique) {
		this.historique = historique;
	}
}
