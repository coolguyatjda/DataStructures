package com.jda.ds.core;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import com.jda.ds.util.LinkedList;

public class OrderedList {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("/home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/TextFileInt.txt");
		Scanner in = new Scanner(file);
		String str = "";
		while(in.hasNextLine()){
			str += in.nextLine();
			str += " ";
		}
		String strs[] = str.split("\\s+");
		int arr[] = new int[strs.length];
		for(int i=0; i<strs.length; i++){
			arr[i] = Integer.parseInt(strs[i]);
		}
		Arrays.sort(arr);
		LinkedList<Integer> li = new LinkedList<>();
		for(int i=arr.length-1; i>=0; i--){
			if(li.search(arr[i]) == false)
				li.add(arr[i]);
			else
				li.remove(arr[i]);
		}
		System.out.println(li);
	}

}
