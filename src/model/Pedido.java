package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private int id;
	
	private String dataPedido;
	
	private List<Produto> produtos = new ArrayList<>();

	public Pedido() {
		 Date dataAtual = new Date();
		 SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		 this.dataPedido = simpleDate.format(dataAtual);
	}
	
	
	
	public void abrirCarrinho() {
		System.out.println("\n\n---------------CARRINHO DE COMPRAS----------------");
		if(produtos.isEmpty()) {
			System.out.println("O carrinho está vazio!");
		}else {
			for(Produto produto: produtos) {
				System.out.println("\nCódigo do Produto: " + produto.getId() 
						+ "\nNome: " + produto.getNome() 
				+ "\nTamanho: " + produto.getTamanho() 
				+ "\nPreço: " + produto.getPreco()
				+ "\nQuantidade: " + produto.getQuantidade());
			}
		}
		
	}
	
	public void adicionarProduto(Produto novoProduto) {
		Produto produtoExistente = null;
		
		if(produtos.isEmpty()) {
			novoProduto.setQuantidade();
			produtos.add(novoProduto);
		}else {
			for (Produto p : produtos) {
			      if (p.getId() == novoProduto.getId()) {
			    	produtoExistente = p;
			        break;
			      }
			}
			if(produtoExistente != null) {
				produtoExistente.setQuantidade();
				int index = produtos.indexOf(produtoExistente);
				produtos.set(index, produtoExistente);
			}else{
				novoProduto.setQuantidade();
				produtos.add(novoProduto);
			}
			
			
		}
		
		
		

	}
	
	public boolean verificarProduto(Produto produto) {		
		boolean retorno = this.produtos.contains(produto);		
		return retorno;
	}
	
	public void removerProduto(Produto produto) {
		this.produtos.remove(produto);
	}

	
	
	
	
	

}
