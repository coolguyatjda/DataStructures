package com.jda.ds.core;

import java.io.File;
import java.util.Scanner;

import com.jda.ds.util.LinkedList;

/**
 * The main method reads a file and stores the numbers in an array of linked list.
 * The main method requires an integer input and pop()'s or push()'s the number based on if its found in the 
 * list..
 * 
 * @author sanket rathi
 *
 */
public class HashingProb {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("/home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/TextFileInt.txt");
		Scanner in = new Scanner(file);
		String str = in.nextLine();
		String strs[] = str.split("\\s+");
		LinkedList<Integer>[] li = new LinkedList[11];
		LinkedList<Integer> lii = new LinkedList();
		for(int i=0; i<strs.length; i++){
		//	lii = li[0];
			lii.add(Integer.parseInt(strs[i]));
			li[Integer.parseInt(strs[i])%11] = lii;
			lii = new LinkedList<>();
		}
		for(int i=0; i<11; i++)
			System.out.println(li[i]);
		Scanner inp= new Scanner(System.in);
		int input = inp.nextInt();
		lii = li[input%11];
		if(lii.search(input))
			lii.add(input);
		else
			lii.remove(input);
		li[input%11] = lii;
		
		for(int i=0; i<11; i++)
			System.out.println(li[i]);
	}

}
