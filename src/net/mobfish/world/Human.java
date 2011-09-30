package net.mobfish.world;

import java.util.Calendar;
import java.util.Date;

public class Human extends Organism{

	private String name;
	private Date bDay;
	private double hight;
	
	public Human(String name,double hight){
	 this.bDay = Calendar.getInstance().getTime();
	 this.hight = hight;
	}
	
	public Date getBDay(){
		return bDay;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public long getHight(){
		return hight;
	}
	
	public void grow(long growth){
		hight += growth;
	}

	@Override
	public String getBiologicalName() {
		return "Ich bin ein Mensch :D";
	}
	
}
