package main;

import java.util.Scanner;

public class M3App {
	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroCoches=0, numeroMotos=0, numeroCochesMax=50,numeroMotosMax=50;
		String vehiculo = "";
		Coche[] nuevoCoche = new Coche[numeroCochesMax];
		Bike[] nuevaMoto = new Bike[numeroMotosMax];
		System.out.println("Tienes moto o coche? ");
		vehiculo = teclat.nextLine().toLowerCase();
		if(vehiculo.equalsIgnoreCase("coche")) {
			coche(nuevoCoche,numeroCoches,numeroCochesMax);
		}
		if (vehiculo.equalsIgnoreCase("moto")) {
			moto(nuevaMoto,numeroMotos,numeroMotosMax);
		}
		System.out.println(nuevaMoto[0].toString());
		

	}
	public static void coche(Coche[] nuevoCoche, int numeroCoches,int numeroCochesMax) {
		System.out.println("Que matricula tiene? ");
		String matricula=teclat.nextLine();
		System.out.println("Que marca tiene? ");
		String marca=teclat.nextLine();
		System.out.println("Que color tiene? ");
		String color=teclat.nextLine();
		nuevoCoche[numeroCoches] = new Coche(matricula,marca,color);
		System.out.println("Que marca tiene las rueda delantera? ");
		marca=teclat.nextLine();
		System.out.println("Que diametro tiene las rueda delantera");
		double diametro = Double.parseDouble(teclat.nextLine());
		nuevoCoche[numeroCoches].AñadirRuedaDelantera(marca, diametro);
		nuevoCoche[numeroCoches].AñadirRuedaDelantera(marca, diametro);
		System.out.println("Que marca tiene las rueda traseras? ");
		marca=teclat.nextLine();
		System.out.println("Que diametro tiene las rueda traseras");
		diametro = Double.parseDouble(teclat.nextLine());
		nuevoCoche[numeroCoches].AñadirRuedaTrasera(marca, diametro);
		nuevoCoche[numeroCoches].AñadirRuedaTrasera(marca, diametro);
		numeroCoches++;
		if (numeroCoches>=numeroCochesMax) {
			numeroCochesMax=numeroCochesMax*2;
		}
	}
	public static void moto(Bike[] nuevaMoto, int numeroMotos,int numeroMotosMax) {
		System.out.println("Que matricula tiene? ");
		String matricula=teclat.nextLine();
		System.out.println("Que marca tiene? ");
		String marca=teclat.nextLine();
		System.out.println("Que color tiene? ");
		String color=teclat.nextLine();
		nuevaMoto[numeroMotos] = new Bike(matricula,marca,color);
		System.out.println("Que marca tiene las rueda delantera? ");
		marca=teclat.nextLine();
		System.out.println("Que diametro tiene las rueda delantera");
		double diametro = Double.parseDouble(teclat.nextLine());
		nuevaMoto[numeroMotos].AñadirRuedaDelantera(marca, diametro);
		System.out.println("Que marca tiene las rueda traseras? ");
		marca=teclat.nextLine();
		System.out.println("Que diametro tiene las rueda traseras");
		diametro = Double.parseDouble(teclat.nextLine());
		nuevaMoto[numeroMotos].AñadirRuedaTrasera(marca, diametro);
		numeroMotos++;
		if (numeroMotos>=numeroMotosMax) {
			numeroMotosMax=numeroMotosMax*2;
		}
	}

}
