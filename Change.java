public class Change
{
	public static void main(String[]args)
	{
		System.out.println("Hello World!");
		System.out.println(NumberOfWaysToMake(11));
	}

	public static int NumberOfWaysToMake(int cents)
	{
		if(cents < 0) 
		{
			return 0;
		}

		if(cents < 5)
		{
			return 1;
		}

		int[]coins = {5, 10, 25};
		int number_of_ways = 1; 

		for(int i = 0; i < 3; i++)
		{
			int coin = coins[i];
			number_of_ways += NumberOfWaysToMake(cents - coin);
		}

		return number_of_ways;
	}
}

// javac Change.java 
// java Change