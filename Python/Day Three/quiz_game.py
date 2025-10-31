from quiz_game_functions import *

score = 0
trial = 0
print(show_menu())
keep_going = True
while(keep_going):
	print(show_options())
	option = input("choose from the option above: ")
	match(option):
		case "1": 
			questions = show_questions()
			answer = questions[2]
			print(questions[0])
			print(questions[1])

			choice = input("Choose your answer from the above option lettered (a - b): ")
			if choice == answer:
				score += 1
				trial += 1
				print("Correct!!! You Are Genius Indeed")
			else:
				trial += 1
				print("You Can Always Do Better Sweetheart")

		case  "2":
			if trial == 0:
				print("You are a coward, you didnt even get to enjoy the Merry-Go Round")
			else:
				print(f"You scored {score} out of {trial}!")
			keep_going = False
		case _: print("Invalid Input, Please Choose From The Above Menu")