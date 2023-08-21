import java.util.Scanner;

public class convertirABinarioApp {

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);
        
        int numero = 0;
        String binario = "";
        
        System.out.print("Introduce un número en base decimal: ");
        numero = teclado.nextInt();
        
        binario = decimalABinario(numero);
        
        System.out.println("El número " + numero + " en base binaria es: " + binario);
    }
    
    public static String decimalABinario(int num) {
    	
    	String binario = "";
        String binarioInvertido = "";
    	
        if (num == 0) {
        	
            return "0";
        }
                
        while (num > 0) {
        	
            binario += num % 2;
            num /= 2;
        }
        
        for (int i = binario.length() - 1; i >= 0; i--) {
        	
            binarioInvertido += binario.charAt(i);
        }
        
        return binarioInvertido;
    }
}