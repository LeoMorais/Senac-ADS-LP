package com.leonardo;

/*Exemplo de uma classe com m�todo*/

public class TabelaIMC {
	
	//Vari�vel resultado para retorno do m�tdo tabimc
	public String resultado;

		//M�todo tbmic, recebe como argumento o imc e retorna a tabela IMC
		public String tabimc(double n1) {
			
			//Primeira condi��o da tabela IMC
			if (n1 > 18.5 && n1 < 24.9) {
				resultado = "Peso Normal";
			}
			
			//Segunda condi��o da tabela IMC
			if (n1 > 25 && n1 < 29.9) {
				resultado = "Sobrepeso";
			}
			
			//Terceira condi��o da tabela IMC
			if (n1 > 30 && n1 < 34.9) {
				resultado = "Obsediade grau 1";
			}
			
			if (n1 > 34.9) {
				resultado = "Obsediade grau 2";
			}
		
			//retorno do m�todo atrav�s da vari�vel resultado
			return resultado;
		}
}
