package codechef.june2013;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] s)
	{
		try
		{
			InputStream inputStream = System.in;
			InputReader in = new InputReader(inputStream);
			PrintWriter writer = new PrintWriter(System.out);

			TaskA solution = new TaskA();
			solution.solve(in,writer);

			writer.close();
			inputStream.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}

class TaskA
{
	public void solve(InputReader in, PrintWriter out) throws IOException
	{
		int tests = in.nextInt();
		for (int i=0;i<tests;i++)
		{
			out.println(isLapindrome(splitString(in.next())));
		}
	}

	private String isLapindrome(String[] strings)
	{
		String isLapindrome = "YES";
		Map<Character, Integer> firstHalfCount = getCharCount(strings[0].toCharArray());
		Map<Character, Integer> secondHalfCount = getCharCount(strings[1].toCharArray());

		// Different Char in both halves
		if(firstHalfCount.size() != secondHalfCount.size())
			isLapindrome = "NO";
		else
		{
			for (Map.Entry<Character, Integer> entry : firstHalfCount.entrySet())
			{
				if (secondHalfCount.get(entry.getKey()) != entry.getValue())
					isLapindrome = "NO";
			}
		}
		return isLapindrome;
	}

	private String[] splitString(String str)
	{
		String[] strings = new String[2];
		if((str.length() % 2) == 0)
		{
			strings[0] = str.substring(0, (str.length()/2));
			strings[1] = str.substring(str.length()/2, str.length());
		}
		else
		{
			strings[0] = str.substring(0, (str.length()/2));
			strings[1] = str.substring((str.length()/2)+1, str.length());
		}

		return strings;
	}

	private Map<Character, Integer> getCharCount(char[] str)
	{
		Map<Character, Integer> strCount = new HashMap<Character, Integer>();
		for (int i=0; i < str.length; i++)
		{
			int count = 1;
			for (int j=i+1; j < str.length; j++)
			{
				if (str[i] == str[j])
					count++;
			}

			if (!strCount.containsKey(str[i]))
				strCount.put(str[i], count);
		}
		return  strCount;
	}
}

class InputReader
{
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream)
	{
		reader = new BufferedReader(new InputStreamReader(stream));
		tokenizer = null;
	}

	public String next()
	{
		while (tokenizer == null || !tokenizer.hasMoreTokens())
		{
			try
			{
				tokenizer = new StringTokenizer(reader.readLine());
			}
			catch (IOException e)
			{
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt()
	{
		return Integer.parseInt(next());
	}

	public long nextLong()
	{
		return Long.parseLong(next());
	}

	public double nextDouble()
	{
		return Double.parseDouble(next());
	}
}
