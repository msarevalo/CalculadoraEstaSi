package co.unbosque.isii.calculadora_pruebas;

public class ActivarComando {

	public static void activar(Character signo) {
		if(signo.equals('+')) {
			//System.out.println("Suma");
			EncontrarComando.addOp(new Suma());
		}else {
			if(signo.equals('-')) {
				//System.out.println("Resta");
				EncontrarComando.addOp(new Resta());
			}else {
				if(signo.equals('*')) {
					//System.out.println("Multiplica");
					EncontrarComando.addOp(new Multiplica());
				}else {
					if(signo.equals('/')) {
						//System.out.println("Divide");
						EncontrarComando.addOp(new Divide());
					}
				}
			}
		}
	}
}
