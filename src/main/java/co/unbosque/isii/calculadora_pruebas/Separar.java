package co.unbosque.isii.calculadora_pruebas;

import java.util.Scanner;

public class Separar {

	/*static PilasSignos pilaS = new PilasSignos();
	static PilasNumeros pilaN = new PilasNumeros();
	static MatrizPrioridad mat = new MatrizPrioridad();*/
	
	public static void main(String[] args) throws ComandoNoEncontradoException {
		Scanner teclado = new Scanner(System .in);
		String cadena;
		
		//System.out.println("Escriba una cadena cualquiera: ");
		//cadena = teclado.nextLine();
		
		//System.out.println(MatrizPrioridad.matrizPrincipal('+', '+'));
		separacion("10*560/14*2");
	}

	public static void separacion(String cadena) throws ComandoNoEncontradoException {
		PilasSignos pilaS = new PilasSignos();
		PilasNumeros pilaN = new PilasNumeros();
		MatrizPrioridad mat = new MatrizPrioridad();
		Character digito;
		//pilaN.getNumeros().push(0);
		double temporal = 0;
		double temporal2 = 0;
		/*EncontrarComando.addOp(new Suma());
		EncontrarComando.addOp(new Resta());
		EncontrarComando.addOp(new Multiplica());
		EncontrarComando.addOp(new Divide());*/
		
		for(int i=0; i<cadena.length();i++) {
			digito = cadena.charAt(i);
			if(!digito.equals('+') && !digito.equals('-') && !digito.equals('*') && !digito.equals('/')){
				//temporal = pilaN.getNumeros().pop();
				temporal = (temporal * 10) + Double.parseDouble(""+digito);
				//pilaN.getNumeros().push(temporal);
				temporal2 = temporal;
				//System.out.println(temporal2);
			}else {
				pilaN.getNumeros().push(temporal);
				//System.out.println(digito);
				if(pilaS.getSignos().isEmpty()) {
					pilaS.getSignos().push(digito);
				}else {
					System.out.println("Prueba");
					char signo = pilaS.getSignos().pop();
					System.out.println(signo);
					System.out.println(digito);
					int resultado = mat.matrizPrincipal(signo, digito);
					if(resultado == 0) {
						System.out.println("Prueba3");
						ActivarComando.activar(digito);
						Comando operacion = EncontrarComando.cmd(digito);
						//System.out.println(pilaN.getNumeros().get(i));
						System.out.println(temporal);
						double numero1 = pilaN.getNumeros().pop();
						double respuesta = operacion.ejecutarOperacion(numero1, temporal2);
						System.out.println(respuesta + "Esta es");
						pilaN.getNumeros().push(respuesta);
						pilaS.getSignos().push(signo);
					}else {
						System.out.println("Prueba4");
						ActivarComando.activar(signo);
						Comando operacion = EncontrarComando.cmd(signo);
						double numero1=pilaN.getNumeros().pop();
						double numero2=pilaN.getNumeros().pop(); 
						System.out.println(temporal);
						double respuesta = operacion.ejecutarOperacion(numero1, numero2);
						System.out.println(respuesta + "Esta es2");
						pilaN.getNumeros().push(respuesta);
						pilaS.getSignos().push(digito);
					}
				}
				temporal = 0;
				temporal2=0;
			}
			//pilaN.getNumeros().push(temporal);
		}
		pilaN.getNumeros().push(temporal);
		for(int i=0;i<pilaS.getSignos().size();i++) {
			System.out.println(pilaS.getSignos().get(i));
		}
		
		for(int i=0;i<pilaN.getNumeros().size();i++) {
			System.out.println(pilaN.getNumeros().get(i));
		}
		System.out.println(pilaS.getSignos().isEmpty());
		while(!pilaS.getSignos().isEmpty()) {
			char sig = pilaS.getSignos().pop();
			//EncontrarComando.addOp(new Suma());
			ActivarComando.activar(sig);
			Comando operacion = EncontrarComando.cmd(sig);
			double numero1=pilaN.getNumeros().pop();
			double numero2=pilaN.getNumeros().pop(); 
			double respuesta = operacion.ejecutarOperacion(numero1, numero2);
			pilaN.getNumeros().push(respuesta);
		}
		
		for(int i=0;i<pilaN.getNumeros().size();i++) {
			System.out.println(pilaN.getNumeros().get(i));
		}
	}
}
