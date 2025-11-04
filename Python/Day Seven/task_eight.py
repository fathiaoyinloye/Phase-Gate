numberOne = 4;
numberTwo = 8;

sum_of_multiples_of_four = 0;
sum_of_multiples_of_eight = 0;

for num in range(1, 6):
	sum_of_multiples_of_four = sum_of_multiples_of_four + numberOne
	sum_of_multiples_of_eight = sum_of_multiples_of_eight + numberTwo

	

	numberOne = numberOne * 4;
	numberTwo = numberTwo * 8;
print(sum_of_multiples_of_four + sum_of_multiples_of_eight )