package Game_LoosCoupleing;

public class GameRunner {

	//Mario m;

	Game_Lanucher gl;
	
	public GameRunner(Game_Lanucher gl1) {
		super();
		this.gl=gl1;
	}
	
	public void run()
	{
		gl.up();
		gl.down();
		gl.left();
		gl.right();
	}
	
}
