import java.util.Random;

public class SchluesselObjekt implements Comparable<SchluesselObjekt>
{
	private int _key;

	public SchluesselObjekt(int key)
	{
		Random rand = new Random();
		int zw700u800 = 700 + rand.nextInt(101);
		_key = zw700u800 * key;		
	}
	
	@Override
	public int compareTo(SchluesselObjekt o)
	{
		if(gibKey() > o.gibKey())
		{
		return 1;
		}
		else if(o.gibKey() > gibKey())
		{
		return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public int gibKey()
	{
		return _key;
	}
	

}
