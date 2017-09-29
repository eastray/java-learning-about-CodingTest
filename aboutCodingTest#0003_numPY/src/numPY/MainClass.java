package numPY;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numPY("oooo"));
		System.out.println(numPY("pPooooyY"));
		System.out.println(numPY("opopopo"));
		System.out.println(numPY("oyoyoyo"));
		System.out.println(numPY("oyopoyop"));
		System.out.println(numPY("oyYoPoYoP"));
		
	}
	
	public static boolean numPY(String s) {
		
		int numP = 0;
		int numY = 0;
		boolean result = false;
		
		for(int i = 0; i < s.length(); i++ ) {
			
			if(Character.toLowerCase(s.charAt(i)) == 'p') 
				numP++;
			
			if(Character.toLowerCase(s.charAt(i)) == 'y')
				numY++;	
		}
		
		if(numP == numY)
			result = true;
				
		return result;
	}

}
