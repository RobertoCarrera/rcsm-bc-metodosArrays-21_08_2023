import java.util.Scanner;

public class aleatoriosPrimosApp {

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
			while (!esPrimo(numeros[i])) {
				
				numeros[i] = (int)(Math.random() * 10);
			}
		}
	}
	
	public static void mostrarValores(int[] numeros) {
		
		int maximo = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
			if (numeros[i] > maximo) {
				
				maximo = numeros[i];
			}
		}
		
		System.out.println("El valor máximo es: " + maximo);
	}
	
	public static boolean esPrimo(int numero) {
		
	    if (numero <= 1) {
	    	
	        return false;
	    }
	    for (int i = 2; i < numero; i++) {
	    	
	        if (numero % i == 0) {
	        	
	            return false;
	        }
	    }
	    return true;
	}
}
