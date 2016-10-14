package fck.iecs.oop;

import  java. util.*;

public class StringComparator {

	public static void main(String[] args) {
		int compare =0;
		
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a string 1: ");
			String a = input.next();
			System.out.println("Enter a string 2: ");
			String b = input.next();
		
			a.toLowerCase();
			b.toLowerCase();
		
			int flag = a.compareTo(b);
		
			if(a.equalsIgnoreCase(b)) {
				System.out.println("The two strings are the same.");
				compare = 0;
			}
			else{
				System.out.println("The two strings are not the same.");
				compare = 1;
			}
		}while(compare == 1);

	}

}
