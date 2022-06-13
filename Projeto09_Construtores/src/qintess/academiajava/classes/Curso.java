package qintess.academiajava.classes;

import java.util.Random;

public class Curso {
	private final int codigo;
	private String descricao;
	private int cargahoraria;
	private double preco;
	
	
	//Construtor
		
	
	public Curso(String descricao, int cargahoraria, double preco) {
		
		//this.codigo = (int)(Math.random() * 900) + 100;
		
		Random random = new Random();
		this.codigo = random.nextInt(899) + 100; 
		//this.codigo = random.nextInt(100, 999); ( Essa também é uma forma de fazer )
		
		this.setDescricao(descricao);
		this.setCargahoraria(cargahoraria);
		this.setPreco(preco);
		
	}
		
		public int getCodigo() {
			return codigo;
    }
////	public void setCodigo(int codigo) {
////		this.codigo = codigo;
//	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String mostrar() {
		String resultado = "Código: " + this.getCodigo() +
		"\nDescrição: " + this.getDescricao() +
		"\nCarga Horária: " + this.getCargahoraria() +
		"\nPreço: " + this.getPreco();
	return resultado;	
	}
	
}
