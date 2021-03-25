package ITAcademyM03;

import java.util.*;
import javax.swing.*;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class M3Nivell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f
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
		
		/**
		 * - Fase 2
			Un cop tenim els noms de les ciutats guardats en variables 
			haurem de pasar l’informacio a un array (arrayCiutats). 
			Quan tinguem l’array ple, haurem de mostrar per consola el nom 
			de les ciutats ordenadas per ordre alfabetic. 			
		 */
		
		// String[] arrayCiutats = {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"};
		
		String[] arrayCiutats = {
				ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6
		};
		
		Arrays.sort(arrayCiutats);
		System.out.println(Arrays.toString(arrayCiutats));
		
		/**
		 * - Fase 3
			Cambieu les vocals “a” dels noms de les ciutats per 
			el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). 
			Mostreu per consola l’array modificat i ordenat per ordre alfabetic. 
		 */
		
		String[] arrayCiutatsModificades = new String[6];
		int i = 0;
		
		for (String ciutat : arrayCiutats) {
			String tempCiutat = "";
			char[] charCiutat = ciutat.toCharArray();
			
			for (char ch : charCiutat) {
				if (ch == 'a') {
					// char uses ' instead of "
					tempCiutat += '4';
				} else {
					tempCiutat += ch;
				}
			}
			// System.out.print(tempCiutat.getClass());
			arrayCiutatsModificades[i] = tempCiutat;
			i++;
		}
		
		Arrays.sort(arrayCiutatsModificades);
		System.out.println(Arrays.toString(arrayCiutatsModificades));
		
		/**
		 * - Fase 4
			Creeu un nou array per cada una de les ciutats que tenim. 
			La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).  
			Ompliu els nous arrays lletra per lletra. 
			Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 
		 */
		
		for (String ciutat : arrayCiutats) {
			
			// String tempCiutatMod = "";
			char[] tempCiutat = new char[ciutat.length()];
			char[] charCiutat = ciutat.toCharArray();
			
			for (int j = 0; j < charCiutat.length ; j++) {
		    	tempCiutat[j] = charCiutat[charCiutat.length - 1 - j];
		    }
			System.out.print(charCiutat);
			System.out.print(" - ");
			System.out.println(tempCiutat);
		}
		
	}

}
