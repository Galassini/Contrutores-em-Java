package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Bicicleta", "Transporte", 1000);
		Produto produto2 = new Produto("Mochila", "Vestuario", 200);
		Produto produto3 = new Produto("Hamburger", "Alimentação", 20);

		System.out.println(produto1.mostrar());
		System.out.println("--------------");
		System.out.println(produto2.mostrar());
		System.out.println("--------------");
		System.out.println(produto3.mostrar());

	}
}
