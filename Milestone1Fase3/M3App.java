import java.util.Scanner;

public class M3App {
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vehiculo;
		int nCoches = 0, nMotos = 0, nCochesMax = 50, nMotosMax = 50;
		Coche [] nuevo = new Coche[nCochesMax];
		Bike [] nueva = new Bike[nMotosMax];
		
		
		System.out.println("Tienes una moto o un coche");
		vehiculo = teclado.nextLine().toLowerCase();
		
		if(vehiculo.equalsIgnoreCase("coche")) {
			coche(nuevo, nCoches, nCochesMax);

			System.out.println(nuevo[0].toString());
		}if(vehiculo.equalsIgnoreCase("moto")) {
			moto(nueva, nMotos, nMotosMax);

			System.out.println(nueva[0].toString());
		}
		
	}
	public static void coche (Coche [] nuevo, int nCoches, int nCochesMax) {
		String matricula, marca, color;
		
		//Preguntamos datos coche
		System.out.println("Matricula?");
		matricula = teclado.nextLine();
		System.out.println("Marca");
		marca = teclado.nextLine();
		System.out.println("Color?");
		color = teclado.nextLine();
		nuevo[nCoches] = new Coche (matricula, marca, color);
		
		//Preguntamos datos ruedas
		System.out.println("Marca rueda delantera?");
		marca = teclado.nextLine();
		System.out.println("Diametro rueda delantera?");
		double diametro = Double.parseDouble(teclado.nextLine());
		nuevo[nCoches].añadirRuedaDelantera(marca, diametro);
		nuevo[nCoches].añadirRuedaDelantera(marca, diametro);
		
		//traseras
		System.out.println("Marca rueda trasera?");
		marca = teclado.nextLine();
		System.out.println("Diametro rueda trasera?");
		diametro = Double.parseDouble(teclado.nextLine());
		diametro = Double.parseDouble(teclado.nextLine());
		nuevo[nCoches].añadirRuedaTrasera(marca, diametro);
		nuevo[nCoches].añadirRuedaTrasera(marca, diametro);
		
		nCoches++;
		if(nCoches>=nCochesMax) {
			nCochesMax=nCochesMax*2;
		}
	}
	public static void moto (Bike [] nueva, int nMotos, int nMotosMax) {
	String matricula, marca, color;
	
		//Preguntamos datos coche
		System.out.println("Matricula?");
		matricula = teclado.nextLine();
		System.out.println("Marca");
		marca = teclado.nextLine();
		System.out.println("Color?");
		color = teclado.nextLine();
		nueva[nMotos]= new Bike (matricula, marca, color);
		
		//Preguntamos datos ruedas
		System.out.println("Marca rueda delantera?");
		marca = teclado.nextLine();
		System.out.println("Diametro rueda delantera?");
		double diametro = Double.parseDouble(teclado.nextLine());
		nueva[nMotos].añadirRuedaDelantera(marca, diametro);
		
		//Traseras
		System.out.println("Marca rueda trasera?");
		marca = teclado.nextLine();
		System.out.println("Diametro rueda trasera?");
		diametro = Double.parseDouble(teclado.nextLine());
		nueva[nMotos].añadirRuedaTrasera(marca, diametro);
		
		nMotos++;
		if(nMotos>=nMotosMax) {
			nMotosMax=nMotosMax*2;
		}
	}

}
