def elementIsAPerfectSquare(myNumber):

	isAPerFectSquare = myNumber
	count = 0
	for number in myNumber:
		divisor = 2;
		while(number % divisor != 0):
			divisor += 1
			if (number % divisor) == 0:
				break
		
		numberInHalf = number/divisor;
		if(number == 1):
			isAPerFectSquare[count] = True;

		elif(number == numberInHalf * numberInHalf):
			isAPerFectSquare[count] = True;
		else:

			isAPerFectSquare[count] = False;

		count += 1
		
		
	return isAPerFectSquare;

my_list = [7,2,3,4]
print(elementIsAPerfectSquare(my_list))