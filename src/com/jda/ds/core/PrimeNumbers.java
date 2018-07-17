package com.jda.ds.core;


public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1000;
		int a[] = primes(N);
		a[0] =1; a[1] =1;
		for(int i=1; i<=10; i++){
			for(int j=1; j<=100; j++)
			    System.out.print(a[i*j] + " ");
			System.out.println();
		}
	}
	public static int[] primes(int N){
		int arr[] = new int[N+2];
		for(int i=2; i<=(int)Math.sqrt(N); i++){
			int count  = i;
			while(count*i <= N+1){
				if(arr[i] == 1)
					break;
				arr[count*i] =1;
				count++;
			}
		}
		return arr;
	}

}
