package monsters;

public class FireMonster extends Monster {

	private int hotnessLevel; 
	
	public FireMonster(String monsterName, int temp) {
		super(monsterName);
		temp = hotnessLevel; 
	}
	
	public void attack(String type) {
		System.out.println("Attack with " + type + "!");
	}
	
	public void growl() {
		System.out.println("The monster goes FWOOOSH!");
	}
	
	

}
