import java.util.Scanner;
public class generarAleatoriosapp {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int min, max, cantidad, aleatorio, i;
		
		i = 0;
		
		System.out.println("Dime el rango mínimo donde buscaremos números: ");
		min = teclado.nextInt();
		System.out.println("Dime el rango máximo donde buscaremos números: ");
		max = teclado.nextInt();
		System.out.println("Cuántos aleatorios quieres buscar?");
		cantidad = teclado.nextInt();
		do {
			
			aleatorio = buscarAleatorios(min,max);
			System.out.println("El número aleatorio número "+(i+1)+" es = "+aleatorio);
			i++;
		}while(i<cantidad);
		
	}

	public static int buscarAleatorios (int minimo, int maximo) {
		
		int aleatorio = (int)(Math.random() * (maximo-minimo+1))+minimo;
		
		return aleatorio;
	}
}