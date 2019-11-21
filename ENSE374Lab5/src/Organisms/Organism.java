package Organisms;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author lane203m
 *class for all organisms. Parent class. All organisms extend from this. 
 *Contains 
 *name, nickname, what they eat, if they can move or are fed, their x/y coords
 *Contains the eat, move, get functions and constructors for the organisms
 */
public class Organism
{
	String organismName;
	String nickName;
	String eatsOrganism[];
	boolean organismCanMove;
	boolean organismIsFed;
	int xCoordinate;
	int yCoordinate;
	
	/**
	* default constructor. Organism is essentially null
	*/
	public Organism()
	{
		nickName = null;
		organismName = null;
		eatsOrganism = null;
		organismCanMove = false;
		organismIsFed = false;
		
	}
	
	/**
	*  constructor. Organism is null. Note that extending classes may refer to this constructor as 'super'
	*  sets name, nickname and initial x/y coords. can move if animal can move. Not fed by default. Eats no animal by default.
	*/
	public Organism(String newName, String newNickName, boolean canMove)
	{
		nickName = newNickName;
		organismName = newName;
		eatsOrganism = null;
		organismCanMove = canMove;
		organismIsFed = false;
		xCoordinate = ThreadLocalRandom.current().nextInt(0, 19 + 1);
		yCoordinate = ThreadLocalRandom.current().nextInt(0, 19 + 1);
	}
	
	/**
	*  After the constructor, this function sets what animals the organism can eat to become fed
	*/
	public void setEats(String[] canEat)
	{
		eatsOrganism = canEat;
	}
	/**
	 * get x coords of an organism
	 * @return xCoordinate
	 */
	public int getXCoordinates()
	{
		return xCoordinate;			//where is animal on x
	}
	
	/**
	 * get y coords of an organism
	 * @return yCoordinate
	 */
	public int getYCoordinates()
	{
		return yCoordinate;			//where is animal on y
	}
	
	/**
	 * gets the name of our organism
	 * @return organismName
	 */
	public String getName()
	{
		return organismName;
	}
	
	/**
	 * gets the nickName of our organism
	 * @return nickName
	 */
	public String getNickName()
	{
		return nickName;
	}
	
	/**
	 * prints a list of edible organisms according to organism.
	 */
	public void printEdibles()
	{
		int k = 0;
		while(k<eatsOrganism.length)
		{

			System.out.println("  "+eatsOrganism[k]);
			k++;
		}
		System.out.println();
	}
	
	/**
	 * placeholder move function for when animals move around the map in search of food. Not implemented. Note that I have not implemented a die or eat() method.
	 */
	/*public void move()
	{
		//this would be our funciton for moving an animal around our grid. We would change their x/y coords as it persued food or randomly moved from place to place. Tree/grass would not move (moves = false).
	}
	*/
	/* not needed in this iteration
	public boolean tryEat(String toEat)
	{
		for (int j = 0; j <12;j++)
		{
			if(toEat == eats[j])
			{
				return true;		//based on the given animal name toEat, our other animal will see if it can eat the animal toEat. 
			}
				   
				   	
		}
		return false;
	}
	*/	
	
}

