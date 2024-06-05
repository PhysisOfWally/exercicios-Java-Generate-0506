package main;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		/* Com base na tabela abaixo, escreva um algoritmo 
		 * em Java que leia o código de um item (número inteiro de 1 a 6) 
		 * e a quantidade comprada deste item (número inteiro). A seguir, 
		 * mostre na tela o valor total da conta e o nome do produto que 
		 * foi comprado.*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando as variaveis
		int codigo, qntd;
		double valorTotal = 0.00;
		float valorProduto = 0.00f;
		String nomeProduto = "";
		
		//Entrada de dados
		System.out.println("----------------------------------------------------------------------");
        System.out.println("Código do Produto\tProduto\t\t\tPreço Unitário\n");
        System.out.println("1\t\t\tCachorro Quente\t\tR$ 10.00");
        System.out.println("2\t\t\tX-Salada\t\tR$ 15.00");
        System.out.println("3\t\t\tX-Bacon\t\t\tR$ 18.00");
        System.out.println("4\t\t\tBauru\t\t\tR$ 12.00");
        System.out.println("5\t\t\tRefrigerante\t\tR$ 8.00");
        System.out.println("6\t\t\tSuco de laranja\t\tR$ 13.00");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Entre com o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Informe a quantidade que deseja: ");
        qntd = sc.nextInt();

		//Parte lógica do código

        switch (codigo) {
            case 1:
                nomeProduto = "Cachorro Quente";
                valorProduto = 10.00f;
                break;
            case 2:
                nomeProduto = "X-Salada";
                valorProduto = 15.00f;
                break;
            case 3:
                nomeProduto = "X-Bacon";
                valorProduto = 18.00f;
                break;
            case 4:
                nomeProduto = "Bauru";
                valorProduto = 12.00f;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                valorProduto = 8.00f;
                break;
            case 6:
                nomeProduto = "Suco de laranja";
                valorProduto = 13.00f;
                break;
            default:
                System.out.println("Produto não existe!!!");
        }
        
        // Cálculo do valor total
        valorTotal = qntd * valorProduto;
        
        // Exibição do resultado
        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
		
		sc.close();
	}

}
