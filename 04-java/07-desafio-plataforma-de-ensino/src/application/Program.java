package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da " + i + "ª aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char taskOrVideo = sc.next().charAt(0);
			sc.nextLine();
					
			if (taskOrVideo == 'c') {
				System.out.print("Título: ");
				String title = sc.nextLine();
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundo: ");
				int seconds = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				Video video = new Video(title, url, seconds);
				list.add(video);
			} 
			else if (taskOrVideo == 't') {
				System.out.print("Título: ");
				String title = sc.nextLine();
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int quantity = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				Task task = new Task(title, description, quantity);
				list.add(task);
			}
		}
		
		int sum = 0;
		for (Lesson lesson : list) {
			sum += lesson.duration();
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");
		
		sc.close();
	}
}

