public class Player {
	int number = 0;
	
	public void Guess(){
		number = (int) (math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}