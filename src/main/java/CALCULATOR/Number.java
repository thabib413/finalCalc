package CALCULATOR;

import java.util.Scanner;

/**
 * Created by taiseerhabib on 4/29/16.
 */

//public int unum = " ";

public class Number {

public int guess = 0;
public double unum[];
public String operation = new String();

  public double[] checkNumber() {
      System.out.println("How many variables: ");
      Scanner vlength = new Scanner(System.in);
      double udata2 = vlength.nextDouble();
      unum[0] = udata2;

      for (int i=0; unum[i] <= 3; i++){
          unum[i] = i;
      }


/*
      for (int i=1; unum[i] <= unum[0]; i++ ) {
          System.out.println("Enter number: ");
          Scanner uvariable = new Scanner(System.in);
          unum[i] = uvariable.nextDouble();
          //Scanner unum[i] = new Scanner(System.in);
          //unum[0] = unum[].nextDouble();
      }

      for (int i=1; unum[i] <= unum[0]; i++ ) {
          System.out.println("Variables entered: ");
          System.out.println(unum[i]);
      }

      Scanner uoperation = new Scanner(System.in);
      operation = uoperation.nextLine();
*/


      //String operation = " ";
      //System.out.println(": ");
      //Scanner op = new Scanner(System.in);
      //operation = op.toString();


return unum;
  }

}

