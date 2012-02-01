
public class Player 
{
	int tilePosition;
	Boolean isComputer;
	Boolean winner;
	
	public Player(int tilePos, boolean isComp, boolean win)
	{
		tilePosition = tilePos;
		isComputer = isComp;
		winner = win;
	}
	
	public boolean checkWin()
	{
		return winner;
	}
	
	private void updateWinStatus()
	{
		if(tilePosition>= 63)
			winner = true;
	}
	
	public void updateTilePosition(int jump)
	{
		tilePosition = tilePosition + jump;
		updateWinStatus();
	}
	
	public int returnPos()
	{
		return tilePosition;
	}
	

}
