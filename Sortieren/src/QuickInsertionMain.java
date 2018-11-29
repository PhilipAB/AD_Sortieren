
public class QuickInsertionMain
{
	private long _zeit;
	private PivotEnde _pivotEnde1;
	private PivotEnde _pivotEnde2;
	private Quicksort _quicksort;
	private QuickInsertion _quickInsertion;
	private SchluesselObjekt _array1[];
	private SchluesselObjekt _array2[];
	private SchluesselObjekt _array3[];
	private SchluesselObjekt _array4[];
	private SchluesselObjekt _array5[];
	
	public QuickInsertionMain()
	{
		_zeit = 0;
		_pivotEnde1 = new PivotEnde();
		_pivotEnde2 = new PivotEnde();
		_quicksort = new Quicksort(_pivotEnde1);
		_quickInsertion = new QuickInsertion(_pivotEnde2);
		_array1 = new SchluesselObjekt[10];
		_array2 = new SchluesselObjekt[100];
		_array3 = new SchluesselObjekt[1000];
		_array4 = new SchluesselObjekt[10000];
		_array5 = new SchluesselObjekt[100000];	
	}
	
	public void sortiereUndMesseZeiten()
	{
		messeZeit(_array1);
		messeZeit(_array2);
		messeZeit(_array3);
		messeZeit(_array4);
		messeZeit(_array5);
		
		testRoutine(_array1);
		testRoutine(_array2);
		testRoutine(_array3);
		testRoutine(_array4);
		testRoutine(_array5);
	}
	
	private void erstelleNeuenDatensatz(SchluesselObjekt[] array)
	{
		for(int i = 0; i < array.length; ++i)
		{
			array[i] = new SchluesselObjekt(array.length);		
		}
	}
	
	private void messeZeit(SchluesselObjekt[] array)
	{
		for(int i = 0; i < 10; ++i)
		{
		erstelleNeuenDatensatz(array);
		_zeit = System.nanoTime();
		_quicksort.sortiereDaten(array, 0, array.length - 1);
		System.out.println("Quicksort und k = " + ((int) Math.log10(array.length)) + 
		" ... benötigte Zeit: " + (System.nanoTime() - _zeit));
		
		erstelleNeuenDatensatz(array);
		_zeit = System.nanoTime();
		_quickInsertion.sortiereDaten(array, 0, array.length - 1);
		System.out.println("QuickInsertion und k = " + ((int) Math.log10(array.length)) + 
				" ... benötigte Zeit: " + (System.nanoTime() - _zeit));
		System.out.println();
		}	
	}
	
	private boolean testRoutine(SchluesselObjekt[] array)
	{
		for(int i = 0; i < array.length - 1; ++i)
		{
			if(array[i].compareTo(array[i+1]) > 0)
			{
				System.out.println("Array für k = " + ((int) Math.log10(array.length)) + " ist falsch sortiert.");
				return false;
			}		
		}
		System.out.println("Array für k = " + ((int) Math.log10(array.length)) + " ist richtig sortiert.");
		return true;		
	}
	
}
