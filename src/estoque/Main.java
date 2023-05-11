package estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Pedido;
import model.Produto;

public class Main {

	static Pedido pedido = new Pedido();

	static List<Produto> lista = new ArrayList();
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {		
		lista.add(new  Produto(0, "Camisa",54.90,"M"));
		lista.add(new  Produto(1, "Calça",90,"G"));
		lista.add(new  Produto(2, "Blusa",150,"P"));
		lista.add(new  Produto(3, "Camiseta",45.50,"GG"));
		lista.add(new  Produto(4, "Shorts",40,"M"));		
		menu();
		
	}
	
	public static void menu() {
		int opcao = -1;
		
		System.out.print("Bem vindo ao menu!");
		while(opcao != 0) {
			System.out.println("\n\nEscolha uma das opções a baixo:"
					+ "\n1. Listar Produtos"
					+ "\n2. Adicionar um pedido"
					+ "\n3. Remover um pedido"
					+ "\n4. Ver o carrinho"
					+ "\n0. Sair");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: {
				
				listarProdutos();
				break;
			}
			case 2:{
				Produto novoProduto = adicionarPedido();
				if(novoProduto == null) {
					System.out.println("Código do Produto inválido!");
				}else {
					System.out.println(novoProduto.getNome() + " adicionado ao pedido!");
				}
				break;
			}
			case 3:{
				removerProduto();
				break;
			}
			case 4 :{
				pedido.abrirCarrinho();
				break;
			}
			
			}
		}	
		
	}
	
	public static void removerProduto() {

		System.out.println("Informe o código do produto: ");
		int cod = entrada.nextInt();
		Produto novoProduto;
		for(Produto produto: lista) {
			if(produto.getId() == cod) {
				novoProduto = produto;
				pedido.removerProduto(novoProduto);
				System.out.println("Pedido Removido");
				return;
			}
			System.out.println("Pedido não encontrado");
		}
	}
	
	public static Produto adicionarPedido() {
		
		System.out.println("Informe o código do produto: ");
		int cod = entrada.nextInt();
		Produto novoProduto;
		for(Produto produto: lista) {
			if(produto.getId() == cod) {
				novoProduto = produto;
				pedido.adicionarProduto(novoProduto);
				return novoProduto;
			}
		}
		return null;
	}
	
	public static Produto listarProdutos() {		
		for(Produto produto: lista) {
			System.out.println("\nCódigo do Produto: " + produto.getId()
					+ "\nNome: " + produto.getNome() 
			+ "\nTamanho: " + produto.getTamanho() 
			+ "\nPreço: " + produto.getPreco());
		
		}
		return null;
		
		
		
		
	}
	
	
}
