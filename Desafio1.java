package Aula5;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 int opcao,qutDesejada,resp,cont = 0;
		 double imposto,tributo, PrecoFinalizado = 0;
		 
		 int[] codigo  = {1,2,3,4,5,6,7,8,9,10};
		 String[] nome  = {"Leite ","Cereal","Arroz ","Atum  ","Feijão","Azeite","Óleo  ","Sabão ","Sal   ","Açucar"};
		 int[] qutProduto  = {10,10,10,10,10,10,10,10,10,10};
		 double[] preco = {4.57,6.60,8.0,5.5,9.40,13.0,12.70,3.60,5.60,7.0};
		 
		 String[] nomeCarrinho = new String[100];
		 int[] qutProdutoCarrinho = new int[100];
		 double[] precoCarrinho = new double[100];
		 double[] precoTotal = new double[100];
		 
		 
		System.out.println("                              Wipro Store");
		System.out.println("##########################################################################");
		System.out.println();
		System.out.println();
		
		
		
		do {
			System.out.println("CÓDIGO       PRODUTO       QUANT.PRODUTO      PREÇO UNIT.");
			System.out.println();
			System.out.println(codigo[0] + "             " + nome[0] + "             " +qutProduto[0]+ "             " +preco[0] );
			System.out.println(codigo[1] + "             " + nome[1] + "             " +qutProduto[1]+ "             " +preco[1] );
			System.out.println(codigo[2] + "             " + nome[2] + "             " +qutProduto[2]+ "             " +preco[2] );
			System.out.println(codigo[3] + "             " + nome[3] + "             " +qutProduto[3]+ "             " +preco[3] );
			System.out.println(codigo[4] + "             " + nome[4] + "             " +qutProduto[4]+ "             " +preco[4] );
			System.out.println(codigo[5] + "             " + nome[5] + "             " +qutProduto[5]+ "             " +preco[5] );
			System.out.println(codigo[6] + "             " + nome[6] + "             " +qutProduto[6]+ "             " +preco[6] );
			System.out.println(codigo[7] + "             " + nome[7] + "             " +qutProduto[7]+ "             " +preco[7] );
			System.out.println(codigo[8] + "             " + nome[8] + "             " +qutProduto[8]+ "             " +preco[8] );
			System.out.println(codigo[9] + "            " + nome[9] +  "             " +qutProduto[9]+ "             " +preco[9] );
			System.out.println();
			System.out.println();
			
		do {
		System.out.println("Olá, digite o código o produto desejado:");
		opcao = entrada.nextInt();
		if(opcao > 10 || opcao < 1) {
			System.err.println("Código inválido.");
		}
		}while(opcao > 10 || opcao < 1);
		
		System.out.println("Insira a quantidade desejada do produto:");
		qutDesejada = entrada.nextInt();
		
		if(qutDesejada > qutProduto[opcao - 1]) {
			System.err.println("Quantidade do produto indisponível.");
			System.out.println("Deseja continuar sua compra ?      1-sim    2-não");
			resp = entrada.nextInt();
		} else {
		
		qutProduto[opcao - 1] = qutProduto[opcao - 1] - qutDesejada;
		nomeCarrinho[cont] = nome[opcao - 1];
		qutProdutoCarrinho[cont] = qutDesejada;
		precoCarrinho[cont] = preco[opcao - 1];
		precoTotal[cont] = (precoTotal[cont] + (preco[opcao - 1] * qutDesejada));
		PrecoFinalizado = PrecoFinalizado + precoTotal[cont];
		cont++;
		
		
		
		System.out.println();
		System.out.println(qutDesejada + " un. de " + nome[opcao - 1] + " adicionado com sucesso no carrinho !!");
		System.out.println("Deseja continuar sua compra ?      1-sim    2-não");
		resp = entrada.nextInt();
		}
		}while(resp == 1);
		
		
		System.out.println();
		System.out.println("ITENS DO CARRINHO:");
		System.out.println("Nome        Qtde. no carrinho        Preço unit.(R$)        Preço Total (R$)");
		
		for(int i = 0; i< cont; i++) {
		System.out.print(nomeCarrinho[i]+ "                " + qutProdutoCarrinho[i] + "                        " + precoCarrinho[i] + "                     ");	
		System.out.printf("%.2f\n",precoTotal[i]);
	}
		
		System.out.println("                                                                      -------");
		System.out.printf("                                                                       R$ %.2f\n", PrecoFinalizado);
		tributo = (PrecoFinalizado * 9)/100;
		imposto = PrecoFinalizado + tributo;
		System.out.println();
		System.out.print("O valor total da compra com imposto de 9%:     ");
		System.out.printf("R$%.2f\n", imposto);
		
		
		int y = 0;
		
		do {
		System.out.println();
		System.out.println("Opções de pagamento:");
		System.out.println("[1] À vista em dinheiro ou cartão MASTERCARD, recebe 20% de desconto.");
		System.out.println("[2] À vista no cartão de crédito, recebe 15% de desconto.");
		System.out.println("[3] Em duas vezes, preço normal de etiqueta sem juros.");
		System.out.println("[4] Em três vezes, preço normal de etiqueta mais juros de 10%.");
		System.out.println();
		System.out.println("Qual seria a forma de pagamento ??");
		
		int x = entrada.nextInt();
        switch (x) {
        case 1:
            double precoTotalComDesconto,desconto;
            desconto = (PrecoFinalizado * 20)/100;
            precoTotalComDesconto = PrecoFinalizado - desconto;
            
            System.out.println("Wipro STORE");
            System.out.println("Rua dos Bôbos, nº0 - Mercadinho - LTDA");
            System.out.println("CNPJ : 1234554321-00");
            
            System.out.println("                            NOTA FISCAL");
            System.out.println("=============================================================================");
            System.out.println("PRODUTO          QTND. PRODUTOS           PREÇO UNIT.           PREÇO x PRODUTO           PREÇO TOTAL");
        	for(int i = 0; i< cont; i++) {
        		System.out.println(nomeCarrinho[i]+ "                " + qutProdutoCarrinho[i] + "                        " + precoCarrinho[i] + "                     " + precoTotal[i]+ "                     " +PrecoFinalizado);	
        		
        	}
        	System.out.println("=============================================================================");
        	System.out.println();
        	System.out.println();
        	System.out.println();
        	
        	System.out.printf("DESCONTO NA COMPRA: R$%.2f\n",desconto);
        	System.out.printf("VALOR TOTAL A SER PAGO: R$%.2f\n",precoTotalComDesconto);
        	System.out.printf("VALOR TRIBUTÁRIO: R$%.2f\n",tributo);
        	y=0;
            break;
            
        case 2:
        	double precoTotalComDesconto2,desconto2;
            desconto2 = (PrecoFinalizado * 15)/100;
            precoTotalComDesconto2 = PrecoFinalizado - desconto2;
            
            System.out.println("Wipro STORE");
            System.out.println("Rua dos Bôbos, nº0 - Mercadinho - LTDA");
            System.out.println("CNPJ : 1234554321-00");
            
            System.out.println("                            NOTA FISCAL");
            System.out.println("=============================================================================");
            System.out.println("PRODUTO          QTND. PRODUTOS           PREÇO UNIT.           PREÇO x PRODUTO           PREÇO TOTAL");
        	for(int i = 0; i< cont; i++) {
        		System.out.println(nomeCarrinho[i]+ "                " + qutProdutoCarrinho[i] + "                        " + precoCarrinho[i] + "                     " + precoTotal[i]+ "                     " +PrecoFinalizado);	
        		
        	}
        	System.out.println("=============================================================================");
        	System.out.println();
        	System.out.println();
        	System.out.println();
        	
        	System.out.printf("DESCONTO NA COMPRA: R$%.2f\n",desconto2);
        	System.out.printf("VALOR TOTAL A SER PAGO: R$%.2f\n",precoTotalComDesconto2);
        	System.out.printf("VALOR TRIBUTÁRIO: R$%.2f\n",tributo);
        	y=0;
            break;
        case 3:
        	double precoTotalComDesconto3,desconto3,valorParcela;
            desconto3 = 0;
            precoTotalComDesconto3 = PrecoFinalizado;
            valorParcela = PrecoFinalizado / 2;
            
            System.out.println("Wipro STORE");
            System.out.println("Rua dos Bôbos, nº0 - Mercadinho - LTDA");
            System.out.println("CNPJ : 1234554321-00");
            
            System.out.println("                            NOTA FISCAL");
            System.out.println("=============================================================================");
            System.out.println("PRODUTO          QTND. PRODUTOS           PREÇO UNIT.           PREÇO x PRODUTO           PREÇO TOTAL");
        	for(int i = 0; i< cont; i++) {
        		System.out.println(nomeCarrinho[i]+ "                " + qutProdutoCarrinho[i] + "                        " + precoCarrinho[i] + "                     " + precoTotal[i]+ "                     " +PrecoFinalizado);	
        		
        	}
        	System.out.println("=============================================================================");
        	System.out.println();
        	System.out.println();
        	System.out.println();
        	
        	System.out.printf("DESCONTO NA COMPRA: R$%.2f\n",desconto3);
        	System.out.printf("VALOR TOTAL A SER PAGO: R$%.2f\n",precoTotalComDesconto3);
        	System.out.printf("VALOR TRIBUTÁRIO: R$%.2f\n",tributo);
        	System.out.printf("Valor da parcela: R$%.2f",valorParcela);
        	
        	y=0;
            break;
        case 4:
        	double precoTotalComJuros,juros,valorParcela1;
            juros = (PrecoFinalizado *10)/100;
            precoTotalComJuros = PrecoFinalizado + juros;
            valorParcela1 = PrecoFinalizado / 3;
            
            System.out.println("Wipro STORE");
            System.out.println("Rua dos Bôbos, nº0 - Mercadinho - LTDA");
            System.out.println("CNPJ : 1234554321-00");
            
            System.out.println("                            NOTA FISCAL");
            System.out.println("=============================================================================");
            System.out.println("PRODUTO          QTND. PRODUTOS           PREÇO UNIT.           PREÇO x PRODUTO           PREÇO TOTAL");
        	for(int i = 0; i< cont; i++) {
        		System.out.println(nomeCarrinho[i]+ "                " + qutProdutoCarrinho[i] + "                        " + precoCarrinho[i] + "                     " + precoTotal[i]+ "                     " +PrecoFinalizado);	
        		
        	}
        	System.out.println("=============================================================================");
        	System.out.println();
        	System.out.println();
        	System.out.println();
        	
        	System.out.print("JUROS DE 10% NA COMPRA:" );
        	System.out.printf("  R$%.2f\n",juros);
        	System.out.printf("VALOR TOTAL A SER PAGO: R$%.2f\n",precoTotalComJuros);
        	System.out.printf("VALOR TRIBUTÁRIO: R$%.2f\n",tributo);
        	System.out.printf("Valor da parcela: R$%.2f",valorParcela1);
        	y = 0;
            break;
        default:
            System.err.println("Forma de pagamento inválida.");
            y = 1;
            break;	
}
}while(y == 1);
		
		
	}
}

