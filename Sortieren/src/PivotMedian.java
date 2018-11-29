/**
 * Eine Klasse, die das Pivotelement ermittelt, indem sie den Median aus dem ersten, mittleren und letzen Element ermittelt
 * @author Philip
 *nicht genutzt
 */
//public class PivotMedian implements PivotStrategie
//{
//	@Override
//	public <E> int ermittlePivotElementIndex(Comparable<E>[] daten, int indexLinks, int indexRechts)
//	{
//		if(istMedian(0, daten))
//		{
//			return 0;
//		}
//		else if(istMedian(daten.length/2, daten))
//		{
//			return daten.length/2;
//		}
//		else 
//		{
//			return daten.length - 1;
//		}
//	}
//	
//	private boolean wahr(int i)
//	{
//		return (i > 0);
//	}
//	
//	@SuppressWarnings("unchecked")
//	private <E> boolean istMedian(int index, Comparable<E>[] daten)
//	{
//		int index0GroesserEnde = daten[0].compareTo((E) daten[daten.length -1]);
//		int index0GroesserMitte = daten[0].compareTo((E) daten[daten.length/2]);
//		int indexEndeGroesserMitte = daten[daten.length -1].compareTo((E) daten[daten.length/2]);
//		
//		if(index == 0)
//		{
//		return ((wahr(index0GroesserEnde) && !wahr(index0GroesserMitte)) 
//			   || (!wahr(index0GroesserEnde) && wahr(index0GroesserMitte)));
//		}
//		else /*if(index == daten.length/2)*/
//		{
//		return ((wahr(index0GroesserEnde) && wahr(index0GroesserMitte) && !wahr(indexEndeGroesserMitte))
//				|| !(wahr(index0GroesserEnde) && !wahr(index0GroesserMitte) && wahr(indexEndeGroesserMitte)));
//		}
////		else
////		{
////			return ((wahr(index0GroesserEnde) && wahr(index0GroesserMitte) && wahr(indexEndeGroesserMitte))
////					|| !(wahr(index0GroesserEnde) && !wahr(index0GroesserMitte) && !wahr(indexEndeGroesserMitte)));			
////		}		
//	}
//	
//}
//
//
