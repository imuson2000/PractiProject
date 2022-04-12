package com.tech.java;

public class TestCase1 {


	int numberOfSides;
	int sideLength;
	public void accept()
	{
		numberOfSides=3;
		sideLength=12;
	
	}
	public void add()
	{
		int sum=numberOfSides*sideLength;
		System.out.println("Total is "+sum);
	}
	public void sub()
	{ int tri= numberOfSides+sideLength;
	System.out.println("The Area of the Tringle is  "+tri);
	
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
