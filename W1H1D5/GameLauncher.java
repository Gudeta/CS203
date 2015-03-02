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
import java.util.Scanner;
public class GameLauncher {
	public static void main(String[] args) 
	{
		Guessgame game = new Guessgame();
		System.out.println("Amount of players");
		scanner scan  = new scanner(System.in);
		int nummberOfplayers;
		nummberOfplayers = scan.nextInt();
		game.startGame();
	}
}