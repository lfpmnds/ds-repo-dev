package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		System.out.println();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> list = new ArrayList<>();
			String lines = br.readLine();

			while (lines != null) {
				String[] fields = lines.split(",");

				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));

				lines = br.readLine();
			}

			System.out.println("Cinco primeiras vendas de 2016 de maior preço médio");

			list.sort((s1, s2) -> s1.averagePrice().compareTo(s2.averagePrice()));
			Collections.reverse(list);

			List<Sale> newList = list.stream().filter(x -> x.getYear() == 2016).limit(5).collect(Collectors.toList());
			newList.forEach(System.out::println);

			System.out.println();

			double sum = list.stream()
					.filter(x -> x.getSeller().equals("Logan") && (x.getMonth() == 1 || x.getMonth() == 7))
					.mapToDouble(y -> y.getTotal()).sum();

			System.out.printf("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f", sum);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
		}
		sc.close();
	}
}