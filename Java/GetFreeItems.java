public class GetFreeItems{

	public static int getTotalPrice(int numberOfItems){
		int price = 50000;
		int totalPrice = 50000 * numberOfItems;
		if(numberOfItems < 1)
			totalPrice = 0;
	
		return totalPrice;

	}

	public static int getDepreciationValue(int numberOfItems){
		int totalPrice = getTotalPrice(numberOfItems);
		int depreciation = totalPrice * 8/100;
		return depreciation;

	}

	public static int getNumberOfYearsToGetFree(int numberOfItems){
		int totalPrice = getTotalPrice(numberOfItems);
		int depreciation = getDepreciationValue(numberOfItems);
		int numberOfYearsToBeFree = 0;
		for(; totalPrice > 0; numberOfYearsToBeFree++){
			if(totalPrice < depreciation){
				numberOfYearsToBeFree += 1;
				break;
			}

			totalPrice = totalPrice - depreciation;

		}
		return numberOfYearsToBeFree;

	}

	public static String giveResponseToTheBuyer(int numberOfItems){
		int numberOfYearsToBeFree = getNumberOfYearsToGetFree(numberOfItems);
		String output = "It will take " + numberOfYearsToBeFree + "years to  get the item for free";
		return output;

	}





}