/*Faculdade Senac - An�lise e Desenvolvimento de Sistemas
 * Professor Leonardo Pereira de Morais
 * Exemplo de c�digo para introdu��o aos conceitos de Classe e M�todo
 * Programa para caulculo do IMC e tabela IMC atrav�s de peso e altura
 * Aula 06 - 04/05/2020
 */

package com.leonardo;

//Import da Classe JoptionPane
import javax.swing.JOptionPane;


public class Principal {

	//Exemplo de um m�todo simples de subtra��o passando dois argumentos do tipo Double
	public static double imc(double peso, double altura) {
		return (peso) / (altura * altura);
	}

	//M�tdo principal
	public static void main(String[] args) {
		
		//Cria��o do objeto timc instanciando a Classe TabelaIMC
		TabelaIMC timc = new TabelaIMC();
		
		//Recebendo valores do usu�rio atrav�s da classe JOPtionPane
		double pes = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira seu peso"));
		double alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua altura"));
		
		//Exemplo para n�o utiliza��o do JOptionPane
		//double p = 90;
		//double a = 1.75;
		
		//Invoca��o dos m�tdos e exibi��o dos resultados
		System.out.printf("IMC = %.2f %nTabela IMC = %s", imc(pes,alt), timc.tabimc(imc(pes,alt)));
		
		
	}

}
