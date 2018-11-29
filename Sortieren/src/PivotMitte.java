
public class PivotMitte implements PivotStrategie
{

	@Override
	public <E> int ermittlePivotElementIndex(int indexLinks, int indexRechts)
	{
		return (indexLinks + indexRechts)/2;
	}
	

}
