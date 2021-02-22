package ITAcademyM03;
import java.util.*;
import javax.swing.*;

public class M3Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** NIVELL 1
		 * - Fase 1
			Crea sis variables tipu string buides. 
			Demana per consola que s’introdueixin els noms.  
			Introdueix els següents noms de ciutats 
			(Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. 
			Mostra per consola el nom de les 6 ciutats. 
		 */
		
		String ciutat1 = new String();
		String ciutat2 = new String();
		String ciutat3 = new String();
		String ciutat4 = new String();
		String ciutat5 = new String();
		String ciutat6 = new String();
		
		ciutat1 = JOptionPane.showInputDialog("Ciutat:");
		System.out.println(ciutat1);
		
		ciutat2 = JOptionPane.showInputDialog("Ciutat:");
		System.out.println(ciutat2);
		
		ciutat3 = JOptionPane.showInputDialog("Ciutat:");
		System.out.println(ciutat3);
		
		ciutat4 = JOptionPane.showInputDialog("Ciutat:");
		System.out.println(ciutat4);
		
		ciutat5 = JOptionPane.showInputDialog("Ciutat:");
		System.out.println(ciutat5);
		
		ciutat6 = JOptionPane.showInputDialog("Ciutat:");
		System.out.println(ciutat6);
		
		// x6
		
		/**
		 * - Fase 2
			Un cop tenim els noms de les ciutats guardats en variables 
			haurem de pasar l’informacio a un array (arrayCiutats). 
			Quan tinguem l’array ple, haurem de mostrar per consola el nom 
			de les ciutats ordenadas per ordre alfabetic. 
		 */
		
		/**
		 * - Fase 3
			Cambieu les vocals “a” dels noms de les ciutats per 
			el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). 
			Mostreu per consola l’array modificat i ordenat per ordre alfabetic. 
		 */
		
		/**
		 * - Fase 4
			Creeu un nou array per cada una de les ciutats que tenim. 
			La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).  
			Ompliu els nous arrays lletra per lletra. 
			Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 
		 */
		
		/** NIVELL 2
		 * En aquest exercici crearàs un array bidimensional on introduiràs 3 notes per a 5 alumnes. 
		 * Es calcularà la nota mitjana de cada alumna i s'indicarà si han suspès o no. 
			Crea un array bidimensional capaç de guardar 3 notes de 5 alumnes. 
			Omple l’array amb un bucle demanant els valors per pantalla (nota entre 0 i 10),
			 has d’identificar per pantalla quan és una agrupació d’un alumne nou .
			Recorre l'array, fes la Mitjana aritmètica de les 3 notes i indica si l'alumne 
			ha aprovat o suspès 
		 */
		
		/**
		 * Escriviu un programa que donat un numero N retorni la seqüència de 
		 * Fibonacci fins al numero N.La seqüència de Fibonacci 
		 * és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
		 * El número següent es troba sumant els dos números anteriors. 
		 */
	}

}
