package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "madam";   
		int length = st.length();
		System.out.println(length);// Declare A String value as"madam"
	
				String st1 = ""   ;     //Declare another String rev value as ""
				
				
				
         for (int i = (length-1);i>=0;i--) {
        	 System.out.println(i);//	 Iterate over the String in reverse order
        	 
        	 st1=st1+st.charAt(i);         //	 Add the char into rev
         }
         if (st1.equalsIgnoreCase(st)) { 
 			System.out.println(st);
 		}

 		else { 
 			System.out.println(st);
 		}
        	 

//	 Compare the original String with the reversed String, if it is same then print palinDrome 
	}

}
