from quiz_game_functions import *

score = 0
print(show_menu())
trial = int(input("Choose from  1 - 10 the number of questions you want to answer"))

count = 0
if trial == 0:
	print("You are a coward, you didnt even get to enjoy the Merry-Go Round")

while(trial > 0):
	questions = show_questions()
	answer = questions[2]
	print(questions[0])
	print(questions[1])

	choice = input("Choose your answer from the above option lettered (a - b): ")
	if choice == answer:
		score += 1
		trial -= 1
		count += 1
		print("Correct!!! You Are Genius Indeed")
		print(f"You scored {score} and your number of trial is  {count} you have {trial} more to go")

	else:
		count += 1
		trial -= 1
		print("You Can Always Do Better Sweetheart")
		print(f"You scored {score} and your number of trial is  {count} you have {trial} more to go")