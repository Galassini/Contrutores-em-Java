package qintess.academiajava.utils;

public class Utilitarios {

	// Metodo que recebe dois parâmetros númericos e retorna sua soma 
	
	public static double somar(double x, double y) {
		double resultado = x + y;
		return resultado;
		
	}
	// Metodo que recebe um valor em dolares e retorna este valor em reais
	//(tomando como base o dolar do dia 14/04/2022: 4.696)
	
	public static double dolarPraReal(double dolar) {
		return dolar * 4.696;
		
	}
	
	
	
	
}
