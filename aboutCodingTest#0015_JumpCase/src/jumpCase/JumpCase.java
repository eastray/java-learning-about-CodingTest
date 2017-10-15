package jumpCase;

public class JumpCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JumpCase jc = new JumpCase();

		int testCase = 5;
		System.out.println(jc.jumpCase(testCase));

	}

	public int jumpCase(int num) {
		int answer = 0;
		// int num1 = 1;
		// int num2 = 1;
		//
		// for(int i = 1; i <num; i++) {
		//
		// answer = num1 + num2;
		// num1 = num2;
		// num2 = answer;
		//
		// }

		if (num <= 2)
			return num;
		answer = jumpCase(num - 1) + jumpCase(num - 2);

		return answer;
	}

}
