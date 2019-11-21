package Organisms;


/**
 * 
 * @author lane203m
 *class for TreeOrShrubs, extending organism. assigns name of TreeOrShrubs and nickname. TreeOrShrubs cannot move. Eats no food.
 */
public class TreeOrShrubs extends Organism
{
	/**
	 * constructor for TreeOrShrubs. Assigns name/nickname and what it eats
	 */
	public TreeOrShrubs()
	{
		
		super( "TreeOrShrubs",  "TS", false);
		String canEat[] = {"None"};
		setEats(canEat);
	}
	
}