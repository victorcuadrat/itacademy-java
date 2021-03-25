package ITAcademyM03;

import java.util.*;
import javax.swing.*;

import java.util.Arrays;

public class M3Nivell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/** NIVELL 3
		 * Escriviu un programa que donat un numero N retorni la seq��ncia de 
		 * Fibonacci fins al numero N.La seq��ncia de Fibonacci 
		 * �s la s�rie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
		 * El n�mero seg�ent es troba sumant els dos n�meros anteriors. 
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
