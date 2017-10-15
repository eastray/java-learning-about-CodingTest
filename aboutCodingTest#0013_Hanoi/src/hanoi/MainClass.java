package hanoi;


public class MainClass {

	static int disk = 3;
	static int count = 0;

	public static void main(String[] args) {
		moveDisk(disk, 'A', 'B', 'C');
		System.out.println("count: " + count);
	}

	public static void moveDisk(int top, char one, char two, char three) {
		count++;
		if (top == 1)
			System.out.println(top+ ": [" + one + ", " + three + "]");
		else {
			moveDisk(top - 1, one, three, two);

			System.out.println(top + ": [" + one + ", " + three + "]");
			moveDisk(top - 1, two, one, three);
		}
	}
}

