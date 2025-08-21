package controller;

import java.text.DecimalFormat;
import java.util.Scanner;

import model.Venda;

public class CtrlPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");  // Instância de DecimalFormat para formatar os valores
		
		
		System.out.println("Digite a quantidade de vendas: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
		
		System.out.println("Digite o número da venda: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite a quantidade de produtos: ");
		int quantidade = sc.nextInt();
		
		System.out.println("Digite o valor unitário do produto: ");
		double valorUnitario = sc.nextDouble();
		
		Venda venda = new Venda(numero, quantidade, valorUnitario);
		
		System.out.println("\nDados da venda:");
		System.out.println("Número de vendas: " + venda.getNumero());
		System.out.println("Quantidade de produtos: " + venda.getQuantidade());
		System.out.println("Valor unitário: R$ " + df.format(venda.getValorUnidade()));
		System.out.println("Valor total a pagar: R$ " + df.format(venda.valorPagar()));
		
		
		
		sc.close();
		}

	}

}
