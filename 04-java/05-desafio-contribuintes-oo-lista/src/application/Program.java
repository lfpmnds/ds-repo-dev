package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes voc� vai digitar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			TaxPayer taxPayer = new TaxPayer();
			taxPayer.setId(i);
			System.out.println("Digite os dados do " + i + "� contribuinte:");
			System.out.print("Renda anual com sal�rio: ");
			taxPayer.setSalaryIncome(sc.nextDouble());
			System.out.print("Renda anual com presta��o de servi�os: ");
			taxPayer.setServicesIncome(sc.nextDouble());
			System.out.print("Renda anual com ganho de capital: ");
			taxPayer.setCapitalIncome(sc.nextDouble());
			System.out.print("Gastos m�dicos: ");
			taxPayer.setHealthSpending(sc.nextDouble());
			System.out.print("Gastos educacionais: ");
			taxPayer.setEducationSpending(sc.nextDouble());
			System.out.println();

			list.add(taxPayer);
		}
		
		for (TaxPayer tp : list) {
			System.out.println("Resumo do " + tp.getId() + "� contribuinte:");
			System.out.printf("Imposto bruto total: %.2f \n", tp.grossTax());
			System.out.printf("Abatimento: %.2f \n", tp.taxRebate());
			System.out.printf("Imposto devido: %.2f \n", tp.netTax());
			System.out.println();
		}

		sc.close();
	}
}
