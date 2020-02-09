package com.Calculator;
import java.io.*;

class Data{
	int choice;
	double number1,number2;
	Data(){}
	public void readFromConsole() throws IOException,NumberFormatException {
		InputStreamReader inp=new InputStreamReader(System.in);
	    BufferedReader buf=new BufferedReader(inp);
	    String n1,n2,ch;
		System.out.println("Please enter a number:");
        n1=buf.readLine();
		System.out.println("Please enter another number:");
	    n2=buf.readLine();
	    System.out.println("Select one option 1.ADD 2.SUBTRACT 3.MULTIPLY 4.DIVIDE\t--");
	    ch=buf.readLine();
	    this.number1=Double.parseDouble(n1.trim());
	    this.number2=Double.parseDouble(n2.trim());
	    this.choice=Integer.parseInt(ch.trim());
	}
}