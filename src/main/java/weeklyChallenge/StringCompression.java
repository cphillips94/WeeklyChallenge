package weeklyChallenge;

public class StringCompression {
	
	public static void main (String args[]) {
		
		String test = "aabcccccaaa";
		char [] charTest= test.toCharArray();
		int count = 0;
		//to store the char to be tested for repeat
		char r = charTest[0];
		//to store new string
		StringBuilder fin = new StringBuilder();
		
		for (int x =0;  x < charTest.length; x++) {
			if (charTest[x]==r) {
				//the the char is repeated add 1 to the count
				count++;
			}
			else {
                fin.append((r + "") + count);
                r = charTest[x];
                count= 1;
                //reset count and add the repeated char and the count to fin 
			}
		}
		//to ensure the string is smaller now
		
		if (fin.toString().length() <= test.length()) {
			System.out.println(fin.toString());
		}
		else {
			System.out.println("the old string was smaller  "+ test);
		}
		
		 
	}
	

}
