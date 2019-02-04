package org.bridgelabz.designpattern.creational;

public class emp 
{
		int id;
		String name;
		
		//set and get method  for  id
			
		public void setID(int id)        /*scope is public bcz if we write(get & set method) in another package..then
													the main should access it*/
		{
			this.id =id;
		}
		
		public int getID()
		{
			return id;
		}
		
		//set and get method  for  name
		public void setName(String name)
		{
			this.name =name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public static void main(String[] args) 
		{
			//1st object created
		emp emp=new emp();
		emp emp2=new emp();
		
			
			//1st obj at id ka value set_karo by set method;
			emp.setID(101);
			

			//print output of 1st object by get method
			System.out.println(emp.getID()+","+emp.getName());
			
			System.out.println(emp2.getID()+","+emp2.getName());

			//2nd obj at name ka value set_karo by set method;
			emp2.setName("abc");
			
			System.out.println(emp.getID()+","+emp.getName());
			
			System.out.println(emp2.getID()+","+emp2.getName());
		}

}
