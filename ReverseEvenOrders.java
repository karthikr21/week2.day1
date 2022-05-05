package week2.day1;

import org.bouncycastle.operator.AADProcessor;

public class ReverseEvenOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
for (int i=0;i<split.length;i++) {
	if (i%2 == 0) {
		System.out.print(split[i]+" ");
	}
	else {
		int a = split[i].length();
		int k = 0;
		//Convert words to character array if the position is even else print the word as it is(concatenate space at the end)
		char[] ch = new char[a];
		//print the even position words in reverse order using another loop
		for (int j = a-1; j >= 0; j--) {
			ch[k++] = split[i].charAt(j);					
		}
		//print the even character array
		System.out.print(ch);
		System.out.print(" ");
}
	}

	}}
