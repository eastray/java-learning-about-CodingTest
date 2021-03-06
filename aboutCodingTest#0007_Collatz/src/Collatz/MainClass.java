package Collatz;

import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);
	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testCase = 0;

		System.out.print("Input TestCase: ");
		testCase = sc.nextInt();

		MainClass mainClass = new MainClass();

		System.out.println("count: " + mainClass.collatz(testCase));
	}

	private int collatz(int testCase) {
		System.out.print("Process TestCase: " + testCase);
		System.out.println();
		
		if (testCase == 1)
			return count;
		
		if (count == 50)
			return -1;

		count++;
		
		if (testCase % 2 == 0)  // Even
			return this.collatz(testCase / 2);
		
		 else  // Odd
			return this.collatz(testCase * 3 + 1);
	}
}
