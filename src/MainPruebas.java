public class MainPruebas {

	public static void main(String[] args) {

		String b1,b2,b3;
		b1 = "elige un colors";
		b2 = "ROJO";
		b3 = "ASUL";
//		boolean color;
		byte z = 6;
		
//		System.out.printf("%s",b1);
//		System.out.printf("\n  1.- %s",b2);
//		System.out.printf("\n  2.- %s",b3);
		
//		color  = Teclado.leerBoolean("color?", "rojo", b3);
//		System.out.println(color);
		
		
		System.out.println();
		
//		System.out.println(b2.equals(b3));
//		byte x;
//		System.out.println("Introduce un byte");
//		x = Teclado.leerByte();
//		System.out.println(x);
		
		Teclado.Comparacion(z, Teclado.ES.MAYOR);
		
//		b1 = Teclado.leerCadena();
//		System.out.println(b1);
		
		char c;
		
		c = Teclado.leerChar();
		System.out.println(c);
	}

}
