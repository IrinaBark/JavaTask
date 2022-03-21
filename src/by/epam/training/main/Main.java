package by.epam.training.main;

import java.util.Scanner;

import by.epam.training.entity.Student;

public class Main {

	public static void main(String[] args) {

		Student[] array = new Student[10];

		init(array);

		printExcellentStudent(array);

	}

	public static void init(Student[] array) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			array[i] = new Student();

			System.out.println("¬ведите фамилию ученика!! " + (i + 1) + " >");
			array[i].surname = sc.nextLine();

			System.out.println("¬ведите инициалы ученика!! " + (i + 1) + " >");
			array[i].initials = sc.nextLine();

			System.out.println("¬ведите номер группы!! >" + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("¬ведите номер группы! (число) >");
			}
			array[i].groupNumber = sc.nextInt();

			for (int j = 0; j < array[i].grades.length; j++) {

				System.out.println("¬ведите оценку ученика >" + (i + 1) + " >");
				
				while (!sc.hasNextInt()) {
					sc.nextLine();
					System.out.println("¬ведите оценку ученика! (число) >");
				}
				array[i].grades[j] = sc.nextInt();
			}
			sc.nextLine();
		}
	}

	public static void printExcellentStudent(Student[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].grades.length; j++) {

				if (array[i].grades[j] < 9) {

					array[i].excellent = false;
				}
			}
			if (array[i].excellent) {

				System.out.println("”ченик из группы "+array[i].groupNumber + " с фамилией " + array[i].surname+" €вл€етс€ отличнком!");
			}
		}

	}
}
