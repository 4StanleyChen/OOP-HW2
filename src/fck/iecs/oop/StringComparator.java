package fck.iecs.oop;

import  java. util.*;

public class StringComparator {

	public static void main(String[] args) {
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
        }
        else{
        	System.out.println("The two strings are not the same.");
        }

	}

}
