package nextBigNumber;

import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = sc.nextInt();
		int numberOfOne = 0;
		
		String stringNum = Integer.toBinaryString(num);
		
		String[] binaryString = stringNum.split("", 0);
		
		numberOfOne = stringToInt(binaryString);
		
		while(true){
			num++;
			
			stringNum = Integer.toBinaryString(num);
			
			binaryString = stringNum.split("", 0);
			
			if(numberOfOne == stringToInt(binaryString))
				break;
		
		}
		
		System.out.println("result: " + num);
		
	}
	
	public static int stringToInt(String[] binaryString){
		int numberOfOne = 0;
		
		for(String obj: binaryString)
			numberOfOne += Integer.parseInt(obj);
		
		return numberOfOne;
	}

}
