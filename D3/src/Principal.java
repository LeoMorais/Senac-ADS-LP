import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		//Variaveis utilizdas no Desafio 01, comentadaas para o segundo e terceiro dasafio.
		//int n1 = 50;
		//int n2 = 2;
		
		//Cria��o de objetos Classes Scanner e Operacao
		Scanner input = new Scanner(System.in);
		Operacao op = new Operacao();
		
		//Iniciando vari�vel para controle do la�o de repeti��o
		String operacao = "qualquer";
		
		
		//La�o de repeti��o
		while (!operacao.equals("sair")) {
				
		
		//Intera��o com usu�rio para saber a opera��o 	
		System.out.println("Insira qual operacao deseja realizar \nCaso desejar finalizar o programa, insira sair");
		operacao = input.next();
		
		//Intera��o com usu�rio para saber o primeiro valor
		System.out.println("Insira o valor do primeiro numero");
		int n1 = input.nextInt();
		
		//Intera��o com usu�rio para saber o segundo valor
		System.out.println("Insira o valor do segundo numero");
		int n2 = input.nextInt();
		
		
		
		//Estrutura condi��o para realiza��o da opera��o
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
