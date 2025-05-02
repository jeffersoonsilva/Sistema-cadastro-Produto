package sistema_cadratro_de_produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	
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
	
	System.out.println("================================");			
	System.out.println("             Menu               ");
	System.out.println("================================");
	
	System.out.println("Digite 0 para sair do programa");
	System.out.println("Digite 1 para listar os produtos");
	System.out.println("Digite 2 para alterar o preço do produto");
	System.out.println("Digite 3 para deletar o produto ");
	
	System.out.println("");
	Integer posicao;
	do {

		resp = entrada.nextInt();
		
		switch(resp) {
			case 1:
				System.out.println("================================");		
				System.out.println("       Listas dos Produtos      ");
				System.out.println("================================");		
				for(Produto product : produto) {
					System.out.println(product);	
				}
				break;
			case 2:	
				System.out.print("Digite o codigo do produto: ");
				int codigoProdutoAlterar = entrada.nextInt();
				posicao = codigoProduto(produto, codigoProdutoAlterar);
				
				if(posicao == null) {
					System.out.print("Não existe este produto! ");
				}else {
					System.out.print("Digite o novo valor do produto: ");
					double precoNovo = entrada.nextDouble();
					produto.get(posicao).alterarPrecoProduto(precoNovo);
				}
				break;
			case 3:
				System.out.print("Digite o codigo  do produto: ");
				int codigoProdutoExcluir = entrada.nextInt();
				posicao = codigoProduto(produto, codigoProdutoExcluir);
				
				if(posicao == null) {
					System.out.print("Não existe este produto! ");
				}else {
					 produto.remove((int) posicao);
					System.out.print("Produto excluido com sucesso! ");
				}
				break;				
		}
	}while(resp != 0);
	
	entrada.close();
}

public static Integer codigoProduto(List<Produto> produto, int codigo) {
	for(int i = 0; i < produto.size(); i++) {
		if(produto.get(i).getCodigo() == codigo) {
			return i;
		}
	}		
	return null;
}

}
