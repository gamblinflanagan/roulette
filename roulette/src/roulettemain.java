import java.util.*;
public class roulettemain 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		roulette game1 = new roulette();
		
		final int elements = 2;
		int[] array = new int[elements];
		
		int	thewheel = 0;
		int	thechips = 100;
		int	thebetval = 0;
		int	thebetnum = 0;
		int pcount = 0;
		
		
		
		int decision = 0;
		
		System.out.println("Welcome to Roulette");
		System.out.println("Enter 1 to play or 0 to quit or 2 for rules");
		decision = keyboard.nextInt();
		
		if(decision == 2)
		{
			System.out.println("the object of the game is to guess the same number that is rolled 0-36 ");
			System.out.println("the other way to win is to guess either red or black numbers");
			System.out.println("even numbers are considered black numbers and odd numbers are considered red numbers");
			System.out.println("you can enter 37 for red or 38 for black numbers");
			System.out.println("you begin the game with 100 chips and play until you lose or quit");
			System.out.println("your wins and loses depend on how much you bet");
			System.out.println("if you lose a round you lose your bet");
			System.out.println("guessing the same number as the one rolled wins your bet plus half your bet");
			System.out.println("winning by guessing red or black wins your bet plus a quarter of your bet");
			System.out.println("Good luck");
			
			System.out.println("Enter 1 to play or 0 to quit");
			decision = keyboard.nextInt();
		}
		
		while(decision != 0)
		{
			for(int i = 0; i < elements; i++)
			{	
				do
				{
					if(decision != 0)
					{
						System.out.println("chips = "+ thechips);
			
						System.out.println("person "+ (i+1));
						thebetnum = game1.setbetnum();
				
						thebetval = game1.setbetval();
			
						thechips = game1.setchips();
						System.out.println("chips remaining = " + thechips);
						System.out.println();
			
						thewheel = game1.setwheel();
						System.out.println("wheel = "+ thewheel);
						if(thebetnum == 37)
						{
							System.out.println("you bet on red");
						}
						else if(thebetnum == 38)
						{
							System.out.println("you bet on black");
						}
						else
						{
							System.out.println("you bet on " + thebetnum);
						}
						
						boolean outcome = game1.win();
						thechips = game1.total();
						if(outcome == true)
						{
							System.out.println("you win");
							
						}
						if(outcome == false)
						{
							System.out.println("you lose");
						}
						System.out.println("chips = "+ thechips);
						
						System.out.println("Enter 1 to continue or 0 to quit");
						decision = keyboard.nextInt();
				}
					else
					{
						thechips = 0;
						decision = 1;
					}
						
				}while(thechips != 0);
				
				pcount++;
				game1.resetchips();
				thechips = 100;
			}
			
			System.out.println("Enter 1 to play again or 0 to quit");
			decision = keyboard.nextInt();
		}
		
		
	}

}

/**
output

Welcome to Roulette
Enter 1 to play or 0 to quit or 2 for rules
1
chips = 100
person 1
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
38
Enter a betting amount (must be a miniumun of 10)
40
chips remaining = 60

wheel = 2
you bet on black
you win
chips = 110
Enter 1 to continue or 0 to quit
0
chips = 100
person 2
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
38
Enter a betting amount (must be a miniumun of 10)
100
chips remaining = 0

wheel = 30
you bet on black
you win
chips = 125
Enter 1 to continue or 0 to quit
0
Enter 1 to play again or 0 to quit
0

Welcome to Roulette
Enter 1 to play or 0 to quit or 2 for rules
1
chips = 100
person 1
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
37
Enter a betting amount (must be a miniumun of 10)
50
chips remaining = 50

wheel = 25
you bet on red
you win
chips = 112
Enter 1 to continue or 0 to quit
1
chips = 112
person 1
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
38
Enter a betting amount (must be a miniumun of 10)
112
chips remaining = 0

wheel = 33
you bet on black
you lose
chips = 0
Enter 1 to continue or 0 to quit
1
chips = 100
person 2
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
38
Enter a betting amount (must be a miniumun of 10)
100
chips remaining = 0

wheel = 9
you bet on black
you lose
chips = 0
Enter 1 to continue or 0 to quit
1
Enter 1 to play again or 0 to quit
1
chips = 100
person 1
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
38
Enter a betting amount (must be a miniumun of 10)
100
chips remaining = 0

wheel = 2
you bet on black
you win
chips = 125
Enter 1 to continue or 0 to quit
1
chips = 125
person 1
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on

Welcome to Roulette
Enter 1 to play or 0 to quit or 2 for rules
1
chips = 100
person 1
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
79
invalid input
88
invalid input
36
Enter a betting amount (must be a miniumun of 10)
5
bet not valid
200
bet not valid
100
chips remaining = 0

wheel = 21
you bet on 36
you lose
chips = 0
Enter 1 to continue or 0 to quit
1
chips = 100
person 2
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
5
Enter a betting amount (must be a miniumun of 10)
50
chips remaining = 50

wheel = 1
you bet on 5
you lose
chips = 50
Enter 1 to continue or 0 to quit
1
chips = 50
person 2
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
5
Enter a betting amount (must be a miniumun of 10)
25
chips remaining = 25

wheel = 1
you bet on 5
you lose
chips = 25
Enter 1 to continue or 0 to quit
1
chips = 25
person 2
Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on
1
Enter a betting amount (must be a miniumun of 10)
25
chips remaining = 0

wheel = 31
you bet on 1
you lose
chips = 0
Enter 1 to continue or 0 to quit
0
Enter 1 to play again or 0 to quit
0

Welcome to Roulette
Enter 1 to play or 0 to quit or 2 for rules
2
the object of the game is to guess the same number that is rolled 0-36 
the other way to win is to guess either red or black numbers
even numbers are considered black numbers and odd numbers are considered red numbers
you can enter 37 for red or 38 for black numbers
you begin the game with 100 chips and play until you lose or quit
your wins and loses depend on how much you bet
if you lose a round you lose your bet
guessing the same number as the one rolled wins your bet plus half your bet
winning by guessing red or black wins your bet plus a quarter of your bet
Good luck
Enter 1 to play or 0 to quit
0



*/
