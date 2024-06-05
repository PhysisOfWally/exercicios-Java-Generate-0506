package main;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia um número inteiro via 
		 * teclado e mostre na tela uma mensagem indicando se 
		 * este número é * par ou ímpar e se o número é positivo ou negativo. 
		 * Veja os exemplos abaixo:*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando as variaveis
		int number;
		
		//Entrada de dados
		System.out.println("Entre com um número: ");
		number = sc.nextInt();
		
		//Parte lógica do código
		if(number < 0) {
			//numero negativo
			if(number % 2 == 0) {
				//numero par
				System.out.printf("O número %d é NEGATIVO e PAR", number);
			}else {
				System.out.printf("O número %d é NEGATIVO e ÍMPAR", number);
			}
		}else {
			//numero positivo
			if(number % 2 == 0) {
				//numero par
				System.out.printf("O número %d é POSITIVO e PAR", number);
			}else {
				System.out.printf("O número %d é POSITIVO e ÍMPAR", number);
			}
		}
		
		sc.close();

	}

}
