package srm145div2;

/**
 * Created with IntelliJ IDEA.
 * User: Subramaniam S
 * Date: 6/5/13
 * Time: 1:10 PM
 */
public class ImageDithering
{
	public int count(String dithered, String[] screen)
	{
		int count = 0;
		for (String scr : screen)
		{
			for (char c : dithered.toCharArray())
			{
				count += getCountOf(c, scr);
			}
		}
		return count;
	}

	private int getCountOf(char c, String scr)
	{
		int count = 0;
		for (char s : scr.toCharArray())
		{
			if (c == s)
				count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		ImageDithering obj = new ImageDithering();

		System.out.println(obj.count("BW", new String[] {"AAAAAAAA", "ABWBWBWA", "AWBWBWBA", "ABWBWBWA", "AWBWBWBA", "AAAAAAAA"}));

		System.out.println(obj.count("BW", new String[] {"BBBBBBBB",
				"BBWBWBWB",
				"BWBWBWBB",
				"BBWBWBWB",
				"BWBWBWBB",
				"BBBBBBBB"}));

		System.out.println(obj.count("ACEGIKMOQSUWY", new String[] {"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX"}));

		System.out.println(obj.count("CA", new String[] {"BBBBBBB",
				"BBBBBBB",
				"BBBBBBB"}));

		System.out.println(obj.count("DCBA", new String[] {"ACBD"}));
	}
}
