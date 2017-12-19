package top.mylogos.entity;

public class LigneCommande {
	private int id;
	private Produit produit;
	private int quantite;
	private Commande commande;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public LigneCommande(int id, Produit produit, int quantite, Commande commande) {
		this.id = id;
		this.produit = produit;
		this.quantite = quantite;
		this.commande = commande;
	}

	public LigneCommande() {
	}

}
