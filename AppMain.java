package Livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {

	static ArrayList<Livraria> ListaLivraria = new ArrayList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int menu;
		int cont;

		System.out.println(" ================================");
		System.out.print(" DIGITE 0 PARA MOSTRAR O MENU: ");
		cont = in.nextInt();
		System.out.println(" ================================");
		while (cont != 0) {
			System.out.print(" DIGITE 0 PARA MOSTRAR O MENU: ");
			cont = in.nextInt();
			System.out.println(" ================================");
		}
		while (cont == 0) {
			System.out.println("		MENU");
			System.out.println();
			System.out.println(" 1 - ADICIONAR LIVROS");
			System.out.println();
			System.out.println(" 2 - LISTAR LIVROS");
			System.out.println();
			System.out.println(" 3 - ALTERAR LIVRO");
			System.out.println();
			System.out.println(" 4 - EXCLUIR LIVRO");
			System.out.println();
			System.out.println(" 5 - EMPRESTAR LIVRO");
			System.out.println();
			System.out.println(" 6 - SAIR");
			System.out.println(" ================================");
			System.out.print(" ESCOLHA UMA DAS OP��ES ACIMA: ");
			menu = in.nextInt();
			System.out.println(" ================================");
			if (menu == 1) {
				adicionar();
			} else if (menu == 2) {
				listar();
			} else if (menu == 3) {
				alterar();
			} else if (menu == 4) {
				excluir();
			} else if (menu == 5) {
				emprestimo();
			} else if (menu == 6) {
				System.out.println(" SAIU DO MENU!");
			} else {
				System.out.println(" OP��O INV�LIDA!");
				break;
			}
			System.out.print(" DESEJA CONTINUAR? APERTE 0 PARA SIM OU 1 PARA N�O: ");
			cont = in.nextInt();
			System.out.println(" =====================================================");
			if (cont == 1) {
				break;
			}
			while (cont != 0) {
				System.out.print(" DESEJA CONTINUAR? APERTE 0 PARA SIM OU 1 PARA N�O: ");
				cont = in.nextInt();
				System.out.println(" =====================================================");
				if (cont == 1) {
					break;
				}
			}
		}

	}

	private static void adicionar() {
		Livraria livraria = new Livraria();
		Scanner inteiro = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		Scanner lendoValor = new Scanner(System.in);
		System.out.print(" C�DIGO: ");
		int codigo = inteiro.nextInt();
		System.out.print(" NOME DO LIVRO: ");
		String nome = teclado.nextLine();
		System.out.println(" ================================");
		System.out.print(" AUTOR: ");
		String autor = teclado.nextLine();
		System.out.println(" ================================");
		System.out.print(" GENERO: ");
		String genero = teclado.nextLine();
		System.out.println(" =====================================================");
		livraria.setCodigo(codigo);
		livraria.setNome(nome);
		livraria.setAutor(autor);
		livraria.setGenero(genero);
		ListaLivraria.add(livraria);
	}

	private static void listar() {
		for (int i = 0; i < ListaLivraria.size(); i++) {
			System.out.println(" C�DIGO: " + ListaLivraria.get(i).getCodigo());
			System.out.println(" NOME DO LIVRO: " + ListaLivraria.get(i).getNome());
			System.out.println(" =====================================================");
			System.out.println(" AUTOR DO LIVRO: " + ListaLivraria.get(i).getAutor());
			System.out.println(" =====================================================");
			System.out.println(" GENERO DO LIVRO: " + ListaLivraria.get(i).getGenero());
			System.out.println(" =====================================================");

		}

	}

	private static void alterar() {
		Scanner teclado = new Scanner(System.in);
		Scanner lendoValor = new Scanner(System.in);
		Scanner inteiro = new Scanner(System.in);
		System.out.print(" DIGITE O C�DIGO DO LIVRO QUE VOC� DESEJA ALTERAR? ");
		int cod = inteiro.nextInt();
		for (int i = 0; i < ListaLivraria.size(); i++) {
			Livraria livro = ListaLivraria.get(i);
			if (livro.getCodigo() == cod) {
				System.out.print(" NOME DO LIVRO: ");
				String nome = teclado.nextLine();
				System.out.println(" ================================");
				System.out.print(" AUTOR: ");
				String autor = teclado.nextLine();
				System.out.println(" ================================");
				System.out.print(" GENERO: ");
				String genero = teclado.nextLine();
				System.out.println(" =====================================================");
				livro.setNome(nome);
				livro.setAutor(autor);
				livro.setGenero(genero);
			}
		}
	}

	private static void excluir() {
		Scanner inteiro = new Scanner(System.in);
		System.out.print(" DIGITE O C�DIGO DO LIVRO QUE VOC� DESEJA EXCLUIR? ");
		int cod = inteiro.nextInt();
		for (int i = 0; i < ListaLivraria.size(); i++) {
			Livraria instrumento = ListaLivraria.get(i);
			if (instrumento.getCodigo() == cod) {
				ListaLivraria.remove(i);
			}
		}
	}

	private static void emprestimo() {
		LivrosEmprestados emprestado = new LivrosEmprestados();
		Cliente cliente = new Cliente();
		Scanner inteiro = new Scanner(System.in);
		System.out.print(" DIGITE O C�DIGO DO LIVRO QUE FOI EMPRESTADO: ");
		int cod = inteiro.nextInt();
		for (int i = 0; i < ListaLivraria.size(); i++) {
			Livraria instrumento = ListaLivraria.get(i);
			if (instrumento.getCodigo() == cod) {
				System.out.println(" C�DIGO: " + ListaLivraria.get(i).getCodigo());
				System.out.println(" NOME DO LIVRO: " + ListaLivraria.get(i).getNome());
				System.out.println(" =====================================================");
				System.out.println(" AUTOR: " + ListaLivraria.get(i).getAutor());
				System.out.println(" =====================================================");
				System.out.println(" GENERO: " + ListaLivraria.get(i).getGenero());
				System.out.println(" =====================================================");

			}

		}
		System.out.println(" INFORMA��ES SOBRE O EMPRESTIMO");
		System.out.println(" =====================================================");
		emprestado.dadosInstrumentosVendidos();
		cliente.dadosCliente();

	}
}