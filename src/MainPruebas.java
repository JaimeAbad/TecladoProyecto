
public class MainPruebas {

	public static void main(String[] args) {

		String b1,b2,b3;
		b1 = "elige un color su primo";
		b2 = "ROJO";
		b3 = "ASUL";
		boolean color;
		byte x;
		
//		System.out.printf("%s",b1);
//		System.out.printf("\n  1.- %s",b2);
//		System.out.printf("\n  2.- %s",b3);
		
//		color  = Teclado.leerBoolean("color?", "rojo", b3);
//		System.out.println(color);
		
		
		System.out.println();
		
		System.out.println(b2.equals(b3));
		
		System.out.println("Introduce un byte");
		x = Teclado.leerByte();
		System.out.println(x);
		
	}

}
