import java.util.Scanner;

public class arrayPosicionesApp {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		rellenarValores(numeros);
		mostrarValores(numeros);
	}

	public static void rellenarValores(int[] numeros) {
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Introduce el valor para la posición " + i + ": ");
			numeros[i] = teclado.nextInt();
		}
	}

	public static void mostrarValores(int[] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Índice: " + i + "- Valor: " + numeros[i]);
		}
	}
}