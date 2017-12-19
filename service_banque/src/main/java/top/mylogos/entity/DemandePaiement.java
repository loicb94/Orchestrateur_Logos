package top.mylogos.entity;

public class DemandePaiement {

	private String cleClient;

	private double montant;

	private String numeroCarte;
	private String cvv;
	private int moisExpiration;
	private int anneeExpiration;
	private String nomPorteur;

	public String getCleClient() {
		return cleClient;
	}

	public void setCleClient(String cleClient) {
		this.cleClient = cleClient;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public int getMoisExpiration() {
		return moisExpiration;
	}

	public void setMoisExpiration(int moisExpiration) {
		this.moisExpiration = moisExpiration;
	}

	public int getAnneeExpiration() {
		return anneeExpiration;
	}

	public void setAnneeExpiration(int anneeExpiration) {
		this.anneeExpiration = anneeExpiration;
	}

	public String getNomPorteur() {
		return nomPorteur;
	}

	public void setNomPorteur(String nomPorteur) {
		this.nomPorteur = nomPorteur;
	}

}
