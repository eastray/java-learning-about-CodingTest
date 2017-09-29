package LineCombination;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mc = new MainClass();
		System.out.println(Arrays.toString(mc.setAlign(3, 5)));

	}

	public int[] setAlign(int n, long k) {
		int[] answer = {};

		int startNum = 1;
		
		int temp = sub2(2);
		
		return answer;
	}
	
	public int sub2 (int n) {
		
		int result = 0;
		
		int fac = 1;
		for (int i = n; i >= 1; i--) {
			//fac = fac * i;
			
		}
	
		
		return result;
		
	}
	
	public int sub (int n ) {

		int fac = 1;
		for (int i = n; i >= 1; i--) {
			fac = fac * i;
		}
	
		
		if (n <=1)
			return n;
		else
			return sub(n-2) + sub(n-1);
	}

}
