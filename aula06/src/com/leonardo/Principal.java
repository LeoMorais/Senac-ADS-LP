/*Faculdade Senac - Análise e Desenvolvimento de Sistemas
 * Professor Leonardo Pereira de Morais
 * Exemplo de código para introdução aos conceitos de Classe e Método
 * Programa para caulculo do IMC e tabela IMC através de peso e altura
 * Aula 06 - 04/05/2020
 */

package com.leonardo;

//Import da Classe JoptionPane
import javax.swing.JOptionPane;


public class Principal {

	//Exemplo de um método simples de subtração passando dois argumentos do tipo Double
	public static double imc(double peso, double altura) {
		return (peso) / (altura * altura);
	}

	//Métdo principal
	public static void main(String[] args) {
		
		//Criação do objeto timc instanciando a Classe TabelaIMC
		TabelaIMC timc = new TabelaIMC();
		
		//Recebendo valores do usuário através da classe JOPtionPane
		double pes = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira seu peso"));
		double alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua altura"));
		
		//Exemplo para não utilização do JOptionPane
		//double p = 90;
		//double a = 1.75;
		
		//Invocação dos métdos e exibição dos resultados
		System.out.printf("IMC = %.2f %nTabela IMC = %s", imc(pes,alt), timc.tabimc(imc(pes,alt)));
		
		
	}

}
