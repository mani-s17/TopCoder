package srm149div2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Subramaniam S
 * Date: 6/12/13
 * Time: 4:48 PM
 */
public class FormatAmt
{
	public String amount(int dollars, int cents)
	{
		String dollar = "";
		String cent = "." + (cents<10 ? "0" : "") + cents;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(dollars);
		char[] rev = stringBuilder.reverse().toString().toCharArray();

		stringBuilder = new StringBuilder();
		int count = 2;
		for (int i=0; i< rev.length; i++)
		{
			stringBuilder.append(rev[i]);
			if (count == 0)
			{
				stringBuilder.append(",");
				count = 3;
			}
			count--;
		}

		dollar = stringBuilder.reverse().toString();
		if(dollar.startsWith(","))
			dollar = dollar.replaceFirst(",", "");

		return  "$" +  dollar + cent;
	}

	public static void main(String[] args)
	{
		FormatAmt obj = new FormatAmt();
		System.out.println(obj.amount(123456, 0));
		System.out.println(obj.amount(49734321, 9));
		System.out.println(obj.amount(0, 99));
		System.out.println(obj.amount(1000, 1));
	}

}
