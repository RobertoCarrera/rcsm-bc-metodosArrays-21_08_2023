import java.util.Scanner;

public class arrayAleatoriosapp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del array: ");
		int tamano = teclado.nextInt();
		int[] numeros = new int[tamano];
		
		rellenarValores(numeros);
		mostrarValores(numeros);
	}
	
	public static void rellenarValores(int[] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)(Math.random() * 10);
		}
	}
	
	public static void mostrarValores(int[] numeros) {
		
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
			suma += numeros[i];
		}
		
		System.out.println("Suma de todos los valores: " + suma);
	}
}