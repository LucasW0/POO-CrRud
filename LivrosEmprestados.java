package Livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class LivrosEmprestados extends Livraria { /* Sub Classe */
	private String numeroIdentificador;
	private String data;
	private ArrayList<Cliente> listaCliente;

	public LivrosEmprestados() {
	}

	public LivrosEmprestados(String numeroIdentificador, String data, String tipoVenda, String tipoPagamento,
			String garantia, ArrayList<Cliente> listaCliente) {
		listaCliente = new ArrayList<Cliente>();
		this.numeroIdentificador = numeroIdentificador;
		this.data = data;
		this.listaCliente = listaCliente;
	}

	public String getNumeroIdentificador() {
		return numeroIdentificador;
	}

	public void setNumeroIdentificador(String numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	public void dadosInstrumentosVendidos() {
		Scanner in = new Scanner(System.in);
		Scanner inteiro = new Scanner(System.in);
		System.out.print(" N�mero Identificador: ");
		numeroIdentificador = in.nextLine();
		System.out.println(" =====================================================");
		System.out.print(" Data: ");
		data = in.nextLine();
		System.out.println(" =====================================================");
		System.out.println(" =====================================================");
	}

}
