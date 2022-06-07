package Livraria;

public class Livraria { /*Super Classe*/
	private String nome;
	private String autor;
	private String genero;
	private int codigo;
	
	public Livraria() {
	}
	
	public Livraria(String nome, String autor, String genero,  int codigo) {
		this.nome = nome;
		this.autor = autor;
		this.genero= genero;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
		
	}

}