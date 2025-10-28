from simple_arithmetic_functions import *
from time import time

begining_time = time()
print(show_menu())
passes = 0
number_play = 10
while (number_play > 0):
	count = 0
	game = subtract_generated_numbers()
	while(count < 2):
		choice = input(f"What is {game[0]} - {game[1]} : ")
		if (choice == str(game[2])):
			print("Bravo! That's great")
			passes += 1
			number_play -= 1
			break;
		else:
			if count == 1:
				print("You've exhausted your last trial")
				number_play -= 1
				break;	
			print("You can do it sweetheart, Try Again")
			
		count += 1
ending_time = time()
time_used = (ending_time - begining_time)
print(f"Your Total score is {passes}/10")
print(f"The time in seconds used is {time_used: .3} seconds")