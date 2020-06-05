/*Faculdade de Tecnologia Senac
 *Professor: Leonardo Pereira de Morais
 *Programa de introdu��o aos conceitos de Array em JAVA
 *Descri��o: Recebe 5 nome e notas do usu�rio, calcula a m�dia e informa o usu�rios que tem nota superior a m�dia
 */

import java.util.Scanner;

public class Programa1 {
	public static void main(String[] args) {
	
	//Declara entrada instanciado classe Scanner
	Scanner entrada = new Scanner(System.in);	
	
	String[] nomes = new String[5]; //Declara vetor nomes com 5 posi��es para receber nomes dos usu�rios
	int[] notas = new int[5]; //Declarar o vetor notas com 5 posi��es para receber notas dos usu�rios
	int media; // Declara vari�vel m�dia para calcular a m�dia das notas
	
	//Recebia 10 valores do usu�rio
	int i = 0;
	while(i<=4) {
		System.out.println("Insira um nome "); //Exibir uma mensagem para o usu�rio
		//Armazena nome do usu�rio na posi��o i do vetor nomes
		nomes[i] = entrada.next(); //Armazenar o valor recebido do usu�rio na posi��o i do vetor
		System.out.println("Insira o valor "); //Exibir uma mensagem para o usu�rio
		//Armazena notas do usu�rio na posi��o i do vetor notas
		notas[i] = entrada.nextInt(); //Armazenar o valor recebido do usu�rio na posi��o i do vetor
		i=i+1;
	}
	
	//Percorre o la�o para somar todas as notas
	int soma = 0;
	for (int j = 0; j < notas.length ; j++) {
		//Vari�vel soma recebe valor de soma + valor do vetor notas na posi��o i
		soma = soma + notas[j]; 
	}
	
	//Realiza c�lculo da m�dia (valor da v�riavel soma/ tamanho do vetor notas)
	media = soma/notas.length;
	System.out.println("Media="+media);
	
	//Percorre o la�o para compara se a nota � superior a m�dia
	for (int j = 0; j < notas.length ; j++) {
		//Compara nota na posi��o j do vetor notas com a m�dia
		if (notas[j] > media) {
			//Exibe na tela o nome e a nota do usu�rio que � superio a m�dia
			System.out.println(nomes[j]+":"+notas[j]+" tem nota superior a media:"+media);
		}
	}
}
}