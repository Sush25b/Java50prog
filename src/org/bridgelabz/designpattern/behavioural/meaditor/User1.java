package org.bridgelabz.designpattern.behavioural.meaditor;

//This is a class.  

public class User1 extends Participant {  
    
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
    
  public User1(Chatroom chat){  
      this.chatr=chat;  
  }     
    
}