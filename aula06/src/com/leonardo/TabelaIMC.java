package com.leonardo;

/*Exemplo de uma classe com método*/

public class TabelaIMC {
	
	//Variável resultado para retorno do métdo tabimc
	public String resultado;

		//Método tbmic, recebe como argumento o imc e retorna a tabela IMC
		public String tabimc(double n1) {
			
			//Primeira condição da tabela IMC
			if (n1 > 18.5 && n1 < 24.9) {
				resultado = "Peso Normal";
			}
			
			//Segunda condição da tabela IMC
			if (n1 > 25 && n1 < 29.9) {
				resultado = "Sobrepeso";
			}
			
			//Terceira condição da tabela IMC
			if (n1 > 30 && n1 < 34.9) {
				resultado = "Obsediade grau 1";
			}
			
			if (n1 > 34.9) {
				resultado = "Obsediade grau 2";
			}
		
			//retorno do método através da variável resultado
			return resultado;
		}
}
