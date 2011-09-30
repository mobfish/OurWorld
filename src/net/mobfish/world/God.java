package net.mobfish.world;

public class God {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		World world = new World();
		Human tobi = new Human("Tobi", 1.81);
		world.addOrganism(tobi);
		System.out.println(tobi.getBiologicalName());
		
	}

}
