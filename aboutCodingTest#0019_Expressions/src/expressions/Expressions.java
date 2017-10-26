package expressions;

import java.util.Scanner;

public class Expressions {

	private int expressions(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++) {
			int sum = i;
			
			for (int j = i + 1; j <= n; j++) {
				sum += j;
				
				if (n == sum) {
					result++;
					break;
				}

				if (n < sum) 
					break;
			}
		}

		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expressions ex = new Expressions();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(ex.expressions(n));

	}

}
