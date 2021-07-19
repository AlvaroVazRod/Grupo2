package main;

import java.util.Scanner;

public class M3App {
	static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) throws TipoLicenciaIncorrecto {
		int numeroMaxVehicle = 0, numeroVehicle = 0, numeroMaxPersonas = 0, numeroPersonas = 0;
		Vehicle[] nuevoVehicle = new Vehicle[50];
		Persona[] nuevaPersona = new Persona[50];
		crearTitular(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
		eleccion(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);

	}

	public static void menu2(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle,
			int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
		System.out.println("Buenos dias Quiere añadir un vehiculo o una persona? ");
		String eleccion;
		eleccion = teclat.nextLine().toLowerCase();
		switch (eleccion) {
		case "vehiculo":
			menuVehiculo(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas,
					numeroMaxVehicle);
			break;
		case "persona":
			menuPersona(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + eleccion);
		}
	}

	public static void menuVehiculo(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle, int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
		String vehiculo;
		System.out.println("Buenos dias");
		System.out.println("Que tipo de vehiculo tienes? ");
		vehiculo = teclat.nextLine().toLowerCase();
		switch (vehiculo) {
		case "coche":
			if (nuevaPersona[numeroPersonas].licenciaPersona.getTipusLlicencia().equalsIgnoreCase(vehiculo)) {
				coche(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			} else {
				throw new TipoLicenciaIncorrecto(vehiculo);
			}

			break;
		case "moto":
			if (nuevaPersona[numeroPersonas].licenciaPersona.getTipusLlicencia().equalsIgnoreCase(vehiculo)) {
				moto(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			} else {
				throw new TipoLicenciaIncorrecto(vehiculo);
			}
			break;
		case "camion":
			if (nuevaPersona[numeroPersonas].licenciaPersona.getTipusLlicencia().equalsIgnoreCase(vehiculo)) {
				camion(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			} else {
				throw new TipoLicenciaIncorrecto(vehiculo);
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + vehiculo);
		}
	}

	public static void menuVehiculo2(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle, int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
		String vehiculo;
		System.out.println("Buenos dias");
		System.out.println("Que tipo de vehiculo tienes? ");
		vehiculo = teclat.nextLine().toLowerCase();
		switch (vehiculo) {
		case "coche":
			coche(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			break;
		case "moto":
			moto(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			break;
		case "camion":
			camion(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + vehiculo);
		}
	}

	public static void menuPersona(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle, int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
		String persona;
		System.out.println("Buenos dias");
		System.out.println("Que quiere crear un titular o un conductor? ");
		persona = teclat.nextLine().toLowerCase();
		switch (persona) {
		case "titular":
			crearTitular(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas,
					numeroMaxVehicle);
			break;
		case "conductor":
			crearCond(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroMaxVehicle);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + persona);
		}
	}

	public static void crearTitular(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas,
			int numeroVehicle, int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
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
		numeroMaxPersonas++;
		menuVehiculo(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroVehicle);
	}

	public static void crearCond(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle,
			int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
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
		String nombreCompleto = nombre + " " + apellido;
		System.out.println("Fecha caducidad? ");
		String fechaCa = teclat.nextLine();
		System.out.println("Tienes seguro? ");
		Llicencia licencia = new Llicencia(id, tipoLicencia, nombreCompleto, fechaCa);
		nuevaPersona[numeroPersonas] = new Conductor(nombre, apellido, fechaNa, licencia);
		numeroMaxPersonas++;
	}

	public static void coche(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle,
			int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
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
		System.out.println("Es el titular?");
		String respuesta2 = teclat.nextLine();
		switch (respuesta2) {
		case "si":
			nuevoVehicle[numeroVehicle] = new Coche(matricula, marca, color, ruedaDelantera, ruedaTrasera,
					nuevaPersona[numeroPersonas]);
			break;
		case "no":
			nuevoVehicle[numeroVehicle] = new Coche(matricula, marca, color, ruedaDelantera, ruedaTrasera);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + respuesta2);
		}
		numeroMaxVehicle++;
		System.out.println("Quieres añadir un conductor nuevo?");
		String respuesta = teclat.nextLine().toLowerCase();
		while (respuesta.equalsIgnoreCase("si")) {
			int numeroConductor;
			System.out.println("Quien conduce el vehiculo?");
			for (int i = 0; i <= numeroMaxPersonas - 1; i++) {
				System.out.println(i + " " + nuevaPersona[i].toString());
			}
			System.out.println("Que conductor quieres añadir? ");
			numeroConductor = Integer.parseInt(teclat.nextLine());
			if (nuevaPersona[numeroConductor].licenciaPersona.getTipusLlicencia().equalsIgnoreCase("coche")) {
				nuevoVehicle[numeroVehicle].añadirConductor(nuevaPersona[numeroConductor]);
			} else {
				throw new TipoLicenciaIncorrecto("coche");
			}
			System.out.println("Quieres añadir un conductor nuevo?");
			respuesta = teclat.nextLine().toLowerCase();
		}
		numeroPersonas++;
		numeroVehicle++;
	}

	public static void moto(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle,
			int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
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
		System.out.println("Es el titular?");
		String respuesta2 = teclat.nextLine();
		switch (respuesta2) {
		case "si":
			nuevoVehicle[numeroVehicle] = new Coche(matricula, marca, color, ruedaDelantera, ruedaTrasera,
					nuevaPersona[numeroPersonas]);
			break;
		case "no":
			nuevoVehicle[numeroVehicle] = new Coche(matricula, marca, color, ruedaDelantera, ruedaTrasera);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + respuesta2);
		}
		numeroMaxVehicle++;
		System.out.println("Quieres añadir un conductor nuevo?");
		String respuesta = teclat.nextLine().toLowerCase();
		while (respuesta.equalsIgnoreCase("si")) {
			int numeroConductor;
			System.out.println("Quien conduce el vehiculo?");
			for (int i = 0; i <= numeroMaxPersonas - 1; i++) {
				System.out.println(i + " " + nuevaPersona[i].toString());
			}
			System.out.println("Que conductor quieres añadir? ");
			numeroConductor = Integer.parseInt(teclat.nextLine());
			if (nuevaPersona[numeroConductor].licenciaPersona.getTipusLlicencia().equalsIgnoreCase("moto")) {
				nuevoVehicle[numeroVehicle].añadirConductor(nuevaPersona[numeroConductor]);
			} else {
				throw new TipoLicenciaIncorrecto("moto");
			}
			System.out.println("Quieres añadir un conductor nuevo?");
			respuesta = teclat.nextLine().toLowerCase();
		}
		numeroPersonas++;
		numeroVehicle++;
	}

	public static void camion(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle,
			int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
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
		System.out.println("Es el titular?");
		String respuesta2 = teclat.nextLine();
		switch (respuesta2) {
		case "si":
			nuevoVehicle[numeroVehicle] = new Coche(matricula, marca, color, ruedaDelantera, ruedaTrasera,
					nuevaPersona[numeroPersonas]);
			break;
		case "no":
			nuevoVehicle[numeroVehicle] = new Coche(matricula, marca, color, ruedaDelantera, ruedaTrasera);
			System.out.println("Quien es el titular? ");
			for (int i = 0; i < numeroMaxPersonas - 1; i++) {
				System.out.println(nuevaPersona[i]);
			}
			int elTitular = Integer.parseInt(teclat.nextLine());
			nuevoVehicle[numeroVehicle].añadirTitular(nuevaPersona[elTitular]);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + respuesta2);
		}
		numeroMaxVehicle++;
		System.out.println("Quieres añadir un conductor nuevo?");
		String respuesta = teclat.nextLine().toLowerCase();
		while (respuesta.equalsIgnoreCase("si")) {
			int numeroConductor;
			System.out.println("Quien conduce el vehiculo?");
			for (int i = 0; i <= numeroMaxPersonas - 1; i++) {
				System.out.println(i + " " + nuevaPersona[i].toString());
			}
			System.out.println("Que conductor quieres añadir? ");
			numeroConductor = Integer.parseInt(teclat.nextLine());
			if (nuevaPersona[numeroConductor].licenciaPersona.getTipusLlicencia().equalsIgnoreCase("camion")) {
				nuevoVehicle[numeroVehicle].añadirConductor(nuevaPersona[numeroConductor]);
			} else {
				throw new TipoLicenciaIncorrecto("camion");
			}
			System.out.println("Quieres añadir un conductor nuevo?");
			respuesta = teclat.nextLine().toLowerCase();
		}
		numeroPersonas++;
		numeroVehicle++;
	}

	public static void eleccion(Vehicle[] nuevoVehicle, Persona[] nuevaPersona, int numeroPersonas, int numeroVehicle,
			int numeroMaxPersonas, int numeroMaxVehicle) throws TipoLicenciaIncorrecto {
		String elec;
		System.out.println("Quieres crear un vehiculo o una Persona? ");
		elec = teclat.nextLine().toLowerCase();
		switch (elec) {
		case "vehiculo":
			menuVehiculo2(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroVehicle);
			break;
		case "persona":
			menuPersona(nuevoVehicle, nuevaPersona, numeroPersonas, numeroVehicle, numeroMaxPersonas, numeroVehicle);
		default:
			throw new IllegalArgumentException("Unexpected value: " + elec);
		}

	}
}
