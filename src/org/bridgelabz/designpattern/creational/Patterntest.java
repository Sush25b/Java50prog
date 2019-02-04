package org.bridgelabz.designpattern.creational;

import java.util.List;

public class Patterntest 
{
	int f;
	
	public void test()
	{
		f=101;
	}
	
		@Override
	public String toString() {
		return "Patterntest [f=" + f + "]";
	}

		public static void main(String[] args) throws CloneNotSupportedException
		{

			Employees emps = new Employees();
			System.out.println(emps.id+"***********");
			emps.loadData();
			
			System.out.println(emps.id);
			
			emps.id=11;
			System.out.println(emps.id);
			
			//Use the clone method to get the Employee object
			Employees empsNew = (Employees) emps.clone();
			
	
			System.out.println("emps List: "+emps.getEmpList());
			
			Patterntest p=new Patterntest();

			
			System.out.println(p.f);
			p.test();
			System.out.println(p);
		}
}
