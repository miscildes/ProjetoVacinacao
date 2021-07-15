package br.com.progvacinacao;

import java.util.Scanner;

public class SituacaoGeral {

	public static void dadosGerais() {
		System.out.println("========================================== Informa��es Gerais =========================================");
		System.out.println("\n*Fa�a o seu Pr�-Cadastro no site Vacina J�! (https://www.vacinaja.sp.gov.br/)");
		System.out.println("\n*Caso n�o possua, no dia da vacina��o levar RG, Cart�o do SUS e Comprovante de Resid�ncia.");
		System.out.println("\nTodas as vacinas protegem contra o Covid -19 de forma eficiente.");

		System.out.println("\n====================================== Imunobiol�gicos (Vacinas) ======================================");
		System.out.println("\nASTRAZENECA | OXFORD (2 Doses)");
		System.out.println("\nCORONAVAC | BUTANTAN (2 Doses)");
		System.out.println("\nJANSSEN | JOHNSON & JOHNSON (Dose �nica)");
		System.out.println("\nPFIZER | BIONTECH (2 Doses)");

		System.out.println("\n=========================== Quadro Geral de Vacinados no Estado de S�o Paulo ==========================");
		System.out.println("\nPrimeira Dose ---> 21.404.663");
		System.out.println("\nSegunda Dose ---> 6.494.595");
		System.out.println("\nDose �nica ---> 737.085 ");
		System.out.println("\nPorcentagem da popula��o vacinada ---> 15,62%");

		System.out.println("\n=========================== Quadro Geral de Vacinados na Cidade de S�o Paulo ==========================");
		System.out.println("\nPrimeira Dose ---> 5.936.812");
		System.out.println("\nSegunda Dose ---> 1.758.930");
		System.out.println("\nDose �nica ---> 290.477 ");
		System.out.println("\nPorcentagem da popula��o vacinada ---> 8%");

		Scanner ler = new Scanner(System.in);
		int opcao;

		System.out.println("\n========================================= Selecione uma op��o =========================================");
		System.out.println("\n1. Voltar ao menu");
		System.out.println("\n2. Sair");

		opcao = ler.nextInt();

		if (opcao == 1) {
			MenuInicial.menu();
		}

		else if (opcao == 2) {
			System.out.println("\nVacina J�! ");
			
		}

	}
}
