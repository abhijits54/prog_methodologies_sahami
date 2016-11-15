/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run()
	{
		
		while(true)
		{
			populateOdd();
			if(!leftIsClear())
				break;
			moveToNext();
			populateEven();
			if(!leftIsClear())
				break;
			moveToNext();
		}
	}
	
	private void populateOdd()
	{
		putBeeper();
		while(frontIsClear())
		{
			move();
			if(!frontIsClear())
				break;
			move();
			putBeeper();
		}
		turnAround();
		while(frontIsClear())
			move();
		turnAround();
		
	}
	
	private void moveToNext()
	{
		turnLeft();
		move();
		turnRight();
		
	}
	
	private void populateEven()
	{
		
		while(frontIsClear())
		{
			move();
			putBeeper();
			if(!frontIsClear())
				break;
			move();
			
		}
		turnAround();
		while(frontIsClear())
			move();
		turnAround();
		
		
	}
	
}
