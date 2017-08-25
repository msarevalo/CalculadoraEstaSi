package co.unbosque.isii.calculadora_pruebas;

import java.util.Stack;

public class PilasNumeros {
	
	private static Stack<Double> numeros = new Stack<Double>();

	public Stack<Double> getNumeros() {
		return numeros;
	}

	public static void setNumeros(Stack<Double> numeros) {
		PilasNumeros.numeros = numeros;
	}

}
