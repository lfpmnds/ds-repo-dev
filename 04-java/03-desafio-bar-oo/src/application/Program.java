package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f \n", bill.feeding());
		if (bill.couvert() != 0) {
			System.out.printf("Couvert = R$ = %.2f \n", bill.couvert());
		}
		else {
			System.out.println("Isento de Couvert");
		}
		System.out.printf("Ingresso = R$ %.2f \n", bill.ticket());
		
		System.out.println();
		
		System.out.printf("Valor a pagar = R$ %.2f", bill.total());
		
		sc.close();
		// TODO Auto-generated method stub
		

		/*
   escreval
   escreval("RELATÓRIO:")
   escreval("Consumo = R$ ", consumo:4:2)
   se consumo > 30.00 entao
      couvert <- 0.00
      escreval("Isento de couvert")
      senao
         couvert <- 4.00
         escreval("Couvert = R$ ", couvert:4:2)
   fimse
   se sexo = "F" entao
      ingresso <- 8.00
      senao
         ingresso <- 10.00
   fimse
   escreval("Ingresso = R$ ", ingresso:4:2)
   
   valorAPagar <- consumo + couvert + ingresso
   
   escreval
   escreval("Valor a pagar = R$ ", valorAPagar:4:2)*/
		

	}

}
