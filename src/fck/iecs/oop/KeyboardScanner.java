package fck.iecs.oop;
import  java. util.*;

public class KeyboardScanner {

	public static void main(String[] args) {
		System.out.println("Enter a integer: ");
		Scanner dodolu = new Scanner(System.in);
		int i = dodolu.nextInt();
		System.out.println("Enter a float point number: ");
		float f = dodolu.nextFloat();
		System.out.println("Enter a you name: ");
		String s = dodolu.next();
		System.out.printf("Hi %s, the multiplication of %d and %f is %.2e", s, i, f, i*f);

	}

}
