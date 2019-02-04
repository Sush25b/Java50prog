package org.bridgelabz.designpattern.creational;

import java.util.ArrayList;
import java.util.List;


public class std
{
			int id;
			
			public std()
			{
			}
			
			public std(int id){
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
}
