/*
 * Soma Simples
 * 
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, 
 * calcule a soma entre elas e atribua à variável SOMA. 
 * A seguir escrever o valor desta variável.
 * 
 * Entrada:
 * O arquivo de entrada contém 2 valores inteiros.
 * 
 * Saída:
 * Imprima a mensagem "SOMA" com todas as letras maiúsculas, 
 * com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente 
 * à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
 * caso contrário, você receberá "Presentation Error".
 * */

package br.com.logica.exercicio.beecrowd;

import java.util.Scanner;

public class Exercicio1003 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		input.close();
		int soma = A + B;

		System.out.println("SOMA = " + soma);

	}

}
