import java.util.Scanner;

public class buscarDigitoApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del array: ");
		int tamano = teclado.nextInt();
		int[] numeros = new int[tamano];
		
		rellenarValores(numeros);
		
		int digito = 0;

		System.out.print("Introduce el dígito a buscar: ");
		do{
			
			digito = teclado.nextInt();
		}while (digito < 0 || digito > 9);
		
		buscarDigito(numeros, digito);
	}
	
	public static void rellenarValores(int[] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)(Math.random() * 300 + 1);
		}
		
		System.out.println("El array rellando es = ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
		}
	}
	
	public static void buscarDigito(int[] numeros, int digito) {
						
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] % 10 == digito) {

				System.out.println("Números encontrados con el dígito "+digito+":");
				System.out.println(numeros[i]);
			}
		}
	}
}