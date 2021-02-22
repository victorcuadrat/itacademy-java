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
		
		/** NIVELL 2
		 * En aquest exercici crearàs un array bidimensional on introduiràs 3 notes per a 5 alumnes. 
		 * Es calcularà la nota mitjana de cada alumna i s'indicarà si han suspès o no. 
			Crea un array bidimensional capaç de guardar 3 notes de 5 alumnes. 
			Omple l’array amb un bucle demanant els valors per pantalla (nota entre 0 i 10),
			 has d’identificar per pantalla quan és una agrupació d’un alumne nou .
			Recorre l'array, fes la Mitjana aritmètica de les 3 notes i indica si l'alumne 
			ha aprovat o suspès 
			
			Array de prova:
			int[][] notesAlumnes = {
			  {1, 2, 3}, 
		      {4, 5, 6}, 
		      {7, 8, 9},
		      {7, 8, 9},
		      {7, 8, 9},
		};
		 */

		
		int[][] notesAlumnes = new int[5][3];
		for (int a = 0; a < notesAlumnes.length; ++a) {
            for (int n = 0; n < notesAlumnes[a].length; ++n) {
            	int input = -1;
            	while ((input < 0) || (input > 10)) {
            		String text = String.format("Nota % 1d alumne %1d (rang 0-10): ", n + 1, a + 1);
            		input = Integer.parseInt(JOptionPane.showInputDialog(text));
            	}
            	notesAlumnes[a][n] =  input;
            }
        }
		
		for (int a = 0; a < notesAlumnes.length; ++a) {
			int temp = 0;
            for (int n = 0; n < notesAlumnes[a].length; ++n) {
                temp += notesAlumnes[a][n];
            }
            int avg = temp/notesAlumnes[a].length;
            
            if ( avg >= 5) {
            	String text = String.format("Alumne %1d, amb nota mitja %1d, està aprovat.", a + 1, avg );
            	System.out.println(text);
            } else {
            	String text = String.format("Alumne %1d, amb nota mitja %1d, està suspès.", a + 1, avg );
            	System.out.println(text);
            }
        }
		
		
		/**
		 * Escriviu un programa que donat un numero N retorni la seqüència de 
		 * Fibonacci fins al numero N.La seqüència de Fibonacci 
		 * és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
		 * El número següent es troba sumant els dos números anteriors. 
		 */
		
		int numero = 15;
		int[] Fibonacci = new int[numero];
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
		
		for (int num = 2; num < numero; ++num) {
			Fibonacci[num] = Fibonacci[num - 1] + Fibonacci[num - 2];
		}
		System.out.print("Seq Fibonacci: ");
		System.out.println(Arrays.toString(Fibonacci));
	}

}
