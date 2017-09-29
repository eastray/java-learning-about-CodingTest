package HarshadNumber;

public class MainClass {

	public static void main(String[] args) {
		MainClass sn = new MainClass();
		System.out.println(sn.isHarshad(18));
	}

	public boolean isHarshad(int num) {

		boolean result = false;
		int initNum = num;
		int inputNum[] =  new int[] { 0, 0, 0, 0, 0 };
		int sum = 0;
		int i = 0;

		while (num != 0) {
			inputNum[i] = num % 10;
			sum += num % 10;
			num /= 10;
			i++;
		}
		
		if (initNum % sum == 0)
			result = true;

		return result;
	}
}
