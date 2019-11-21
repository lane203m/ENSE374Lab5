package Organisms;


/**
 * 
 * @author lane203m
 *class for Rabbit, extending organism. assigns name of Rabbit and nickname. Rabbit can move. Eats Grass.
 */
public class Rabbit extends Organism
{
	/**
	 * constructor for Rabbit. Assigns name/nickname and what it eats
	 */
	public Rabbit()
	{
		
		super( "Rabbit",  "RB", true);
		String canEat[] = {"Grass"};
		setEats(canEat);
	}
	
}
