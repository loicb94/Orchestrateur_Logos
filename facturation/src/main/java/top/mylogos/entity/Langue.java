package top.mylogos.entity;

public class Langue {
	private Integer id;
	private String libelle;
	private String codeIso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCodeIso() {
		return codeIso;
	}

	public void setCodeIso(String codeIso) {
		this.codeIso = codeIso;
	}

	public Langue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Langue [id=" + id + ", libelle=" + libelle + ", codeIso=" + codeIso + "]";
	}

}
