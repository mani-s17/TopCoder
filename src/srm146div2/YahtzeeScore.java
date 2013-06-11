package srm146div2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Subramaniam S
 * Date: 6/6/13
 * Time: 12:19 PM
 */
public class YahtzeeScore
{
	public int maxPoints(int[] toss)
	{
		int maxPoint = 0;
		Map<Integer, Integer> tossCount = getTossCount(toss);

		for (Map.Entry<Integer, Integer> entry : tossCount.entrySet())
		{
			int point = entry.getKey() * entry.getValue();
			if (maxPoint < point)
				maxPoint = point;
		}
		return maxPoint;
	}

	private Map<Integer, Integer> getTossCount(int[] toss)
	{
		Map<Integer, Integer> tossCount = new HashMap<Integer, Integer>();
		for (int i=0; i < toss.length; i++)
		{
			int count = 1;
			for (int j=i+1; j < toss.length; j++)
			{
				if (toss[i] == toss[j])
					count++;
			}

			if (!tossCount.containsKey(toss[i]))
				tossCount.put(toss[i], count);
		}
		return  tossCount;
	}

	public int maxPoints2(int[] toss)
	{
		int maxPoint = 0;
		for (int value = 1; value <= 6; value++)
		{
			int sum = 0;
			for (int i = 0; i < toss.length; i++)
			{
				if (value == toss[i])
					sum = sum + toss[i];
			}
			if (sum > maxPoint)
				maxPoint = sum;
		}
		return maxPoint;
	}

	public static void main(String[] args)
	{
		YahtzeeScore obj = new YahtzeeScore();
		System.out.println(obj.maxPoints(new int[] { 2, 2, 3, 5, 4 }));
		System.out.println(obj.maxPoints(new int[] { 6, 4, 1, 4, 4 }));
		System.out.println(obj.maxPoints(new int[] { 5, 3, 5, 3, 3 }));
	}
}
