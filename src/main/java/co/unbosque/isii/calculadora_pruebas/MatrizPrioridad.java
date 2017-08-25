package co.unbosque.isii.calculadora_pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
//import java.util.Map;
import java.util.Scanner;

import javax.swing.RowFilter.Entry;

import org.testng.internal.collections.Pair;

public class MatrizPrioridad {
	
	public static int matriz() {
		/*ArrayList<Contenido> matriz = new ArrayList<Contenido>();
		Contenido cont;*/
		
		//HashMap<Entry<Character, Character>, Integer> matriz = new HashMap<Entry<Character,Character>, Integer>();
	 
		
		/*Pair<Character, Character> suma_resta = new Pair<Character, Character>('+', '-');
		Pair
		
		matriz.put(suma, 1);
		matriz.put(suma_resta, 0);*/
		//matriz.add(cont);
		
		//Map<new Map<Character, Character>, Integer> matriz = new Map<new Map<Character, Character>, Integer>;
		HashMap<HashMap<Character, Character>, Integer> matriz = new HashMap<HashMap<Character,Character>, Integer>();;
		
		matriz.put(new HashMap<Character, Character>(){{put('+','+');}}, 1);
		//prueba
		
		return matriz.get('+');
	}
	
	public static Integer matrizSuma(Character obten) {
		HashMap< Character, Integer> suma = new HashMap<Character, Integer>();
		
		suma.put('+', 1);
		suma.put('-', 1);
		suma.put('*', 0);
		suma.put('/', 0);
		Integer resultado = null;
				
		resultado = suma.get(obten);
		
		return resultado;		
	}
	
	public static Integer matrizResta(Character obten) {
		HashMap< Character, Integer> resta = new HashMap<Character, Integer>();
		
		resta.put('+', 0);
		resta.put('-', 1);
		resta.put('*', 0);
		resta.put('/', 0);
		Integer resultado = null;
				
		resultado = resta.get(obten);
		
		return resultado;		
	}
	
	public static Integer matrizMultiplica(Character obten) {
		HashMap< Character, Integer> multiplica = new HashMap<Character, Integer>();
		
		multiplica.put('+', 1);
		multiplica.put('-', 1);
		multiplica.put('*', 1);
		multiplica.put('/', 1);
		Integer resultado = null;
				
		resultado = multiplica.get(obten);
		
		return resultado;		
	}
	
	public static Integer matrizDivide(Character obten) {
		HashMap< Character, Integer> deivide = new HashMap<Character, Integer>();
		
		deivide.put('+', 1);
		deivide.put('-', 1);
		deivide.put('*', 0);
		deivide.put('/', 1);
		Integer resultado = null;
				
		resultado = deivide.get(obten);
		
		return resultado;		
	}
	
	/*public static void main(String[] args) {
		System.out.println(matrizSuma('/'));
		System.out.println(matrizResta('-'));
		System.out.println(matrizMultiplica('+'));
		System.out.println(matrizDivide('+'));
		
	}*/
	
	public Integer matrizPrincipal(Character signo, Character obten) {
		//HashMap<Character, Integer> matriz = new HashMap<Character, Integer>();
		Integer respuesta = null;
		if(signo.equals('+')) {
			respuesta = matrizSuma(obten);
			//EncontrarComando.addOp(new Suma());
			//System.out.println(matrizSuma(obten));
		}else {
			if(signo.equals('-')) {
				respuesta = matrizResta(obten);
				//EncontrarComando.addOp(new Resta());
			}else {
				if(signo.equals('*')) {
					respuesta = matrizMultiplica(obten);
					//EncontrarComando.addOp(new Multiplica());
				}else {
					if(signo.equals('/')) {
						respuesta = matrizDivide(obten);
						//EncontrarComando.addOp(new Divide());
					}else {
						if(signo.equals('p')) {
							respuesta = 1;
						}
					}
				}
			}
		}
		/*if(respuesta == 1) {
			ActivarComando.activar(obten);
		}else {
			ActivarComando.activar(signo);
		}*/
		
		return respuesta;
		//return matriz.get(obten);
	}
}
