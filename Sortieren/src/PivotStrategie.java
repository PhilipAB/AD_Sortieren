
public interface PivotStrategie
{
/**
 * 
 * @param indexLinks der Startindex des übergebenen Arrays
 * @param indexRechts der Endindex des übergebenen Arrays
 * @return gibt den Index für das Pivotelement zurück
 */
	public <E> int ermittlePivotElementIndex(int indexLinks, int indexRechts);
}
