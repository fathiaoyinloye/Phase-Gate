const prompt = require('prompt-sync')();
function totalPrice(prices){
	let sum = 0;
	for(let price of prices){
		sum += price
	}
	return sum;
}

function calculateVat(sum){
	let vat = (sum * 7.5)/100;
	return vat;
}
	
function calculateSumAfterVat(sum, vat){
	total_price = sum + vat;
	return total_price;

}
function calculateBalance(total, paid){
	grandTotal = paid - total
	return grandTotal

}


function getInvoice(names, prices){
	total = totalPrice(prices)
	vat = calculateVat(total)
	totalPlusVat = calculateSumAfterVat(total, vat)
	count = 0
	console.log(">>>>>>>>>>>>>>>>> Invoice<<<<<<<<<<<<<<<<<<<")
	for (let price of prices){
		console.log(names[count] + "		" + prices[count])
		count += 1
	}
	console.log("Subtotal is 	" + total)
	console.log("VAT (7.5%)	 "+ vat)
	console.log("Payment Amount 	" + totalPlusVat )
	console.log(">>>>>>>>>>>>>>>>> Invoice<<<<<<<<<<<<<<<<<<<")

	return "Please Pay Payment Amount"

}

function getReceipt(names, prices, paid){
	total = totalPrice(prices)
	vat = calculateVat(total)
	total_plus_vat = calculateSumAfterVat(total, vat)
	balance = calculateBalance(total_plus_vat, paid)
	count = 0
	console.log(">>>>>>>>>>>>>>>>> Reciept<<<<<<<<<<<<<<<<<<<")
	for (let price of prices){
		console.log(names[count] + "		" + prices[count])
		count += 1
	}
	console.log("Total Paid	 "+  paid)
	console.log("Grand Total 	" + total_plus_vat )
	console.log("Balance		" + balance)
	console.log(">>>>>>>>>>>>>>>>> Reciept<<<<<<<<<<<<<<<<<<<")

	return "Payment successful! Thank You For Shopping"
}







let names = []
let prices = []
going = true
while(going){
	let name = prompt("Enter product name: ")
	names.push(name)
	let price = Number(prompt("Enter product price: "))
	prices.push(price)
	choice = prompt("Enter done if that is all or anything to continue: ").toLowerCase()
	if(choice == "done"){
		total = totalPrice(prices)
		vat = calculateVat(total)
		total_with_vat = calculateSumAfterVat(total, vat)
		console.log(getInvoice(names, prices))
		payment_Amount = Number(prompt("Enter Payment Amount: "))
		if (payment_Amount >= total_with_vat){
			console.log(getReceipt(names, prices, payment_Amount))
			break;
		}
	

		while(payment_Amount < total_with_vat){
				console.log("Please enter Amount that is greater or equal to your Payment Amount")
				payment_Amount = Number(prompt("Enter Payment Amount: "))
				if (payment_Amount >= total_with_vat){
					console.log(getReceipt(names, prices, payment_Amount))
					break;
				}
			}

		going = false;
		}
}