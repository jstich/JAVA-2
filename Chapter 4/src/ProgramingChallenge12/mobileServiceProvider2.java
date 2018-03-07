package ProgramingChallenge12;


public class mobileServiceProvider2
{
	private char servicePackage;
	private int serviceMins;
	public mobileServiceProvider2(char usrPackage, int usrMins)
	{
		servicePackage = usrPackage;
		serviceMins = usrMins;
	}
	
	public double getTotalCharges()
	{
		double total_amount = 0;
		switch(servicePackage)
		{
			case 'A':
				if(serviceMins<=450)
				{
					total_amount = 39.99;
				}
				else
					total_amount = 39.99+((serviceMins-450)*0.45);
				break;
			case 'B':
				if(serviceMins<=900)
				{
					total_amount = 59.99;
				}
				else
					total_amount = 59.99+((serviceMins-900)*0.40);
			break;
			case 'C':
					total_amount = 69.99;
			break;
		}
	
	return total_amount;
	}
	
}