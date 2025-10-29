import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainDish{

		@Test
		public void testThatTheFirstCharacterOfALetterIsKnown(){
	
			int actual = MainDish.getPositionOfTheChar("bolaji", 'l');
			assertEquals(actual,2 );

		}
		"""@Test
		public void testThatTheAppropriateWordIsReturn(){
	
			String actual = MainDish.getNewWord("bolaji", 'l');
			assertEquals(actual, "bolaji" );

		"""}



}

