package co.unbosque.isii.calculadora_pruebas;

import java.awt.Image;
import java.util.Scanner;

<<<<<<< HEAD:src/main/java/co/unbosque/isii/calculadora_pruebas/PrincipalPrueba.java
public class PrincipalPrueba {
=======
import javax.swing.ImageIcon;

public class Principal {
>>>>>>> 270dd44ff7b5a637f5362faf137f3e4f9bcb0c42:src/main/java/co/unbosque/isii/calculadora_pruebas/Principal.java

	public static void main(String[] args) throws ComandoNoEncontradoException {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String cadena = null;
		int respuesta = 0;
		int contador = 1;

		System.out.println("Escriba EXIT para salir");
		while (respuesta == 0) {
<<<<<<< HEAD:src/main/java/co/unbosque/isii/calculadora_pruebas/PrincipalPrueba.java
			//try {
=======
			try {
				//contador=1;
>>>>>>> 270dd44ff7b5a637f5362faf137f3e4f9bcb0c42:src/main/java/co/unbosque/isii/calculadora_pruebas/Principal.java
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
<<<<<<< HEAD:src/main/java/co/unbosque/isii/calculadora_pruebas/PrincipalPrueba.java
			/*} catch (Exception e) {
				System.out.println(e);
				System.out.println("Oh Oh algo ha sucedido, intenta de nuevo\n");
			}*/
=======
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
>>>>>>> 270dd44ff7b5a637f5362faf137f3e4f9bcb0c42:src/main/java/co/unbosque/isii/calculadora_pruebas/Principal.java
		}

		teclado.close();

	}

}
