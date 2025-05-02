package controller;

import java.util.List;

import model.Produto;

public class ProdutoController {
	
	public Integer retornaPosicao(List<Produto> produto, int codigo) {
		for(int i = 0; i < produto.size(); i++) {
			if(produto.get(i).getCodigo() == codigo) {
				return i;
			}
		}		
		return null;
	}
	
	public void menuOpcao() {
		System.out.println("================================");			
		System.out.println("             Menu               ");
		System.out.println("================================");
		
		System.out.println("Digite 0 para sair do programa");
		System.out.println("Digite 1 para listar os produtos");
		System.out.println("Digite 2 para alterar o preço do produto");
		System.out.println("Digite 3 para deletar o produto ");
		
	}
	
	public void listarProdutos(List<Produto> produto) {
		System.out.println("================================");		
		System.out.println("       Listas dos Produtos      ");
		System.out.println("================================");		
		for(Produto product : produto) {
			System.out.println(product);	
		}
	}
	
	public void alterarPreco(List<Produto> produto, int codigo, double novoPreco ) {
		
		Integer posicao = retornaPosicao(produto, codigo);
		
		if(posicao == null) {
			System.out.print("Não existe este produto! ");
		}else {
			produto.get(posicao).setPreco(novoPreco);
		}
	}
	
	public void excluirProduto(List<Produto> produto, int codigo) {
		
		Integer posicao = retornaPosicao(produto, codigo);
		
		if(posicao == null) {
			System.out.print("Não existe este produto! ");
		}else {
			produto.remove((int) posicao);
			System.out.println("Produto excluido com sucesso! ");
		}	
	}	
}
