package GusserGame;

import java.util.Scanner;

class Guesser
{
	int guessNumber;
	
	int guessNum()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Guesser Please Guess The Number");
		int temp = s.nextInt();
		if(temp>=0 || temp<=10)
			guessNumber = temp;
		return guessNumber;
		
	}
	
}
class Player
{
	int guessNumber;
	
	int guessNum()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Player Please Guess The Number");
		guessNumber = s.nextInt();
		return guessNumber;
		
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectFromGusser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		
	}
	void collectFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		if(numFromGuesser>=0 && numFromGuesser<=10)
		{
			numFromPlayer1 = p1.guessNum();
			numFromPlayer2 = p2.guessNum();
			numFromPlayer3 = p3.guessNum();
		}
		else
			System.out.println("Guesser Please Please Enter The Number between 1 and 10");

		
	}
	void  compare()
	{
		if(numFromGuesser == numFromPlayer1)
		{
			System.out.println("Player1 Won The Game");
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			System.out.println("Player2 Won The Game");
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player3 Won The Game");
		}
		else if(!(numFromGuesser>=0) || !(numFromGuesser<=10))
		{
			System.out.println("Please choose between Range");
		}
		else
		{
			System.out.println("Game Lost Please Try Again!");
		}
	}
	
	
}
public class GusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectFromGusser();
		u.collectFromPlayer();
		u.compare();

	}

}
