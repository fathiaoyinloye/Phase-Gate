import random 

my_list = [
["What is the capital of Nigeria","(a) Lagos (b) Abuja (c) Ikeja" ,"b"],

["____ is the recording of transactions on a daily basis in the appropriate book", "(a) book-keeping (b)transaction log (c) keeping", "a"],

["_____ is process of recording, classifying, and interpreting the financial data of an organization to enable users make decisions","(a) user guide (b)transaction log (c) Accounting ", "c"],
["How many Geo-political zone do we have in Nigeria","(a) 2 (b)4 (c) 3", "b"],
["Like two peas in a pod means that","(a) very similar (b)little similarities (c) No similarities", "a"],
["The brother of your father is your _____","(a) maga (b)uncle (c)brother ", "c"],
["The sister of your mother is your _____","(a) aunty (b)shima (c) sister", "a"],
["___ can be seen as a crochet maaterial","(a) pen (b)cotton (c) yarn", "c"],
["I can eat millions of this is what figure of speech","(a) hyperbole (b)irony (c) metaphor", "a"],
["___ can be seen as a crochet tool","(a) knife (b)cotton (c) Stich maker", "c"],
["He is as dirty as a pig is what figure of speech","(a) hyperbole (b)simile (c) metaphor", "b"],
["He a pig is what figure of speech","(a) hyperbole (b)simile (c) metaphor", "c"]



]


def show_questions():
	random.shuffle(my_list)
	questions = random.choice(my_list)

	return questions


def show_menu():

	menu ="""
*********************************************************
*		OMOTEMMY QUIZ GAME			*				
*********************************************************
*	Welcome Victorious Jewel!!!			*
*	Let  Get On A Merry Go Round Of Questions	*
*	Fasten Your SeatBelt				*
*	It's gonna be an amazing ride			*
*********************************************************
"""
	return menu


def show_options():

	options ="""
*********************************************************
*	Choose from the following options		*				
*********************************************************
*	1  	->	Go for the quiz			*
*	2	->	Nay, No Quiz			*
*********************************************************
"""
	return options




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