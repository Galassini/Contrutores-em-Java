package qintess.academiajava.classes;

public class Automovel {
	
	
	//1. atributos
	private String marca; // Atributos da classe
	private String modelo;
	private int ano;
	private final/*Constante imutável*/ String tipoMotor; 
	
	//2.Construtores
	
	public Automovel(String marca, String motor) {
		this.setMarca(marca);
		this.tipoMotor = motor;
	}
	
	public Automovel(String marca, String modelo, String motor) {
		this(marca, motor);
		this.setModelo(modelo);
		
	}
	
	public Automovel(String marca, String modelo, int ano, String motor) {
		this(marca, modelo, motor);
		this.setAno(ano);
		
	}
	
	
	//3. Getters / Setters 
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		if(ano < 1960) {
			throw new NumberFormatException("O ano do carro é inválido, o ano minimo permitido é 1960.");
		}
		this.ano = ano; 
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	
	//4. Metodos adicionais
	

	public String mostrar() {
		String resposta = "Marca: " + this.getMarca();
				
		if(this.getModelo() != null) {
			resposta += "\nModelo: " + this.getModelo();
		}
		
		if(this.getAno() != 0) {
			resposta += "\nAno: " + this.getAno();
		}
		resposta += "\nTipo Motor: " + this.getTipoMotor();
		
		return resposta;	
	}
	
	
	
	

	
	
	
}
	

