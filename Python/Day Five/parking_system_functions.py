slot = ["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"]
taken_slot = []

def parking_lot(my_parking_lot):
	if(len(my_parking_lot) >= 20):
		return "Omotemmy Parking Lot is currently occupied"

	return my_parking_lot

def give_out_space(choice):
	
	if choice != "1" and choice != "2" and choice != "3" and choice != "4" and choice != "5" and choice != "6"and choice != "7"and choice != "8" and choice != "9" and choice != "10" and choice != "11" and choice != "12" and choice != "13" and choice != "14" and choice != "15" and choice != "16" and choice != "17" and choice != "18" and choice != "19" and choice != "20":
		return "Invalid Input, Our Parking Space only range from 1 - 20"
	if choice in slot:
		slot.remove(choice) 
		taken_slot.append(choice)
		return f"Your parking_space is {choice}"


	return "The parking space have been taken, you can view available parking space"

			

def veiw_available_space():
	if len(slot) == 0:
		return "There is currently no available slot you can come back later"

	return slot

def leave_parking_lot(choice_to_leave):

	if choice_to_leave != "1" and choice_to_leave != "2" and choice_to_leave != "3" and choice_to_leave != "4" and choice_to_leave != "5" and choice_to_leave != "6" and choice_to_leave != "7" and choice_to_leave != "8" and choice_to_leave != "9" and choice_to_leave != "10" and choice_to_leave != "11" and choice_to_leave != "12" and choice_to_leave != "13" and choice_to_leave != "14" and choice_to_leave != "15" and choice_to_leave != "16" and choice_to_leave != "17" and choice_to_leave != "18" and choice_to_leave != "19" and choice_to_leave != "20":
		return "Invalid Input, Our Parking Space only range from 1 - 20"

	if choice_to_leave in taken_slot:
		taken_slot.remove(choice_to_leave)
		slot.append(choice_to_leave)
		return "You can now leave the slot"

	return f"{choice_to_leave} was never taken"
	




def show_menu():
	menu ="""
*********************************************************
*	Welcome To Omotemmy Parking Lot			*
*********************************************************
*	Our Serices are					*
*	1 	->	Get A Parking Space		*
*	2	->	Leave Parking Space		*
*	3	-> 	Show Available Parking Space	*
*	4	->	Exit the app			*
*********************************************************
"""
	return menu
