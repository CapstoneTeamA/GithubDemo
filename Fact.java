public class Fact{
	public static int fact(int num)
	{
		if (num == 1 || num == 0)
<<<<<<< HEAD
			return 1;
		else if (num < 0)
			return -1;
=======
		{
			return 1;
		}
		else if (num < 0)
		{
			return -1;
		}
>>>>>>> 4e04660777a81dcbd962b08e3a7493e14a1246d3
		return num * fact(num - 1);
	}
}
