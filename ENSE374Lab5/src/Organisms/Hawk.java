package Organisms;

/**
 * 
 * @author lane203m
 *class for Hawk, extending organism. assigns name of Hawk and nickname. Hawk can move. Eats Mouse, Squirrel.
 */
public class Hawk extends Organism
{
	/**
	 * constructor for Hawk. Assigns name/nickname and what it eats
	 */
	public Hawk()
	{
		
		super("Hawk", "HK", true);
		String canEat[] = {"Mouse", "Squirrel"};
		setEats(canEat);
	}
	
}