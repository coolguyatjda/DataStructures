package com.jda.ds.core;

import java.util.Scanner;

public class BSTNumber {

public static	int catalan(int n) {
      int res = 0;
       
      // Base case
      if (n <= 1) {
          return 1;
      }
      for (int i = 0; i < n; i++) {
          res += catalan(i) * catalan(n - i - 1);
      }
      return res;
  }

  public static void main(String[] args) {
     
      Scanner in = new Scanner(System.in);
      int i = in.nextInt();
     System.out.print(catalan(i));
     
  }

}
