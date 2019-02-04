package org.bridgelabz.designpattern.behavioural.observer;

public class BinaryObserverj extends Observera
{
	 public BinaryObserverj(Subject subject)
	 {
		 this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }
}
