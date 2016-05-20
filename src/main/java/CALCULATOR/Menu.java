package CALCULATOR;

import java.util.Scanner;

/**
 * Created by taiseerhabib on 4/30/16.
 */
public class Menu {

    public Number tempnum = new Number();

    public String mselect (){

        System.out.println("Please Select from the following menu: ");

        System.out.println("Enter 'd' to display variables entered");
        System.out.println("Enter '+' for Sum");
        System.out.println("Enter '-' for Subtraction");
        System.out.println("Enter 'x' for Multiplication");
        System.out.println("Enter '/' for Division");
        System.out.println("Enter 's' for Square");
        System.out.println("Enter 's1' for Square Root");
        System.out.println("Enter 'exp' for Variable Exponentiation");
        System.out.println("Enter 'i' for inverse");
        System.out.println("Enter 's2' to invert sign");


        Scanner uoperation = new Scanner(System.in);
        tempnum.operation = uoperation.nextLine();
        return tempnum.operation;
    }
}
