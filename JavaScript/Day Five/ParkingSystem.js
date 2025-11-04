const prompt = require('prompt-sync')();

let slot = ["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"]
let taken_slot = []

function giveOutSpace(choice_to_leave){

	if (choice_to_leave != "1" && choice_to_leave != "2" && choice_to_leave != "3" && choice_to_leave != "4" && choice_to_leave != "5" && choice_to_leave != "6" && choice_to_leave != "7" && choice_to_leave != "8" && choice_to_leave != "9" && choice_to_leave != "10" && choice_to_leave != "11" && choice_to_leave != "12" && choice_to_leave != "13" && choice_to_leave != "14" && choice_to_leave != "15" && choice_to_leave != "16" && choice_to_leave != "17" && choice_to_leave != "18" && choice_to_leave != "19" && choice_to_leave != "20")
		return "Invalid Input, Our Parking Space only range from 1 - 20";
	for (const space of slot){
		if (space == choice_to_leave){
			index = slot.indexOf(choice_to_leave);
			slot.splice(index, choice_to_leave)
			taken_slot.push(choice_to_leave);
			return "Your can now park in spot " + choice_to_leave;
		}


	}
	
	return "The parking space have been taken, you can view available parking space";
		

}			

function veiwAvailableSpace(){
	
	return slot
}

function leaveParkingLot(choice_to_leave){
	if (choice_to_leave != "1" && choice_to_leave != "2" && choice_to_leave != "3" && choice_to_leave != "4" && choice_to_leave != "5" && choice_to_leave != "6" && choice_to_leave != "7" && choice_to_leave != "8" && choice_to_leave != "9" && choice_to_leave != "10" && choice_to_leave != "11" && choice_to_leave != "12" && choice_to_leave != "13" && choice_to_leave != "14" && choice_to_leave != "15" && choice_to_leave != "16" && choice_to_leave != "17" && choice_to_leave != "18" && choice_to_leave != "19" && choice_to_leave != "20")
		return "Invalid Input, Our Parking Space only range from 1 - 20";
	for (const space of taken_slot){
		if (space == choice_to_leave){

			index = taken_slot.indexOf(choice_to_leave);
			taken_slot.splice(index, choice_to_leave);
			slot.push(choice_to_leave);
			return "You can now leave the slot";
			}
		}
		return "You didn't park in the space chosen";	
		
	

	
}
	




function showMenu(){
	menu =`
*********************************************************
*	Welcome To Omotemmy Parking Lot			*
*********************************************************
*	Our Serices are					*
*	1 	->	Get A Parking Space		*
*	2	->	Leave Parking Space		*
*	3	-> 	Show Available Parking Space	*
*	4	->	Exit the app			*
*********************************************************
`
	return menu;
}

let going = true
while (going){
	console.log(showMenu())

	choiceEntered = prompt("Choose the service you want from above: ");
	switch (choiceEntered){
		case "1":{
			let park = prompt("Choose a parking space from 1 - 20: ");
			let response =  giveOutSpace(park);
			console.log(response);
			break;
			}
		
			

		case "2":{
			let leaveSlot = prompt("Please specify your slot number: ");
			let result = leaveParkingLot(leaveSlot);
			console.log(result);
			break;
			}
		case "3":{
			let slotAvailable = veiwAvailableSpace();
			if(slotAvailable.length == 0)
				console.log("There are no available space in the parking lot");
			else{
				console.log("The available space are")
				for( let space of slotAvailable){
					console.log(space)
				}
			}
			break;
			}
		case "4":{
			console.log("Thank you for using Omotemmy Parking Lot")
			going = false;
			break;
			}
		default: console.log("Invalid Input, please choose from the options above")

	}

}

