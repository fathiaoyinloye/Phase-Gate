const prompt = require('prompt-sync')();
let count = 0;
let numberOfTime = 0
let score = 0

while (numberOfTime < 10){
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
			score += 1
			console.log("Bravo!!! You did well");
			break;
		}
		else{
		let fail = 1
		while(fail != 2){
			let choice = Number(prompt("What is " + maximum + " minus  " + minimum + ": "))
			fail += 1
			console.log("You can do it");
			}
			numberOfTime += 1
			continue;
			if (numberOfTime == 10)
			break;
		}
		count += 1
	

	}
	numberOfTime += 1
}
console.log("Your score is: " + score)