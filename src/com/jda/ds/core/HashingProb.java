package com.jda.ds.core;

import java.io.File;
import java.util.Scanner;

import com.jda.ds.util.LinkedList;

public class HashingProb {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("/home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/TextFileInt.txt");
		Scanner in = new Scanner(file);
		String str = in.nextLine();
		String strs[] = str.split("\\s+");
		LinkedList<Integer>[] li = new LinkedList[11];
		li[1].add(1);
		li[1].add(2);
		System.out.println(li[1]);
		for(int i=0; i<strs.length; i++){
			li[Integer.parseInt(strs[i])%11].add(Integer.parseInt(strs[i]));	
		}
		Scanner inp= new Scanner(System.in);
		int input = inp.nextInt();
		if(li[input%11].search(input))
			li[input%11].add(input);
		else
			li[input%11].remove(input);
		for(int i=0; i<10; i++)
			System.out.println(li[i]);
	}

}
