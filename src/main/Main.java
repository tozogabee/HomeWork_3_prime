package main;

public class Main {
	
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println("No any parameters are used");
		}
		else
		{
			int i=1;
			for(String tmp : args)
			{
			
				if(isPrime(i))
				{
					System.out.println("Hello "+tmp+"!!");
				}
				else
				{
					System.out.println("Hello "+tmp+"!");
				}
				++i;
			}
		}
	}
	
	public static boolean isPrime(int number)
	{	
		if(number<2)
		{
			return false;
		}
		else
		{
			for(int i=2;i<number;++i)
			{
				if(number%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
