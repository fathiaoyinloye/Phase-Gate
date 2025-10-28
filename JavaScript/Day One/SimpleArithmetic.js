const prompt = require('prompt-sync')();
const dateTime = new Date();


function generateAndSubtractRandomNumbers(){
	let numberOne = Math.floor(Math.random() * 31) + 20
	let numberTwo = Math.floor(Math.random() * 21) 
	let subtract = numberOne - numberTwo;
	let result = [numberOne, numberTwo, subtract];

	return result;


	}
function showMenu(){

	let menu =`
*********************************************************
*	Welcome Victorious Jewel!!!			*
*	Let  Solve Subtraction Arithmetic Problem	*
*	Your Writing Material With You			*
*	Get Ready For An Amazing Experince		*
*	Bring Out The Genius in You			*
*********************************************************
`;
	return menu;
	
	}		

const secondsBegins = dateTime.getSeconds()
console.log(showMenu());
let passes = 0;
let numberPlay = 10;
while (numberPlay > 0){
	let count = 0;
	let game = generateAndSubtractRandomNumbers();
		while(count < 2){
			choice = prompt("What is " + game[0] + " - " + game[1] + ": ");
				if (Number(choice) == game[2]){
					console.log("Bravo! That's great");
					passes += 1;
					numberPlay -= 1;
					break;
				}
				else{
					if (count == 1){
					console.log("You have exhasted your last trial");
						break;
						
					}
					console.log("You can do it sweetheart, Try Again");
					numberPlay -= 1;
					
			
			count += 1;
			}

		}


}

const endindDateTime = new Date();
const secondsEnds = endindDateTime.getSeconds()

let secondsUsed = secondsEnds - secondsBegins

console.log("Your Total score is: "+ passes +"/10");
console.log("Your Total time spent on answering the question  is: "+ secondsUsed +"seconds");




