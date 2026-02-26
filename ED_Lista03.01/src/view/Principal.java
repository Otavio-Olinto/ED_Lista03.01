/*
 * Crie uma função recursiva que exiba a quantidade de dígitos de um número inteiro passado como 
parâmetro.
 */

package view;

import controller.Digitos;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe Digitos
		Digitos metodo = new Digitos();
		
		int num = 13579; 
		
		System.out.println("O número "+num+" possui "+metodo.quantidade(num)+" dígitos");

	}

}
