let myString = "fola"
palindrome = ""
	for (let count = 0; count < myString.length; count++){
		palindrome = myString.charAt(count) + palindrome
	}
console.log(palindrome)
function isPalindrome(myString){
	palindrome = ""
		for (let count = 0; count < myString.length; count++){
			palindrome = myString.charAt(count) + palindrome
		}

	if (myString == palindrome)
		return true;
	else
		return false;



}


let my_list = ["fathia", "madam", "12321"]
let new_list = []
	for(let count = 0; count < my_list.length; count++){
		
	palindrome = ""
		for (let counter = 0; count < my_list[count].length; counter++){
			palindrome = my_list[count].charAt(counter) + palindrome
		}

		if (my_list[count] == palindrome){
		new_list[count] = true;
		}
		else{
		new_list[count](false);
		}

	}
console.log(new_list[0])
