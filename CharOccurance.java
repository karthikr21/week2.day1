package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		
		int i =0;
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		int length = str.length();
		System.out.println(length);
		for(int j=0; j<charArray.length;j++) {
			
			if(charArray[j]== 'e')
			{
				i=i+1;
			}	
				
        }
		System.out.println(i);
			
		}
		
		
	}


