package com.leonardo;

public class Caixa {

	//Vari�vel saldo
	private double saldo;
	
	//M�todo depositar
	public void depositar(double deposito) {
		saldo = saldo + deposito;
	}
	
	
	//M�todo sacar
	public void sacar(double saque) {
		saldo = saldo - saque;
	}
	
	
	//M�todo consultar saldo
	public double consultar() {
		return saldo;
	}
}

