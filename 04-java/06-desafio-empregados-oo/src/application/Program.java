package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Nome do departamento: ");
		String deptName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address adress = new Address(email, phone);
		Department dept = new Department(deptName, payDay, adress);
		
		System.out.println();
		System.out.print("Quantos funcion�rios tem o departamento? ");
		int n = sc.nextInt();		
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Dados do funcion�rio " + i + ":");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(name, salary);
			dept.addEmployee(emp);
		}
		
		showReport(dept);
		
		sc.close();		
	}
	
	public static void showReport(Department dept) {
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.printf("Departamento de Vendas = R$ %.2f \n", dept.payroll());
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println("Funcion�rios:");
		for (Employee emp : dept.getEmployees()) {
			System.out.println(emp.getName());
		}
		System.out.println("Para d�vidas favor entrar em contato: " + dept.getAddress().getEmail());
	}
}
