package main;

public class Persona {
	protected String nom;
	protected String cognom;
	protected String dataDeNaixement;
	protected Llicencia licenciaPersona;

	public Persona(String nom, String cognom, String dataDeNaixement,Llicencia licenciaPersoan) {
		this.nom = nom;
		this.cognom = cognom;
		this.dataDeNaixement = dataDeNaixement;
		this.licenciaPersona=licenciaPersoan;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getDataDeNaixement() {
		return dataDeNaixement;
	}

	public void setDataDeNaixement(String dataDeNaixement) {
		this.dataDeNaixement = dataDeNaixement;
	}

	public Llicencia getLicenciaPersona() {
		return licenciaPersona;
	}

	public void setLicenciaPersona(Llicencia licenciaPersona) {
		this.licenciaPersona = licenciaPersona;
	}


	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", dataDeNaixement=" + dataDeNaixement
				+ ", licenciaPersona=" + licenciaPersona + "]";
	}



}
