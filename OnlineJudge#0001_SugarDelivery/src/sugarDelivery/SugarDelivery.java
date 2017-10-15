package sugarDelivery;

public class SugarDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sugarDelivery(500));

	}

	public static int sugarDelivery(int n) {

		if (n < 2 || n > 5000)
			return -1;

		if (n % 5 == 0)
			return n / 5;
		else {
			if ((n % 5) % 3 != 0)
				return -1;
		}

		return n / 5 + (n % 5) / 3;
	}

}
