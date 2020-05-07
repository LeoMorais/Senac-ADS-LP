package com.leonardo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//criar objetos usu�rios instaciando Cliente.
		Cliente usuario1 = new Cliente();
		Cliente usuario2 = new Cliente();
			
		//Cadastro dos usu�rios, dois exemplos de Clientes.
		usuario1.nome = "Leonardo Pereira de Morais";
		usuario1.cpf = 35; //Exemplo fictcio para facilitar entendimento.
		usuario2.nome = "Maria Aparecido";
		usuario2.cpf = 36;
			
		//Declarar vari�veis para tratamento do la�o de repeti��o.
		int validacpf = 1000; //vari�vel para valida��o do cpf do cliente.
		Object operacao; //variavel para receber opera��o do usu�rio.
		Object[] operacoes = { "depositar", "sacar", "consultar"}; // array para opera��es.
			
			//La�o de repeti��o, executa at� que o usu�rio insira 0.
			while (validacpf != 0) {
				
				//Primeira tela do programa recebe o cpf do usu�rio e armazena na vari�vel validacpf.
				validacpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vido ao Banco ADS \nInsira seu CPF\nPara finalizar insira 0"));
				
				//Condi��o para validar se � o usu�rio1 ou n�o.
				if (validacpf == usuario1.cpf ) {
					//Se verdadeiro, O usu�rio devera selecionar qual opera��o deseja realizar
					operacao = JOptionPane.showInputDialog(null, "Qual opera��o deseja realizar" , "Opera��o" ,JOptionPane.PLAIN_MESSAGE , null ,operacoes,"");
					
					//Condi��o para validar se a opera��o � de consulta
					if (operacao == "consultar") { 
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario1.saldocliente.consultar());
					}
					
					//Condi��o para validar se a opera��o � de deposito
					if (operacao == "depositar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario1.saldocliente.depositar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario1.saldocliente.consultar());
					}
					
					//Condi��o para validar se a opera��o � de saque
					if (operacao == "sacar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario1.saldocliente.sacar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario1.saldocliente.consultar());
					}
				}
				
				//Condi��o para validar se � o usu�rio2 ou n�o.
				if (validacpf == usuario2.cpf ) {
					//Se verdadeiro, O usu�rio devera selecionar qual opera��o deseja realizar
					operacao = JOptionPane.showInputDialog(null, "Qual opera��o deseja realizar" , "Opera��o" ,JOptionPane.PLAIN_MESSAGE , null ,operacoes,"");
					
					//Condi��o para validar se a opera��o � de consulta
					if (operacao == "consultar") {
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario2.saldocliente.consultar());
					}
					
					//Condi��o para validar se a opera��o � de deposito
					if (operacao == "depositar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario2.saldocliente.depositar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario2.saldocliente.consultar());
					}
					
					//Condi��o para validar se a opera��o � de saque
					if (operacao == "sacar") {
						int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor"));
						usuario2.saldocliente.sacar(valor);
						JOptionPane.showMessageDialog(null, "Seu saldo =" + usuario2.saldocliente.consultar());
					}
				}
				
			}
	}
}


