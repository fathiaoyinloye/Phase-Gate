from parking_system_functions import *
going = True
while going:
	print(show_menu())

	choice_entered = input("Choose the service you want from above: ")
	match choice_entered:
		case "1": 
			park = input("Choose a parking space from 1 - 20: ")
			response = give_out_space(park)
			print(response)
		
			

		case "2":
			leave_slot = input("Please specify your slot number: ")
			result = leave_parking_lot(leave_slot)
			print(result)
		case "3":
			slot_available = veiw_available_space()
			print("The available space are")
			for slot in slot_available:
				print(slot, end = " ")
		case "4":
			print("Thank you for using Omotemmy Parking Lot")
			going = False
		case _: print("Invalid Input, please choose from the options above")