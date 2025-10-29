

def changeCharacterPosition(letters, single_letter):
	for letter in letters:
		if single_letter != letter:
			new_word = letters 
		
	count = 0
	for letter in letters:
		if letter == single_letter:
			break
		count += 1
		new_word = letters[-count-1::-1] + letters[count+ 1:]
	return new_word

print(changeCharacterPosition("abcdefd" ,"d"))

#abcdefd
#dcbaefd