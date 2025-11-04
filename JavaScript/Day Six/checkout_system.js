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
	return paid - total
}