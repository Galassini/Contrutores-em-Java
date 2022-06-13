package qintess.academiajava.aplicacao;

import qintess.academiajava.utils.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		// Método somar
		double soma = Utilitarios.somar(2, 3);
		System.out.println("soma: " + soma);
		
		// Metodo dolar para real
		double dolar = 20.50;
		double reais = Utilitarios.dolarPraReal(dolar);
		System.out.println(dolar +" dolares valem " + reais + " reais");
		
	}
}
