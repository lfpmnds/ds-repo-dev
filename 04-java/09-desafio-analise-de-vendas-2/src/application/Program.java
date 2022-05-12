package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Sale> list = new ArrayList<>();
		Map<String, Double> totalSales = new LinkedHashMap<>();

		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		System.out.println();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	
			String lines = br.readLine();				

			while (lines != null) {
				String[] fields = lines.split(",");

				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));				
				
				if (totalSales.containsKey(fields[2])) {
					double sum = totalSales.get(fields[2]);
					totalSales.put(fields[2], Double.parseDouble(fields[4]) + sum);
				}
				else {
					totalSales.put(fields[2], Double.parseDouble(fields[4]));
				}					
				
				lines = br.readLine();
			}
			
			System.out.println("Total de vendas por vendedor:");
			for (String key : totalSales.keySet()) {
				System.out.println(key + " - R$ " + String.format("%.2f", totalSales.get(key)));
			}	
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		sc.close();
	}
}