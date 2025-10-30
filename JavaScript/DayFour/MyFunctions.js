function elementIsPalindrome(my_list){

let new_list = []
	for(let count = 0; count < my_list.length; count++){
		
			let palindrome = ""
		for (let counter = 0; counter < my_list[count].length; counter++){
			palindrome = my_list[count].charAt(counter) + palindrome
		}

		if (my_list[count] == palindrome){
		new_list[count] = true;
		}
		else{
		new_list[count] = false;
		}

	}
	return new_list


}


function elementIsAPerfectSquare(myNumber){

let isAPerFectSquare = []
for (let index = 0; index < myNumber.length; index++){
	let divisor = 2;
	while(myNumber[index] % divisor != 0){
		divisor++;

		}
	let numberInHalf = myNumber[index]/divisor;
		if(myNumber[index] == 1)
			isAPerFectSquare[index] = true;

		else if(myNumber[index] == numberInHalf * numberInHalf)
			isAPerFectSquare[index] = true;
		else

			isAPerFectSquare[index] = false;


		}
		
		return isAPerFectSquare;



	}


