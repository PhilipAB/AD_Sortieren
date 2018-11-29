import java.util.Random;

/**
 * Eine Klasse, die das Pivotelement zufällig ermittelt
 * @author Philip
 *
 */
public class PivotRandom implements PivotStrategie
{

	@Override
	public <E> int ermittlePivotElementIndex(int indexLinks, int indexRechts)
	{
//		return (int) ((Math.random() * (indexRechts+1)+indexLinks) % (indexRechts));
		Random rand = new Random();
		int randomIndex = indexLinks + rand.nextInt(indexRechts - indexLinks);
		return randomIndex;
	}
}
