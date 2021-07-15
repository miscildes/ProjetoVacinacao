package br.com.progvacinacao;

import java.util.Scanner;

public class Cadastro {

	static void cadastrando() {
			
		Scanner ler = new Scanner(System.in);
		Usuario user1 =  new Usuario();
		Perguntas perguntas1 = new Perguntas();
		
		System.out.println("***************************************** PREENCHA O CADASTRO *****************************************\n");
		System.out.println("Digite seu nome completo: ");
		user1.setNome(ler.nextLine());
		
		System.out.println("\nDigite o seu CPF (Sem pontos e tra�os: ex.: 12345678910).");
		user1.setCpf(ler.nextLong());	
		
		System.out.println("\nQual a sua idade? ");
		user1.setIdade(ler.nextInt());
		
		if(user1.getIdade() <= 0 || user1.getIdade() >= 120 ) {
			System.out.println("Idade inv�lida\n");
			Cadastro.cadastrando();			
		}
				
		System.out.println("\nDe acordo com as regi�es abaixo digite o n�mero correspondente"
				+ " a sua regi�o:" +"\n1- Centro \n2- Norte \n3- Leste \n4- Sul \n5- Oeste");
		user1.setRegiao(ler.nextInt());
						
		System.out.println("\n**************************************** COMO PODEMOS AJUDAR? *****************************************\n"
				+ "\nDigite o n�mero para op��o desejada: \n1- Mais informa��es sobre vacina��o \n2- Voltar ao menu \n");
		perguntas1.setAjuda(ler.nextInt());
			
		
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 1 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda n�o chegou a sua vez!!!\n\nA ANVISA autorizou crian�as com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a libera��o, todas as informa��es estar�o dispon�veis para voc�!\n\nVamos deixar a informa��o sobre o posto central de vacina��o da sua regi�o.\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 2) {
			MenuInicial.menu();
		}
				
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 2 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda n�o chegou a sua vez!!!\n\nA ANVISA autorizou crian�as com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a libera��o, todas as informa��es estar�o dispon�veis para voc�!\n\nVamos deixar a informa��o sobre o posto central de vacina��o da sua regi�o.\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
					+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");	
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 3 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda n�o chegou a sua vez!!!\n\nA ANVISA autorizou crian�as com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a libera��o, todas as informa��es estar�o dispon�veis para voc�!\n\nVamos deixar a informa��o sobre o posto central de vacina��o da sua regi�o.\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");	
			MenuInicial.menu();
		}

		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 4 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda n�o chegou a sua vez!!!\n\nA ANVISA autorizou crian�as com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a libera��o, todas as informa��es estar�o dispon�veis para voc�!\n\nVamos deixar a informa��o sobre o posto central de vacina��o da sua regi�o.\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 1 && user1.getIdade() < 12 && user1.getIdade() > 0 && user1.getRegiao() == 5 ) {			
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nAinda n�o chegou a sua vez!!!\n\nA ANVISA autorizou crian�as com 12 anos ou mais para se vacinarem."
					+ "\nAssim que ocorrer a libera��o, todas as informa��es estar�o dispon�veis para voc�!\n\nVamos deixar a informa��o sobre o posto central de vacina��o da sua regi�o.\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
					+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
			MenuInicial.menu();
		}
		
		if(perguntas1.getAjuda() == 1) {			
			System.out.println("Voc� tomou a 1� dose da vacina? Digite 1 ou 2 nas op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setVacina1(ler.nextInt());
			
		}
					
		if(perguntas1.getVacina1() == 1) {			
			System.out.println("\nDigite o n�mero correspodente para qual fabricante foi aplicada a 1� dose em voc�:\n1- Coronavac (Butantan) "
					+ "\n2- AstraZeneca/Oxford (Fiocruz) \n3- Pfizer (BioNTech) \n4- Jassen (Johnson & Johnson) ");
			perguntas1.setFabricante(ler.nextInt());	
				
		}
		
		if(perguntas1.getFabricante() == 1) {			
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nVoc� tomou a 2� dose? Digite 1 ou 2 nas op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setCoronavac1(ler.nextInt());						
		}
		
		if(perguntas1.getCoronavac1() == 1) {			
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\n\nParab�ns!!!\n \nFicamos muito felizes que voc� tomou as duas doses!\n"
					+ "\nAinda precisamos da sua colabora��o para vencermos o V�rus.\nA vacina te protege mas n�o eximi o cont�gio.\n\n-----------------------------------------------Importante----------------------------------------------"
					+ "\n\nContinue seguindo as recomedan��es dos �rg�os de sa�de:\n \n-Use m�scara. \n-Lave suas m�os com frequ�ncia. Use sab�o e "
					+ "�gua ou �lcool em gel.\n-Matenha o distanciamento social sempre que poss�vel.\n \n#Vacinaparatodos \n---------------------------------------------------------------------------"
					+ "----------------------------");									
		}
		
		if(perguntas1.getCoronavac1() == 2) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nFazem 28 dias ou mais que voc� tomou a 1� dose? Digite 1 ou 2 nas"
					+ " op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setCoronavac2S(ler.nextInt());
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 1) {
			System.out.println("\n======================================= Coronavac (Butantan) ======================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 -"
					+ " Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n--------------------------------------------------------------------------"
					+ "-----------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 2) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
			+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 3) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
			+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 4) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
			+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getCoronavac2S() == 1 && user1.getRegiao() == 5) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
			+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
			+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}				
		
		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 1) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEst� quase l�!!!\nAguarde o prazo de 28 dias e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n--------------------------------------------------------------------------------"
					+ "-----------------------");			
		}				

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 2) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEst� quase l�!!!\nAguarde o prazo de 28 dias e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
					+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 3) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEst� quase l�!!!\nAguarde o prazo de 28 dias e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacina-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 4) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEst� quase l�!!!\nAguarde o prazo de 28 dias e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getCoronavac2S() == 2 && user1.getRegiao() == 5) {
			System.out.println("\n========================================= Coronavac (Butantan) ========================================\nEst� quase l�!!!\nAguarde o prazo de 28 dias e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
					+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getFabricante() == 2) {			
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nVoc� tomou a 2� dose? Digite 1 ou 2 nas op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setAstrazeneca1(ler.nextInt());						
		}
		
		if(perguntas1.getAstrazeneca1() == 1) {			
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\n\nParab�ns!!!\n \nFicamos muito felizes que voc� tomou as duas doses!\n"
					+ "\nAinda precisamos da sua colabora��o para vencermos o V�rus.\nA vacina te protege mas n�o eximi o cont�gio.\n\n-----------------------------------------------Importante----------------"
					+ "------------------------------\n\nContinue seguindo as recomedan��es dos �rg�os de sa�de:\n \n-Use m�scara. \n-Lave suas m�os com frequ�ncia. Use sab�o e "
					+ "�gua ou �lcool em gel.\n-Matenha o distanciamento social sempre que poss�vel.\n \n#Vacinaparatodos \n-----------------------------------------------------------------------------------"
					+ "--------------------");								
		}
		
		if(perguntas1.getAstrazeneca1() == 2) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nFazem 12 semanas ou mais que voc� tomou a 1� dose? Digite 1 ou 2 nas"
					+ " op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setAstrazeneca2S(ler.nextInt());
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 1) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n---------------------------------------------------------------------"
					+ "----------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 2) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
			+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 3) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
			+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 4) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
			+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getAstrazeneca2S() == 1 && user1.getRegiao() == 5) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
			+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
			+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		
		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 1) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------"
					+ "------------");			
		}				

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 2) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
					+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 3) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 4) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		

		if(perguntas1.getAstrazeneca2S() == 2 && user1.getRegiao() == 5) {
			System.out.println("\n===================================== AstraZeneca/Oxford (Fiocruz) ====================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
					+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getFabricante() == 3) {			
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nVoc� tomou a 2� dose? Digite 1 ou 2 nas op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setPfizer1(ler.nextInt());						
		}
		
		if(perguntas1.getPfizer1() == 1) {			
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\n\nParab�ns!!!\n \nFicamos muito felizes que voc� tomou as duas doses!\n"
					+ "\nAinda precisamos da sua colabora��o para vencermos o V�rus.\nA vacina te protege mas n�o eximi o cont�gio.\n\n------------------------------------------------"
					+ "Importante--------------------------------------------\n\nContinue seguindo as recomedan��es dos �rg�os de sa�de:\n \n-Use m�scara. \n-Lave suas m�os com frequ�ncia. Use sab�o e "
					+ "�gua ou �lcool em gel.\n-Matenha o distanciamento social sempre que poss�vel.\n \n#Vacinaparatodos \n------------------------------------------------------------------------------------"
					+ "-------------------");								
		}
		
		if(perguntas1.getPfizer1() == 2) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nFazem 12 semanas ou mais que voc� tomou a 1� dose? Digite 1 ou 2 nas"
					+ " op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setPfizer2S(ler.nextInt());
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 1) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------"
					+ "------------------------------------");
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 2) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
			+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 3) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
			+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 4) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
			+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getPfizer2S() == 1 && user1.getRegiao() == 5) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nChegou a sua hora!!!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
			+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
			+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
			+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
			+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}				
		
		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 1) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n---------------------------------------------------------------------------------------"
					+ "----------------");			
		}				

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 2) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
					+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 3) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 4) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}		

		if(perguntas1.getPfizer2S() == 2 && user1.getRegiao() == 5) {
			System.out.println("\n========================================== Pfizer (BioNTech) ==========================================\nEst� quase l�!!!\nAguarde o prazo de 12 semanas e se dirija a um posto de sa�de pr�ximo da sua resid�ncia e vacine-se!!!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
					+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
		
		if(perguntas1.getFabricante() == 4) {			
			System.out.println("\n===================================== Jassen (Johnson & Johnson) ======================================\n\nParab�ns!!!\n\nFicamos muito felizes que voc� tomou a dose �nica da Jassen!\n"
					+ "\nAinda precisamos da sua colabora��o para vencermos o V�rus.\nA vacina te protege mas n�o eximi o cont�gio.\n\n-----------------------------------------------Importante----------------------------------------------"
					+ "\n\nContinue seguindo as recomedan��es dos �rg�os de sa�de:\n\n-Use m�scara.\n-Lave suas m�os com frequ�ncia. Use sab�o e "
					+ "�gua ou �lcool em gel.\n-Matenha o distanciamento social sempre que poss�vel.\n\n#Vacinaparatodos\n-------------------------------------------------------------------------------------------------------");
		}		
				
		if(perguntas1.getVacina1() == 2){
			System.out.println("Voc� possui Comorbidades? Digite 1 ou 2 nas op��es abaixo:\n1- Sim \n2- N�o");
			perguntas1.setComorbidade(ler.nextInt());
		}		
					
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 1 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e defici�ncia permanente podem se vacinar!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 2 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 18 anos"					
					+ "\ncom comorbidades e defici�ncia permanente podem se vacinar!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
					+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 3 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e defici�ncia permanente podem se vacinar!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}
				
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 4 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e defici�ncia permanente podem se vacinar!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");			
		}			
		
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 5 && user1.getIdade() >= 18){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 18 anos"
					+ "\ncom comorbidades e defici�ncia permanente podem se vacinar!\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
					+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getComorbidade() == 1 && user1.getRegiao() == 1 && user1.getIdade() < 18 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEst� quase l�!!!\n\nVeja no cronograma de vacina��o abaixo qual data esta sua faixa de idade"
					+ "\ne j� anote na sua agenda."
					+ "\nEstamos ansiosos para que voc� tome a sua vacina!!!\nAh, n�o se esque�a tamb�m de anotar o posto central da sua regi�o!\n"
					+ "\n************************************* CRONOGRAMA DE VACINA��O *************************************"
					+ "\nEntre 12 e 17 anos -------> 23 a 5 de setembro(com defici�ncia e comorbidades)\n***************************************************************************************************\n"
					+ "\nLOCAL DE VACINA��O:"
					+ "\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
				
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 1 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 2 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 37 anos podem se vacinar!"					
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
					+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 3 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 4 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}			
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 5 && user1.getIdade() >= 37){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nChegou a sua hora!!!\n\nTodos os moradores do munic�pio de S�o Paulo a partir dos 37 anos podem se vacinar!"
					+ "\n\nLOCAL DE VACINA��O:\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
					+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 1 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEst� quase l�!!!\n\nVeja no cronograma de vacina��o abaixo qual data esta sua faixa de idade"
					+ "\ne j� anote na sua agenda."
					+ "\nEstamos ansiosos para que voc� tome a sua vacina!!!\nAh, n�o se esque�a tamb�m de anotar o posto central da sua regi�o!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINA��O ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINA��O:"
					+ "\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�\nEndere�o: Rua Frederico Alvarenga, n� 259 - "
					+ "Parque Dom Pedro - 01020-030\nTelefone: (11) 3101-2344\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 2 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEst� quase l�!!!\n\nVeja no cronograma de vacina��o abaixo qual data esta sua faixa de idade"
					+ "\ne j� anote na sua agenda."
					+ "\nEstamos ansiosos para que voc� tome a sua vacina!!!\nAh, n�o se esque�a tamb�m de anotar o posto central da sua regi�o!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINA��O ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINA��O:"					
					+ "\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Cruz das Almas\nEndere�o: Rua Padre Feliciano Domingos, n� 90 - "
					+ "Freguesia do � - 02965-140\nTelefone: (11) 3975-3531\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 3 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEst� quase l�!!!\n\nVeja no cronograma de vacina��o abaixo qual data esta sua faixa de idade"
					+ "\ne j� anote na sua agenda."
					+ "\nEstamos ansiosos para que voc� tome a sua vacina!!!\nAh, n�o se esque�a tamb�m de anotar o posto central da sua regi�o!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINA��O ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINA��O:"
					+ "\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Carlos Gentile de Melo\nEndere�o: Av dos T�xteis, n� 3765 - "
					+ "Cidade Tiradentes - 08490-600\nTelefone: (11) 4780-5108\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 4 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEst� quase l�!!!\n\nVeja no cronograma de vacina��o abaixo qual data esta sua faixa de idade"
					+ "\ne j� anote na sua agenda."
					+ "\nEstamos ansiosos para que voc� tome a sua vacina!!!\nAh, n�o se esque�a tamb�m de anotar o posto central da sua regi�o!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINA��O ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\n*Gestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro."
					+ "\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINA��O:"
					+ "\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS S�o Vicente de Paula\nEndere�o: Rua Vicente da Costa, n� 289 - "
					+ "Ipiranga - 04266-050 \nTelefone: (11) 2273-4592\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}			
		
		if(perguntas1.getComorbidade() == 2 && user1.getRegiao() == 5 && user1.getIdade() < 37 && user1.getIdade() >= 12){
			System.out.println("\n============================================= VACINA SIM! ============================================="
					+ "\nEst� quase l�!!!\n\nVeja no cronograma de vacina��o abaixo qual data esta sua faixa de idade"
					+ "\ne j� anote na sua agenda."
					+ "\nEstamos ansiosos para que voc� tome a sua vacina!!!\nAh, n�o se esque�a tamb�m de anotar o posto central da sua regi�o!\n"
					+ "\n*************************************** CRONOGRAMA DE VACINA��O ***************************************"
					+ "\nEntre 35 e 36 anos -------> 15 a 18 de julho.\nEntre 30 e 34 anos -------> 19 de julho a 4 de agosto."
					+ "\nEntre 25 e 29 anos -------> 5 a 12 de agosto.\nEntre 18 e 24 anos -------> 13 a 20 de agosto."
					+ "\nEntre 15 e 17 anos -------> 6 a 19 de setembro.\nEntre 12 e 14 anos -------> 20 a 30 de setembro."
					+ "\nGestantes entre 12 e 17 anos -------> 23 de agosto a 5 de setembro.\n*******************************************************************************************************\n"
					+ "\nLOCAL DE VACINA��O:"
					+ "\n\nSua regi�o cadastrada foi a n�: " +  + user1.getRegiao()
					+ "\n\nIndicamos abaixo as informa��es do posto de vacina��o central para sua regi�o:\n\nUBS Alto de Pinheiros"
					+ "\nEndere�o: Av Queir�z Filho, n� 313 - "
					+ "Alto de Pinheiros - 05319-000 \nTelefone: (11) 3023-4588\nPara maiores informa��es"
					+ " acesse: https://www.vacinaja.sp.gov.br/\n\n#Vacinaparatodos \n-------------------------------------------------------------------------------------------------------");
		}		
		
		int opcao;

		System.out.println("\n========================================= Selecione uma op��o =========================================");
		System.out.println("\n1. Voltar ao menu");
		System.out.println("\n2. Sair ");

		opcao = ler.nextInt();

		if (opcao == 1) {
			MenuInicial.menu();
		}

		else if (opcao == 2) {
			System.out.println("\nVacina J�!");
			
		}
			
	}
	
}
