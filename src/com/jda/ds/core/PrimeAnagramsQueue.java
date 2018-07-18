package com.jda.ds.core;

import com.jda.ds.util.AnagramDetection;
import com.jda.ds.util.Queue;

public class PrimeAnagramsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1000;
		int arr[] = PrimeNumbers.primes(N);
		Queue<Integer> si = new Queue<>();
		
		for(int i=10; i<N; i++){
			for(int j=i+1; j<N+1; j++){
				if(arr[i] == 0 && arr[j] == 0){
					if(AnagramDetection.check(Integer.toString(i), Integer.toString(j))){
						si.enqueue(i);
						si.enqueue(j);
					}
				}
			}
	}
		for(int i=0; i<si.size()/2; i++){
			for(int j=0; j<2; j++)
				System.out.print(si.dequeue() + " ");
			System.out.println();
	}
	}
}
