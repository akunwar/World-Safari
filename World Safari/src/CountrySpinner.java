//just a random choosing spinner class for now - will change this later
import java.util.Random;
public class CountrySpinner 
{
	/**
	String countryName;
	int countryNumber;
	String countryPosition; //will figure this out later
	
	public CountrySpinner(String c, int n, String p)
	{
		countryPosition = c;
		countryNumber = n;
		countryPosition = p;
	}
	*/
	public int spinnerChooser()
	{
		Random rand = new Random();
		return(rand.nextInt(4)+1);
	}

}
