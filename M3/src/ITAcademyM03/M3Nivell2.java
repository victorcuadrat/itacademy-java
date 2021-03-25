package ITAcademyM03;

import java.util.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class M3Nivell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	}

}
