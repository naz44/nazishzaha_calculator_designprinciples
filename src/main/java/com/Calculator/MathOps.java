package com.Calculator;
class MathOps{
	double num1,num2;
	MathOps(double n1,double n2)
	{
		this.num1=n1;
		this.num2=n2;
	}
	public double add()
	{
		return(num1+num2);
	}
	public double multiply()
	{
		return(num1*num2);
	}
	public double divide()
	{
		return(num1/num2);
	}
	public double subtract()
	{
		return(num1-num2);
	}
}