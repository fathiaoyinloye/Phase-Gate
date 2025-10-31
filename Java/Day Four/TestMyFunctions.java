import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyFunctions{

		@Test
		public void testThatMyFunctionReturnAnArrayOfBoolean(){
			String[] myArray = {"fathia", "madam", "tope"};

			boolean [] result = MyFunctions.isElementPalindrome(myArray);
			boolean actual =result[0] ;
			assertEquals(actual,false);

		}
		@Test
		public void testThatElementArePalindromeAreSeenAsPalindrome(){
			String[] myArray = {"fathia", "madam", "tope"};
			boolean [] result = MyFunctions.isElementPalindrome(myArray);
			boolean actual =result[1] ;
			assertEquals(actual,true);




		}

		@Test
		public void testThatElementThatAreNotPalindromeAreSeenAsNotPalindrome(){
			String[] myArray = {"fathia", "madam", "tope"};
			boolean [] result = MyFunctions.isElementPalindrome(myArray);
			boolean actual =result[2] ;
			assertEquals(actual,false);




		}

		@Test
		public void testThatIsPerfectSuareReturnsAnArrayOfBoolean(){
			int[] myNumber = {6,5,9,3,4};
			boolean [] result = MyFunctions.isElementIsAPerfectNumber(myNumber);
			boolean actual =result[0] ;
			assertEquals(actual,false);




		}
		@Test
		public void testThatIsPerfectSuareReturnsFalseWhenItIsNotAPerFectSquare(){
			int[] myNumber = {6,5,9,3,4};
			boolean [] result = MyFunctions.isElementIsAPerfectNumber(myNumber);
			boolean actual =result[3] ;
			assertEquals(actual,false);




		}
		@Test
		public void testThatIsPerfectSuareReturnsTrueWhenItIsAPerFectSquare(){
			int[] myNumber = {6,5,9,3,4};
			boolean [] result = MyFunctions.isElementIsAPerfectNumber(myNumber);
			boolean actual =result[2] ;
			assertEquals(actual,true);



		}
		@Test
		public void testThatIsPerfectSuareReturnsTrueWhenItIsOne(){
			int[] myNumber = {1,5,9,3,4};
			boolean [] result = MyFunctions.isElementIsAPerfectNumber(myNumber);
			boolean actual =result[0] ;
			assertEquals(actual,true);




		}







}

