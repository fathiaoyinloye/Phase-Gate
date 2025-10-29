const prompt = require('prompt-sync')();


function generateAndSubtractRandomNumbers(){
	let index = Math.floor(Math.random() * 13)

	let myList = [
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
		let questions = myList[index]
	return questions;

}


function showMenu(){

	let menu =`
*********************************************************
*		OMOTEMMY QUIZ GAME			*				
*********************************************************
*	Welcome Victorious Jewel!!!			*
*	Let  Get On A Merry Go Round Of Questions	*
*	Fasten Your SeatBelt				*
*	It's gonna be an amazing ride			*
*********************************************************
`
	return menu
}

function showOptions(){

	options =`
*********************************************************
*	Choose from the following options		*				
*********************************************************
*	1  	->	Go for the quiz			*
*	2	->	Nay, No Quiz			*
*********************************************************
`
	return options
}


let score = 0;
let trial = 0;
console.log(showMenu());
let keepGoing = "0";

while(keepGoing == "0"){
	console.log(showOptions());
	option = prompt("Choose from the option above: ");
	switch(option){
	case "1": {
		let questions = generateAndSubtractRandomNumbers();
		let answer = questions[2];
		console.log(questions[0]);
		console.log(questions[1]);

		choice = prompt("Choose your answer from the above option lettered (a - b): ");
		if (choice == answer){
			score += 1;
			trial += 1;
			console.log("Correct!!! You Are Genius Indeed");
		}
		else{
			trial += 1;
			console.log("You Can Always Do Better Sweetheart");
		}
		break
	}

	case  "2":{
		if (trial == 0){
			console.log("You are a coward, you didnt even get to enjoy the Merry-Go Round");}
				else{
					console.log("You scored " + score + " out of " + trial);
					keepGoing = "-1"
				}
			break;
			}
	default: {console.log("Invalid Input, Please Choose From The Above Menu")}	
	
		}

	}

