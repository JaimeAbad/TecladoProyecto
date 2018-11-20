import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	//declaracion del teclado estatico para poder usarlo en cada funcion
	static Scanner keyboard = new Scanner(System.in);


	
	/*HACER EL PLANTEAMIENTO DE CADA FUNCION*/
	
//CERRAR TECLADO -----------------------------------------------------------------------------------------------------
	/*cerrarTeclado: esta funcion no devuelve nada, "modifica" el teclado cerrandolo*/
	public static void cerrarTeclado() {
		keyboard.close();
	}
	
//LECTURA DE UN CARACTER ------------------------------------------------------------------------------------------------------------
	
	/*leerChar(): funcion que recibe un valor de tipo carcater, si se introduce una cadena obtendra el primer valor */
	public static char leerChar() {
		char caracter;
		
		caracter = keyboard.next().charAt(0);
		
		return caracter;
	}
	/*leerChar(String mensaje): lo mismo que la funcion anterior pero el mensaje ira dentro*/
	public static char leerChar(String mensaje) {
		char caracter;
		
		System.out.println(mensaje);
		caracter = keyboard.next().charAt(0);
		
		return caracter;
	}
	
//LECTURA DE UNA CADENA ---------------------------------------------------------------------------------------------------------------------------------
	
	/*leerCadena(): funcion que obtiene una cadena por teclado, controla que no este vacia*/
	public static String leerCadena() {
		String cadena;
		
		do {
			cadena = keyboard.nextLine();
		}while(cadena.equals(""));
		
		
		return cadena;
	}
	
	/*leerCadena(String msj): igual que la anterior pero le introducimos el mensaje en la funcion*/
	
	public static String leerCadena(String mensaje) {
		String cadena;
		
		System.out.println(mensaje);
		do {
			cadena = keyboard.nextLine();
		}while(cadena.equals(""));
		
		
		return cadena;
	}
	
//LEER BOOLEANO ----------------------------------------------------------------------------------------------------------------------------------------------
	
	/*leerBoolean(): recibe 3 mensajes (1- pregunta 2-opcionA 3-opcionB) con la opcion A devuelve true con la opcion B false */
	
	public static boolean leerBoolean(String pregunta, String opcion1, String opcion2) {
		boolean resultado = false;
		int opcion = 0;
		boolean valido = false;
		
		do {
			System.out.printf("%s\n  1.- %s\n  2.- %s",pregunta, opcion1, opcion2);
			try {
				opcion = keyboard.nextInt();
				valido = true;
			}catch(InputMismatchException e) {
				System.out.println("Introduce un numero valido");
				keyboard.nextLine();
			}
		}while(opcion!=1 && opcion!=2 && !valido);
		
		
		
		if(opcion == 1) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		
		return resultado;
	}
	
	
	
	
	
	
	
	
}
