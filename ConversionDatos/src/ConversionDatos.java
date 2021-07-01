
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tipos de datos en Java
		 * Numericos: byte(-128 a 127), short, int, long, float, double.
		 * Booleanos (true, false): boolean.
		 * Caracter: char.
		 * Cadena: String.
		 * 
		 * */
		byte numeropequeno = 127;
		byte otronumeropequeno = 1;
		byte suma = (byte) (numeropequeno + otronumeropequeno);
		
		int numero1 = 1000;
		long numero2 = numero1;
		float numero3 = numero2;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(suma);
	}

}
