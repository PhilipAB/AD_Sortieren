/**
 * Eine Klasse, die vergleichbare Objekte nach dem Quicksort-Verfahren aufsteigend vergleichen kann
 * @author Philip Aguilar Bremer, Jan-Patrick Ritter
 *
 */
public class Quicksort
{
	PivotStrategie _pivotStrategie;
	
	/**
	 * 
	 * @param pivotStrategie Die Strategie, mit der das Pivotelement ermittelt werden soll
	 */
	public Quicksort(PivotStrategie pivotStrategie)
	{
		_pivotStrategie = pivotStrategie;
		
	}
	
	@SuppressWarnings("unchecked")
	public <E> void sortiereDaten(Comparable<E>[] daten, int indexLinks, int indexRechts)
	{
		if(indexRechts > indexLinks)
		{
		int links = indexLinks;
		int rechts = indexRechts;
		int pivotIndex = _pivotStrategie.ermittlePivotElementIndex(indexLinks, indexRechts);
		E pivot = (E) daten[pivotIndex];
		tauschen(daten, pivotIndex, indexRechts);
		pivotIndex = indexRechts;
		
		while(true)
		{

			while((daten[links].compareTo(pivot) < 0) && links < indexRechts) //|| links == pivotIndex) //|| links == pivotIndex) && links < indexRechts)
			{
				++links;
			}
			
			while((daten[rechts].compareTo(pivot) >= 0) && rechts > 0) //|| rechts == pivotIndex) && rechts > indexLinks)
			{
				--rechts;
			}
			
			if(links >= rechts)
			{
				break;
			}
			
			tauschen(daten, links, rechts);
			
		}

		tauschen(daten, links, pivotIndex);
		sortiereDaten(daten, indexLinks, links-1);
		sortiereDaten(daten, links+1, indexRechts);
		}		
	}
	
	public <E> void tauschen(Comparable<E>[] daten, int index1, int index2)
	{
		Comparable<E> hilfsspeicher = daten[index1];
		daten[index1] = daten[index2];
		daten[index2] = hilfsspeicher;
	}

}
