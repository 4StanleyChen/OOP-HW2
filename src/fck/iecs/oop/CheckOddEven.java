package fck.iecs.oop;

import  java. util.*;

public class CheckOddEven {

	public static void main(String[] args) {
		System.out.println("Enter a integer:");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i%2==0){
			System.out.println("The input integer is Even Number.");	
		}
		else{
		    System.out.println("The input integer is Odd Number.");	
		}

	}

}
