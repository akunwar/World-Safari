
public class ComputerDriver {
	int[] levelGraph;
	
	public ComputerDriver(String level)
	{
		levelGraph = new int[63];
		levelFill(level);
		shuffle();
	}
	
	private void levelFill(String level)
	{
		int ones=0;
		if(level.equals("Easy"))
		{
			ones = 18;
		}
		else if(level.equals("Medium"))
		{
			ones = 31;
		}
		else if(level.equals("Difficult"))
		{
			ones = 50;
		}
		
		for(int i = 0; i< 63;i++)
		{
			if(i<ones)
			{
				levelGraph[i] = 1;
			}
			else
			{
				levelGraph[i] = 0;
			}
		}
	}
	
	private void shuffle()//using Fisher-Yates shuffle algorithm
	{
		for (int i = 0; i < 63; i++) 
		{
            int r = i + (int) (Math.random() * (63 - i));
            int swap = levelGraph[r];
            levelGraph[r] = levelGraph[i];
            levelGraph[i] = swap;
        }
	}
	
	public int getAnsSim(int pos)
	{
		return levelGraph[pos -1];
	}
/**	
	private void print()
	{
		for(int i = 0;i<63;i++)
		{
			System.out.print(levelGraph[i] + " ");
		}
	}
	
	public static void main(String args[])
	{
		ComputerDriver obj = new ComputerDriver("Medium");
		obj.print();
	}*/

}
