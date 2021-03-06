package setAlign;

import java.util.Scanner;

public class MainClass {
	
	private static Scanner sc = new Scanner(System.in);
	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testN = sc.nextInt();
		int testCount = sc.nextInt();
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		perm(arr, 0, testN, testCount);
	}

	public static void perm(int[] arr, int depth, int n, int testCount) {

		if(count == testCount ){
			System.out.print("testCount: " + testCount + ": ");
			print(arr,n);
			count = 10000;
			return;
		}
		
		if (depth == n) { 
			count++;
			return;
		}
		
		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, testCount);
			swap(arr, i, depth);
			
		}
	} 

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr, int k) {
		for (int i = 0; i < k; i++) {
			if (i == k - 1)
				System.out.println(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
	}
}
