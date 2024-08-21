package javaEx;

import java.util.Scanner;

public class consloIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gello, Java!"); //줄바꿈
		System.out.print("Enter yout name: "); //줄바꿈 x
		
		//콘솔
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Welcom, " + name + "!");
	}

}
