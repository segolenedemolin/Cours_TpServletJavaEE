package fr.aston.poec.jee.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.aston.poec.jee.models.Player;


@WebFilter("/game")
public class MonFiltre implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			
		//Pour récupérer la session avec le joueur
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			
			Player player = (Player) req.getSession().getAttribute("player");
			
			//On verifie l'existence du joueur
			if(player == null) {
				res.sendRedirect("login");
			}else {
				chain.doFilter(request, response);
			}		
		}
	}

