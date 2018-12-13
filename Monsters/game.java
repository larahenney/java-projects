package monsters;

public class game {

	public static void main(String[] args) {
		
		Monster fire = new FireMonster("Burnie", 55); 
		Monster water1 = new WaterMonster("Jetson"); 
		Monster stone1 = new StoneMonster("Rockie", 84);  
		Monster normal1 = new Monster("Rat Monster"); 
		
		
		fire.attack("fire");
		water1.growl();
		stone1.attack("with rocks");
		normal1.growl();
		
		

	}

}
