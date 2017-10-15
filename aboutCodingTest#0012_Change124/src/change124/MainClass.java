package change124;

public class MainClass {

	private static String answer = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mc = new MainClass();

		for (int i = 1; i < 20; i++)
			System.out.println(i+": result: " + mc.change124(i));

	}

	public String change124(int n) {
		 String answer = "";

	        while (true) {
	            int divNum = n / 3;
	            int remNum = n % 3 == 0 ? 4 : n % 3;

	            answer = remNum + answer;

	            n = divNum - (remNum == 4 ? 1 : 0);

	            if (n < 1) {
	                break;
	            }
	        }

	        return answer;

	}
}
