public class GameLauncher {
	public static void main(String[] args){
		
		GuessGame GuessGameObject = new GuessGame();
		GuessGameObject.startGame();
		
		Player playerobject = new Player();
		playerobject.Guess();
		
	}
}
