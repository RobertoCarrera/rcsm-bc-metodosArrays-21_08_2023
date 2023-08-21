import java.util.Scanner;

public class esPrimoApp {

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
    
    public static boolean esPrimo(int num) {
    	
        if (num <= 1) {
        	
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
        	
            if (num % i == 0) {
            	
                return false;
            }
        }
        
        return true;
    }
}