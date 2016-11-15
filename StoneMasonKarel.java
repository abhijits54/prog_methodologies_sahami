/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run()
	{
		
		
		while(frontIsClear())
		{
			
			populatePillar();
			toNextPillar();
		}
		populatePillar();
		
	}
	
	private void populatePillar()
	{
		goUpPillar();
		goDownPillar();
	}
	
	private void goUpPillar()
	{
		turnLeft();
		while(frontIsClear())
		{
			
			populateSpot();
			move();
			
		}
		populateSpot();
	}
	
	private void populateSpot()
	{
		if(noBeepersPresent())
		{
			putBeeper();
		}
	}
	
	private void goDownPillar()
	{
		turnAround();
		while(frontIsClear())
			move();
		turnLeft();
	}
	
	private void toNextPillar()
	{
		for(int i=0;i<4;i++)
		{
			move();
		}
	}
	
}
