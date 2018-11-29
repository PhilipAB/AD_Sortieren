
public class PivotAnfang implements PivotStrategie
{
	@Override
	public <E> int ermittlePivotElementIndex(int indexLinks, int indexRechts)
	{
		return indexLinks;
	}

}
