package co.unbosque.isii.calculadora_pruebas;

import java.util.ArrayList;

public class SepararSignos {

	public static ArrayList<String> separacionSignos(String cadena) {
		// TODO Auto-generated method stub
		String[] ope;
		ArrayList<String> operadores = new ArrayList<String>();
		ope = cadena.split("[0-9]");
		
		System.out.println(ope.length);
		for(int i = 0; i<ope.length;i++) {
			operadores.add(ope[i]);
		//	System.out.println("Prueba 1 " + operadores.get(i));
		}
		//System.out.println(operadores.size());
		//operadores.remove(0);
		for(int i = 0; i<operadores.size();i++) {
			if(operadores.get(i).isEmpty()) {
				operadores.remove(i);
			}
		}
		
		return operadores;
	}

}
