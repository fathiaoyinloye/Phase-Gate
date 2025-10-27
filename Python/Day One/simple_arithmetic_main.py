from simple_arithmetic_functions import *
from datetime import time

now = time()
print(show_menu())
count = 0
passes = 0
number_play = 10
while (number_play > 0):
	game = subtract_generated_numbers()
	while(count < 2):
		choice = input(f"What is {game[0]} - {game[1]} : ")
		if (choice == str(game[2])):
			print("Bravo! That's great")
			passes += 1
			number_play -= 1
			break;
		else:
			print("You can do it sweetheart, Try Again")
			if count == 1:
				number_play -= 1
				break;
		count += 1
print(f"Your Total score is {passes}")
print(f"The time in seconds used is {now} seconds")