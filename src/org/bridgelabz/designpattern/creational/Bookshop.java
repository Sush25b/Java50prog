package org.bridgelabz.designpattern.creational;

import java.util.ArrayList;
import java.util.List;

public class Bookshop implements Cloneable
{
	private String shopname;
	 List<Book> book=new ArrayList<Book>();
	
	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public void loaddata()
	{
		int i;
		for( i=0;i<10;i++)
		{
			Book b=new Book();
			b.setId(i);	
			b.setName("JAVA book "+i);
			getBook().add(b);
			//System.out.println(book);
		}
	}
	
	//to print list of book directly
	public void d()
	{
		System.out.println(shopname);
		System.out.println(book);
	}

	@Override
	public String toString() 
	{
		return "Bookshop [shopname=" + shopname + ", book=" + book + "]";
	}
	
	@Override
	protected Bookshop clone() throws CloneNotSupportedException 
	{
		Bookshop shop=new Bookshop();
		
		for(Book b: this.getBook())
		{
			shop.getBook().add(b);
		}
		return shop;
	}

//	protected Bookshop clone2()  throws CloneNotSupportedException 
	{
//		return super.clone();
	}
	
	public static void main(String[] args) 
	{
		Bookshop b=new Bookshop();
		System.out.println(b.shopname);
		System.out.println(b.book);
		System.out.println(b.shopname);
		System.out.println(b.book);
	}
}
