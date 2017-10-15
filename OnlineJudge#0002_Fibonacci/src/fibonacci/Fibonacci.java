package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci fibo = new Fibonacci();

		System.out.println(fibo.fibonacci(10));

	}

	private int fibonacci(int n) {
		int result = 0;

		if (n < 2)
			return n;

		result = fibonacci(n - 1) + fibonacci(n - 2);

		return result;
	}

}
