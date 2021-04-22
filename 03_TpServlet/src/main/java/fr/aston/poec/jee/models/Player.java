package fr.aston.poec.jee.models;

public class Player {

	private String login;
	private String mdp;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Player(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
	}
	
}
