import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Random;

public class FlashCard 
{
	QAholder quesSet[]; //in the order - people, landscape, monuments, world
	
	public FlashCard()
	{
		quesSet = new QAholder[4];
	}
	
	public void makeQuestion(String q, String o1, String o2, String o3, int corrAns, int i)
	{
		quesSet[i] = new QAholder(q, o1, o2, o3, corrAns);
	}
	
	public boolean fetchAndCheckQuestion(int i) throws IOException
	{
		quesSet[i].printQues();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your choice number: ");
		String s = br.readLine();
		int ans = Integer.parseInt(s);
		if(ans == quesSet[i].returnAns())
		{
			System.out.println("Well done! Correct Answer.");
			System.out.println("Spinning it again...");
			return true;
		}
		else
		{
			System.out.println("Oops! Wrong Answer.");
			return false;
		}
	}
	
	public boolean fetchAndCheckQuestionForComp(int i, int ansSim) throws IOException
	{
		quesSet[i].printQues();
		int ans = 0;
		System.out.print("Waiting for computer's response... ");
		if(ansSim == 1)
			ans = quesSet[i].returnAns();
		else
		{
			Random rand = new Random();
			ans = rand.nextInt(3)+1;
		}
		System.out.println("Computer chose: " + ans);
		if(ans == quesSet[i].returnAns())
		{
			System.out.println("Computer answered correctly.");
			System.out.println("Spinning it again for the computer...");
			return true;
		}
		else
		{
			System.out.println("Computer answered wrong.");
			return false;
		}
	}
	

}
