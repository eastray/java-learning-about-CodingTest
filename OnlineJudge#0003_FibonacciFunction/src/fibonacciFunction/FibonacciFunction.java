package fibonacciFunction;

import java.util.Scanner;

public class FibonacciFunction {

	private static Scanner sc = new Scanner(System.in);
	private static int[] array = new int[2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		for (int ele : arr) {
			// System.out.println(fibonacci(ele));
			fibonacci(ele);
			System.out.print(array[0] + " " + array[1]);
			System.out.println();

			array[0] = 0;
			array[1] = 0;
		}

	}

	private static int fibonacci(int n) {

		if (n == 0) {
			array[0]++;
			return 0;
		} else if (n == 1) {
			array[1]++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
