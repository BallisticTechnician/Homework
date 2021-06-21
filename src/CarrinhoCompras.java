import java.util.Scanner;
public class CarrinhoCompras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double vetCarrinhoValores[] = new double [50];
		String vetCarrinhoNomes[] = new String [50];
		int opcao = 0;
		int posicao =0;
		while (opcao!=7) {
		System.out.println("\n\n");
		System.out.println("1 - Adicione os itens no carrinho");
		System.out.println("2 - Remover um produto do carrinho");
		System.out.println("3 - Calcule o valor total da compra");
		System.out.println("4 - Exibe a quantidade de produtos totais comprados");
		System.out.println("5 - Exibe o nome do produto de maior valor");
		System.out.println("6 - Exibe o nome do produto ao lado do preço");
		System.out.println("7 - Encerre o sistema");
		opcao = leitor.nextInt();
		leitor.nextLine();
		switch (opcao) {
			case 1:
				if (posicao<vetCarrinhoNomes.length) {
				System.out.println("Carrinho de compras, entre com o nome do produto :");
				vetCarrinhoNomes[posicao]=leitor.nextLine();
				System.out.println("Entre com o valor do produto :");
				vetCarrinhoValores[posicao]=leitor.nextDouble();
				leitor.nextLine();
				posicao = posicao +1;
				System.out.println("Atualizando posição do produto");
				}
				else {				
					System.out.println("Carrinho cheio");
				}
				break;
			case 2:
				String nome;
				System.out.println("Escolha um item para remover");
				nome = leitor.nextLine();
				for (int i=0;i<posicao;i++) {
					if(vetCarrinhoNomes[i].equalsIgnoreCase(nome)) {
						vetCarrinhoNomes[i]="";
						vetCarrinhoValores[i]=0;
						System.out.println("Item removido");
					}
					}
				break;
			case 3:
				double TotalCompra=0;
				System.out.println("Valor total da compra:");
				for (int i=0;i<posicao;i++) {
					TotalCompra = TotalCompra+vetCarrinhoValores[i];
				}
				System.out.println("R$ " +TotalCompra);
				break;
			case 4:
				int qtd=0;
				for (int i=0;i<posicao;i++) {
					if (!vetCarrinhoNomes[i].equals("")) {
						qtd = qtd+1;
					}
				}
				System.out.println("Quantidade de itens :"+qtd);
				break;
			case 5:
				double MaiorValor=0;
				for (int i=0;i<posicao;i++) {
					if (vetCarrinhoValores[i]>MaiorValor) {
						MaiorValor=vetCarrinhoValores[i];
					}
					}
				for (int i=0;i<posicao;i++) {
					if(vetCarrinhoValores[i]==MaiorValor) {
						System.out.println("Item de maior valor :"+vetCarrinhoNomes[i]+" = "+MaiorValor);

					}}
				break;
			case 6:
				for (int i=0;i<posicao;i++) {
					System.out.println(vetCarrinhoNomes[i]+" = R$ "+vetCarrinhoValores[i]+"\n");

				}
				break;
			case 7:
				System.out.println("Encerrando o sistema");
				break;
			default:
			{System.out.println("Opção Invalida!!!");
			break;
			}
		}}

}}
