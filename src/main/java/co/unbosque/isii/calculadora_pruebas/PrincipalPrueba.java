package co.unbosque.isii.calculadora_pruebas;

import java.awt.Image;
import java.util.Scanner;

public class PrincipalPrueba {
	public static void main(String[] args) throws ComandoNoEncontradoException {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String cadena = null;
		int respuesta = 0;
		int contador = 1;

		System.out.println("Escriba EXIT para salir");
		while (respuesta == 0) {
			//try {
			try {
				//contador=1;
				System.out.println("Escriba la operacion a realizar");
				cadena = teclado.nextLine();

				if (cadena.equals("exit") || cadena.equals("Exit") || cadena.equals("EXIT")) {
					System.out.println("Gracias por usar la Calculadora!!");
					respuesta = 1;
				} else {
					if (!cadena.isEmpty()) {
						System.out.printf("El resultado de %s es %.2f\n\n", cadena, SepararP.separacion(cadena));
						contador = 1;
					}else {
						
					}
				}
			/*} catch (Exception e) {
				System.out.println(e);
				System.out.println("Oh Oh algo ha sucedido, intenta de nuevo\n");
			}*/

			} catch (Exception e) {
				switch (contador) {
				case 1:
					System.out.println("Ooops!!! algo ha sucedido, intenta de nuevo");
					contador++;
					break;

				case 2:
					System.out.println("Oiga, que esta ingresando algo mal!");
					contador++;
					break;
				case 3:
					System.out.println("Estoy perdiendo la paciencia, no escriba mal");
					contador++;
					break;
				case 4:
					System.out.println("SE LO ADVERTÍ!!!");
					respuesta = 1;
					break;
				default:
					break;
				}
				
			}
		}

		teclado.close();

	}

}
