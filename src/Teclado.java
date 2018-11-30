import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	//declaracion del teclado estatico para poder usarlo en cada funcion
	static Scanner keyboard = new Scanner(System.in);

	
	
	public static enum ES{
		MAYOR, MENOR, MAYOR_IGUAL, MENOR_IGUAL
	}
	public static enum Rango{
		AMBOS_INCLUIDOS, AMBOS_EXCLUIDOS, MINIMO_INCLUIDO, MAXIMO_INCLUIDO
	}
	
//CERRAR TECLADO -----------------------------------------------------------------------------------------------------
	/*1. Funcion cerrarTeclado(): sera una funcion que no devuelva nada, pero modifique el estado del teclado cerrandolo*/
	public static void cerrarTeclado() {
		keyboard.close();
	}
//LIMPIEZA DEL BUFFER
	/*1. limpiarBuffer(): esta funcion contiene un nextLine() que nos sirve para limpiar el buffer*/
	public static void limpiarBuffer() {
		keyboard.nextLine();
	}
	
//LECTURA DE UN CARACTER ------------------------------------------------------------------------------------------------------------
	/*1. Funcion leerCaracter(): en ambas funciones si se le pasa una cadena solo coge el primer caracter
	 *		1.1 esta funcion devuelve y guarda un caracter que se le habra pedido previamente al usuario
	 *		1.2 realiza lo mismo que la funcion anterior pero se le pasa por parametro el mensaje*/
	
	/*1.1 esta funcion devuelve y guarda un caracter que se le habra pedido previamente al usuario*/
	public static char leerChar() {
		char caracter;
		
		caracter = keyboard.nextLine().charAt(0);
		
		return caracter;
	}
	/*1.2 realiza lo mismo que la funcion anterior pero se le pasa por parametro el mensaje*/
	public static char leerChar(String mensaje) {
		char caracter;
		
		System.out.println(mensaje);
		caracter = leerChar();
		
		return caracter;
	}
	
//LECTURA DE UNA CADENA ---------------------------------------------------------------------------------------------------------------------------------
	/*1. Funcion leerCadena(): se controlara que la cadena no este vacia, en este caso voloveremos a pedir el dato al usuario hasta que no lo este
	 *	1.1 devuelve la cadena que tras haberle pedido al usuario habra guardado ella misma
	 *	1.2 tiene la misma funcion que la anterior pero la funcion tambien recibe el mensaje de pedida de datos*/
	
	/*1.1 Devuelve una cadena que le habremos pedido al usuario*/
	public static String leerCadena() {
		String cadena;
		
		do {
			cadena = keyboard.nextLine();
		}while(cadena.equals(""));
		
		
		return cadena;
	}
	
	/*1.2 Tiene la misma funcion que la anterior pero la funcion tambien recibe el mensaje de pedida de datos*/
	public static String leerCadena(String mensaje) {
		String cadena;
		
		System.out.println(mensaje);
		cadena = leerCadena();
		
		
		return cadena;
	}
	
//LEER BOOLEANO ----------------------------------------------------------------------------------------------------------------------------------------------
	/*Funcion leerBoolean(): 
	 * 1. Devuelve una respuesta de tipo booleana (true ó false), la cual ha indicado el usuario
	 * 2. La funcion tiene dos variantes:
	 * 
	 *	2.1 esta funcion recibe 3 cadenas (1 pregunta y 2 opciones a esta) y devuelve un booleano (si la respuesta es la opcion 1 el valor devuelto sera true, si la respuesta es 2 devolvera false)
	 *	2.1.2 Controlara que el valor de la opcion que introduce el usuario sea valido, tanto siendo un numero como estando este dentro de los que se piden (en este caso 1 ó 2)
	 *	2.1.3 Si el valor que introduce el usuario no es valido le mostramos un mensaje de error y volvemos a pedirle el dato hasta que lo introduzca correctamente
	 *	
	 *	2.2 esta funcion recibe unicamente una cadena(que sera la pregunta que se le hara al usuario) y devuelve un booleano (que sera true o false dependiendo de la respuesta que del el usuario, puede ser s/S ó nN, si es s/S el valor guardado y devuelto sera true, en cambio si es n/N el valor guardado y devuelto sera false)
	 *	2.2.1 Controlaremos que la respuesta del usuario sea igual a s/S o a n/N y si el valor que introduce el usuario no es valido le mostramos un mensaje de error y volvemos a pedirle el dato hasta que lo introduzca correctamente
	 **/
	
	/*2.1 esta funcion recibe 3 cadenas (1 pregunta y 2 opciones a esta) y devuelve un booleano (si la respuesta es la opcion 1 el valor devuelto sera true, si la respuesta es 2 devolvera false)
	 *	2.1.2 Controlara que el valor de la opcion que introduce el usuario sea valido, tanto siendo un numero como estando este dentro de los que se piden (en este caso 1 ó 2)
	 *	2.1.3 Si el valor que introduce el usuario no es valido le mostramos un mensaje de error y volvemos a pedirle el dato hasta que lo introduzca correctamente*/
	public static boolean leerBoolean(String pregunta, String opcion1, String opcion2) {
		byte opcion;
		
		
		System.out.printf("%s\n  1.- %s\n  2.- %s",pregunta, opcion1, opcion2);
		opcion = (byte) Rango(1, 2, Rango.AMBOS_INCLUIDOS);
		
		
		return opcion == 1;
	}

	/*2.2 esta funcion recibe unicamente una cadena(que sera la pregunta que se le hara al usuario) y devuelve un booleano (que sera true o false dependiendo de la respuesta que del el usuario, puede ser s/S ó nN, si es s/S el valor guardado y devuelto sera true, en cambio si es n/N el valor guardado y devuelto sera false)
	 *	2.2.1 Controlaremos que la respuesta del usuario sea igual a s/S o a n/N y si el valor que introduce el usuario no es valido le mostramos un mensaje de error y volvemos a pedirle el dato hasta que lo introduzca correctamente*/
	public static boolean leerBoolean(String pregunta) {
		char respuesta; 
		
		do {
			System.out.printf("%s (s/n): ", pregunta);
			respuesta = Character.toLowerCase(leerChar());
			if(respuesta != 's' && respuesta != 'n') {
				System.out.printf("El valor introducido no es válido, introduce \"s\" ó \"n\" ");
			}
			
		}while(respuesta != 's'&& respuesta != 'n');
		
		
		//resultado=(respuesta=="s")?true:false; otra opcion
		return respuesta == 's';
	}
	
	
//LEER NUMERO CUALQUIERA byte, short, int, long, float, double--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/* Funcion leerNumero(): 
	 * 1. Devuelve un dato numerico que sera el que habra introducido el usuario
	 * 2. Dentro de la funcion controlaremos que el dato que introduce el usuario sea numerico y que este dentro del rango de cada tipo, en caso contrario volveremos a pedirselo
	 *		- Tenemos dos opciones para cada funcion: 
	 *				-- La primera funcion guardara y devolvera el dato numerico que halla introducido el usuario
	 *				-- La segunda funcion hara lo mismo pero recibe ademas una cadena, la cual sera el mensaje que le mostraremos al usuario*/
	
	
	//LEER BYTE ----------------------------------------------------------------------------------------------------
	/*1.1 esta primera funcion guardara y devolvera el dato numerico de tipo byte que halla introducido el usuario*/
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
			}finally {
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	/*1.2 esta segunda funcion hara lo mismo pero recibe ademas una cadena, la cual sera el mensaje que le mostraremos al usuario*/
	public static byte leerByte(String mensaje) {
		byte respuesta = 0;
		
		System.out.println(mensaje);
		respuesta = leerByte();
		
		
		return respuesta;
	}
	
	
	//LEER INT ------------------------------------------------------------------------------------------------------
	/*1.1 esta primera funcion guardara y devolvera el dato numerico de tipo int que halla introducido el usuario*/
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
			}finally {
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	/*1.2 esta segunda funcion hara lo mismo pero recibe ademas una cadena, la cual sera el mensaje que le mostraremos al usuario*/
	public static int leerEntero(String mensaje) {
		int respuesta = 0;

		System.out.println(mensaje);
		respuesta = leerEntero();
		
		
		return respuesta;
	}
	
	
	//LEER SHORT ----------------------------------------------------------------------------------------------------
	/*1.1 esta primera funcion guardara y devolvera el dato numerico de tipo short que halla introducido el usuario*/
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
			}finally {
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	/*1.2 esta segunda funcion hara lo mismo pero recibe ademas una cadena, la cual sera el mensaje que le mostraremos al usuario*/
	public static short leerShort(String mensaje) {
		short respuesta = 0;
		
		System.out.println(mensaje);
		respuesta = leerShort();
		
		
		return respuesta;
	}
	
	//LEER LONG -----------------------------------------------------------------------------------------------------
	/*1.1 esta primera funcion guardara y devolvera el dato numerico de tipo long que halla introducido el usuario*/
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
			}finally {
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	/*1.2 esta segunda funcion hara lo mismo pero recibe ademas una cadena, la cual sera el mensaje que le mostraremos al usuario*/
	public static long leerLong(String mensaje) {
		long respuesta = 0;
		
		System.out.println(mensaje);
		respuesta = leerLong();
		
		
		return respuesta;
	}
	
	//LEER FLOAT ---------------------------------------------------------------------------------------------------
	/*1.1 esta primera funcion guardara y devolvera el dato numerico de tipo float que halla introducido el usuario*/
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
			}finally {
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	/*1.2 esta segunda funcion hara lo mismo pero recibe ademas una cadena, la cual sera el mensaje que le mostraremos al usuario*/
	public static float leerFloat(String mensaje) {
		float respuesta = 0;
		
		System.out.println(mensaje);
		respuesta = leerFloat();
		
		
		return respuesta;
	}
	
	//LEER DOUBLE ---------------------------------------------------------------------------------------------------
	/*1.1 esta primera funcion guardara y devolvera el dato numerico de tipo double que halla introducido el usuario*/
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
			}finally {
				limpiarBuffer();
			}
			
		}while(!valido);
		
		
		return respuesta;
	}
	/*1.2 esta segunda funcion hara lo mismo pero recibe ademas una cadena, la cual sera el mensaje que le mostraremos al usuario*/
	public static double leerDouble(String mensaje) {
		double respuesta = 0;
		
		System.out.println(mensaje);
		respuesta = leerDouble();
		
		
		return respuesta;
	}
	

//LEER LIMITE ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/* Funcion obtenerLimite(): 
	 * 1. Recibe un numero del tipo que le pidamos, que sera el numero con el que comparemos
	 *  el numero del usuario y un dato enumerado que nos indicara si el dato del usuario debe ser mayor, menor, mayor_igual o menor_igual
	 * 2. Le pediremos al usuario que introduzca el dato numerico mientras: no sea el valor valido (por ejemplo que le pidamos que sea mayor e introduzca un numero menor) ó el dato introducido no sea un numero
	 **/
	//COMPARAR BYTE -------------------------------------------------------------------------------------------------
	public static byte Comparacion(byte numero, ES es) {
		byte numero2 = 0 ;
		
		switch(es) {
		case MAYOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerByte();	
			}while(numero2<=numero);
			
			break;
		case MENOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerByte();
					
			}while(numero2>=numero);
			break;
		case MAYOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerByte();	
			}while(numero2<numero);
			break;
		case MENOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerByte();
					
			}while(numero2>numero);
			break;
			
		}
		
		return numero2;
	}
	// COMPARAR INT -------------------------------------------------------------------------------------------------
	public static int Comparacion(int numero, ES es) {
		int numero2 = 0 ;
		
		switch(es) {
		case MAYOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerEntero();	
			}while(numero2<=numero);
			
			break;
		case MENOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerEntero();	
			}while(numero2>=numero);
			break;
		case MAYOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerEntero();
					
			}while(numero2<numero);
			break;
		case MENOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerEntero();	
			}while(numero2>numero);
			break;
			
		}
		
		return numero2;
	}
	// COMPARAR SHORT -------------------------------------------------------------------------------------------------
	public static short Comparacion(short numero, ES es) {
		short numero2 = 0 ;
		
		switch(es) {
		case MAYOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerShort();		
			}while(numero2<=numero);
			
			break;
		case MENOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerShort();
			}while(numero2>=numero);
			break;
		case MAYOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerShort();	
			}while(numero2<numero);
			break;
		case MENOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerShort();	
			}while(numero2>numero);
			break;
			
		}
		
		return numero2;
	}
	// COMPARAR LONG -------------------------------------------------------------------------------------------------
	public static long Comparacion(long numero, ES es) {
		long numero2 = 0 ;
		
		switch(es) {
		case MAYOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerLong();	
			}while(numero2<=numero );
			
			break;
		case MENOR:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerLong();	
			}while(numero2>=numero );
			break;
		case MAYOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerLong();	
			}while(numero2<numero );
			break;
		case MENOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %d : ",es, numero);
				numero2 = leerLong();
			}while(numero2>numero );
			break;
			
		}
		
		return numero2;
	}
	// COMPARAR FLOAT -------------------------------------------------------------------------------------------------
	public static float Comparacion(float numero, ES es) {
		float numero2 = 0 ;
		
		switch(es) {
		case MAYOR:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerFloat();
					
			}while(numero2<=numero );
			
			break;
		case MENOR:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerFloat();
					
			}while(numero2>=numero);
			break;
		case MAYOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerFloat();
					
			}while(numero2<numero);
			break;
		case MENOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerFloat();
					
			}while(numero2>numero);
			break;
			
		}
		
		return numero2;
	}
	// COMPARAR DOUBLE -------------------------------------------------------------------------------------------------
	public static double Comparacion(double numero, ES es) {
		double numero2 = 0 ;
		
		switch(es) {
		case MAYOR:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerDouble();
					
			}while(numero2<=numero);
			
			break;
		case MENOR:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerDouble();
					
			}while(numero2>=numero);
			break;
		case MAYOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerDouble();		
			}while(numero2<numero);
			break;
		case MENOR_IGUAL:
			do{
				System.out.printf("Introduzca un numero %s que el %.2f : ",es, numero);
				numero2 = leerDouble();		
			}while(numero2>numero);
			break;
			
		}
		
		return numero2;
	}
	
	
//LEER RANGO --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/* Funcion obtenerRango():
	 *  1. Esta funcion recibira dos valores de tipo numerico(donde uno indicara el valor minimo del rango y otro el valor maximo del rango) y un tipo enumerado (indicara si el numero puede incluir algun limite de rango, si no puede incluir ninguno o si puede incluir ambos)
	 *  2. Se controlara que los parametros sean correctos, pueden ser iguales, pero el que debe ser menor no puede ser mayor, si esto pasa se mostrara un mensaje de error
	 *  3. Controlaremos que el valor que introduce el usuario este dentro del rango valido y que sea de tipo numerico, si esto no se da, repetiremos la peticion de datos
	 *  */
	
	//RANGO BYTE --------------------------------------------------------------------------------------------------
	public static byte Rango(byte lim_menor, byte lim_mayor, Rango entre) {
		byte numero = 0;
		
		if(lim_menor > lim_mayor){
			throw new IllegalArgumentException("ERROR, el numero inferior no puede ser mayor al superior");
		}
		
		switch(entre) {
		case AMBOS_INCLUIDOS:
			
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerByte();
			}while(numero < lim_menor || numero > lim_mayor);

			break;
		case AMBOS_EXCLUIDOS:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerByte();
			}while(numero<=lim_menor || numero>=lim_mayor);
			break;
		case MINIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerByte();
			}while(numero<lim_menor || numero>=lim_mayor);
			break;
		case MAXIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerByte();
			}while(numero<=lim_menor || numero>lim_mayor);
			break;
		}
		
		return numero;
	}
	//RANGO INT --------------------------------------------------------------------------------------------------
	public static int Rango(int lim_menor, int lim_mayor, Rango entre) {
		int numero = 0;
		
		if(lim_menor > lim_mayor){
			throw new IllegalArgumentException("ERROR, el numero inferior no puede ser mayor al superior");
		}
		
		switch(entre) {
		case AMBOS_INCLUIDOS:
			
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerEntero();
			}while(numero < lim_menor || numero > lim_mayor);

			break;
		case AMBOS_EXCLUIDOS:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerEntero();
			}while(numero<=lim_menor || numero>=lim_mayor);
			break;
		case MINIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerEntero();
			}while(numero<lim_menor || numero>=lim_mayor);
			break;
		case MAXIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerEntero();
			}while(numero<=lim_menor || numero>lim_mayor);
			break;
		}
		
		return numero;
	}
	//RANGO SHORT --------------------------------------------------------------------------------------------------
	public static short Rango(short lim_menor, short lim_mayor, Rango entre) {
		short numero = 0;
		
		if(lim_menor > lim_mayor){
			throw new IllegalArgumentException("ERROR, el numero inferior no puede ser mayor al superior");
		}
		
		switch(entre) {
		case AMBOS_INCLUIDOS:
			
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerShort();
			}while(numero < lim_menor || numero > lim_mayor);

			break;
		case AMBOS_EXCLUIDOS:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerShort();
			}while(numero<=lim_menor || numero>=lim_mayor);
			break;
		case MINIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerShort();
			}while(numero<lim_menor || numero>=lim_mayor);
			break;
		case MAXIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerShort();
				
			}while(numero<=lim_menor || numero>lim_mayor);
			break;
		}
		
		return numero;
	}
	//RANGO LONG --------------------------------------------------------------------------------------------------
	public static long Rango(long lim_menor, long lim_mayor, Rango entre) {
		long numero = 0;
		
		if(lim_menor > lim_mayor){
			throw new IllegalArgumentException("ERROR, el numero inferior no puede ser mayor al superior");
		}
		
		switch(entre) {
		case AMBOS_INCLUIDOS:
			
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerLong();	
			}while(numero < lim_menor || numero > lim_mayor);

			break;
		case AMBOS_EXCLUIDOS:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerLong();
			}while(numero<=lim_menor || numero>=lim_mayor);
			break;
		case MINIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerLong();
			}while(numero<lim_menor || numero>=lim_mayor);
			break;
		case MAXIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %d y %d , %s : ", lim_menor, lim_mayor, entre);
				numero = leerLong();
			}while(numero<=lim_menor || numero>lim_mayor);
			break;
		}
		
		return numero;
	}
	//RANGO FLOAT --------------------------------------------------------------------------------------------------
	public static float Rango(float lim_menor, float lim_mayor, Rango entre) {
		float numero = 0;
		
		if(lim_menor > lim_mayor){
			throw new IllegalArgumentException("ERROR, el numero inferior no puede ser mayor al superior");
		}
		
		switch(entre) {
		case AMBOS_INCLUIDOS:
			
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerFloat();
			}while(numero < lim_menor || numero > lim_mayor);

			break;
		case AMBOS_EXCLUIDOS:
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerFloat();
			}while(numero<=lim_menor || numero>=lim_mayor);
			break;
		case MINIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerFloat();
			}while(numero<lim_menor || numero>=lim_mayor);
			break;
		case MAXIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerFloat();
			}while(numero<=lim_menor || numero>lim_mayor);
			break;
		}
		
		return numero;
	}
	//RANGO DOUBLE --------------------------------------------------------------------------------------------------
	public static double Rango(double lim_menor, double lim_mayor, Rango entre) {
		double numero = 0;
		
		if(lim_menor > lim_mayor){
			throw new IllegalArgumentException("ERROR, el numero inferior no puede ser mayor al superior");
		}
		
		switch(entre) {
		case AMBOS_INCLUIDOS:
			
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerDouble();
			}while(numero < lim_menor || numero > lim_mayor);

			break;
		case AMBOS_EXCLUIDOS:
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerDouble();
			}while(numero<=lim_menor || numero>=lim_mayor);
			break;
		case MINIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerDouble();
			}while(numero<lim_menor || numero>=lim_mayor);
			break;
		case MAXIMO_INCLUIDO:
			do {
				System.out.printf("Introduce un numero entre %.2f y %.2f , %s : ", lim_menor, lim_mayor, entre);
				numero = leerDouble();
			}while(numero<=lim_menor || numero>lim_mayor);
			break;
		}
		
		return numero;
	}
	
	
	
	
	
}
