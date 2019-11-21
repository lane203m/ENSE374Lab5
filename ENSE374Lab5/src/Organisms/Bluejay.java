package Organisms;

/**
 * 
 * @author lane203m
 *class for Bluejay, extending organism. assigns name of Bluejay and nickname. Bluejay can move. Eats Grasshopper, TreeOrShrubs, Caterpillar.
 */
public class Bluejay extends Organism
{
	/**
	 * constructor for Bluejay. Assigns name/nickname and what it eats
	 */
	public Bluejay()
	{
		
		super("Bluejay", "BJ", true);
		String canEat[] = {"Grasshopper", "TreeOrShrubs", "Caterpillar"};
		setEats(canEat);
	}
	
}