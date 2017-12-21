package top.mylogos.entity;

import java.util.List;

public class Produit {
	private int id;
	private String nom;
	private String description;
	private List<ImagesProduit> listeImagesProduit;
	private Langue langue;
	private Categorie categorie;
	private double prix;
	private int quantite;
	private Double prixPremium;
	private Integer premium;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Produit(int id, String nom, double prix, int quantite) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Produit() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ImagesProduit> getListeImagesProduit() {
		return listeImagesProduit;
	}

	public void setListeImagesProduit(List<ImagesProduit> listeImagesProduit) {
		this.listeImagesProduit = listeImagesProduit;
	}

	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Double getPrixPremium() {
		return prixPremium;
	}

	public void setPrixPremium(Double prixPremium) {
		this.prixPremium = prixPremium;
	}

	public Integer getPremium() {
		return premium;
	}

	public void setPremium(Integer premium) {
		this.premium = premium;
	}

}
