package Organisms;

/**
 * 
 * @author lane203m
 *class for Fox, extending organism. assigns name of Fox and nickname. Fox can move. Eats Bluejay, Mouse, Squirrel, Rabbit.
 */	
public class Fox extends Organism
{
	/**
	 * constructor for Fox. Assigns name/nickname and what it eats
	 */
	public Fox()
	{	
		super("Fox", "FX", true);
		String canEat[] = {"Bluejay", "Mouse", "Squirrel", "Rabbit"};
		setEats(canEat);
	}
	
}