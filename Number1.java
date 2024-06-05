package main;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		/* Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
		imprima na tela se a soma de A + B é maior, menor ou igual a C.*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando as variaveis
		int a, b, c, soma;
		
		//Entrada de dados
		System.out.println("Entre com o valor de A: ");
		a = sc.nextInt();
		
		System.out.println("Entre com o valor de B: ");
		b = sc.nextInt();
		
		System.out.println("Entre com o valor de C: ");
		c = sc.nextInt();
		
		//Parte lógica do código
		soma = a + b;
		
		if(soma > c) {
			System.out.printf("A soma de A e B (%d) é MAIOR que C (%d)", soma, c);
		}else if(soma < c){
			System.out.printf("A soma de A e B (%d) é MENOR que C (%d)", soma, c);
		}else if(soma == c) {
			System.out.printf("A soma de A e B (%d) é IGUAL que C (%d)", soma, c);
		}
		
		sc.close();
	}

}
