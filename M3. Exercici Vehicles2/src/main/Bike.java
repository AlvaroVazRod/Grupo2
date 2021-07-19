package main;

import java.util.Arrays;

public class Bike extends Vehicle{
	private Rueda[] ruedasTraseras;
	private Rueda[] ruedasDelanteras;
	protected int numRuedas = 0;

	public Bike (String matricula, String marca, String color,Rueda ruedasTraseras,Rueda ruedasDelanteras, Persona titular) {
		super(matricula,marca,color,ruedasTraseras,ruedasDelanteras,titular);
		this.ruedasDelanteras= new Rueda[1];
		this.ruedasTraseras= new Rueda[1];
		comprovarDiametro(ruedasTraseras.getDiametro());
		comprovarDiametro(ruedasDelanteras.getDiametro());
		for (int i = 0; i < this.ruedasDelanteras.length; i++) {
			this.ruedasDelanteras[i]=ruedasDelanteras;
			this.ruedasTraseras[i]=ruedasTraseras;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+ " [ruedasTraseras=" + Arrays.toString(ruedasTraseras) + ", ruedasDelanteras="
				+ Arrays.toString(ruedasDelanteras) + ", numRuedas=" + numRuedas + "]";
	}


}
