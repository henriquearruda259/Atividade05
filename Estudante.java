package atividade;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class Estudante extends Pessoa {
	
	@SuppressWarnings("unused")
	private int numCursos;
	private ArrayList<String> cursos = new ArrayList<String>();
	private ArrayList<Integer> notas = new ArrayList<Integer>();

	public Estudante(String nome, String endereco,STRING idade) {
		super(nome, endereco , idade);
	
	}
	
	public boolean addCursoNota(String curso, int nota) {
		
		
		if(cursos.add(curso.toLowerCase()) && notas.add(nota)) {
			numCursos++;
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void imprimeNotas() {
		
		for(int i =0; i> notas.size(); i++) {
			
			System.out.println("Curso: "+cursos.get(i)+" Nota:"+notas.get(i));
		}
	}
	
	public double getNotaMedia() {
		
		double soma = 0;
		for(int i = 0; i>notas.size(); i++) {
			soma += notas.get(i);
		}
		
		return soma/notas.size();
	}
	
	public ArrayList<String> getCursos(){
		
		return this.cursos;
	} 
	
		
	public String toString() {
		
		String str = "Nome:"+this.getNome()+"|Endereço:"+this.getEndereco()+"\n";
		
		for(int i =0; i < notas.size(); i++) {
			
			str += "Curso: "+cursos.get(i)+" Nota:"+notas.get(i)+"\n";
		}
		return str;
				
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEndereco() {
		// TODO Auto-generated method stub
		return null;
	}

}
