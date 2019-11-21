package Organisms;

/**
 * 
 * @author lane203m
 *class for Squirrel, extending organism. assigns name of Squirrel and nickname. Squirrel can move. Eats TreeOrShrubs.
 */
public class Squirrel extends Organism
{
	/**
	 * constructor for squirrel. Assigns name/nickname and what it eats
	 */
	public Squirrel()
	{
		
		super("Squirrel", "SQ", true);
		String canEat[] = {"TreeOrShrubs"};
		setEats(canEat);
	}
	
}