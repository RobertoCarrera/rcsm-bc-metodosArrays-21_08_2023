import java.util.Scanner;

//La verdad, no entiendo muy bien el ejercicio, he hecho lo que he podido
//con lo que he entendido

public class reasignacionValoresApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce la dimensión de los arrays: ");
		int tamano = teclado.nextInt();
		int[] numeros1 = new int[tamano];
		int[] numeros2 = new int[tamano];
		
		rellenarValores(numeros1);
		reasignarValores(numeros2, numeros1);
		int[] multiplicacion = multiplicarArrays(numeros1, numeros2);

		System.out.println("El array multiplicado es = ");
		for (int i = 0; i < multiplicacion.length; i++) {

			System.out.println("Valor "+i+" - "+multiplicacion[i]);
		}
	}
	
	public static void rellenarValores(int[] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)(Math.random() * 10);
		}

		System.out.println("El primer array, aleatorio, es = ");
		for (int i = 0; i < numeros.length; i++) {
					
			System.out.println("Valor "+i+" - "+numeros[i]);
		}
	}
	
	public static void reasignarValores(int[] numeros, int[] original) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)(Math.random() * 10);
			original[i] = numeros[i];
		}
		
		System.out.println("El segundo, reasignado, es = ");
		
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Valor "+i+" - "+numeros[i]);
		}
	}
	
	public static int[] multiplicarArrays(int[] numeros1, int[] numeros2) {
		
		int[] resultado = new int[numeros1.length];
		
		for (int i = 0; i < resultado.length; i++) {
			
			resultado[i] = numeros1[i] * numeros2[i];
		}
		
		return resultado;
	}
}