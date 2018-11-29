
public class QuickInsertion
{
PivotStrategie _pivotStrategie;
	
	/**
	 * 
	 * @param pivotStrategie Die Strategie, mit der das Pivotelement ermittelt werden soll
	 */
	public QuickInsertion(PivotStrategie pivotStrategie)
	{
		_pivotStrategie = pivotStrategie;
		
	}
	
	@SuppressWarnings("unchecked")
	public <E> void sortiereDaten(Comparable<E>[] daten, int indexLinks, int indexRechts)
	{
		int size = (indexRechts+1) - indexLinks;
		if(indexRechts > indexLinks)
		{
			if(size <= 10)
			{
				insertionSort(daten, indexLinks, indexRechts);
			}
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
	
	@SuppressWarnings("unchecked")
	private <E> void insertionSort(Comparable<E>[] daten, int indexLinks, int indexRechts)
	{
		for (int i = indexLinks + 1; i <= indexRechts; ++i) 
		{
			Comparable<E> element = daten[i];
            int j = i-1;
            while (j>=0 && (daten[j].compareTo((E) element) > 0)) 
            {
                daten[j+1] = daten[j];
                j--;
            }
            daten[j+1] = element;
        }
	}

}
