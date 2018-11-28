public class MainPruebas {

	public static void main(String[] args) {
		
		
		boolean salir = false;
		byte opcion = 0;
		boolean b1, b2,b3,b4,b5,b6,b7,b8;
		char c,c2, c1,c4;
		int c3;
		String s1,s2,s3,s4,s5,s6,s7;
		int i1,i2,i3,i4,i5,i6,i7;
		byte by1,by2,by3,by4,by5,by6,by7;
		long l1,l2,l3,l4,l5,l6,l7;
		short sh1,sh2,sh3,sh4,sh5,sh6,sh7;
		float f1,f2,f3,f4,f5,f6;
		double d1, d2, d3,d4,d5,d6;
		double rangoAmbExc5, rangoAmbInc5, rangoMaxInc5, rangoMinInc5;
		float rangoAmbExc4, rangoAmbInc4, rangoMaxInc4, rangoMinInc4;
		long rangoAmbExc3, rangoAmbInc3, rangoMaxInc3, rangoMinInc3;
		short rangoAmbExc2, rangoAmbInc2, rangoMaxInc2, rangoMinInc2;
		int rangoAmbExc1, rangoAmbInc1, rangoMaxInc1, rangoMinInc1;
		byte rangoAmbExc, rangoAmbInc, rangoMaxInc, rangoMinInc;
		byte limMax,limMin,limMaxI,limMinI;
		int limMax1,limMin1,limMaxI1,limMinI1;
		short limMax2,limMin2,limMaxI2,limMinI2;
		long limMax3,limMin3,limMaxI3,limMinI3;
		float limMax4,limMin4,limMaxI4,limMinI4;
		double limMax5,limMin5,limMaxI5,limMinI5;
		/*Para las funciones que reciben mensaje simplemente hago una prueba valida, para comprobar que se ejecuta
		bien, ya que dentro de ellas estara la llamada a la funcion sin mensaje y con las pruebas de esta nos vale*/
		
		
		do {
			System.out.println("MENU -------------------------------");
			System.out.printf("1. Leer Caracter \n2. Leer Cadena \n3. Leer Booleano Caracter"
					+ " \n4. Leer Booleano Numero \n5. Leer Numero \n6. Limite \n7. Rango \n8. Salir");
			opcion = Teclado.leerByte();
			
			switch(opcion) {
			case 1:
//				PRUEBAS VALIDAS LEER CARACTER----------------------------------------------		
				System.out.println("PRUEBAS VALIDAS LEER CARACTER----------------------------------------------");
				
				System.out.println("Introduce un caracter: ");
				c = Teclado.leerChar();
				System.out.println("Caracter-numero(Devuelve el numero o el primero de ellos si hay mas de uno) Introduce un numero cualquiera : ");
				c1 = Teclado.leerChar();
				System.out.println("Caracter-cadena (Introduce una cadena): ");
				c2 = Teclado.leerChar();
				System.out.println("Caracter-Numero (Devuelve el codigo unicode del numero introducido o si hya mas de uno del primero)");
				c3 = Teclado.leerChar();
//				PRUEBA CON MENSAJE----------------------------------------------------------------------			
				c4 = Teclado.leerChar("Introduce un caracter: ");
				
				System.out.printf("%c %c %c %c %c",c,c1,c2,c3,c4);
				break;
			case 2:
//				PRUEBAS VALIDAS LEER CADENA----------------------------------------------		
				System.out.println("PRUEBAS VALIDAS LEER CADENA--------------------------------------------------");
				
				
				
				System.out.println("Introduce una cadena de texto: ");
				s1 = Teclado.leerCadena();
				System.out.println("Introduce un caracter (a, e i ó P): ");
				s2 = Teclado.leerCadena();
				System.out.println("Introduce un numero entero: ");
				s3 = Teclado.leerCadena();
				System.out.println("Introduce 0: ");
				s4 = Teclado.leerCadena();
				System.out.println("Introduce un numero decimal: ");
				s5 = Teclado.leerCadena();
//				PRUEBAS NO VALIDAS LEER CADENA----------------------------------------------		
				System.out.println("PRUEBAS NO VALIDAS LEER CADENA------------------------------------------------");
				
				System.out.println("Introduce cadena vacia(da intro)");
				s6 = Teclado.leerCadena();
//				PRUEBA CON MENSAJE ----------------------------------------------------------				
				s7 = Teclado.leerCadena("Introduce una cadena de texto: ");
				
				System.out.printf("%s %s %s %s %s %s %s",s1,s2,s3,s4,s5,s6,s7);
				
				break;
			case 3:
//		      PRUEBAS VALIDAS LEER BOOLEAN CARACTER ---------------------------------------		
				System.out.println("PRUEBAS VALIDAS LEER BOOLEAN CARACTER ---------------------------------------");
				
				
				System.out.println("Introduce s/S ó n/N");
				b1 = Teclado.leerBoolean("¿Estudias?");
//				PRUEBAS NO VALIDAS LEER BOOLEAN CARACTER -----------------------------------------		
				System.out.println("PRUEBAS NO VALIDAS LEER BOOLEAN CARACTER -------------------------------------");
				
				System.out.println("Introduce un numero entero: ");
				b2 = Teclado.leerBoolean("¿Estudias?");
				System.out.println("Introduce una cadena de texto: ");
				b3 = Teclado.leerBoolean("¿Estudias?");
				System.out.println("Introduce un caracter que no sea s/S ó n/N: ");
				b4 = Teclado.leerBoolean("¿Estudias?");
				
				System.out.printf("%b %b %b %b",b1,b2,b3,b4);
				break;
			case 4:
//				PRUEBAS VALIDAS LEER BOOLEAN NUMERO -----------------------------------------		
				System.out.println("PRUEBAS VALIDAS LEER BOOLEAN NUMERO -----------------------------------------");
				
				System.out.println("Introduce 1 ó 2");
				b5 = Teclado.leerBoolean("¿Estudias?","si","no");
//				PRUEBAS NO VALIDAS LEER BOOLEAN NUMERO -----------------------------------------		
				System.out.println("PRUEBAS NO VALIDAS LEER BOOLEAN NUMERO -------------------------------------");
				
				System.out.println("Introduce un numero entero distinto de 1 ó 2: ");
				b6 = Teclado.leerBoolean("¿Estudias?","si","no");
				System.out.println("Introduce una cadena de texto: ");
				b7 = Teclado.leerBoolean("¿Estudias?","si","no");
				System.out.println("Introduce un caracter: ");
				b8 = Teclado.leerBoolean("¿Estudias?","si","no");
				
				System.out.printf("%b %b %b %b",b5,b6,b7,b8);
				break;
			case 5:
				
				byte tipoNumero= 0;
				System.out.printf("1. Entero int \n2. Byte \n3. Short"
						+ " \n4. Long \n5. Float \n6. Double \n");
				switch(tipoNumero) {
				case 1:
//					PRUEBAS VALIDAS LEER INT--------------------------------------------------		
					System.out.println("PRUEBAS VALIDAS LEER INT--------------------------------------------------");
					
					
					System.out.println("Introduce un numero entero positivo: ");
					i1 = Teclado.leerEntero();
					System.out.println("Introduce un 0 : ");
					i2 = Teclado.leerEntero();
					System.out.println("Introduce un numero entero negativo: ");
					i3 = Teclado.leerEntero();
					
//					PRUEBAS NO VALIDAS LEER INT------------------------------------------------		
					System.out.println("PRUEBAS NO VALIDAS LEER INT------------------------------------------------");
					
					System.out.println("Introduce un caracter: ");
					i4 = Teclado.leerEntero();
					System.out.println("Introduce una cadena: ");
					i5 = Teclado.leerEntero();
					System.out.println("Introduce un numero decimal: ");
					i6 = Teclado.leerEntero();
					System.out.println("Introduce un numero fuera del rango de los INT [-2.147.483.648 - 2.147.483.649]-");
					i7 = Teclado.leerEntero();
//					PRUEBA CON MENSAJE
					Teclado.leerEntero("Introduce un numero de tipo int: ");
					break;
				case 2:
//					PRUEBAS VALIDAS LEER BYTE----------------------------------------------------		
					System.out.println("PRUEBAS VALIDAS LEER BYTE----------------------------------------------------");
					
					
					System.out.println("Introduce un numero entero byte positivo: ");
					by1 = Teclado.leerByte();
					System.out.println("Introduce un 0 : ");
					by2 = Teclado.leerByte();
					System.out.println("Introduce un numero entero byte negativo: ");
					by3 = Teclado.leerByte();
					
//					PRUEBAS NO VALIDAS LEER BYTE------------------------------------------------		
					System.out.println("PRUEBAS NO VALIDAS LEER BYTE------------------------------------------------");
					
					System.out.println("Introduce un caracter: ");
					by4 = Teclado.leerByte();
					System.out.println("Introduce una cadena: ");
					by5 = Teclado.leerByte();
					System.out.println("Introduce un numero decimal: ");
					by6 = Teclado.leerByte();
					System.out.println("Introduce un numero fuera del rango de los BYTE [-128 - 127]-");
					by7 = Teclado.leerByte();
//					PRUEBA CON MENSAJE
					Teclado.leerByte("Introduce un numero de tipo byte");
					break;
				case 3:
//					PRUEBAS VALIDAS SHORT--------------------------------------------------------		
					System.out.println("PRUEBAS VALIDAS SHORT--------------------------------------------------------");
					
					
					System.out.println("Introduce un numero entero short positivo: ");
					sh1 = Teclado.leerShort();
					System.out.println("Introduce un 0 : ");
					sh2 = Teclado.leerShort();
					System.out.println("Introduce un numero entero short negativo: ");
					sh3 = Teclado.leerShort();
					
//					PRUEBAS NO VALIDAS SHORT--------------------------------------------------------
					System.out.println("\"PRUEBAS NO VALIDAS SHORT--------------------------------------------------------");
					
					System.out.println("Introduce un caracter: ");
					sh4 = Teclado.leerShort();
					System.out.println("Introduce una cadena: ");
					sh5 = Teclado.leerShort();
					System.out.println("Introduce un numero decimal: ");
					sh6 = Teclado.leerShort();
					System.out.println("Introduce un numero fuera del rango de los SHORT [-32.768 - 32.767]-");
					sh7 = Teclado.leerShort();
//					PRUEBA CON MENSAJE
					Teclado.leerShort("Introduce un numero de tipo short");
					break;
				case 4:
//					PRUEBAS VALIDAS LONG---------------------------------------------------------		
					System.out.println("PRUEBAS VALIDAS LONG---------------------------------------------------------");
					
					
					
					System.out.println("Introduce un numero entero long positivo: ");
					l1 = Teclado.leerLong();
					System.out.println("Introduce un 0 : ");
					l2 = Teclado.leerLong();
					System.out.println("Introduce un numero entero long negativo: ");
					l3 = Teclado.leerLong();
					
//					PRUEBAS NO VALIDAS LEER LONG------------------------------------------------		
					System.out.println("PRUEBAS NO VALIDAS LEER LONG------------------------------------------------");
					
					System.out.println("Introduce un caracter: ");
					l4 = Teclado.leerLong();
					System.out.println("Introduce una cadena: ");
					l5 = Teclado.leerLong();
					System.out.println("Introduce un numero decimal: ");
					l6 = Teclado.leerLong();
					System.out.println("Introduce un numero fuera del rango de los LONG[-9*10^18 - 9*10^18]-");
					l7 = Teclado.leerLong();
//					PRUEBA CON MENSAJE
					Teclado.leerLong("Introduce un numero de tipo Long");
					break;
				case 5:
//					PRUEBAS VALIDAS FLOAT--------------------------------------------------------
					System.out.println("PRUEBAS VALIDAS FLOAT--------------------------------------------------------");
					
					
					System.out.println("Introduce un numero decimal positivo: ");
					f1 = Teclado.leerFloat();
					System.out.println("Introduce 0.0: ");
					f2 = Teclado.leerFloat();
					System.out.println("Introduce un numero decimal negativo: ");
					f3 = Teclado.leerFloat();
					System.out.println("Introduce un numero fuera del rango FLOAT [-3.4*10^38 - 3.4*10^38]");
					f4 = Teclado.leerFloat();
					
//					PRUEBAS NO VALIDAS FLOAT------------------------------------------------------
					System.out.println("PRUEBAS NO VALIDAS FLOAT------------------------------------------------------");
					
					System.out.println("Introduce un caracter: ");
					f5 = Teclado.leerFloat();
					System.out.println("Introduce una cadena de texto: ");
					f6 = Teclado.leerFloat();
//					PRUEBA CON MENSAJE
					Teclado.leerFloat("Introduce un numero de tipo Float");
					break;
					
				case 6:
//					PRUEBAS VALIDAS LEER DOUBLE--------------------------------------------------
					System.out.println("PRUEBAS VALIDAS LEER DOUBLE--------------------------------------------------");
					
					
					System.out.println("Introduce un numero decimal positivo: ");
					d1 = Teclado.leerDouble();
					System.out.println("Introduce 0.0: ");
					d2 = Teclado.leerDouble();
					System.out.println("Introduce un numero decimal negativo: ");
					d3 = Teclado.leerDouble();
					System.out.println("Introduce un numero fuera del rango DOUBLE [-1.79*10^308 - 1.79*10^308]");
					d4 = Teclado.leerDouble();
					
//					PRUEBAS NO VALIDAS DOUBLE------------------------------------------------------
					System.out.println("PRUEBAS NO VALIDAS DOUBLE------------------------------------------------------");
					
					System.out.println("Introduce un caracter: ");
					d5 = Teclado.leerDouble();
					System.out.println("Introduce una cadena de texto: ");
					d6 = Teclado.leerDouble();
					break;
				}
//				PRUEBA CON MENSAJE
				Teclado.leerDouble("Introduce un numero de tipo Double: ");
				break;
			case 6:
//				PRUEBAS VALIDAS LEER LIMITE--------------------------------------------------
				System.out.println("PRUEBAS VALIDAS LEER LIMITE--------------------------------------------------");
				
				System.out.println("TIPO BYTE");
				limMax = Teclado.Comparacion((byte) 50, Teclado.ES.MAYOR);
				limMin = Teclado.Comparacion((byte) 50, Teclado.ES.MENOR);
				limMaxI = Teclado.Comparacion((byte) 50, Teclado.ES.MAYOR_IGUAL);
				limMinI = Teclado.Comparacion((byte) 50, Teclado.ES.MENOR_IGUAL);
				
				System.out.println("TIPO INT");
				limMax1 = Teclado.Comparacion(50, Teclado.ES.MAYOR);
				limMin1 = Teclado.Comparacion(50, Teclado.ES.MENOR);
				limMaxI1 = Teclado.Comparacion(50, Teclado.ES.MAYOR_IGUAL);
				limMinI1= Teclado.Comparacion(50, Teclado.ES.MENOR_IGUAL);
				
				System.out.println("TIPO SHORT");
				limMax2 = Teclado.Comparacion((short) 50, Teclado.ES.MAYOR);
				limMin2 = Teclado.Comparacion((short) 50, Teclado.ES.MENOR);
				limMaxI2 = Teclado.Comparacion((short) 50, Teclado.ES.MAYOR_IGUAL);
				limMinI2 = Teclado.Comparacion((short) 50, Teclado.ES.MENOR_IGUAL);
				
				
				System.out.println("TIPO LONG");
				limMax3 = Teclado.Comparacion((long) 50, Teclado.ES.MAYOR);
				limMin3 = Teclado.Comparacion((long) 50, Teclado.ES.MENOR);
				limMaxI3 = Teclado.Comparacion((long) 50, Teclado.ES.MAYOR_IGUAL);
				limMinI3 = Teclado.Comparacion((long) 50, Teclado.ES.MENOR_IGUAL);
				
				System.out.println("TIPO FLOAT");
				limMax4 = Teclado.Comparacion(50.0f, Teclado.ES.MAYOR);
				limMin4 = Teclado.Comparacion(50.0f, Teclado.ES.MENOR);
				limMaxI4 = Teclado.Comparacion(50.0f, Teclado.ES.MAYOR_IGUAL);
				limMinI4 = Teclado.Comparacion(50.0f, Teclado.ES.MENOR_IGUAL);
				
				
				System.out.println("TIPO DOUBLE");
				limMax5 = Teclado.Comparacion(50.0, Teclado.ES.MAYOR);
				limMin5 = Teclado.Comparacion(50.0, Teclado.ES.MENOR);
				limMaxI5 = Teclado.Comparacion(50.0, Teclado.ES.MAYOR_IGUAL);
				limMinI5 = Teclado.Comparacion(50.0, Teclado.ES.MENOR_IGUAL);
				break;
			case 7:
//				PRUEBAS VALIDAS LEER RANGO---------------------------------------------------
				System.out.println("PRUEBAS VALIDAS LEER RANGO---------------------------------------------------");

				System.out.println("TIPO BYTE");
				rangoAmbExc = Teclado.Rango((byte)10, (byte)100,Teclado.Rango.AMBOS_EXCLUIDOS);
				rangoAmbInc = Teclado.Rango((byte)10, (byte)100,Teclado.Rango.AMBOS_INCLUIDOS);
				rangoMaxInc = Teclado.Rango((byte)10, (byte)100,Teclado.Rango.MAXIMO_INCLUIDO);
				rangoMinInc = Teclado.Rango((byte)10, (byte)100,Teclado.Rango.MINIMO_INCLUIDO);
				
				System.out.println("TIPO INT");
				rangoAmbExc1 = Teclado.Rango(10, 100,Teclado.Rango.AMBOS_EXCLUIDOS);
				rangoAmbInc1 = Teclado.Rango(10, 100,Teclado.Rango.AMBOS_INCLUIDOS);
				rangoMaxInc1 = Teclado.Rango(10, 100,Teclado.Rango.MAXIMO_INCLUIDO);
				rangoMinInc1 = Teclado.Rango(10, 100,Teclado.Rango.MINIMO_INCLUIDO);
				
				System.out.println("TIPO SHORT");
				rangoAmbExc2 = Teclado.Rango((short)10, (short)100,Teclado.Rango.AMBOS_EXCLUIDOS);
				rangoAmbInc2 = Teclado.Rango((short)10, (short)100,Teclado.Rango.AMBOS_INCLUIDOS);
				rangoMaxInc2 = Teclado.Rango((short)10, (short)100,Teclado.Rango.MAXIMO_INCLUIDO);
				rangoMinInc2 = Teclado.Rango((short)10, (short)100,Teclado.Rango.MINIMO_INCLUIDO);
				
				System.out.println("TIPO LONG");
				rangoAmbExc3 = Teclado.Rango((long)10, (long)100,Teclado.Rango.AMBOS_EXCLUIDOS);
				rangoAmbInc3 = Teclado.Rango((long)10, (long)100,Teclado.Rango.AMBOS_INCLUIDOS);
				rangoMaxInc3 = Teclado.Rango((long)10, (long)100,Teclado.Rango.MAXIMO_INCLUIDO);
				rangoMinInc3= Teclado.Rango((long)10, (long)100,Teclado.Rango.MINIMO_INCLUIDO);
				
				System.out.println("TIPO FLOAT");
				rangoAmbExc4 = Teclado.Rango(10.0f, 100.0f,Teclado.Rango.AMBOS_EXCLUIDOS);
				rangoAmbInc4 = Teclado.Rango(10.0f, 100.0f,Teclado.Rango.AMBOS_INCLUIDOS);
				rangoMaxInc4 = Teclado.Rango(10.0f, 100.0f,Teclado.Rango.MAXIMO_INCLUIDO);
				rangoMinInc4= Teclado.Rango(10.0f, 100.0f,Teclado.Rango.MINIMO_INCLUIDO);
				
				
				System.out.println("TIPO DOUBLE");
				rangoAmbExc5 = Teclado.Rango((double)10, (double)100,Teclado.Rango.AMBOS_EXCLUIDOS);
				rangoAmbInc5 = Teclado.Rango((double)10, (double)100,Teclado.Rango.AMBOS_INCLUIDOS);
				rangoMaxInc5 = Teclado.Rango((double)10, (double)100,Teclado.Rango.MAXIMO_INCLUIDO);
				rangoMinInc5= Teclado.Rango((double)10, (double)100,Teclado.Rango.MINIMO_INCLUIDO);
				break;
			case 8:
				salir = true;
				break;
			}
		}while(!salir);
		
	}

}
