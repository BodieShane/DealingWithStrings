package strings.controller;
import javax.swing.JOptionPane;

import string.view.PopupDisplay;
import strings.model.Thingy; 

public class PopupController

{
	private PopupDisplay myPopups; 
	private Thingy myTestThingy;
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String myName = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("You typed in:" + myName + " stupid face that sounds like an old man name how old are you");
		
		String temp = myPopups.grabAnswer("Type in your age");
		int myAge;
		while(!isInteger(temp))
		{
			temp =myPopups.grabAnswer("What you don't want to type in a real age. Are you scared?!?!");
		}
		if(isInteger(temp))
		{
			myAge= Integer.parseInt(temp);
		}
		else
		{
			myAge = -9999999;
		}
		
		
		myPopups.showResponse("You typed " + myAge  + " wow your old why are you so old? Like I am like a week old. ");
		
		temp = myPopups.grabAnswer("Tipe in your weight");
		
		
		
		
		double myWeight;
		while(!isDouble(temp))
		{
			temp = myPopups.grabAnswer("what you don't want to give me your real weight");
		}
		if (isDouble(temp) )
		{
			myWeight = Double.parseDouble(temp);
		}
		else
		{
			myWeight = -500;
		}
		
		
		myTestThingy = new Thingy(myName, myAge, myWeight);
		
		
	}
	 private boolean isInteger(String input)
	 
	 {
		 boolean isInt = false;
		 
		 try
		 {
			 int temp = Integer.parseInt(input);
			 isInt = true;
		 }
		  catch(NumberFormatException error)
		 {
			  myPopups.showResponse("not an int - bad value will be used");
		 }
		 return isInt;
	 }
	 
	 private boolean isDouble(String input)
	 {
		 boolean isDouble = false;
		 
		 try
		 {
			 double temp = Double.parseDouble(input);
			 isDouble = true;
			 
		 }
		 catch (NumberFormatException error)
		 {
			 myPopups.showResponse("not a dubble - bad vaule will be used"); 
		 }
		 return isDouble;
	 }
	 
	 
}
