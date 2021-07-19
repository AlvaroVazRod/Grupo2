package main;

public class TitularVehiculo extends Persona {
	private boolean seguro;
	private boolean garage;

	public TitularVehiculo(String nom, String cognom, String dataDeNaixement, boolean seguro, boolean garage,
			Llicencia licencia) {
		super(nom, cognom, dataDeNaixement, licencia);
		this.seguro = seguro;
		this.garage = garage;
	}

	@Override
	public String toString() {
		return super.toString() + " [seguro=" + seguro + ", garage=" + garage + "]";
	}
	
}
