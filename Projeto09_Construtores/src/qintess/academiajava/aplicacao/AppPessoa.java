package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Italo Franca");
		pessoa.setIdade(33);
		pessoa.setSexo(Sexo.MASCULINO);
		
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
		
		
		
				 
	}
}
