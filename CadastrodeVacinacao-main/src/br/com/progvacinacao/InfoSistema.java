package br.com.progvacinacao;

import java.util.Scanner;

public class InfoSistema {
	
	public static void infsistema(){
		
		System.out.println("======================================== Informa��es do Sistema =======================================");
		System.out.println("\n*O objetivo do Dissemina Vac � levar informa��o referente a vacina��o "
				+ "\ncontra a COVID na Cidade de S�o Paulo");
		System.out.println("\n*Fornecemos informa��es gerais de controle de vacina��o e coletamos"
				+ "\n dados para melhor auxiliar quem esta em busca orienta��o");

		System.out.println("\n============================================ Equipe T�cnica ===========================================");
		System.out.println("\nAlessandro Dias Jr"
							+ "\nGillie Hope"
							+ "\nJonatas Ribeiro"
							+ "\nKelvin Silva"
							+ "\nLucas Otoni");
		
		
		System.out.println("\n========================================== Vers�o do Sistema ==========================================");
		System.out.println("\n1.0.0");


		
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
			System.out.println("\nVacina J�!");
			
		}
	}

}
