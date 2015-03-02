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
public class Player {
	private int number;
	public int getnumber() {
		return number;
	}
	public void setnumber(int number) {
		this.number = number;
	}
	public void guess() {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter ur number");
		int num = x.nextInt();
		setnumber(num);
	}
}
