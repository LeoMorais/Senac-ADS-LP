/*Faculdade de Tecnologia Senac
 *Professor: Leonardo Pereira de Morais
 *Programa de introdução aos conceitos de Array em JAVA
 *Descrição: Recebe 5 nome e notas do usuário, calcula a média e informa o usuários que tem nota superior a média
 */

import java.util.Scanner;

public class Programa1 {
	public static void main(String[] args) {
	
	//Declara entrada instanciado classe Scanner
	Scanner entrada = new Scanner(System.in);	
	
	String[] nomes = new String[5]; //Declara vetor nomes com 5 posições para receber nomes dos usuários
	int[] notas = new int[5]; //Declarar o vetor notas com 5 posições para receber notas dos usuários
	int media; // Declara variável média para calcular a média das notas
	
	//Recebia 10 valores do usuário
	int i = 0;
	while(i<=4) {
		System.out.println("Insira um nome "); //Exibir uma mensagem para o usuário
		//Armazena nome do usuário na posição i do vetor nomes
		nomes[i] = entrada.next(); //Armazenar o valor recebido do usuário na posição i do vetor
		System.out.println("Insira o valor "); //Exibir uma mensagem para o usuário
		//Armazena notas do usuário na posição i do vetor notas
		notas[i] = entrada.nextInt(); //Armazenar o valor recebido do usuário na posição i do vetor
		i=i+1;
	}
	
	//Percorre o laço para somar todas as notas
	int soma = 0;
	for (int j = 0; j < notas.length ; j++) {
		//Variável soma recebe valor de soma + valor do vetor notas na posição i
		soma = soma + notas[j]; 
	}
	
	//Realiza cálculo da média (valor da váriavel soma/ tamanho do vetor notas)
	media = soma/notas.length;
	System.out.println("Media="+media);
	
	//Percorre o laço para compara se a nota é superior a média
	for (int j = 0; j < notas.length ; j++) {
		//Compara nota na posição j do vetor notas com a média
		if (notas[j] > media) {
			//Exibe na tela o nome e a nota do usuário que é superio a média
			System.out.println(nomes[j]+":"+notas[j]+" tem nota superior a media:"+media);
		}
	}
}
}