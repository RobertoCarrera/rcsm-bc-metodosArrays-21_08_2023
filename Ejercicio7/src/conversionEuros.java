import java.util.Scanner;

public class conversionEuros {

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);
        
        double euros;
        int moneda;
        
        System.out.print("Introduce una cantidad en euros: ");
        euros = teclado.nextDouble();
        
        do {
            System.out.print("Introduce la moneda a la que deseas convertir (1. dolares, 2. yenes o 3. libras): ");
           moneda = teclado.nextInt();
        }while((moneda < 1)||(moneda > 3));
        
        convertirEuros(euros, moneda);
    }
    
    public static void convertirEuros(double euros, int moneda) {
        double conversion = 0;
        
        switch (moneda) {
            case 1:
                conversion = euros * 1.21;
                System.out.println(euros + " euros son " + conversion+ " dolares");
                break;
            case 2:
                conversion = euros * 133.51;
                System.out.println(euros + " euros son " + conversion+ " yenes");
                break;
            case 3:
                conversion = euros * 0.86;
                System.out.println(euros + " euros son " + conversion+ " libras");
                break;
            default:
                System.out.println("Error en el programa.");
                return;
        }
    }
}
