import random

def generate_random_two_numbers():
	number_1 = random.randrange(20,51)
	number_2 = random.randrange(1,20)
	return (number_1, number_2)

def subtract_generated_numbers():
	result = generate_random_two_numbers()
	subtracted_result = result[0] - result[1]
	return (result[0], result[1], subtracted_result)


def show_menu():

	menu ="""
*********************************************************
*	Welcome Victorious Jewel!!!			*
*	Let  Solve Subtraction Arithmetic Problem	*
*	Your Writing Material With You			*
*	Get Ready For An Amazing Experince		*
*	Bring Out The Genius in You			*
*********************************************************
"""
	return menu
