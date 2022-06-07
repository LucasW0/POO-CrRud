package Livraria;

import java.util.Scanner;

public class Cliente {
	private String nomeCliente;
	private int quantidadeLivros;
	
	public Cliente() {
	}

	public Cliente(String nomeCliente, int quantidadeInstrumentos) {
		this.nomeCliente = nomeCliente;
		this.quantidadeLivros = quantidadeInstrumentos;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int geQuantidadeLivros() {
		return quantidadeLivros;
	}

	public void setQuantidadeLivros(int quantidadeLivros) {
		this.quantidadeLivros = quantidadeLivros;
	}
	
	public void dadosCliente() {
		Scanner in = new Scanner(System.in);
		Scanner inteiro = new Scanner(System.in);
		System.out.print(" Nome do Cliente: ");
		nomeCliente = in.nextLine();
		System.out.println(" =====================================================");
		System.out.print(" Quantidade de livros emprestado: ");
		quantidadeLivros = inteiro.nextInt();
		System.out.println(" =====================================================");
	}
	
}
