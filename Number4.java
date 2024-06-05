package main;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia 3 palavras 
		 * (String), que definem as características de um tipo 
		 * de animal possível segundo o diagrama abaixo, que 
		 * deve ser lido da esquerda para a direita.*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando as variaveis
		String carac1, carac2, carac3;
		
		//Entrada de dados
		System.out.print("Insira a característica 1: ");
		carac1 = sc.nextLine();
		
		System.out.print("Insira a característica 2: ");
		carac2 = sc.nextLine();
		
		System.out.print("Insira a característica 3: ");
		carac3 = sc.nextLine();
		
		//Parte lógica do código
		if(carac1.equalsIgnoreCase("VERTEBRADO")) {
			if(carac2.equalsIgnoreCase("AVE")) {
				if(carac3.equalsIgnoreCase("CARNIVORO")) {
					System.out.println("ÁGUIA");
				}else if(carac3.equalsIgnoreCase("ONIVORO")) {
					System.out.println("POMBA");
				}
			}else if(carac2.equalsIgnoreCase("MAMIFERO")){
				if(carac3.equalsIgnoreCase("ONIVORO")) {
					System.out.println("HOMEM");
				}else if(carac3.equalsIgnoreCase("HERBIVORO")) {
					System.out.println("VACA");
				}
			}
		}else if(carac1.equalsIgnoreCase("INVERTEBRADO")){
			if(carac2.equalsIgnoreCase("INSETO")) {
				if(carac3.equalsIgnoreCase("HEMATOFAGO")) {
					System.out.println("PULGA");
				}else if(carac3.equalsIgnoreCase("HERBIVORO")) {
					System.out.println("LAGARTA");
				}
			}else if(carac2.equalsIgnoreCase("ANELIDEO")){
				if(carac3.equalsIgnoreCase("HEMATOFAGO")) {
					System.out.println("SANGUESSUGA");
				}else if(carac3.equalsIgnoreCase("ONIVORO")) {
					System.out.println("MINHOCA");
				}
			}
		}
		
		sc.close();
	}

}
