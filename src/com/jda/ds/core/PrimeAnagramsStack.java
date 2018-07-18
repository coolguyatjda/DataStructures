package com.jda.ds.core;

import com.jda.ds.util.AnagramDetection;
import com.jda.ds.util.Stack;

public class PrimeAnagramsStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1000;
		int arr[] = PrimeNumbers.primes(N);
		Stack<Integer> si = new Stack<>();
		
		for(int i=10; i<N; i++){
			for(int j=i+1; j<N+1; j++){
				if(arr[i] == 0 && arr[j] == 0){
					if(AnagramDetection.check(Integer.toString(i), Integer.toString(j))){
						si.push(i);
						si.push(j);
					}
				}
			}
	}
		for(int i=0; i<si.size()/2; i++){
			for(int j=0; j<2; j++)
				System.out.print(si.pop() + " ");
			System.out.println();
	}
	}
}
