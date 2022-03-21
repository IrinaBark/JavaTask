package by.epam.training.main;

import java.util.Scanner;

import by.epam.training.entity.Train;

public class Main2 {

	public static void main(String[] args) {

		Train[] arrayTrain = new Train[2];

		init(arrayTrain);
		
		sort(arrayTrain);

		printInformation(arrayTrain);
	}
	public static void init(Train[] array) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			array[i] = new Train();

			System.out.println("������� ����� ���������� ������ >");
			array[i].destination = sc.nextLine();

			System.out.println("������� ����� ������ >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("������������ ����! ������� ����� ������ (�����) >");
			}
			array[i].trainNumber = sc.nextInt();

			String[] date = new String[] { "���", "�����", "����", "����", "������", "�������" };
			int[] setDate = new int[6];

			for (int j = 0; j < date.length; j++) {

				System.out.println("������� " + date[j] + " ����������� ������ >");

				while (!sc.hasNextInt()) {
					sc.nextLine();
					System.out.println("������������ ����! ������� " + date[j] + " ����������� ������ (�����) >");
				}
				setDate[j] = sc.nextInt();
			}
			sc.nextLine();

			array[i].departureTime.set(setDate[0], setDate[1], setDate[2], setDate[3], setDate[4], setDate[5]);

		}
	}

	public static void printInformation(Train[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println(" ����� ����� " + array[i].trainNumber + " ������������ � ����� " + array[i].destination
					+ " " + array[i].departureTime.getTime());
		}
	}

	public static void sort(Train[] array) {

		Train temp;

		for (int j = array.length - 1; j > 0; j--) {

			for (int i = 0; i < j; i++) {

				if (array[i].trainNumber > array[i + 1].trainNumber) {

					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}
}







