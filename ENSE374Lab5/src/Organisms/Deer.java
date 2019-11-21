package Organisms;

/**
 * 
 * @author lane203m
 *class for Deer, extending organism. assigns name of Deer and nickname. Deer can move. Eats TreeOrShrubs, Grass.
 */	
public class Deer extends Organism
{
	/**
	 * constructor for Deer. Assigns name/nickname and what it eats
	 */
	public Deer()
	{
		
		super("Deer", "DR", true);
		String canEat[] = {"TreeOrShrubs, Grass"};
		setEats(canEat);
	}
	
}

