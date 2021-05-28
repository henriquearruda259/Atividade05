package atividade;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public abstract class Pessoa {
	
	private String nome;
	private String endereco;
	private STRING idade;
	
	public  Pessoa (String nome, String endereco, STRING idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.setIdade(idade); 
	}

	public  String getNome() {
		return this.nome;
	};

	public  String getEndereco() {
		return this.endereco;
	}

	public String toString() {
		String str = "Nome:"+this.getNome()+"|Endereço:"+this.getEndereco()+"\n";
		return str;
	};
	
	public abstract ArrayList<String> getCursos();

	public STRING getIdade() {
		return idade;
	}

	public void setIdade(STRING idade) {
		this.idade = idade;
	}

}
