package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.Queue;

public class QueueProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strs[] = str.split("//s+");
		Queue<String> qi = new Queue<>();
		for(int i=0;i<strs.length; i++)
			qi.enqueue(strs[i]);
		for(int i=0; i<strs.length; i++)
			System.out.println(qi.dequeue());
	}

}
