package coloredPaper;

import java.util.Scanner;

public class MainClass {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testCase();
		
	}

	public static void testCase() {
		System.out.println("사각형 개수 입력: ");
		int n = scanner.nextInt();
		int[][] paper = new int[100][100];

		for (int i = 0; i < n; i++) {
			System.out.println(i+1 + " 번째 사각형의 좌표 입력: ");
			int sx = scanner.nextInt();
			int sy = scanner.nextInt();
			
			int ex = sx + 9;
			int ey = sy + 9;

			for (int x = sx; x <= ex; x++) {
				for (int y = sy; y <= ey; y++) {
					paper[y][x]++;
				}
			}
		}

		@SuppressWarnings("unused")
		int area = 0;
		for (int y = 0; y <= 99; y++) {
			for (int x = 0; x <= 99; x++) {
				if (paper[y][x] >= 1) {
					area++;
				}
			}
		}
		System.out.println(area);
	}
	
}