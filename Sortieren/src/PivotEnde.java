/**
 * Eine Klasse, die stets das letzte Element eines Datensatzes als Pivotelement festlegt
 * @author Philip
 *
 */
public class PivotEnde implements PivotStrategie
{

	@Override
	public <E> int ermittlePivotElementIndex(int indexLinks, int indexRechts)
	{
		return indexRechts;
	}

}
