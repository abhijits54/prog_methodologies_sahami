import stanford.karel.SuperKarel;

public class DoubleBeeper extends SuperKarel {

	
	public void run()
	{
		move();
		doubleBeepers();
		moveBack();
	}
	public void moveBack(){
		turnAround();
		move();
		turnAround();
	}
	
	
	public void doubleBeepers(){
		
		createAdjacentPile(2);
		move();
		turnAround();
		createAdjacentPile(1);
		turnAround();
		moveBack();
		
		
		
	}
	public void createAdjacentPile(int num){
		while(beepersPresent()){
			pickBeeper();
			putBeepersNextDoor(num);
		}
	}
	public void putBeepersNextDoor(int n){
		move();
		for(int i=0;i<n;i++)
			putBeeper();
		
		moveBack();
	}
	
	public void moveBeeperPileNextDoor(){
		move();
		turnAround();
		putBeepersNextDoor(1);
		
	}
}
