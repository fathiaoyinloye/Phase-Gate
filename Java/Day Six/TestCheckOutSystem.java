import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCheckOutSystem{
		@Test
		public void testThatMoreTotalNumbersIn(){

			double sum = 78;
			double actual =  CheckoutSystem.calculateVat(78);
			assertEquals(actual,5.85);

		}

		@Test
		public void testThatVatIsCalculated(){

			double sum = 78;
			double actual =  CheckoutSystem.calculateVat(78);
			assertEquals(actual,5.85);

		}
		


}