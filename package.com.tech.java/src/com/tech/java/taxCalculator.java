package com.tech.java;

public class taxCalculator {
		private double salary;
		private boolean isIndian;
		public String empname;
		public void calculateTax(double salary,boolean isIndian,String empname)
				throws CountryNotValidException
		{
			this.salary=salary;
			this.isIndian=isIndian;
			this.empname=empname;
			if(!isIndian)
			{
				throw new CountryNotValidException();
			}
			
			
		}
		public static void main(String[] args) {
			CalculateTax tax1=new CalculateTax();
			try {
				tax1.calculateTax(50000, false, "Andy");
			} catch (CountryNotValidException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception is"+e.getMessage());
				e.printStackTrace();
			}
			
		}
	}



	

	
		
		
		


