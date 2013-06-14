package srm148div2;

/**
 * Created with IntelliJ IDEA.
 * User: Subramaniam S
 * Date: 6/12/13
 * Time: 4:11 PM
 */
public class DivisorDigits
{
	public int howMany(int number)
	{
		int sum = 0;
		String numString = String.valueOf(number);
		for (char c : numString.toCharArray())
		{
			int num = c - '0';
			if (num != 0)
			{
				if (number % num == 0)
					sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args)
	{
		DivisorDigits obj = new DivisorDigits();
		System.out.println(obj.howMany(12345));
		System.out.println(obj.howMany(661232));
		System.out.println(obj.howMany(52527));
		System.out.println(obj.howMany(730000000));
	}
}
