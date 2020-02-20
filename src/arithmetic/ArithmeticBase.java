/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 * modifier Anousheh Niazi
 */
public class ArithmeticBase 
{
  public enum UserInput {PLUS,MINUS,TIMES,DIVIDE};
  private UserInput userinput;
  
 public double x,y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int userinput= sc.nextInt();
        
        switch (userinput) 
        {
            case 0:
                return x + y;
            case 1:
                return x - y;
            case 2:
                return x * y;
            case 3:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
