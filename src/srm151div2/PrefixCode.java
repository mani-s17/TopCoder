package srm151div2;

/**
 * Created with IntelliJ IDEA.
 * User: Subramaniam S
 * Date: 6/18/13
 * Time: 3:08 PM
 */
public class PrefixCode
{
	public String isOne(String[] words)
	{
		int index = 50;
		boolean  isOne = true;
		for (int i=0; i<words.length; i++)
		{
			for (int j=i+1; j<words.length; j++)
			{
				if (words[i].startsWith(words[j]))
				{
					if (j < index)
						index = j;
					isOne = false;
				}
				if (words[j].startsWith(words[i]))
				{
					if (i < index)
						index = i;
					isOne = false;
				}
			}
		}

		if (isOne)
			return "Yes";
		else
			return "No, " + index;
	}

	public static void main(String[] args)
	{
		PrefixCode obj = new PrefixCode();
		System.out.println(obj.isOne(new String[] {"trivial"}));
		System.out.println(obj.isOne(new String[] {"10001", "011", "100", "001", "10"}));
		System.out.println(obj.isOne(new String[] {"no", "nosy", "neighbors", "needed"}));
		System.out.println(obj.isOne(new String[] {"1010", "11", "100", "0", "1011"}));
		System.out.println(obj.isOne(new String[] {"No", "not"}));
		System.out.println(obj.isOne(new String[] {"6G9Lnpzw", "kA", "SyW9fFaF", "k", "SyW9fFa", "6G", "6", "SyW9f"}));
	}
}
