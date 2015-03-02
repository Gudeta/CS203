/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1H1D5;

/**
 *
 * @author Gude
 */
import java.util.*;
class Guessgame{
	public void startGame()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();	
		boolean p1isRight = false;
		boolean p2isRight =  false;
		boolean p3isRight = false;
		int targetNumber =  (int)(Math.random()*10);
		while(true){			
			p1.guess();
			p2.guess();
			p3.guess();
			System.out.println("player1 Guess " +p1.getnumber());
			System.out.println("player2 Guess " +p2.getnumber());
			System.out.println("player3 Guess " +p3.getnumber());
			System.out.println("number to guss is :"+ targetNumber);			
			if(p1.getnumber()== targetNumber)
			{
				p1isRight = true;
			}
			if(p2.getnumber()== targetNumber)
			{
				p2isRight = true;
			}
			if(p3.getnumber()== targetNumber)
			{
				p3isRight = true;
			}
			if(p1isRight||p2isRight||p3isRight)
			{
				System.out.println("we have a winner");
				System.out.println("player1 got it right?" +p1isRight);
				System.out.println("player2 got it right?" +p2isRight);
				System.out.println("player3 got it right?" +p3isRight);
				System.out.println("Game is Over");
				break;
			}
			else 
			{
				System.out.println("Can, You try again");	
			}
		}
	}
}
			
	
