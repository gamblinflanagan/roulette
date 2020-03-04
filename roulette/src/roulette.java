import java.util.*;
public class roulette 
{
	Scanner input = new Scanner(System.in);
	
	
	protected int wheel;
	protected int chips;
	protected int betval;
	protected int betnum;
	
	public roulette()//constuctor contains class variables
	{
		wheel = 0;
		chips = 100;
		betval = 0;
		betnum = 0;
		
	}
	
	public roulette(int thewheel, int thechips, int thebetval, int thebetnum)//constructor contains variables to be used in main
	{
		wheel = thewheel; 
		chips = thechips;
		betval = thebetval;
        betnum = thebetnum;
		
	}
	
	
	public int setbetnum()//obtains the number the user would like to bet on
	{
		System.out.println("Enter the number 0-38 (37 for red(odd numbers) or 38 for black(even numbers)) you would like to bet on");
		betnum = input.nextInt();
		
		if((betnum < 0)||(betnum > 38))
		{
			while((betnum < 0)||(betnum > 38))
			{
				System.out.println("invalid input");
				betnum = input.nextInt();		
			}
		}
			return betnum;
	}

	public int setbetval()//obtains the value of the bet from the user
	{
		System.out.println("Enter a betting amount (must be a miniumun of 10)");
		betval = input.nextInt();
		
		if((betval > chips)||(betval < 10))
		{
			while((betval > chips)||(betval < 10))
			{
				System.out.println("bet not valid");
				betval = input.nextInt();
			}
		}
			return betval;
	}
	public int setchips()//sets the value of remaining chips after the user placed a bet
	{
		chips = chips - betval;
		
		return chips;
	}
	public void resetchips()//resets the chip value to the standard value of 100
	{
		chips = 100;
	}
	public int setwheel()//obtains the number of the 36 sided die
	{
		wheel = 0 + (int) (Math.random()*36);
		return wheel;
	}
	
	public boolean win()//determines if the user has won or not
	{
		if(betnum == 37)
		{
			if(wheel %2 == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		if(betnum == 38)
		{
			if(wheel %2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		if(betnum <= 36)
		{
			if(wheel == betnum)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	
	public int total()//determines total amount of chips after each round 
	{
		if(betnum == 37)
		{
			if(wheel %2 == 1)
			{
				chips = chips + betval + (betval/4);
				return chips;
			}
			else
			{
				chips = chips + 0; 
				return chips;
			}
		}
		else if(betnum == 38)
		{
			if(wheel %2 == 0)
			{
				chips = chips + betval + (betval/4);
				return chips;
			}
			else
			{
				chips = chips + 0; 
				return chips;
			}
		}
		else	
		{
			if(wheel == betnum)
			{	
				chips = chips + betval + (betval/2);
				return chips;
			}
			else
			{
				chips = chips + 0; 
				return chips;
			}
		}
	}
}
