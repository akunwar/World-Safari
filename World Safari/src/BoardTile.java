import java.io.*;
public class BoardTile 
{
	int tileNumber;
	FlashCard tileCard;
	int questionType;
	
	public BoardTile(int num, FlashCard tCard, int type)
	{
		tileNumber = num;
		tileCard = tCard;
		questionType = type;
	}
	
	public boolean fetchQuestion()throws IOException
	{
		int i = 0;
		boolean check = false;
		
		if(questionType == 1)
			i = 0;
		else if(questionType == 2)
			i = 1;
		else if(questionType == 3)
			i = 2;
		else if(questionType == 4)
			i = 3;
		else
			check = true;
		
		return(tileCard.fetchAndCheckQuestion(i));
	}
	
	public boolean fetchQuestionForComp(int ansSim)throws IOException
	{
		int i = 0;
		boolean check = false;
		
		if(questionType == 1)
			i = 0;
		else if(questionType == 2)
			i = 1;
		else if(questionType == 3)
			i = 2;
		else if(questionType == 4)
			i = 3;
		else
			check = true;
		
		return(tileCard.fetchAndCheckQuestionForComp(i,ansSim));
	}

}
