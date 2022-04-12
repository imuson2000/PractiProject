package com.tech.java;
public class Calculator {
	int number1;
	int number2;
	public void accept()
	{
		number1=70;
		number2=40;
	
	}
	public void add()
	{
		int sum=number1+number2;
		System.out.println("Total is "+sum);
	}
	public void sub()
	{ int diff= number1+number2;
	System.out.println("Diffrence is "+diff);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cobj;
		cobj=new Calculator();
		cobj.accept();
		cobj.add();
		cobj.sub();
		
	}

}
