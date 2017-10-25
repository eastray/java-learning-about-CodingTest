package chooseCity;

import java.util.Scanner;

public class ChooseCity {
	
	private int chooseCity(int n, int[][] arr) {
		
		int[] cost = new int[n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++){
				if(arr[i][0] == j+1){}
				else 
					cost[i] += Math.abs(arr[j][0] - arr[i][0]) * arr[j][1];
		}
		
		int temp = 0;
		int index = 0;
		for(int i = 1; i < n; i++)
			if(temp > cost[i])
				index = i;
		
		return arr[index][0];
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChooseCity cc = new ChooseCity();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int j = 0; j < n; j++)
			for(int i = 0; i < 2; i++)
				arr[j][i] = sc.nextInt();
		
		System.out.println(cc.chooseCity(n, arr));
		
	}

}
