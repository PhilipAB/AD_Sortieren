public class QuickSortMain
{
	
	public QuickSortMain()
	{	
	}
	
	/**
	 * Eine Beispiel-Methode, die das Alphabet sortiert
	 * 
	 */
	public static void main(String args[])
	{
		String[] testDaten = {"N", "D", "C", "B", "Z", "F", "G", "H", "J", "I", "L", "K", "M", "A", "S", "P", "X", "R", "O", "T", "W", "V", "U", "Q", "Y", "E"};
		PivotStrategie pivotAnfang = new PivotAnfang();
		Quicksort quicksort = new Quicksort(pivotAnfang);
		quicksort.sortiereDaten(testDaten, 0, testDaten.length - 1);	
		for(String s : testDaten)
		{
			System.out.println(s);		
		}
	}
	

}
