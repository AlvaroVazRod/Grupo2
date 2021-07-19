package main;

public class Llicencia {
	private int id;
	private String tipusLlicencia;
	private String nomComplet;
	private String caducitat;

	public Llicencia(int id, String tipoLlicencia, String nomComplet, String caducitat) throws TipoLicenciaIncorrecto {
		boolean tipoCorrecto = comprobarTipo(tipoLlicencia);
		if (tipoCorrecto == true) {
			this.id = id;
			this.tipusLlicencia = tipoLlicencia;
			this.nomComplet = nomComplet;
			this.caducitat = caducitat;
		}
	}

	public boolean comprobarTipo(String tipoLicencia) throws TipoLicenciaIncorrecto {
		boolean tipoCorrecto = false;
		;
		String[] tiposLicencias = new String[3];
		tiposLicencias[0] = "coche";
		tiposLicencias[1] = "moto";
		tiposLicencias[2] = "camion";
		for (int i = 0; i < tiposLicencias.length; i++) {
			if (tipoLicencia.equalsIgnoreCase(tiposLicencias[i])) {
				return tipoCorrecto = true;
			} else {
				tipoCorrecto = false;
				
			}
		}
		if (tipoCorrecto==false) {
			throw new TipoLicenciaIncorrecto(tipoLicencia);
		}
		return tipoCorrecto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipusLlicencia() {
		return tipusLlicencia;
	}

	public void setTipusLlicencia(String tipusLlicencia) {
		this.tipusLlicencia = tipusLlicencia;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	@Override
	public String toString() {
		return "Llicencia [id=" + id + ", tipusLlicencia=" + tipusLlicencia + ", nomComplet=" + nomComplet
				+ ", caducitat=" + caducitat + "]";
	}

	public String getCaducitat() {
		return caducitat;
	}

	public void setCaducitat(String caducitat) {
		this.caducitat = caducitat;
	}

}
