package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.Stack;

public class StackProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char charArr[] = str.toCharArray();
		Stack<Integer> sc = new Stack<>();
		int ans = 0;
		for(int i=0; i<charArr.length;  i++){
			if(charArr[i] == '(')
				sc.push(1);
			else if(charArr[i] == ')'){
				if(sc.isEmpty()){
					System.out.println("NO");
					ans = 1;
					break;
				}
				else
					sc.pop();
			}
		}
		if(ans == 0)
			System.out.println("YES");

	}

}
