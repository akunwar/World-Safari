
public class QAholder 
{
	String question, option1, option2, option3;
	int correctAnswer;
	
	public QAholder(String q, String o1, String o2, String o3, int corrAns)
	{
		question = q;
		option1 = o1;
		option2 = o2;
		option3 = o3;
		correctAnswer = corrAns;
	}
	
	public void printQues()
	{
		System.out.println("Question: " + question);
		System.out.println("1. " + option1);
		System.out.println("2. " + option2);
		System.out.println("3. " + option3);
	}
	
	public int returnAns()
	{
		return correctAnswer;
	}
}
