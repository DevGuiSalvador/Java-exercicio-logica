/*
 * O Maior
 * 
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da 
 * mensagem “eh o maior”. Utilize a fórmula:
 * 
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
 * Um segundo passo, portanto é necessário para chegar no resultado esperado.
 * 
 * Entrada:
 * O arquivo de entrada contém três valores inteiros.
 * 
 * Saída:
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 * */

package br.com.logica.exercicio.beecrowd;

import java.util.Scanner;

public class Exercicio1013 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int a = input.nextInt(); int b = input.nextInt(); int c = input.nextInt();
        input.close();

        int maiorABS = ((a + b + Math.abs(a - b)) / 2);
        int maiorC = ((maiorABS + c + Math.abs(maiorABS - c)) / 2);

        System.out.println(maiorC + " eh o maior");

	}

}
