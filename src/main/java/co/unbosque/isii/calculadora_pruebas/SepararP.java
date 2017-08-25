package co.unbosque.isii.calculadora_pruebas;

public class SepararP {

	public static double separacion(String cadena) throws ComandoNoEncontradoException {
	
		PilasSignos pilaS = new PilasSignos();
		PilasNumeros pilaN = new PilasNumeros();
		MatrizPrioridad mat = new MatrizPrioridad();
		//String variables[] = null;
		Character digito;
		Character variable = null;
		double temporal = 0;
		int aux=0;
		int auxVariable=0;
		for(int i=0; i<cadena.length();i++) {
			digito = cadena.charAt(i);
			if(digito.equals('+') || digito.equals('-')||digito.equals('*')||digito.equals('/')|| (i+1)>=cadena.length()) {
				String numero="";
				if((i+1)>=cadena.length()) {
					for(int j=aux;j<=i;j++) {
						aux=i+1;
						numero+=cadena.charAt(j);
						
					}double numeros = Double.parseDouble(numero);
					pilaN.getNumeros().push(numeros);
				}else {
					for(int j=aux;j<i;j++) {
						aux=i+1;
						numero+=cadena.charAt(j);
						
					}double numeros = Double.parseDouble(numero);
					pilaN.getNumeros().push(numeros);
				}
				
				//variables[auxVariable]= numero;
				//System.out.println(numero);
				//double numeros = Double.parseDouble(numero);
				//System.out.println(numeros);
				//pilaN.getNumeros().push(numeros);
				numero="";
			}
		}
				
		for(int i=0; i<cadena.length();i++) {
			digito = cadena.charAt(i);
			if(!digito.equals('+') && !digito.equals('-') && !digito.equals('*') && !digito.equals('/')) {
				//temporal = (temporal*10) + Double.parseDouble(""+digito);
				//pilaN.getNumeros().push(temporal);
			}else {
				if(pilaS.getSignos().isEmpty()) {
					pilaS.getSignos().push(digito);
				}else {
					variable = pilaS.getSignos().pop();
					int respuesta = mat.matrizPrincipal(variable, digito);
					//System.out.println(respuesta);
					if(respuesta == 1) {
						//System.out.println("Pasa");
						ActivarComando.activar(variable);
						Comando operacion = EncontrarComando.cmd(variable);
						double numero1 = pilaN.getNumeros().pop();
						double numero2 = pilaN.getNumeros().pop();
						double resultado = operacion.ejecutarOperacion(numero2, numero1);
						//System.out.println(resultado);
						pilaN.getNumeros().push(resultado);
						pilaS.getSignos().push(digito);
					}else {
						//System.out.println("No Pasa");
						pilaS.getSignos().push(variable);
						pilaS.getSignos().push(digito);
					}
				}
				temporal = 0;
			}
			
		}
		//System.out.println(pilaS.getSignos().size());
		//System.out.println(pilaN.getNumeros().size());
		//int rango = pilaN.getNumeros().size();
		//int rangoS = pilaS.getSignos().size();
		/*for(int i = 0; i < rango; i++) {
			System.out.println(pilaN.getNumeros().pop());
		}*/
		/*for(int i=0; i<rangoS;i++) {
			System.out.println(pilaS.getSignos().pop());
		}*/
		//System.out.println(pilaN.getNumeros().size());
		while(pilaS.getSignos().size()>1) {
			char signo1 = pilaS.getSignos().pop();
			char signo2 = pilaS.getSignos().pop();
			int respuesta = mat.matrizPrincipal(signo2, signo1);
			if(respuesta == 1) {
				//System.out.println("Pasa1");
				ActivarComando.activar(signo2);
				Comando operacion = EncontrarComando.cmd(signo2);
				double numero1 = pilaN.getNumeros().pop();
				double numero2 = pilaN.getNumeros().pop();
				double numero3 = pilaN.getNumeros().pop();
				//System.out.println(numero3 + " " + numero2);
				double resultado = operacion.ejecutarOperacion(numero3, numero2);
				//System.out.println(resultado);
				pilaN.getNumeros().push(resultado);
				pilaN.getNumeros().push(numero1);
				pilaS.getSignos().push(signo1);
			}else {
				//System.out.println("Pasa2");
				ActivarComando.activar(signo1);
				Comando operacion = EncontrarComando.cmd(signo1);
				double numero1 = pilaN.getNumeros().pop();
				double numero2 = pilaN.getNumeros().pop();
				double numero3 = pilaN.getNumeros().pop();
				//System.out.println(numero3 + " " + numero2);
				double resultado = operacion.ejecutarOperacion(numero2, numero1);
				//System.out.println(resultado);
				pilaN.getNumeros().push(resultado);
				pilaN.getNumeros().push(numero3);
				pilaS.getSignos().push(signo2);
			}
		}
		
		char ultimo = pilaS.getSignos().pop();
		ActivarComando.activar(ultimo);
		Comando operacion = EncontrarComando.cmd(ultimo);
		double numero1 = pilaN.getNumeros().pop();
		double numero2 = pilaN.getNumeros().pop();
		//double numero3 = pilaN.getNumeros().pop();
		//System.out.println(numero2 + " " + numero1);
		double resultado = operacion.ejecutarOperacion(numero2, numero1);
		//System.out.println(resultado);
		//pilaN.getNumeros().push(resultado);
		
		return resultado;
		
		/*int rango = pilaN.getNumeros().size();
		int rangoS = pilaS.getSignos().size();
		for(int i = 0; i < rango; i++) {
			System.out.println(pilaN.getNumeros().pop());
		}
		for(int i=0; i<rangoS;i++) {
			System.out.println(pilaS.getSignos().pop());
		}*/
	}
	
	/*public static void main(String[] args) throws ComandoNoEncontradoException {
		separacion("5*3+2");
	}*/
}
