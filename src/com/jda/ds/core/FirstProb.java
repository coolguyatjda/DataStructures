package com.jda.ds.core;

import java.io.File;
import java.util.Scanner;

import com.jda.ds.util.LinkedList;

public class FirstProb {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("/home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/TextFile.txt");
		Scanner in = new Scanner(file);
		String str = "";
		while( in.hasNextLine()){
			str += in.nextLine();
			str += " ";
		}
		String strs[] = str.split("\\s+");
		LinkedList<String> lis = new LinkedList<>();
		for(int i=0; i<strs.length; i++){
			if(lis.search(strs[i]) == false)
				lis.add(strs[i]);
			else
				lis.remove(strs[i]);
		}
		System.out.println(lis);
	}

}
