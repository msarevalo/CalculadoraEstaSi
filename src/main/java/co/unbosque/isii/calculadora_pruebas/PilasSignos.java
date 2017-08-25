package co.unbosque.isii.calculadora_pruebas;

import java.util.Stack;

public class PilasSignos {
	
	private static Stack<Character> signos = new Stack<Character>();
	/*public static Stack<String> pilas(String cadena) {
		Stack<String> signos = new Stack<String>();
		
		/*signos.push(new Character('^'));
		signos.push(new Character('+'));
		signos.push(new Character('*'));
		while(!signos.isEmpty()) {
		System.out.println(signos.pop());}
		
		return signos;
	}*/

	public Stack<Character> getSignos() {
		return signos;
	}

	public static void setSignos(Stack<Character> signos) {
		PilasSignos.signos = signos;
	}
}
