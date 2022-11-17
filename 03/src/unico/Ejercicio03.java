package unico;

public class Ejercicio03 {

	public static void main(String[] args) {

/* Implementar un método que calcule y muestre el área o el volumen
 * de un cilindro, según se especifique. Para distinguir un caso
 * de otro se le pasará un número 1 (para área) o 2 (para volumen).
 * Además, hemos de pasarle al método el radio de la base y la altura.
 */

		int opc;
		double radio;
		double altura;
		double resultado = 0.00;
		
		opc = Util.leerInt("Indique una de las opciones siguientes [1 - Cálculo de área, 2 - Cálculo de volumen]: ");
		radio = Util.leerDouble("¿Cuánto mide el radio?: ");
		altura = Util.leerDouble("¿Cuánto mide la altura?: ");
		
		
		switch (opc) {
			case 1: area(radio, altura);
				break;
			case 2: volumen(radio, altura);
				break;
			default: System.out.println("ERROR. Opción no encontrada");
		}
		
		Util.escribirLn("El resultado de la opración es: " + resultado);
	}

	public static void area (double r, double h) {
		final double PI = 3.14;
		double a;
		a = 2 * PI * r * (h+r);
		System.out.println("El área del cilindro es: " + a);
	}
	
	public static void volumen (double r, double h) {
		final double PI = 3.14;
		double v;
		v = PI * r * r * h;
		System.out.println("El volumen del cilindro es: " + v);;
	}
	
}

/* resultado = calculoCilindro(opc, radio, altura);
 * util.escribir ("El resultado es: " + resultado);
 * 
 * public static double calculoCilindro (int codigo, double r, double h
 * 		double resultado = 0.00;
 * 		
 * 		if switch codigo {
 * 			case 1: 
 * 				resultado = Math.PI * Math.pow(r, 2) * h;
 * 				break;
 * 			case 2: resultado = 2 * Math.PI * r * (h + r); 
 * 				break;
 * 			default: 
 * 				resultado: 0.00
 * 		}
 * 		return resultado;
 */
