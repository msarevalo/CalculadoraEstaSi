package co.unbosque.isii.calculadora_pruebas;

import java.util.HashMap;

public class EncontrarComando {

	public static HashMap<Character, Comando> operaciones;
	
	public static Comando cmd(Character digito) throws ComandoNoEncontradoException {
		// TODO Auto-generated method stub
		Character digito2 = digito;
		if(operaciones.containsKey(digito2))
			return operaciones.get(digito2);
		throw new ComandoNoEncontradoException();
	}

	public static void addOp(Comando c) {
		// TODO Auto-generated method stub
		if(operaciones==null)
			operaciones= new HashMap<Character, Comando>();
		operaciones.put('+', c);
		operaciones.put('-', c);
		operaciones.put('*', c);
		operaciones.put('/', c);
		operaciones.put('c', c);
	}

}