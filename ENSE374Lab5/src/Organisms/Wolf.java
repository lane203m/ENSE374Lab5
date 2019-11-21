package Organisms;


/**
 * 
 * @author lane203m
 *class for Wolf, extending organism. assigns name of Wolf and nickname. Wolf can move. Eats Rabbit, Deer.
 */
public class Wolf extends Organism
{
	/**
	 * constructor for Wolf. Assigns name/nickname and what it eats
	 */
	public Wolf()
	{
		
		super("Wolf", "WF", true);
		String canEat[] = {"Rabbit", "Deer"};
		setEats(canEat);
	}
	
}