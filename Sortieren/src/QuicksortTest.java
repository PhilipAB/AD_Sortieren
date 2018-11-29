import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuicksortTest
{

	@Test
	public void testRandomDatenRichtigSortiert()
	{
		PivotAnfang pivotAnfang = new PivotAnfang();
		Quicksort anfang = new Quicksort(pivotAnfang);
		PivotEnde pivotEnde = new PivotEnde();
		Quicksort ende = new Quicksort(pivotEnde);
		PivotRandom pivotRandom = new PivotRandom();
		Quicksort random = new Quicksort(pivotRandom);
		PivotMitte pivotMitte = new PivotMitte();
		Quicksort mitte = new Quicksort(pivotMitte);
		Double[] randomDaten = new Double[10];
		for(int i = 1; i  <= 4; ++i)
		{
	
		for(int j = 0; j < 10; ++j)
		{
			randomDaten[j] = Math.random();				
		}

		switch(i)
		{
		case 1:
			random.sortiereDaten(randomDaten, 0, randomDaten.length - 1);
			break;
		case 2:
			anfang.sortiereDaten(randomDaten, 0, randomDaten.length - 1);
			break;
		case 3:
			ende.sortiereDaten(randomDaten, 0, randomDaten.length - 1);
			break;	
		case 4:
			mitte.sortiereDaten(randomDaten, 0, randomDaten.length - 1);
			break;
		}		
		
		assertTrue(randomDaten[0] <= randomDaten[1] && randomDaten[1] <= randomDaten[2] && randomDaten[2] <= randomDaten[3]
				&& randomDaten[3] <= randomDaten[4] && randomDaten[4] <= randomDaten[5] && randomDaten[5] <= randomDaten[6]  
				&& randomDaten[6] <= randomDaten[7] && randomDaten[7] <= randomDaten[8] && randomDaten[8] <= randomDaten[9]);	
		}
	}
		
		@Test
		public void testSortierteDatenKl()
		{
			PivotAnfang pivotAnfang = new PivotAnfang();
			Quicksort anfang = new Quicksort(pivotAnfang);
			PivotEnde pivotEnde = new PivotEnde();
			Quicksort ende = new Quicksort(pivotEnde);
			PivotRandom pivotRandom = new PivotRandom();
			Quicksort random = new Quicksort(pivotRandom);
			PivotMitte pivotMitte = new PivotMitte();
			Quicksort mitte = new Quicksort(pivotMitte);
			String[] sortierteDatenKl = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
			for(int i = 1; i  <= 4; ++i)
			{
		
			switch(i)
			{
			case 1:
				random.sortiereDaten(sortierteDatenKl, 0, sortierteDatenKl.length - 1);
				break;
			case 2:
				anfang.sortiereDaten(sortierteDatenKl, 0, sortierteDatenKl.length - 1);
				break;
			case 3:
				ende.sortiereDaten(sortierteDatenKl, 0, sortierteDatenKl.length - 1);
				break;	
			case 4:
				mitte.sortiereDaten(sortierteDatenKl, 0, sortierteDatenKl.length - 1);
				break;
			}		
			
			assertTrue(sortierteDatenKl[0].equals("A") && sortierteDatenKl[1].equals("B") && sortierteDatenKl[2].equals("C") 
					&& sortierteDatenKl[3].equals("D") && sortierteDatenKl[4].equals("E") && sortierteDatenKl[5].equals("F") 
					&& sortierteDatenKl[6].equals("G") && sortierteDatenKl[7].equals("H") && sortierteDatenKl[8].equals("I") 
					&& sortierteDatenKl[9].equals("J"));
			}
	     }
		
		@Test
		public void testSortierteDatenGr()
		{
			PivotAnfang pivotAnfang = new PivotAnfang();
			Quicksort anfang = new Quicksort(pivotAnfang);
			PivotEnde pivotEnde = new PivotEnde();
			Quicksort ende = new Quicksort(pivotEnde);
			PivotRandom pivotRandom = new PivotRandom();
			Quicksort random = new Quicksort(pivotRandom);
			PivotMitte pivotMitte = new PivotMitte();
			Quicksort mitte = new Quicksort(pivotMitte);
			Character[] sortierteDatenGr = {'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
			for(int i = 1; i  <= 4; ++i)
			{
		
			switch(i)
			{
			case 1:
				random.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;
			case 2:
				anfang.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;
			case 3:
				ende.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;	
			case 4:
				mitte.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;
			}		
			
			assertTrue(sortierteDatenGr[0].equals('A') && sortierteDatenGr[1].equals('B') && sortierteDatenGr[2].equals('C') 
					&& sortierteDatenGr[3].equals('D') && sortierteDatenGr[4].equals('E') && sortierteDatenGr[5].equals('F') 
					&& sortierteDatenGr[6].equals('G') && sortierteDatenGr[7].equals('H') && sortierteDatenGr[8].equals('I') 
					&& sortierteDatenGr[9].equals('J'));
			}
	     }
		
		@Test
		public void testDatenMitGleichenElementen()
		{
			PivotAnfang pivotAnfang = new PivotAnfang();
			Quicksort anfang = new Quicksort(pivotAnfang);
			PivotEnde pivotEnde = new PivotEnde();
			Quicksort ende = new Quicksort(pivotEnde);
			PivotRandom pivotRandom = new PivotRandom();
			Quicksort random = new Quicksort(pivotRandom);
			PivotMitte pivotMitte = new PivotMitte();
			Quicksort mitte = new Quicksort(pivotMitte);
			Character[] sortierteDatenGr = {'C', 'I', 'H', 'E', 'F', 'E', 'D', 'C', 'B', 'A'};
			for(int i = 1; i  <= 4; ++i)
			{
		
			switch(i)
			{
			case 1:
				random.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;
			case 2:
				anfang.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;
			case 3:
				ende.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;	
			case 4:
				mitte.sortiereDaten(sortierteDatenGr, 0, sortierteDatenGr.length - 1);
				break;
			}		
			
			assertTrue(sortierteDatenGr[0].equals('A') && sortierteDatenGr[1].equals('B') && sortierteDatenGr[2].equals('C') 
					&& sortierteDatenGr[3].equals('C') && sortierteDatenGr[4].equals('D') && sortierteDatenGr[5].equals('E') 
					&& sortierteDatenGr[6].equals('E') && sortierteDatenGr[7].equals('F') && sortierteDatenGr[8].equals('H') 
					&& sortierteDatenGr[9].equals('I'));
			}
	     }

}
