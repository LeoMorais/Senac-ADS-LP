package com.leonardo;

public class Caixa {

	//Variável saldo
	private double saldo;
	
	//Método depositar
	public void depositar(double deposito) {
		saldo = saldo + deposito;
	}
	
	
	//Método sacar
	public void sacar(double saque) {
		saldo = saldo - saque;
	}
	
	
	//Método consultar saldo
	public double consultar() {
		return saldo;
	}
}

