package ITAcademyM03;

import java.util.*;
import javax.swing.*;

import java.util.Arrays;

public class M3Nivell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/** NIVELL 3
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
