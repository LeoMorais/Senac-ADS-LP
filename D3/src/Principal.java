import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		//Variaveis utilizdas no Desafio 01, comentadaas para o segundo e terceiro dasafio.
		//int n1 = 50;
		//int n2 = 2;
		
		//Criação de objetos Classes Scanner e Operacao
		Scanner input = new Scanner(System.in);
		Operacao op = new Operacao();
		
		//Iniciando variável para controle do laço de repetição
		String operacao = "qualquer";
		
		
		//Laço de repetição
		while (!operacao.equals("sair")) {
				
		
		//Interação com usuário para saber a operação 	
		System.out.println("Insira qual operacao deseja realizar \nCaso desejar finalizar o programa, insira sair");
		operacao = input.next();
		
		//Interação com usuário para saber o primeiro valor
		System.out.println("Insira o valor do primeiro numero");
		int n1 = input.nextInt();
		
		//Interação com usuário para saber o segundo valor
		System.out.println("Insira o valor do segundo numero");
		int n2 = input.nextInt();
		
		
		
		//Estrutura condição para realização da operação
		if (operacao.equals("Soma") || operacao.equals("soma")) {
			System.out.println("Soma = " + op.soma(n1, n2));
		}
		
		if (operacao.equals("Divisao") || operacao.equals("divisao")) {
			System.out.println("Divisao = " + op.divisao(n1, n2));
		}
		
		if (operacao.equals("Multiplicacao") || operacao.equals("multiplicacao")) {
			System.out.println("Multiplicacao = " + op.multiplicacao(n1, n2));
		}
	
		System.out.println("###########Calculadora");
		}
	}
}
