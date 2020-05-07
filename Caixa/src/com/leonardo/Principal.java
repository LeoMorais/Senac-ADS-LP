/*Faculdade Senac - Análise e Desenvolvimento de Sistemas
 * Laboratório de Programação
 * Professor: Leonardo Pereira de Morais - 06/05/2020
 * Programa para simular operações de um Caixa Eltrônico
 */
package com.leonardo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//criar objetos usuários instaciando Cliente.
		Cliente usuario1 = new Cliente();
		Cliente usuario2 = new Cliente();
			
		//Cadastro dos usuários, dois exemplos de Clientes.
		usuario1.nome = "Leonardo Pereira de Morais";
		usuario1.cpf = 35; //Exemplo fictcio para facilitar entendimento.
		usuario2.nome = "Maria Aparecido";
		usuario2.cpf = 36;
			
		//Declarar variáveis para tratamento do laço de repetição.
		int validacpf = 1000; //variável para validação do cpf do cliente.
		Object operacao; //variavel para receber operação do usuário.
		Object[] operacoes = { "depositar", "sacar", "consultar"}; // array para operações.
			
			//Laço de repetição, executa até que o usuário insira 0.
			while (validacpf != 0) {
				
				//Primeira tela do programa recebe o cpf do usuário e armazena na variável validacpf.
				validacpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vido ao Banco ADS \nInsira seu CPF\nPara finalizar insira 0"));
				
				//Condição para validar se é o usuário1 ou não.
				if (validacpf == usuario1.cpf ) {
					//Se verdadeiro, O usuário devera selecionar qual operação deseja realizar
					operacao = JOptionPane.showInputDialog(null, "Qual operação deseja realizar" , "Operação" ,JOptionPane.PLAIN_MESSAGE , null ,operacoes,"");
					
					//Condição para validar se a operação é de consulta
					if (operacao == "consultar") { 
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario1.saldocliente.consultar());
					}
					
					//Condição para validar se a operação é de deposito
					if (operacao == "depositar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario1.saldocliente.depositar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario1.saldocliente.consultar());
					}
					
					//Condição para validar se a operação é de saque
					if (operacao == "sacar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario1.saldocliente.sacar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario1.saldocliente.consultar());
					}
				}
				
				//Condição para validar se é o usuário2 ou não.
				if (validacpf == usuario2.cpf ) {
					//Se verdadeiro, O usuário devera selecionar qual operação deseja realizar
					operacao = JOptionPane.showInputDialog(null, "Qual operação deseja realizar" , "Operação" ,JOptionPane.PLAIN_MESSAGE , null ,operacoes,"");
					
					//Condição para validar se a operação é de consulta
					if (operacao == "consultar") {
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario2.saldocliente.consultar());
					}
					
					//Condição para validar se a operação é de deposito
					if (operacao == "depositar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario2.saldocliente.depositar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario2.saldocliente.consultar());
					}
					
					//Condição para validar se a operação é de saque
					if (operacao == "sacar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario2.saldocliente.sacar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario2.saldocliente.consultar());
					}
				}
				
			}
	}
}


