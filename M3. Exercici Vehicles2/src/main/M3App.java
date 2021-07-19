package main;

import java.util.Scanner;

public class M3App {
	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) throws TipoLicenciaIncorrecto {
		int numeroMaxVehicle = 50, numeroVehicle = 0, numeroMaxPersonas = 50, numeroPersonas = 0;
		Vehicle[] nuevoVehicle = new Vehicle[50];
		Persona[] nuevaPersona = new Persona[50];
		crearTitular(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle);

	}

	public static void menu2(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle)
			throws TipoLicenciaIncorrecto {
		System.out.println("Buenos dias Quiere añadir un vehiculo o una persona? ");
		String eleccion;
		eleccion = teclat.nextLine().toLowerCase();
		switch (eleccion) {
		case "vehiculo":
			menuVehiculo(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle);
			break;
		case "persona":
			menuPersona(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + eleccion);
		}
	}

	public static void menuVehiculo(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle) throws TipoLicenciaIncorrecto {
		String vehiculo;
		System.out.println("Buenos dias");
		System.out.println("Que tipo de vehiculo tienes? ");
		vehiculo = teclat.nextLine().toLowerCase();
		switch (vehiculo) {
		case "coche":
			if (nuevaPersona[numeroPersonas].licenciaPersona.getTipusLlicencia().equalsIgnoreCase(vehiculo)) {
				coche(nuevoVehicle,nuevaPersona,numeroPersonas, numeroVehicle);
			} else {
				throw new TipoLicenciaIncorrecto(vehiculo);
			}

			break;
		case "moto":
			if (nuevaPersona[numeroPersonas].licenciaPersona.getTipusLlicencia().equalsIgnoreCase(vehiculo)) {
				moto(nuevoVehicle,nuevaPersona,numeroPersonas, numeroVehicle);
			} else {
				throw new TipoLicenciaIncorrecto(vehiculo);
			}
			break;
		case "camion":
			if (nuevaPersona[numeroPersonas].licenciaPersona.getTipusLlicencia().equalsIgnoreCase(vehiculo)) {
				camion(nuevoVehicle,nuevaPersona,numeroPersonas, numeroVehicle);
			} else {
				throw new TipoLicenciaIncorrecto(vehiculo);
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + vehiculo);
		}
	}

	public static void menuPersona(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle) throws TipoLicenciaIncorrecto {
		String persona;
		System.out.println("Buenos dias");
		System.out.println("Que quiere crear un titular o un conductor? ");
		persona = teclat.nextLine().toLowerCase();
		switch (persona) {
		case "titular":
			crearTitular(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle);
			break;
		case "conductor":
			crearCond(nuevoVehicle,nuevaPersona,numeroPersonas, numeroVehicle);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + persona);
		}
	}

	public static void crearTitular(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle) throws TipoLicenciaIncorrecto {
		System.out.println("Cual es su nombre? ");
		String nombre = teclat.nextLine();
		System.out.println("Apellido? ");
		String apellido = teclat.nextLine();
		System.out.println("data nacimiento? ");
		String fechaNa = teclat.nextLine();
		System.out.println("Que id tiene tu licencia? ");
		int id = Integer.parseInt(teclat.nextLine());
		System.out.println("Que tipo de licencia? ");
		String tipoLicencia = teclat.nextLine();
		System.out.println("Fecha caducidad? ");
		String nombreCompleto = nombre + " " + apellido;
		String fechaCa = teclat.nextLine();
		System.out.println("Tienes seguro? ");
		String seguro = teclat.nextLine().toLowerCase();
		boolean seguro2;
		if (seguro.equalsIgnoreCase("si")) {
			seguro2 = true;
		} else {
			seguro2 = false;
		}
		System.out.println("Tienes garage Propio ?");
		String garage = teclat.nextLine().toLowerCase();
		boolean garage2;
		if (garage.equalsIgnoreCase("si")) {
			garage2 = true;
		} else {
			garage2 = false;
		}
		Llicencia licencia = new Llicencia(id, tipoLicencia, nombreCompleto, fechaCa);
		nuevaPersona[numeroPersonas] = new TitularVehiculo(nombre, apellido, fechaNa, seguro2, garage2, licencia);


		menu(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle);
	}

	public static void crearCond(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle)
			throws TipoLicenciaIncorrecto {
		System.out.println("Cual es su nombre? ");
		String nombre = teclat.nextLine();
		System.out.println("Apellido? ");
		String apellido = teclat.nextLine();
		System.out.println("data nacimiento? ");
		String fechaNa = teclat.nextLine();
		System.out.println("Que id tiene tu licencia? ");
		int id = teclat.nextInt();
		System.out.println("Que tipo de licencia? ");
		String tipoLicencia = teclat.nextLine();
		String nombreCompleto = nombre + " " + apellido;
		System.out.println("Fecha caducidad? ");
		String fechaCa = teclat.nextLine();
		System.out.println("Tienes seguro? ");
		Llicencia licencia = new Llicencia(id, tipoLicencia, nombreCompleto, fechaCa);
		nuevaPersona[numeroPersonas] = new Conductor(nombre, apellido, fechaNa, licencia);
	}

	public static void coche(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle) {
		System.out.println("Que matricula tiene? ");
		String matricula = teclat.nextLine();
		System.out.println("Que marca tiene? ");
		String marca = teclat.nextLine();
		System.out.println("Que color tiene? ");
		String color = teclat.nextLine();
		System.out.println("Que marca tiene las rueda delantera? ");
		String marca2 = teclat.nextLine();
		System.out.println("Que diametro tiene las rueda delantera");
		double diametro = Double.parseDouble(teclat.nextLine());
		System.out.println("Que marca tiene las rueda traseras? ");
		String marca3 = teclat.nextLine();
		System.out.println("Que diametro tiene las rueda traseras");
		double diametro2 = Double.parseDouble(teclat.nextLine());
		Rueda ruedaDelantera = new Rueda(marca2, diametro);
		Rueda ruedaTrasera = new Rueda(marca3, diametro2);
		nuevoVehicle[numeroVehicle] = new Coche(matricula, marca, color, ruedaDelantera, ruedaTrasera);
		numeroVehicle++;
	}

	public static void moto(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle) {
		System.out.println("Que matricula tiene? ");
		String matricula = teclat.nextLine();
		System.out.println("Que marca tiene? ");
		String marca = teclat.nextLine();
		System.out.println("Que color tiene? ");
		String color = teclat.nextLine();
		System.out.println("Que marca tiene las rueda delantera? ");
		String marca2 = teclat.nextLine();
		System.out.println("Que diametro tiene las rueda delantera");
		double diametro = Double.parseDouble(teclat.nextLine());
		System.out.println("Que marca tiene las rueda traseras? ");
		String marca3 = teclat.nextLine();
		System.out.println("Que diametro tiene las rueda traseras");
		double diametro2 = Double.parseDouble(teclat.nextLine());

		int numeroConductor = 0;

		Rueda ruedaDelantera = new Rueda(marca2, diametro);
		Rueda ruedaTrasera = new Rueda(marca3, diametro2);
		nuevoVehicle[numeroVehicle] = new Bike(matricula, marca, color, ruedaDelantera, ruedaTrasera,
				nuevaPersona[numeroConductor]);
		numeroVehicle++;
	}

	public static void camion(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle) {
		System.out.println("Que matricula tiene? ");
		String matricula = teclat.nextLine();
		System.out.println("Que marca tiene? ");
		String marca = teclat.nextLine();
		System.out.println("Que color tiene? ");
		String color = teclat.nextLine();
		System.out.println("Que marca tiene las rueda delantera? ");
		String marca2 = teclat.nextLine();
		System.out.println("Que diametro tiene las rueda delantera");
		double diametro = Double.parseDouble(teclat.nextLine());
		System.out.println("Que marca tiene las rueda traseras? ");
		String marca3 = teclat.nextLine();
		System.out.println("Que diametro tiene las rueda traseras");
		double diametro2 = Double.parseDouble(teclat.nextLine());
		Rueda ruedaDelantera = new Rueda(marca2, diametro);
		Rueda ruedaTrasera = new Rueda(marca3, diametro2);
		nuevoVehicle[numeroVehicle] = new Camion(matricula, marca, color, ruedaDelantera, ruedaTrasera);
		numeroVehicle++;
	}

	public static void añadirConductores(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle) {
		int numeroConductor;
		System.out.println("Quien conduce el vehiculo?");
		for (int i = 0; i < nuevaPersona.length; i++) {
			System.out.println(i+" "+nuevaPersona[i].toString());
		}
		numeroConductor=Integer.parseInt(teclat.nextLine());
		
	}
}
