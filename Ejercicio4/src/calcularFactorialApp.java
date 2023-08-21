import java.util.Scanner;

public class calcularFactorialApp {

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    public static int calcularFactorial(int num) {
    	
    	int factorial = 1;
        
        for (int i = 1; i <= num; i++) {
        	
            factorial *= i;
        }
        
        return factorial;
    }
}