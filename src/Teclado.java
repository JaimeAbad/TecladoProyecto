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
//LIMPIEZA DEL BUFFER
	public static void limpiarBuffer() {
		keyboard.nextLine();
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
		byte opcion = 0;
		boolean valido = false;
		
		do {
			System.out.printf("%s\n  1.- %s\n  2.- %s",pregunta, opcion1, opcion2);
			try {
				opcion = keyboard.nextByte();
				valido = true;
			}catch(InputMismatchException e) {
				System.out.println("Introduce un número válido");
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

	/*leerBoolean(): recibe la pregunta y pide una respuesta al usuario que sera 's' o 'n' en mayuscula o minuscula
	 comparamos la respuesta a "s" para que si son iguales devuelva true y si no false*/
	public static boolean leerBoolean(String pregunta) {
		String respuesta; 
		
		do {
			System.out.printf("%s (s/n): ", pregunta);
			respuesta = leerCadena().toLowerCase();
			if(!respuesta.equals("s") && !respuesta.equals("n")) {
				System.out.printf("El valor introducido no es válido, introduce \"s\" ó \"n\" ");
			}
			
		}while(!respuesta.equals("s") && !respuesta.equals("n"));
		
		
		//resultado=(respuesta=="s")?true:false; otra opcion
		return respuesta.equals("s");
	}
	
	
//LEER NUMERO CUALQUIERA byte, short, int, long, float, double--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/*estas funciones obtendran un numero de un tipo(byte, int, short, long, float o double), y que debera estar dentro del rango de cada uno*/
	/*funciones que recibiran el mensaje que se mostrara al usuario y 
	 *  obtendra un numero de un tipo(byte, int, short, long, float o double) y que deberá estar dentro del rango de cada uno*/
	
	//LEER BYTE ----------------------------------------------------------------------------------------------------
	
	public static byte leerByte() {
		byte respuesta = 0;
		boolean valido = false;
		do {
			try {
				respuesta = keyboard.nextByte();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-128:127]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	public static byte leerByte(String mensaje) {
		byte respuesta = 0;
		boolean valido = false;
		do {
			System.out.println(mensaje);
			try {
				respuesta = keyboard.nextByte();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-128:127]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	
	
	//LEER INT ------------------------------------------------------------------------------------------------------
	public static int leerEntero() {
		int respuesta = 0;
		boolean valido = false;
		do {
			try {
				respuesta = keyboard.nextInt();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-2.147.483.648:2.147.483.649]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	public static int leerEntero(String mensaje) {
		int respuesta = 0;
		boolean valido = false;
		do {
			System.out.println(mensaje);
			try {
				respuesta = keyboard.nextInt();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-2.147.483.648:2.147.483.649]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	
	
	//LEER SHORT ----------------------------------------------------------------------------------------------------
	
	public static short leerShort() {
		short respuesta = 0;
		boolean valido = false;
		do {
			try {
				respuesta = keyboard.nextShort();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-32.768:32.767]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	public static short leerShort(String mensaje) {
		short respuesta = 0;
		boolean valido = false;
		do {
			System.out.println(mensaje);
			try {
				respuesta = keyboard.nextShort();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-32.768:32.767]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	
	//LEER LONG -----------------------------------------------------------------------------------------------------
	
	public static long leerLong() {
		long respuesta = 0;
		boolean valido = false;
		do {
			try {
				respuesta = keyboard.nextLong();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-9*10^18:9*10^18]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	public static long leerLong(String mensaje) {
		long respuesta = 0;
		boolean valido = false;
		do {
			System.out.println(mensaje);
			try {
				respuesta = keyboard.nextLong();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-9*10^18:9*10^18]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	
	//LEER FLOAT ---------------------------------------------------------------------------------------------------
	public static float leerFloat() {
		float respuesta = 0;
		boolean valido = false;
		do {
			try {
				respuesta = keyboard.nextFloat();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-3,4*10^38:3,4*10^38]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	public static float leerFloat(String mensaje) {
		float respuesta = 0;
		boolean valido = false;
		do {
			System.out.println(mensaje);
			try {
				respuesta = keyboard.nextFloat();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-3,4*10^38:3,4*10^38]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	
	//LEER DOUBLE ---------------------------------------------------------------------------------------------------
	public static double leerDouble() {
		double respuesta = 0;
		boolean valido = false;
		do {
			try {
				respuesta = keyboard.nextDouble();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-1,79*10^308 a 1,79*10^308]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	public static double leerDouble(String mensaje) {
		double respuesta = 0;
		boolean valido = false;
		do {
			System.out.println(mensaje);
			try {
				respuesta = keyboard.nextDouble();
				valido  = true;
			}
			catch(InputMismatchException e){
				System.out.println("Introduce un número dentro del valor válido. [-1,79*10^308 a 1,79*10^308]");
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	

//LEER LIMITE ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public enum limite{
		MAYOR, MENOR, MAYOR_IGUAL, MENOR_IGUAL
	}
	
	
	
	
	
	
	
//LEER RANGO --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public enum rango{
		AMBOS_INCLUIDOS, AMBOS_EXCLUIDOS, MINIMO_INCLUIDO, MAXIMO_INCLUIDO
	}
	
	
	
	
	
}
