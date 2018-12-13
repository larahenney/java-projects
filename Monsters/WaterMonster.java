package monsters;

public class WaterMonster extends Monster {

	
	public WaterMonster(String monsterName) {
		super(monsterName);
	
	}
	
	public void attack(String type) {
		System.out.println("Attack with " + type + "!");
	}
	
	public void growl() {
		System.out.println("The monster goes BLAAAARRRGGGGGH!");
	}
	

}
