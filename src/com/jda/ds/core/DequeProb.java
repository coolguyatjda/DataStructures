package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.Deque;

public class DequeProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char charArr[] = str.toCharArray();
		Deque<Character> dc = new Deque<>();
		for(int i=0; i<charArr.length; i++)
			dc.addRear(charArr[i]);
		String sn = "";
		for(int i=0; i<charArr.length; i++)
			sn += dc.removeRear();
		if(str.equals(sn))
			System.out.println("Is a palindrome");
		else
			System.out.println("Is not a palindrome");
	}

}
