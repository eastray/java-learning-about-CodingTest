package caesar;

import java.util.Scanner;

public class Caesar {

	private String caesar(String str, int n) {

		String result = "";
		
		for (int i = 0; i < str.length(); i++) 
			result += Character.toString((char)((int)str.charAt(i)+2));

		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caesar cs = new Caesar();

		Scanner sc = new Scanner(System.in);

		String sentence = sc.next();
		int n = sc.nextInt();

		System.out.println(cs.caesar(sentence, n));

	}

}
