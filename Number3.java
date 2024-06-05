package main;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		/* Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
		 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for 
		 * a sua primeira doação. Escreva um Algoritmo em Java que obtenha 
		 * via teclado o nome do doador (String), a idade (inteiro) do 
		 * doador e se é a primeira doação (boolean). De acordo com as 
		 * Regras para a doação, mostre na tela se o doador está Apto ou 
		 * Não Apto para doar sangue. Veja os exemplos abaixo:*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando as variaveis
		String nome;
		int idade;
		boolean doacao;
		
		//Entrada de dados
		System.out.print("Insira o nome do doador: ");
		nome = sc.nextLine();
		
		System.out.print("Insira a idade do doador: ");
		idade = sc.nextInt();
		
		System.out.println("Primeira doação de sangue? (responda com 'true' ou 'false')");
		doacao = sc.nextBoolean();
		
		//Parte lógica do código
		if(idade >= 18 && idade <= 59) {
			//tem idade para doar
			System.out.printf("%s está apto para doar sangue!", nome);
		}else if(idade >= 60 && idade <= 69 && doacao == true) {
			//tem idade para doar mas com uma condicao
			System.out.printf("%s está apto para doar sangue!", nome);
		}else {
			//Não tem idade para doar
			System.out.printf("%s não está apto para doar sangue!", nome);
		}
		
		sc.close();
	}

}
