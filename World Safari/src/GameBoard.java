import java.io.*;
import java.util.*;

public class GameBoard 
{
	FlashCard tileOrder[];
	BoardTile gameCardHolder[];
	String fileNames[];
	int numberOfTotalCards;
	int replacementCounter;//tracks the position of card available if replacement is needed
	
	public GameBoard()
	{
		numberOfTotalCards = 126;
		replacementCounter = 63;
		tileOrder = new FlashCard[63];
		gameCardHolder = new BoardTile[63];
		fileNames = new String[numberOfTotalCards];
		initializeFileNames();
		initializeTileOrder();
		shuffle();
		loadTileOrder();
		loadBoardTiles();
	}
	
	private void loadTileOrder() 
	{
		for(int i = 0; i< 63; i++)
		{
			//System.out.println("loop "+i);
			System.out.println("Loaded file: " + fileNames[i]+"...");
			try
			{
				String path = "src/FlashCards/"+fileNames[i];
				//System.out.println(path);
				BufferedReader br = new BufferedReader(new FileReader(path));
				String line="";
				int counter = 0;
				while(line!=null)
				{
						String ques = br.readLine();
						String o1= br.readLine();
						String o2 = br.readLine();
						String o3 = br.readLine();
						String Ans = br.readLine();
						
						int correctAns = Integer.parseInt(Ans);
						//System.out.println("counter: " + counter);
						if(counter == 0)
						{
							tileOrder[i].makeQuestion(ques,o1,o2,o3,correctAns,0);
						}
						else if(counter == 1)
						{
							tileOrder[i].makeQuestion(ques,o1,o2,o3,correctAns,1);
						}
						else if(counter == 2)
						{
							tileOrder[i].makeQuestion(ques,o1,o2,o3,correctAns,2);
						}
						else if(counter == 3)
						{
							tileOrder[i].makeQuestion(ques,o1,o2,o3,correctAns,3);
						}
						//System.out.println(ques+" * "+o1+" * "+o2+" * "+o3+" * "+Ans);
					line = br.readLine();
					if(line.equals("***End of Question***"))
					{
						counter++;
					}
					
					//System.out.println(line + "uo");
				}
				br.close();
				
			}
			catch(Exception e){}
			}
		
		
	}
	
	private void loadBoardTiles()
	{
		gameCardHolder[0] = new BoardTile(1, tileOrder[0],4);
		gameCardHolder[1] = new BoardTile(2, tileOrder[1],3);
		gameCardHolder[2] = new BoardTile(3, tileOrder[2],5);
		gameCardHolder[3] = new BoardTile(4, tileOrder[3],2);
		gameCardHolder[4] = new BoardTile(5, tileOrder[4],1);
		gameCardHolder[5] = new BoardTile(6, tileOrder[5],4);
		gameCardHolder[6] = new BoardTile(7, tileOrder[6],3);
		gameCardHolder[7] = new BoardTile(8, tileOrder[7],5);
		gameCardHolder[8] = new BoardTile(9, tileOrder[8],2);
		gameCardHolder[9] = new BoardTile(10, tileOrder[9],1);
		gameCardHolder[10] = new BoardTile(11, tileOrder[10],4);
		gameCardHolder[11] = new BoardTile(12, tileOrder[11],3);
		gameCardHolder[12] = new BoardTile(13, tileOrder[12],5);
		gameCardHolder[13] = new BoardTile(14, tileOrder[13],2);
		gameCardHolder[14] = new BoardTile(15, tileOrder[14],1);
		gameCardHolder[15] = new BoardTile(16, tileOrder[15],4);
		gameCardHolder[16] = new BoardTile(17, tileOrder[16],3);
		gameCardHolder[17] = new BoardTile(18, tileOrder[17],5);
		gameCardHolder[18] = new BoardTile(19, tileOrder[18],2);
		gameCardHolder[19] = new BoardTile(20, tileOrder[19],1);
		gameCardHolder[20] = new BoardTile(21, tileOrder[20],4);
		gameCardHolder[21] = new BoardTile(22, tileOrder[21],3);
		gameCardHolder[22] = new BoardTile(23, tileOrder[22],5);
		gameCardHolder[23] = new BoardTile(24, tileOrder[23],2);
		gameCardHolder[24] = new BoardTile(25, tileOrder[24],1);
		gameCardHolder[25] = new BoardTile(26, tileOrder[25],4);
		gameCardHolder[26] = new BoardTile(27, tileOrder[26],3);
		gameCardHolder[27] = new BoardTile(28, tileOrder[27],5);
		gameCardHolder[28] = new BoardTile(29, tileOrder[28],2);
		gameCardHolder[29] = new BoardTile(30, tileOrder[29],1);
		gameCardHolder[30] = new BoardTile(31, tileOrder[30],4);
		gameCardHolder[31] = new BoardTile(32, tileOrder[31],3);
		gameCardHolder[32] = new BoardTile(33, tileOrder[32],5);
		gameCardHolder[33] = new BoardTile(34, tileOrder[33],2);
		gameCardHolder[34] = new BoardTile(35, tileOrder[34],1);
		gameCardHolder[35] = new BoardTile(36, tileOrder[35],4);
		gameCardHolder[36] = new BoardTile(37, tileOrder[36],3);
		gameCardHolder[37] = new BoardTile(38, tileOrder[37],5);
		gameCardHolder[38] = new BoardTile(39, tileOrder[38],2);
		gameCardHolder[39] = new BoardTile(40, tileOrder[39],1);
		gameCardHolder[40] = new BoardTile(41, tileOrder[40],4);
		gameCardHolder[41] = new BoardTile(42, tileOrder[41],3);
		gameCardHolder[42] = new BoardTile(43, tileOrder[42],5);
		gameCardHolder[43] = new BoardTile(44, tileOrder[43],2);
		gameCardHolder[44] = new BoardTile(45, tileOrder[44],1);
		gameCardHolder[45] = new BoardTile(46, tileOrder[45],4);
		gameCardHolder[46] = new BoardTile(47, tileOrder[46],3);
		gameCardHolder[47] = new BoardTile(48, tileOrder[47],5);
		gameCardHolder[48] = new BoardTile(49, tileOrder[48],2);
		gameCardHolder[49] = new BoardTile(50, tileOrder[49],1);
		gameCardHolder[50] = new BoardTile(51, tileOrder[50],4);
		gameCardHolder[51] = new BoardTile(52, tileOrder[51],3);
		gameCardHolder[52] = new BoardTile(53, tileOrder[52],5);
		gameCardHolder[53] = new BoardTile(54, tileOrder[53],2);
		gameCardHolder[54] = new BoardTile(55, tileOrder[54],1);
		gameCardHolder[55] = new BoardTile(56, tileOrder[55],4);
		gameCardHolder[56] = new BoardTile(57, tileOrder[56],3);
		gameCardHolder[57] = new BoardTile(58, tileOrder[57],5);
		gameCardHolder[58] = new BoardTile(59, tileOrder[58],2);
		gameCardHolder[59] = new BoardTile(60, tileOrder[59],1);
		gameCardHolder[60] = new BoardTile(61, tileOrder[60],4);
		gameCardHolder[61] = new BoardTile(62, tileOrder[61],3);
		gameCardHolder[62] = new BoardTile(63, tileOrder[62],5);
		System.out.println("Board tiles loaded...");
		
	}
	
	private void initializeTileOrder()
	{
		for(int i = 0; i< 63;i++)
		{
			tileOrder[i] = new FlashCard();
		}
		System.out.println("Initialized Flash Card order...");
	}
	
	private void initializeFileNames()
	{
		for(int i = 0; i< numberOfTotalCards;i++)
		{
			fileNames[i] = "FlashCard" + (i+1)+".fcd";
		}
		System.out.println("Initialized file names...");
	}
	
	private void shuffle()
	{
		for (int i = 0; i < numberOfTotalCards; i++) 
		{
            int r = i + (int) (Math.random() * (numberOfTotalCards - i));
            String swap = fileNames[r];
            fileNames[r] = fileNames[i];
            fileNames[i] = swap;
        }
		System.out.println("Shuffled Flash Cards...");
	}
	
	public boolean fetchQuestion(int pos)throws IOException
	{
		//fetching the question from the database;
		System.out.println("#### Question on Tile " + pos + " ####");
		return(gameCardHolder[pos-1].fetchQuestion());
	}
	
	public boolean fetchQuestionForComp(int pos, int ansSim)throws IOException
	{
		//fetching the question from the database for the computer;
		System.out.println("#### Question on Tile " + pos + " ####");
		return(gameCardHolder[pos-1].fetchQuestionForComp(ansSim));
	}
}
