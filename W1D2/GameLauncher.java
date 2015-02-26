public class GameLauncher {
	public static void main(String[] args){
		
		GuessGame GuessGameObject = new GuessGame();
		GuessGameObject.startGame();
		
		GuessGameObject.guessp1 =2;
		GuessGameObject.guessp2 =4;
		GuessGameObject.guessp3 = 6;
		
		Player playerobject = new Player();
		playerobject.Guess();
		
	}
}
