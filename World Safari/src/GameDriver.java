import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class GameDriver {
	Player players[] = new Player[2];
	
	public GameDriver()
	{
		players[0] = new Player(0, true, false);//player
		players[1] = new Player(0,false, false);//computer
		System.out.println("Players Initialized...");
	}
	
	private boolean gameStatus()//checking to confirm if there is no winner as yet
	{
		if(players[0].checkWin() == false && players[1].checkWin() == false)
			return true;
		else
			return false;
	}
	
	private void updateJump(int i, int jump)
	{
		players[i].updateTilePosition(jump);
	}
	
	private boolean checkWinner(int i)
	{
		return players[i].checkWin();
	}
	
	private int getPos(int i)
	{
		return(players[i].returnPos());
	}
	
	public static void main(String args[])throws IOException
	{
		GameDriver gameSim = new GameDriver();
		GameBoard game = new GameBoard();//loads every data into the board
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to World Safari!");
		System.out.println("Enter you difficulty level:");
		System.out.println(">Easy");
		System.out.println(">Medium");
		System.out.println(">Difficult");
		String level = br.readLine();
		Boolean correct = true;//stores the correctness of difficulty input
		ComputerDriver levelSimulator = new ComputerDriver("");
		CountrySpinner spinner = new CountrySpinner();
		do{
			correct = true;
			if(level.equals("Easy") || (level.equals("Medium")) || (level.equals("Difficult")))
			{
				levelSimulator = new ComputerDriver(level);
			}
			else
			{
				System.out.println("Invalid response. Please try again.");
				correct = false;
			}
		}while(correct == false);
		correct = true;//stores the correctness of the player in his turn
		//Now everything is loaded
		//Starting on the game play.
		while(gameSim.gameStatus())
		{
			System.out.println("*** Spinning Spinner for YOU ***");
			while(correct)//playing his chance till he is correct
			{
				int jump = spinner.spinnerChooser();
				System.out.println("Spinner chose: " + jump);
				gameSim.updateJump(0, jump);
				if(gameSim.checkWinner(0))
				{
					System.out.println("Congratulations YOU won!!!");
					System.exit(0);
				}
				if(game.fetchQuestion(gameSim.getPos(0)))
					correct = true;
				else
					correct = false;
			}
			System.out.println("*** Spinning Spinner for MR. COMPUTER ***");
			correct = true;
			while(correct)//playing his chance till he is correct
			{
				int jump = spinner.spinnerChooser();
				System.out.println("Spinner chose: " + jump);
				gameSim.updateJump(1, jump);
				if(gameSim.checkWinner(1))
				{
					System.out.println("Sorry! You have lost the game");
					System.exit(0);
				}
				if(game.fetchQuestionForComp(gameSim.getPos(1), levelSimulator.getAnsSim(gameSim.getPos(1))))
					correct = true;
				else
					correct = false;
			}
			correct = true;
		}
	}
}
