class Organism
{
		String name;
		String eats[];
		boolean moves;
		boolean isFed;
	public Organism(String newName, boolean canMove)
	{
		name = newName;
		eats = null;
		moves = canMove;
		isFed = false;
	}
	public void SetEats(String[] canEat)
	{
		eats = canEat;
	}

		
	
}

class TreeOrShrubs extends Organism
{
	String canEat[] = {"None"};
	TreeOrShrubs()
	{
		
		super("TreeOrShrubs", true);
		SetEats(canEat);
	}
	
}