package top.mylogos.entity;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String email;


	public Utilisateur() {
	}

	public Utilisateur(int id, String nom, String prenom, String email) {

		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
