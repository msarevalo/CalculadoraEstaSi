/*package co.unbosque.isii.calculadora_pruebas;

import java.util.ArrayList;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


public class NewTest {
  
	@Test
 	public void debeSumarCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Suma());
		Comando operacion = EncontrarComando.cmd("+");
		//Operaciones op = new Operaciones();
		double resultado = operacion.ejecutarOperacion(3.2, 5);
		double experado = 8.2;
		AssertJUnit.assertEquals(resultado, experado);
	}
	
	/*@Test(expectedExceptions=ComandoNoEncontradoException.class)
	public void noDebeEncontrarOperacionPotencia() throws ComandoNoEncontradoException {
		omando operacion = EncontrarComando.cmd("^"); 
	}
	
	@Test
	public void laOperacionSumaExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Suma());
		Comando operacion = EncontrarComando.cmd("+");
		AssertJUnit.assertTrue(operacion instanceof Suma);
	}
	
	@Test
	public void laOperacionRestaExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Resta());
		Comando operacion = EncontrarComando.cmd("-");
		AssertJUnit.assertTrue(operacion instanceof Resta);
	}
	
	@Test
 	public void debeRestarCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Resta());
		Comando operacion = EncontrarComando.cmd("-");
		//Operaciones op = new Operaciones();
		double resultado = operacion.ejecutarOperacion(10, 3);
		double experado = 7;
		AssertJUnit.assertEquals(resultado, experado);
	}
	
	@Test
	public void laOperacionMultiplicacionExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Multiplica());
		Comando operacion = EncontrarComando.cmd("*");
		AssertJUnit.assertTrue(operacion instanceof Multiplica);
	}
	
	@Test
 	public void debeMultiplicarCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Multiplica());
		Comando operacion = EncontrarComando.cmd("*");
		//Operaciones op = new Operaciones();
		double resultado = operacion.ejecutarOperacion(10, 3);
		double experado = 30;
		AssertJUnit.assertEquals(resultado, experado);
	}
	
	@Test
	public void laOperacionDivisionExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Divide());
		Comando operacion = EncontrarComando.cmd("/");
		AssertJUnit.assertTrue(operacion instanceof Divide);
	}
	
	@Test
 	public void debeDividirCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Divide());
		Comando operacion = EncontrarComando.cmd("/");
		//Operaciones op = new Operaciones();
		double resultado = operacion.ejecutarOperacion(10, 5);
		double experado = 2;
		AssertJUnit.assertEquals(resultado, experado);
	}
	
	@Test
	public void laSeparacionDeNumerosExiste() throws ComandoNoEncontradoException {
		//Comando comando;
		String cadena = "1+2+1+1+1";
		ArrayList<Double> separacion = SepararNumeros.separacionNumeros(cadena);
		double expected = 2;
		AssertJUnit.assertEquals(expected, separacion.get(1));
	}
	
	@Test
	public void laSeparacionDeOperadoresExiste() throws ComandoNoEncontradoException {
		//Comando comando;
		String cadena = "1-5-2+1+1*1/5";
		ArrayList<String> separacion = SepararSignos.separacionSignos(cadena);
		String expected = "-";
		/*for(int i = 0; i<separacion.size();i++) {
			System.out.println(separacion.get(i));
		}
		System.out.println(separacion.size());
		AssertJUnit.assertEquals(expected, separacion.get(0));
	}
	
	@Test
	public void laOperacionCoseno() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Coseno());
		Comando operacion = EncontrarComando.cmd("cos");
		AssertJUnit.assertTrue(operacion instanceof Coseno);
	}
	
	@Test
 	public void debeSacarCosenoCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Coseno());
		Comando operacion = EncontrarComando.cmd("cos");
		//Operaciones op = new Operaciones();
		double resultado = operacion.ejecutarOperacion(10, 90);
		double experado = 0;
		AssertJUnit.assertEquals(resultado, experado);
	}
	
}*/