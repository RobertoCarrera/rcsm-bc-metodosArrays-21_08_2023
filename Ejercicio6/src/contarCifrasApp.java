import java.util.Scanner;

public class contarCifrasApp {

    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	
    	int numero = 0;
    	int cifras = 0;
    	
    	//De esta manera, controlo que sea un número entero positivo
    	do {
    		System.out.println("Dame el número y contaré las cifras que tiene: ");
    		numero = teclado.nextInt();
    	}while(numero <= 0);
    	
    	cifras = contarCifras(numero);
    	System.out.println(numero+" tiene "+cifras+" cifras");
    }
    
    public static int contarCifras(int num) {
    	
    	int contador = 0;
    	
    	do {
    		
    		num /= 10;
    		contador++;
    	}while(num > 0);
    	
    	return contador;
    }
}