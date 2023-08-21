import java.util.Scanner;
public class calcularAreaApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		int opcion = 0;
		double area = 0;
		
		do {
			System.out.println("Qué área quieres calcular: ");
			System.out.println("1. Círculo | 2. Triángulo | 3. Cuadrado");
			System.out.print("Elección: ");
			opcion = teclado.nextInt();
			
		}while((opcion < 1)||(opcion >3));
		switch(opcion) {
		
			case 1:
				
				double radio = 0;
				
				System.out.println("Dame el radio del círculo: ");
				radio = teclado.nextDouble();
				area = calculaAreaCirculo(radio);
				System.out.println("El área = "+area);
				System.out.println("Fin del programa");
				break;
				
			case 2:
				
				double base = 0;
				double altura = 0;
				
				System.out.println("Dame la base del triángulo: ");
				base = teclado.nextDouble();
				System.out.println("Ahora la altura: ");
				altura = teclado.nextDouble();
				area = calculaAreaTriangulo(base, altura);
				System.out.println("El área = "+area);
				System.out.println("Fin del programa");
				break;
				
			case 3:
				
				double lado = 0;
				
				System.out.println("Dame el  lado del cuadrado: ");
				lado = teclado.nextDouble();
				area = calculaAreaCuadrado(lado);
				System.out.println("El área = "+area);
				System.out.println("Fin del programa");
				break;
				
			default:
				
				System.out.println("Error en el programa");
				break;
		}
	}
	
	public static double calculaAreaCirculo(double radio) {
		
		double area = 0;
		
		area = (radio*radio)*Math.PI;
		
		return area;
	}
	

	public static double calculaAreaTriangulo(double altura, double base) {
		
		double area = 0;
		
		area = (base*altura)/2;
		
		return area;
	}
	

	public static double calculaAreaCuadrado(double lado) {
		
		double area = 0;
		
		area = lado*lado;
		
		return area;
	}
}