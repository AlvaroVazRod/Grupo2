package main;

public class M3App {
	 public static void main(String[] args) {
		 Coche[] nuevoCoche = new Coche [1];
		 nuevoCoche [0] = new Coche ("FUJEBWJF","fsbjie","fbsniejb");
		 nuevoCoche[0].AñadirRuedaDelantera("fnieson", 23);
		 nuevoCoche[0].AñadirRuedaDelantera("sgdrg", 12);
		 nuevoCoche[0].AñadirRuedaTrasera("iojnkl", 8);
		 nuevoCoche[0].AñadirRuedaTrasera("454156", 1);
		 System.out.println(nuevoCoche[0].toString());

	 }
}
