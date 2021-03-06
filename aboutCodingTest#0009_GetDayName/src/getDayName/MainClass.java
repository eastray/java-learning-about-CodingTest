package getDayName;

import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] dayOfTheWeek = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] endOfMonth = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int A = sc.nextInt();
		int B = sc.nextInt();

		getDayName(dayOfTheWeek, endOfMonth, A, B);
	}

	public static void getDayName(String[] dayOfTheWeek, int[] endOfMonth, int A, int B) {
		int sum = 0;

		for (int i = 0; i < A - 1; i++) 
			sum += endOfMonth[i];

		B += sum % dayOfTheWeek.length - 1;

		if (B == 1) {
			System.out.println("result: " + dayOfTheWeek[6]);
			return;
		}

		System.out.println("result: " + dayOfTheWeek[(B - 2) % 7]);

	}

}
