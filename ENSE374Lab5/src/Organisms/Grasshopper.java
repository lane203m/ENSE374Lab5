package Organisms;
/**
 * 
 * @author lane203m
 *class for Grasshopper, extending organism. assigns name of Grasshopper and nickname. Grasshopper can move. Eats Grass.
 */
public class Grasshopper extends Organism
{
	/**
	 * constructor for Grasshopper. Assigns name/nickname and what it eats
	 */
	public Grasshopper()
	{
		super( "Grasshopper",  "GH", true);
		String canEat[] = {"Grass"};
		setEats(canEat);
	}
	
}