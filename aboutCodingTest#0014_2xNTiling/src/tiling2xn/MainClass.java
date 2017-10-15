package tiling2xn;

public class MainClass {

	private static int div = 10007;
	private static int[] dp = new int[1001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mc = new MainClass();

		System.out.println(mc.tiling(30));

	}

	private int tiling(int n) {

		int answer = 0;

		if (n <= 2)
			return n;

		answer = tiling(n - 1) + tiling(n - 2);

		// if (n < 2) {
		//
		// return 1;
		// }
		//
		// if (dp[n] > 0) {
		//
		// return dp[n];
		// }
		//
		// dp[n] = (tiling(n - 1) + tiling(n - 2)) % div;
		//
		// answer = dp[n];

		return answer;
	}
}
