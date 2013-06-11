package srm147div2;

/**
 * Created with IntelliJ IDEA.
 * User: Subramaniam S
 * Date: 6/6/13
 * Time: 6:07 PM
 */
public class CCipher
{
	public String decode(String cipherText, int shift)
	{
		StringBuilder stringBuilder = new StringBuilder();
		char[] cipherChar = cipherText.toCharArray();
		for (int i=0; i<cipherChar.length; i++)
			stringBuilder.append(decodeChar(cipherChar[i], shift));
		return stringBuilder.toString();
	}

	private char decodeChar(char c, int shift)
	{
		int asciiValue = (int) c;
		asciiValue -= shift;
		if (asciiValue < 65)
			asciiValue += 26;
		return (char)asciiValue;
	}

	public static void main(String[] args)
	{
		CCipher obj = new CCipher();
		System.out.println(obj.decode("VQREQFGT", 2));
		System.out.println(obj.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10));
		System.out.println(obj.decode("TOPCODER", 0));
		System.out.println(obj.decode("ZWBGLZ", 25));
		System.out.println(obj.decode("DBNPCBQ", 1));
		System.out.println(obj.decode("LIPPSASVPH", 4));
	}
}
