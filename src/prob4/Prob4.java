package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		char[] c = reverse( s );
		printCharArray( c );
		
		scanner.close();
	}
	
	public static char[] reverse(String str) {
		int length= str.length();
		char[] c=new char[length];
		for(int i=0;i<c.length;i++){
			c[length-(i+1)] = str.charAt(i);
		}
		return c;
	}

	public static void printCharArray(char[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}
