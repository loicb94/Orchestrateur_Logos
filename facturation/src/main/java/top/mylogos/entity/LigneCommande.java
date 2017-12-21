package top.mylogos.entity;

public class LigneCommande {
	private int id;
	private Produit produit;
	private int quantite;

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



	public LigneCommande(int id, Produit produit, int quantite) {
		this.id = id;
		this.produit = produit;
		this.quantite = quantite;
	}

	public LigneCommande() {
	}

}
