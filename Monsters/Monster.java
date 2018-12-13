package monsters;

public class Monster {

	String name; 
	
	public Monster(String monsterName) {
		 monsterName = name;  
	}
	


	public void attack(String type) {
		System.out.println("Attack with " + type + "!");
	}
	
	public void growl() {
		System.out.println("The monster goes grooooowl!");
	}
	
}
