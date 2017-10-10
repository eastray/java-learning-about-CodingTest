package hopscotch;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();

		int[][] test = { { 1, 2, 3, 5 }, { 9, 6, 7, 8 }, { 6, 3, 2, 5 } };

		System.out.println(mc.hopscotch(test, 3));
	}

	public int hopscotch(int[][] arr, int size) {
		int result = 0;
		int max = 0;
		int beforeIndex = -1;
		int count = 0;

		for (int[] obj : arr) {
			for (int i = 0; i < obj.length; i++) {
				if (max < obj[i] && beforeIndex != i) {
					max = obj[i];
					count = i;
				}
			}
			result += max;
			beforeIndex = count;
			max = 0;
		}
		return result;
	}

}
