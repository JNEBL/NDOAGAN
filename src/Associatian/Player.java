package Associatian;

public class Player {
	private String name;
	
	private int currentAbility;
	
	private int potentialAbility;
	
	private int age;
	
	public Player(String name,int CA,int PA,int age) {
		this.name = name;
		this.currentAbility = CA;
		this.potentialAbility = PA;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getCurrentAbility() {
		return this.currentAbility;
	}
	
	public int getPotentialAbility() {
		return this.potentialAbility;
	}
	
	public String getName() {
		return this.name;
	}
}
