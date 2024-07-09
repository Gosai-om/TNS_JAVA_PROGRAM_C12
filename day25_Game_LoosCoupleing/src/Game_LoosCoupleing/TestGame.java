package Game_LoosCoupleing;

public class TestGame {

	public static void main(String[] args) {
		
		Game_Lanucher gl_packman = new PackMan();
		Game_Lanucher gl_mario = new Mario();
		
		
		var gamerunner = new GameRunner(gl_packman);
		var gamerunner2 = new GameRunner(gl_mario);
		
		
	
		gamerunner.run();
		System.out.println("\n");
		gamerunner2.run();
		
	}

}
