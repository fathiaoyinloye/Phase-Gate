import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGetFreeItems{

		@Test
		public void testThatNumberOfItemsGivesTheTotalPriceOfTheItems(){
	
			int actual = GetFreeItems.getTotalPrice(2);
			int expected = 100000;
			assertEquals(actual,expected);

		}

		@Test
		public void testThatDepreciationIsCalculatedOnTheTotalAmountAndTheRightAmountIsGiven(){
	
			int actual = GetFreeItems.getDepreciationValue(2);
			int expected = 4000 * 2;
			assertEquals(actual,expected);

		}

		@Test
		public void testThatTheRightYearsToBeFreeIsGenerated(){
	
			int actual = GetFreeItems.getNumberOfYearsToGetFree(1);
			int expected = 13;
			assertEquals(actual,expected);

		}

		@Test
		public void testThatTheRightYearsIsStatedToTheBuyer(){
	
			String actual = GetFreeItems.giveResponseToTheBuyer(1);
			String expected = "It will take 13years to  get the item for free";
			assertEquals(actual,expected);

		}

		@Test
		public void testThatTotalPriceIsZeroWhenZeroIsTheNumberOfItemsToBeBought(){
			int actual = GetFreeItems.getTotalPrice(0);
			assertEquals(actual,0);

		}

		@Test
		public void testThatTotalPriceIsZeroWhenNumberLessThanZeroIsTheNumberOfItemsToBeBought(){
			int actual = GetFreeItems.getTotalPrice(-1);
			assertEquals(actual,0);

		}







}