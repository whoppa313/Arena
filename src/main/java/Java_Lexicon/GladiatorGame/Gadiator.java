package Java_Lexicon.GladiatorGame;



//  What i need for this Game to work:
//  not in this order by all means 
/*
 *  1. I need a random Name Generator. ( Optional ) https://www.youtube.com/watch?v=CZYeTblcOU8
 *  2. I need a random Number Generator.
 *  3. I need to generate an Enemy.
 *  4. I need to make the player able to create, enter and store a name for their Gladiator and any other attributes */
  // 		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  //		(Hitchance = random int bigger get's to hit the lower that and then roll again untill ones hp hits 0,
  //		 player name = string scanner, Enemy name = stored names, health = double (3HitPoints), alive = (true) 
  //		 boolean while Health > 0.0, dead (0Hitpoints) = boolean (true) while health == 0.0).
  //        -----------------------------------------------------------------------------------------------------
 /* 5. I need to make  the player to store the name given as long as they are alive and make a name that all Enemy's will use like EnemyGladiator. 
 *  6. I need to make their HP go down when either the player or enemy wins the round depending on who get the bigger random number.
 *  7. I need to generate a new enemy when the player wins.
 *  8. I need to make sure the player and enemy got the same health at the start of a new round.
 *  9. I need to store and add to the score the player gets for each win or when the player dies
 *  10.I need to make the player able to end the game when the player wants to and show it current score.
 *  11. ...whatever i can come up with i guess ¯\_(ツ)_/¯
 */



import java.util.*;

public class Gadiator 


{

	// the holders of the player and enemy stats
	
	
	
public static void main (String[]args)
{
	double thePlayer;
	double thePlayerHp = thePlayerStatsAlive();
	String thePlayerName = " The Challenger ";
	boolean isPlayerAlive = isAlive();
	
	double theEnemy;
	double theEnemyHp;
	String theEnemyName = " Enemy Gladiator ";
	
	Random playerHit = willPlayerHit();
	Random enemyHit = willEnemyHit();
	
	
	
	// will print the status
	
	if (thePlayerHp == 0)
	{
		System.out.println(thePlayerName + " is now dead after a heroic Fight in the Arena " + thePlayerHp + "HP");
	}
	else if (thePlayerHp == 3)
	{
		System.out.println(thePlayerName + " is alive at full Healt " + thePlayerHp + "HP");
	}
	else if (thePlayerHp == 2)
	{
		System.out.println(thePlayerName + " is still strong and keeps going " + thePlayerHp + "HP");
	}
	else if (thePlayerHp == 1)
	{
		System.out.println(thePlayerName + " is still alive but bearley " + thePlayerHp + "HP");
	}
	
}

//sets the HP to 3
public static double thePlayerStatsAlive()
{
	
	double thePlayerHp = 3;
	return thePlayerHp;
	
	
}

public static double theEnemyStatsAlive()
{
	double theEnemyHp = 3;
	return theEnemyHp;
}

//==================================================

//checks if the Enemy is alive
// and returns alive if HP is more than 0
public static boolean enemyAlive()
{
	double theEnemyHp = theEnemyStatsAlive();
	boolean isEnemyAlive;
	if(theEnemyHp > 0)
	{
		return isEnemyAlive = true;
	}
	else if (theEnemyHp == 0)
	{
		return isEnemyAlive = false;
	}
	else
	{
		return false;
	}
}

public static boolean isAlive()
{
	// checks if the player is alive
	// and returns alive if HP is more than 0
	
	double thePlayerHp = thePlayerStatsAlive();
	boolean isPlayerAlive;
	if(thePlayerHp > 0)
	{
		return isPlayerAlive = true;
	}
	else if (thePlayerHp == 0)
	{
		return isPlayerAlive = false;
	}
	else
	{
		return false;
	}
	
	
}


// these Random's should return a random number to both player and enemy that will determine who will hit the other and lose HP

public static Random willPlayerHit()
{
	Random playerHits = new Random();
	return playerHits;
	
}
public static Random willEnemyHit()
{
	Random enemyHits = new Random();
	return enemyHits;
}
//================================================================================================================================







}
