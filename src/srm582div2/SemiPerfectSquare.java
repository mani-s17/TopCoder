package srm582div2;

/**
 * Created with IntelliJ IDEA.
 * User: Subramaniam S
 * Date: 6/14/13
 * Time: 4:55 PM
 */
public class SemiPerfectSquare
{
	public String check(int N)
	{
		for(int i=1;i<33;i++)
		{
			for (int j=i+1;j<33;j++)
			{
				if (N == i*j*j)
					return "Yes";
			}
		}
		return "No";
	}

}
