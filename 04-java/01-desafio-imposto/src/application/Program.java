package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Renda anual com sal�rio: ");
		double salarioAnual = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		double prestacaoServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double ganhoCapital = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		double gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double gastosEducacionais = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		
		System.out.println("CONSOLIDADO DE RENDA:");		
		
		//imposto sobre o sal�rio
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
		System.out.printf("Imposto sobre sal�rio: %.2f \n", impostoSalario);
		
		//imposto sobre os servi�os
		double impostoServico;
		if (prestacaoServico > 0.0) {
			impostoServico = prestacaoServico * 0.15;
		}
		else {
			impostoServico = 0.0;
		}
		System.out.printf("Imposto sobre servi�os: %.2f \n", impostoServico);
		
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
		
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f \n", maximoDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f \n", gastosDedutiveis);
		
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
