package solid;

public class GamingConsoleApp {
	
	private Game game;
	
	public GamingConsoleApp(Game game) {
		this.game = game;
	}	
	
	public void run(int numberOfPlayer) {
		System.out.println("Loading...");
		this.game.play(numberOfPlayer);
	}
	

}
