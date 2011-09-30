package net.mobfish.world;

public abstract class Organism {

	private boolean alive;
	
	public Organism(){
		
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public void kill(){
		alive = !alive;
	}
	
}
