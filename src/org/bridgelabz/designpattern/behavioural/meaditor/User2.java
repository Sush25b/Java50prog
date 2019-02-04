package org.bridgelabz.designpattern.behavioural.meaditor;

public class User2 extends Participant
{
	 
	    
	  private String name;  
	  private Chatroom chatr;  
	    
	  @Override  
	  public void sendMsg(String msg) 
	  {  
		  chatr.showMessage(msg,this);  
	        
	  }  

	  @Override  
	  public void setname(String name) {  
	      this.name=name;  
	  }  

	  @Override  
	  public String getName() {  
	      return name;  
	  }  
	    
	  public User2(Chatroom chat){  
	      this.chatr=chat;  
	  }     
	    
}
