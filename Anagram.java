package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text1 = "stops";
		String text2 = "potss"; 
		
		int length = text1.length();
		int length2 = text2.length();
		
		if (length==length2) {
			System.out.println("Both length are same ");
			
			char[] charAt = text1.toCharArray();
			char[] charAt2 = text2.toCharArray();
			
			Arrays.sort(charAt);
			Arrays.sort(charAt2);
			
			System.out.println(charAt);
			System.out.println(charAt2);
			
			
		}else {
			System.out.println("the length value is diff" );
		}
			
		
			
		
		
		
	}

}
