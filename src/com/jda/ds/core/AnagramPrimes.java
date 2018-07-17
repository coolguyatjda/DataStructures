package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.AnagramDetection;

public class AnagramPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1000;
		int arr[] = PrimeNumbers.primes(N);
		for(int i=10; i<N; i++){
			for(int j=i+1; j<N+1; j++){
				if(arr[i] == 0 && arr[j] == 0){
					if(AnagramDetection.check(Integer.toString(i), Integer.toString(j)))
						System.out.println(i + " and " + j + " are anagrams");
				}
			}
		}
	}

}