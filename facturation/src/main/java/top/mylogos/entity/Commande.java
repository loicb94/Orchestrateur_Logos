package top.mylogos.entity;

import java.util.List;

public class Commande {
	private int id;
	private List<LigneCommande> ligneCommande;
	private String adresse;



	public List<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Commande(List<LigneCommande> ligneCommande, String adresse) {

		this.ligneCommande = ligneCommande;
		this.adresse = adresse;
	}

	public Commande() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
