package kevinBaconGame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class KevinBaconGame {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KevinBaconGame kb = new KevinBaconGame();

		System.out.println(kb.kevinBacon(sc.nextInt(), sc.nextInt()));

	}

	private int kevinBacon(int n, int m) {

		int[][] arr = new int[n + 1][m + 1];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		int[] count = new int[arr.length];

		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					//System.out.print(arr[i][j]);
					// System.out.println("arr[" + i + "][" + j + "]: " + arr[i][j]);
					if (arr[i][j] > arr[i][k] + arr[k][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
						// System.out.println("arr["+i+"]["+j+"]: " + arr[i][j]);
					}

					count[k] = arr[i][j];
				}
				System.out.println();
			}
		}

		return 0;
	}

}
