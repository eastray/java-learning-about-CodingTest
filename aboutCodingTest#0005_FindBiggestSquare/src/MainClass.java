import java.util.Scanner;

public class MainClass {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass test = new MainClass();
		int[][] board = { 
				{ 0, 1, 1, 1, 0 }, 
				{ 0, 1, 1, 1, 1 }, 
				{ 0, 0, 1, 1, 1 }, 
				{ 0, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 }, };

		System.out.println(test.findLargestSquare(board));
	}

	private int findLargestSquare(int[][] board) {
		int answer = 0;
		int x = board.length;
		int y = board.length;

		int[][] board2 = new int[x + 1][y + 1];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(board[i][j]);
				if (board[i][j] == 1 && i !=0 && j !=0) {
					board2[i][j] = min(board2[i - 1][j - 1], board2[i - 1][j], board2[i][j - 1]) + 1;
					answer = answer > board2[i][j] ? answer : board2[i][j];
				}
				
			}
			System.out.println();
		}
		//System.out.println("answer: " + answer * answer);
		return answer * answer;
	}

	private static int min(int a, int b, int c) {
		a = a < b ? a : b;
		return a < c ? a : c;
	}
}
