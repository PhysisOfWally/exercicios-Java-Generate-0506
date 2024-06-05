package main;

import java.util.Scanner;

public class Number6 {

	public static void main(String[] args) {
		/* Com base na tabela abaixo, escreva um algoritmo 
		 * em Java que leia o código de um item (número inteiro de 1 a 6) 
		 * e a quantidade comprada deste item (número inteiro). A seguir, 
		 * mostre na tela o valor total da conta e o nome do produto que 
		 * foi comprado.*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando as variaveis
		int codigo;
		String nome, cargo = "";
		float salario = 0.00f;
		float porcentagem = 0.00f;
		float novoSalario;
		
		//Entrada de dados
        System.out.print("Digite o nome do colaborador: ");
        nome = sc.nextLine();

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Código do Cargo\t\tCargo\t\t\tPercentual do Reajuste");
        System.out.println("1\t\t\tGerente\t\t\t10%");
        System.out.println("2\t\t\tVendedor\t\t7%");
        System.out.println("3\t\t\tSupervisor\t\t9%");
        System.out.println("4\t\t\tMotorista\t\t6%");
        System.out.println("5\t\t\tEstoquista\t\t5%");
        System.out.println("6\t\t\tTécnico de TI\t\t8%");
        System.out.println("----------------------------------------------------------------------");
        
        System.out.print("Digite o código do cargo (1 a 6): ");
        codigo = sc.nextInt();

        System.out.print("Digite o salário do colaborador: ");
        salario = sc.nextFloat();

        // uso do switch no menu
        switch (codigo) {
            case 1:
                cargo = "Gerente";
                porcentagem = 1.10f;
                break;
            case 2:
                cargo = "Vendedor";
                porcentagem = 1.07f;
                break;
            case 3:
                cargo = "Supervisor";
                porcentagem = 1.09f;
                break;
            case 4:
                cargo = "Motorista";
                porcentagem = 1.06f;
                break;
            case 5:
                cargo = "Estoquista";
                porcentagem = 1.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                porcentagem = 1.08f;
                break;
            default:
                System.out.println("Código do cargo inválido!");
                System.exit(1);
        }

        // Cálculo do novo salário
        novoSalario = salario * porcentagem;

        // Exibição do resultado
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Nome do Colaborador: %s%n", nome);
        System.out.printf("Cargo: %s%n", cargo);
        System.out.printf("Salário Reajustado: R$ %.2f%n", novoSalario);
        System.out.println("----------------------------------------------------------------------");

		sc.close();
	}

}
