package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.ProdutoController;
import model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		ProdutoController produtoC = new ProdutoController();
		List<Produto> produto = new ArrayList<>();
		int resp;
		char respP;
		
		do {
		
			System.out.print("Digite o nome do produto: ");
			String nomeP = entrada.nextLine();
			System.out.print("Digite o codigo do produto: ");
			int codigoP = entrada.nextInt();
			System.out.print("Digite o quantidade do produto: ");
			int quantidadeP = entrada.nextInt();
			System.out.print("Digite o preço do produto: ");
			double precoP = entrada.nextDouble();
			
			produto.add(new Produto(nomeP,codigoP,quantidadeP,precoP));
			System.out.print("Digite 's' para continuar gravando produtos e 'n' para sair");
			respP = entrada.next().charAt(0);
			entrada.nextLine();
			
		}while(respP == 's');
		
		System.out.println("");			
	
		Integer posicao;
		
		do {
			
			produtoC.menuOpcao();
			resp = entrada.nextInt();
			
			switch(resp) {
			
				
				case 1:
					produtoC.listarProdutos(produto);
					break;
				case 2:	
					System.out.print("Digite o codigo do produto que você deseja alterar o preço: ");
					int codigoProdutoAlterar = entrada.nextInt();
					System.out.println("Digite o novo valor");
					double precoNovo = entrada.nextDouble();
					produtoC.alterarPreco(produto, codigoProdutoAlterar, precoNovo);
					break; 
				case 3:
					System.out.print("Digite o codigo  do produto que você deseja excluir: ");
					int codigoProdutoExcluir = entrada.nextInt();
					produtoC.excluirProduto(produto, codigoProdutoExcluir);
			}
		}while(resp != 0);
		
		entrada.close();
	}
}
