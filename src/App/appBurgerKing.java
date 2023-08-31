package App;

import java.util.Scanner;

public class appBurgerKing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 String[][] cardapio = {
		           {"1","Cachorro Quente" ,"4.00"}, 
		           {"2","X-Salada" , "4.50"},  
		           {"3","X-Bacon" ,  "5.00"}, 
		           {"4","Torrada Simples" ,  "2.00"}, 
		           {"5","Refrigerante" , "1.50"}, 
		       };
	       // Array para armazenar os pedido
	       double[] valorPedidos = new double[cardapio.length];

	       boolean continuarPedidos = true;

	       while (continuarPedidos) {
	       	
	           System.out.println("Digite o código do seu pedido (ou digite '0' para finalizar): ");
	           String codigo = sc.next();

	           if (codigo.equals("0")) {
	        	   
	               continuarPedidos = false;
	               break;
	           }

	           System.out.println("Digite a quantidade do seu pedido: ");
	           int quantidade = sc.nextInt();

	           double precoItem = 0;
	           String especificacaoItem = "";

	           // esta lendo todos os items do cardapio
	           for (String[] item : cardapio) {
	           	//se o item 0 que representa a primeira coluna da matriz
	           	//for igual ao codigo solicitado, vai ser armazenado preco e descricao
	           	//e o break encerrara o FOR
	               if (item[0].equals(codigo)) {
	               	
	            	   //Calcula o precoItem como 4.50 (valor do item no cardápio).
	                   precoItem = Double.parseDouble(item[2]);
	                   especificacaoItem = item[1];
	                   break;
	               }
	           }

	           if (precoItem != 0) {
	        	   //Calcula o valor total do pedido como 4.50 * 3 = 13.50.
	               double valorTotalPedido = precoItem * quantidade;
	               //Atualiza o vetor valorPedidos no índice 1 (índice base 0) para somar 13.50.
	               valorPedidos[Integer.parseInt(codigo) - 1] += valorTotalPedido;
	           } else {
	               System.out.println("Item não encontrado no cardápio.");
	           }
	       }

	       double valorTotalGeral = 0;

	       System.out.println("\nResumo dos pedidos:");
	       //esta varrendo o vetor valorPedidos e 
	       //mostrando na tela o produto e o valor total do produto
	       //esta somando tdos os valores de ValorPedidos pra mostrar o geral
	       for (int i = 0; i < valorPedidos.length; i++) {
	           if (valorPedidos[i] > 0) {
	               System.out.println("Item " + cardapio[i][1] + ": R$" + valorPedidos[i]);
	               valorTotalGeral += valorPedidos[i];
	           }
	       }

	       System.out.println("\nValor total da conta geral: R$" + valorTotalGeral);


	}

}
