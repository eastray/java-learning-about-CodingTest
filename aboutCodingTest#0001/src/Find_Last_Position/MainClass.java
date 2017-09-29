package Find_Last_Position;

public class MainClass {

	public static void main(String[] args) {
		int[][] v = { { 1, 1 }, { 2, 2 }, { 1, 2 } };

		solution(v);
	}

	public static int[] solution(int[][] v) {
		int[] answer = { 0, 0 };
		int[] frontNum = { 0, 0, 0 };
		int[] backNum = { 0, 0, 0 };

		for (int i = 0; i < v.length; i++) {
			frontNum[i] = v[i][0];
			backNum[i] = v[i][1];
		}

		answer[0] = solutionFunction(frontNum);
		answer[1] = solutionFunction(backNum);
		
		System.out.println("frontNumber: " + answer[0] + ", backNumber: " + answer[1]);
		return answer;
	}

	public static int solutionFunction(int[] arr) {
		if (arr[0] == arr[1])
			return arr[2];
		if (arr[1] == arr[2])
			return arr[0];
		return arr[1];
	}
}
