package main;

public class TipoLicenciaIncorrecto extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TipoLicenciaIncorrecto (String tipoLicencia) {
		super("El tipo de Licencia "+tipoLicencia+" no esta dentro de la base de datos.");
	}
}
