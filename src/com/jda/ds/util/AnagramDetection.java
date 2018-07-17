package com.jda.ds.util;
import java.util.Scanner;

/**
 * 
 * @author bridgelabz
 *The main method takes in two words as its input and checks if they are anagrams.
 */
public class AnagramDetection {

	public static boolean check(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 != len2)
			return false;
		char[] chararr1 = str1.toCharArray();
		char[] chararr2 = str2.toCharArray();
		int count = 0;
		for(int i=0; i<len2; i++){
			for(int j=0; j<len1; j++){
				if(chararr1[j] == chararr2[i]){
					chararr1[j] = '@';
					count++;
					break;
				}
			}
		}
			if(count == len2)
				return true;
			return false;
		}
	}
