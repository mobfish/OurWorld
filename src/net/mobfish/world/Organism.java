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
	
	public abstract String getBiologicalName();	
	
	
	@Override
	public String toString(){
		return "I am an organism. Am I alive? " +alive;
	}
	
}
