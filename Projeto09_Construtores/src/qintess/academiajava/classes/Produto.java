package qintess.academiajava.classes;

public class Produto {
	
	private final int codigo;
	private String descricao; 
	private String categoria;
	private double preco;
	
	private static int CONTADOR = 1; 
	
	//Construtor: vamos admitir que todos os atributos devem ser informados. 
	
	public Produto(String descricao, String categoria, double preco) {
		
		this.codigo = CONTADOR++;
		
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco < 0) {
			throw new NumberFormatException("O pre�o n�o pode ser negativo.");
		}
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	//Metodos adicionais
	
	// Sobrecarga de m�todos (overloading): quando 2 ou mais m�todos possuirem 
    // o mesmo nome, mesmo retorno e lista  de parametros diferentes, dizemos que 
	// estes m�todos est�o sobrecarregados! 
	
	/*public void receber(String descricao, String categoria, double preco) {
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);*/
		
	
	/*public void receber(String descricao, String categoria) {
		this.setDescricao(descricao);
		this.setCategoria(categoria);*/
		
		
	
	

	public String mostrar() {
		return 	"C�digo: " + this.getCodigo() +
				"\nDescri��o: " + this.getDescricao() +
				"\nCategoria: " + this.getCategoria() +
				"\nPre�o: " + this.getPreco();
		
	}
}
