package Organisms;

/**
 * 
 * @author lane203m
 *class for Caterpillar, extending organism. assigns name of Caterpillar and nickname. Caterpillar can move. Eats TreeOrShrubs.
 */
public class Caterpillar extends Organism
{
	/**
	 * constructor for Caterpillar. Assigns name/nickname and what it eats
	 */
	public Caterpillar()
	{
		
		super("Caterpillar", "CP", true);
		String canEat[] = {"TreeOrShrubs"};
		setEats(canEat);
	}
	
}