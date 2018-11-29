
public class testing {

	public static void main(String[] args) {
//		byte lim;
//		lim = Teclado.Comparacion((byte) 50, Teclado.ES.MAYOR);
//		
//		
//		float limMax4,limMin4,limMaxI4,limMinI4;
//		limMax4 = Teclado.Comparacion(50, Teclado.ES.MAYOR);
//		
//		
//		double limMax5,limMin5,limMaxI5,limMinI5;
//		limMax5 = Teclado.Comparacion(50, Teclado.ES.MAYOR);
//		
//		byte rango;
//		rango = Teclado.Rango((byte)10, (byte)20,Teclado.Rango.AMBOS_EXCLUIDOS);
		
//		float rangoAmbExc4, rangoAmbInc4, rangoMaxInc4, rangoMinInc4;
//		rangoAmbExc4 = Teclado.Rango(10.0f, 100.0f,Teclado.Rango.AMBOS_EXCLUIDOS);
//		
//		double rangoAmbExc5, rangoAmbInc5, rangoMaxInc5, rangoMinInc5;
//		rangoAmbExc5 = Teclado.Rango((double)10, (double)100,Teclado.Rango.AMBOS_EXCLUIDOS);
		
		char c,c2 = 0, c1;
//		System.out.println("Introduce un caracter: ");
//		c = Teclado.leerChar();
//		System.out.println("Caracter-numero(Mostrara el codigo unicode en decimal del primer numero) Introduce un numero cualquiera : ");
//		c1 = Teclado.leerChar();
//		System.out.println("Caracter-cadena (Introduce una cadena): ");
//		c2 = Teclado.leerChar();
		
//		System.out.println(c);
//		System.out.println(c1);
//		System.out.println(c2);
//		boolean salir = false;
//		byte opcion;
//		do {
//			
//			System.out.println("MENU -------------------------------");
//			System.out.printf("1. Leer Caracter \n2. Leer Cadena \n3. Leer Booleano"
//					+ " \n4. Leer Numero \n5. Limite \n6. Rango \n7. Salir");
//			opcion = Teclado.leerByte();
//			
//			if(opcion == 7) {
//				salir = true;
//			}
//			
//			if(opcion == 1) {
//				System.out.println("Caracter-numero(Mostrara el codigo unicode en decimal del primer numero) Introduce un numero cualquiera : ");
//				c1 = Teclado.leerChar();
//			}
//			
//			
//		}while(!salir);
		String s;
		int n ;
//		c = Teclado.leerChar("Introduce c: ");
//		System.out.println(c);
//		c1= Teclado.leerChar("Introduce c1: ");
		

		
		n = Teclado.leerEntero("Entero :");
		s = Teclado.leerCadena("Introduce la cadena: ");
		System.out.println(s);
		System.out.println(n);
//		System.out.println(c1);
	}

}
