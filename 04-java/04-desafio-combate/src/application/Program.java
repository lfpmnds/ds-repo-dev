package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Champion champ1 = new Champion();
		Champion champ2 = new Champion();

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		champ1.setName(sc.nextLine());
		System.out.print("Vida inicial: ");
		champ1.setLife(sc.nextInt());
		System.out.print("Ataque: ");
		champ1.setAttack(sc.nextInt());
		System.out.print("Armadura: ");
		champ1.setArmor(sc.nextInt());
		sc.nextLine();

		System.out.println();

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		champ2.setName(sc.nextLine());
		System.out.print("Vida inicial: ");
		champ2.setLife(sc.nextInt());
		System.out.print("Ataque: ");
		champ2.setAttack(sc.nextInt());
		System.out.print("Armadura: ");
		champ2.setArmor(sc.nextInt());

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= n; i++) {
			champ1.takeDamage(champ2);
			champ2.takeDamage(champ1);
			System.out.println("Resultado do turno " + i);
			System.out.println(champ1.getName() + ": " + champ1.status());
			System.out.println(champ2.getName() + ": " + champ2.status());
			System.out.println();
			if (champ1.isAlive() != true || champ2.isAlive() != true) {
				i = n;
			}
		}

		System.out.println("FIM DO COMBATE!");

		sc.close();
	}
}
