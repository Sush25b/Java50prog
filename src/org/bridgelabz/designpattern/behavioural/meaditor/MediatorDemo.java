package org.bridgelabz.designpattern.behavioural.meaditor;

public class MediatorDemo 
{
	public static void main(String args[])  
    {  
          
          Chatroom chat = new Chatroom();  
      
          User1 u1=new User1(chat);  
          u1.setname("Amit Patil");  
          u1.sendMsg("Hi Sumit! how are you?");  
        
                
          User2 u2=new User2(chat);  
          u2.setname("Tinu");  
          u2.sendMsg("I am Fine ! You tell?");  
    }  
  
}
