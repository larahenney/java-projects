package monsters;

public class StoneMonster extends Monster {

	private int rockLevel; 
	
	public StoneMonster(String monsterName, int rockPower) {
		super(monsterName);
		rockPower = rockLevel; 
	}
	
	public void attack(String type) {
		System.out.println("Attack with " + type + "!");
	}
	
	public void growl() {
		System.out.println("The monster goes CRACK!");
	}
	

}
