package top.mylogos.entity;

/**
 * @author Loïco
 *
 */
public class Facture {
	private int id;
	private int numeroFacture;
	// DATE création facture
	private Commande commande;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(int numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Facture(int id, int numeroFacture, Commande commande) {
		this.id = id;
		this.numeroFacture = numeroFacture;
		this.commande = commande;
	}

	public Facture() {
	}


}
