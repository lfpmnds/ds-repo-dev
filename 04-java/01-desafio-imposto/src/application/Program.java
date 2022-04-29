package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Renda anual com salário: ");
		double salarioAnual = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		double prestacaoServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double ganhoCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double gastosEducacionais = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		
		System.out.println("CONSOLIDADO DE RENDA:");		
		
		//imposto sobre o salário
		double impostoSalario;
		if (salarioAnual < 36000.0) {
			impostoSalario = salarioAnual * 0.0;
		}
		else {
			if (salarioAnual < 60000.0) {
				impostoSalario = salarioAnual * 0.10;
			}
			else {
				impostoSalario = salarioAnual * 0.20;
			}
		}
		System.out.printf("Imposto sobre salário: %.2f \n", impostoSalario);
		
		//imposto sobre os serviços
		double impostoServico;
		if (prestacaoServico > 0.0) {
			impostoServico = prestacaoServico * 0.15;
		}
		else {
			impostoServico = 0.0;
		}
		System.out.printf("Imposto sobre serviços: %.2f \n", impostoServico);
		
		//imposto sobre os ganhos de capital
		double impostoCapital;
		if (ganhoCapital > 0.0) {
			impostoCapital = ganhoCapital * 0.20;
		}
		else {
			impostoCapital = 0.0;
		}
		System.out.printf("Imposto sobre ganho de capital: %.2f \n", impostoCapital);
		
		double impostoTotal = impostoSalario + impostoServico + impostoCapital;
		double maximoDedutivel = impostoTotal * 0.30;
		double gastosDedutiveis = gastosMedicos + gastosEducacionais;
		
		System.out.println();
		
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f \n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f \n", gastosDedutiveis);
		
		System.out.println();
		
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f \n", impostoTotal);
		
		double abatimento;
		if (maximoDedutivel > gastosDedutiveis) {
			abatimento = gastosDedutiveis;
		}
		else {
			abatimento = maximoDedutivel;
		}
		System.out.printf("Abatimento: %.2f \n", abatimento);
		
		double impostoDevido = impostoTotal - abatimento;
		System.out.printf("Imposto devido: %.2f \n", impostoDevido);
		
		sc.close();

	}
}
