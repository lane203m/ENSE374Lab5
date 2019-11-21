package Organisms;

/**
 * 
 * @author lane203m
 *class for Mouse, extending organism. assigns name of Mouse and nickname. Mouse can move. Eats TreeOrShrubs, Grass.
 */
public class Mouse extends Organism
{
	/**
	 * constructor for Mouse. Assigns name/nickname and what it eats
	 */
	public Mouse()
	{
		
		super("Mouse", "MS", true);
		String canEat[] = {"TreeOrShrubs, Grass"};
		setEats(canEat);
	}
	
}


