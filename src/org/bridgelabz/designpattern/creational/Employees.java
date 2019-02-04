package org.bridgelabz.designpattern.creational;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable
{
		int id;
		
		public Employees()
		{
		}
		
		public Employees(int id){
			this.id=id;
		}
		
		public void loadData()
		{
			//read all employees from database and put into the list
			id=101;
		}
		
		public int getEmpList() {
			return id;
		}

		@Override
		public Object clone() throws CloneNotSupportedException{
				
				this.id=505;
			
				return new Employees(id);
	}
}
