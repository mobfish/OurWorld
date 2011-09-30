package net.mobfish.world;

import java.util.LinkedList;

public class World {
	LinkedList<Organism> objs=new LinkedList<Organism>();
	public static void main(String[] args){
		World world=new World();
	}
	
	public World(){
		System.out.println("A new world rises");
	}
	
	public void addOrganism(Organism organism){
		System.out.println("A new "+organism.getBiologicalName()+" is born");
		objs.add(organism);
	}
	

}
