package Organisms;


/**
 * 
 * @author lane203m
 *class for Grass, extending organism. assigns name of Grass and nickname. Grass cannot move. Eats no food.
 */
public class Grass extends Organism
{
	/**
	 * default constructor for Grass. Assigns what its called and what it eats. 
	 */
	public Grass()
	{
		
		super( "Grass",  "GR", false);
		String canEat[] = {"None"};
		setEats(canEat);
	}
	
}