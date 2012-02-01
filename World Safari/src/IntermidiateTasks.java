import java.io.*;
import java.util.*;
public class IntermidiateTasks {
	
	public static void main(String args[]) 
	{
		//try{
		//for(int i = 100;i<=102;i++)
		//{
			//System.out.println("######## file " + i+" ########");
		try
		{
			String path = "src/FlashCards/FlashCard31.fcd";
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
					if(counter == 0)
					{
						System.out.println("***People***");
					}
					else if(counter == 1)
					{
						System.out.println("***Landscape***");
					}
					else if(counter == 2)
					{
						System.out.println("***Monument***");
					}
					else if(counter == 3)
					{
						System.out.println("***World***");
					}
					System.out.println(ques);
					System.out.println(o1);
					System.out.println(o2);
					System.out.println(o3);
					System.out.println(correctAns);
					line = br.readLine();
					if(line.equals("***End of Question***"))
					{
						counter++;
					}
				
				//System.out.println(line+"uo");
			}
			br.close();
			
		}
		catch(Exception e){}
	      // }catch(Exception e){System.out.println("failed.");}
	//}
	}

}
