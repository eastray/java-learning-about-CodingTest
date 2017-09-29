package Colored_Paper;

import java.util.Scanner;

public class MainClass {

	private static Scanner scanner = new Scanner(System.in);
	private static int basicPaperSize = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Colored Paper Scope: " + inputPaperInfo(numberOfColoredPaper()));
	}

	public static int numberOfColoredPaper() {

		System.out.print("Input Number of Colored Paper: ");
		int paperNum = scanner.nextInt();

		return paperNum;
	}

	public static int inputPaperInfo(int paperNum) {
		int[][] paper = new int[100][100];

		// 색종이의 시작 좌표 입력
		for (int cycle = 1; cycle < paperNum+1; cycle++) {

			System.out.print(cycle + "번째 X 좌표: ");
			int xPoint = scanner.nextInt();
			System.out.print(cycle + "번째 Y 좌표: ");
			int yPoint = scanner.nextInt();
			System.out.println("X: " + xPoint + " Y: " + yPoint);
			
			int maxXPoint = xPoint + basicPaperSize;
			int maxYPoint = yPoint + basicPaperSize;
			System.out.println("Max X: " + maxXPoint + " Max Y: " + maxYPoint);

			for (int i = xPoint; i <= maxXPoint; i++) {
				for (int j = yPoint; j <= maxYPoint; j++) {
					paper[j][i]++;
				}
			}
			
		}
		
		int area = 0;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(paper[i][j] >= 1)
					area++;
			}
		}

		return area;
	}
}
