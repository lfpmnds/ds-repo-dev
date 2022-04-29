package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int contarMulheres = 0;
		int contarHomens = 0;
		double testarMaisAlto = 0;
		double somaAlturaMulheres = 0;
		double somaPeso = 0;
		String maisAlto = null;

		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do atleta número " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sexo: ");
			char sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor inválido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			if (sexo == 'F') {
				contarMulheres++;
			} else {
				contarHomens++;
			}
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			while (altura <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			if (altura > testarMaisAlto) {
				testarMaisAlto = altura;
				maisAlto = nome;
			}
			if (sexo == 'F') {
				somaAlturaMulheres += altura;
			}
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			while (peso <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			somaPeso += peso;
		}
		
		double pesoMedio = somaPeso / n;
		double porcHomens = contarHomens * 100 / n;		
				
		System.out.println();

		System.out.println("RELATÓRIO:");		
		System.out.printf("Peso médio dos atletas: %.2f \n", pesoMedio);
		System.out.println("Atleta mais alto: " + maisAlto);		
		System.out.printf("Porcentagem de homens: %.1f %%%n", porcHomens);
		if (contarMulheres == 0) {
			System.out.println("Altura média das mulheres: Não há mulheres cadastradas");
		} else {
			double alturaMediaMulheres = somaAlturaMulheres / contarMulheres;
			System.out.printf("Altura média das mulheres: %.2f", alturaMediaMulheres);
		}		
		
		sc.close();
	}
}

