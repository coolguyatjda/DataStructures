package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[n][n];
		int index=0, flag = -1, temp = n/2;
		for(int i=0; i<2; i++){
			while(index < n){
				arr[index][temp] = 1;
				temp = temp +flag;
				index++;
				if(index == n/2) flag*=-1;
			}
			index= 0;
			temp--;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}

}
