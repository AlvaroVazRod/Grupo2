
public class Rueda {
	private String marca;
	private double diametro;

	public Rueda(String marca, double diametro) {
		this.marca = marca;
		this.diametro = diametro;
	}

	// toString
	@Override
	public String toString() {
		return "marca=" + marca + ", diametro=" + diametro;
	}

	// Gets y sets
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

}
