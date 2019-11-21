import Organisms.*;
/**
 * @author lane203m
 * @version 1.1
 * Main class for our application. Creates map and displays 12 organisms
 */
public class Main
{
	/** my max map size constant **/
	static int MAXGRID = 20;
	/** max animal constant **/
	static int MAXANIMALS = 12;

	/**
	 * 
	 * @param args main function. sets map and displays organisms
	 * @author lane203m 
	 * @version 1.1
	 * main function. sets map and displays organisms
	 */
	public static void main(String[] args)
	{
	  /** 
	   *@author lane203m 
	   *@version 1.1
	   *
	   **/
		Organism[][][] gridEnvironment = new Organism[MAXGRID][MAXGRID][12];	//20 by 20 grid, room for 12 animals on each space
		
		Organism[] organisms = new Organism[MAXANIMALS];	//our 12 organisms
		organisms[0] = new Grass();							//instance as a particular kind of organism
		organisms[1] = new TreeOrShrubs();					//
		organisms[2] = new Squirrel();						//...
		organisms[3] = new Caterpillar();
		organisms[4] = new Rabbit();
		organisms[5] = new Grasshopper();
		organisms[6] = new Mouse();
		organisms[7] = new Deer();
		organisms[8] = new Fox();
		organisms[9] = new Wolf();
		organisms[10] = new Hawk();
		organisms[11] = new Bluejay();
		
		
		/**
		 * We display the organisms and their associated nicknames, as well as their list of prey
		 */
		for(int i = 0; i<MAXANIMALS; i++)
		{
			System.out.print(organisms[i].getName() + " = " + organisms[i].getNickName());
			System.out.println();
			System.out.println(organisms[i].getName() + " can eat: ");
			
			organisms[i].printEdibles();
		}
		
		
		
		/**
		 * based on randomly generated coordinates from our constructors, place animal on the world map
		 */
		for(int i = 0; i<MAXANIMALS; i++)
		{
			gridEnvironment[organisms[i].getXCoordinates()][organisms[i].getYCoordinates()][i] = organisms[i];
		}
		
		
		
		
		
		/** 
		 * nested for loops to display all animals (their nickname)
		 */
		System.out.println("This map displays the position of our organisms. Organisms may share the same space, and would eat one another if they fell under eachothers list of edible creatures. Movement/eating not implemented.");
		for (int r = 0; r<MAXGRID;r++){
			   for (int c = 0; c <MAXGRID;c++){
				   System.out.print("["); 

				   for (int v = 0; v <MAXANIMALS;v++){
					   if(gridEnvironment[r][c][v] != null)
					   {
						   	System.out.print(gridEnvironment[r][c][v].getNickName()); 
					   }
					   else
					   {
						   System.out.print("--");
					   }
				   }
				   System.out.print("]"); 
			   }
			   System.out.println();  // go to next line
			}
	
	}
	
}