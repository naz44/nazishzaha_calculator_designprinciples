package com.Calculator;
import java.io.IOException;
import com.Calculator.*;

/**
 * A calculator application
 * as layered task
 *high cohesion
 *--each class has specific purpose
 * and low coupling
 * --interdependency is less among classes
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args ) throws IOException
    {
     System.out.println("------------CALCULATOR-----------");
     Data input=new Data();
     input.readFromConsole();
	 double res = 0;
     MathOps calculate=new MathOps(input.number1,input.number2);
     if(input.choice==1)
       	 res=calculate.add();
     else if(input.choice==2)
       	 res=calculate.subtract();
     else if(input.choice==3)
       	 res=calculate.multiply();
     else if(input.choice==4) {
       	 if(input.number2!=0)
       	     res=calculate.divide();
       	 else {
       		 System.out.println("\nThe operation is invalid as denominator is 0");
       	     System.exit(0);}
       	 }
     else
       	 System.out.println("enter one among the options");
     System.out.println("The result is :"+res);
    
    }
}
