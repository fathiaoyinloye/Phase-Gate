const prompt = require('prompt-sync')();
let count = 0;
while (count < 2){
	let number = Number(prompt("Enter a number: "))
	let numberTwo = Number (prompt("Enter another number: "))
	let maximum = number
	if (numberTwo > number)
		maximum = numberTwo;
	let minimum = numberTwo
	if (number < numberTwo)
		minimum = number;
	let subtract = maximum - minimum
		let choice = Number(prompt("What is " + maximum + " minus  " + minimum + ": "))
	if(choice == subtract){
		console.log("Bravo!!! You did well");
		break;
	}
	else{
		if (count == 2)
			break;
		console.log("You can do it");
	}
	count += 1
	

}