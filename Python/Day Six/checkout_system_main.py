from checkout_system import *
names = []
prices = []
going = True
while(going):
	name = input("Enter product name: ")
	names.append(name)
	price = float(input("Enter product price: "))
	prices.append(price)
	choice = input("Enter done if that is all or anything to continue: ").lower()
	if(choice == "done"):
		total = total_price(prices)
		vat = calculate_vat(total)
		total_with_vat = calculate_sum_after_vat(total, vat)
		print(get_invoice(names, prices))
		payment_Amount = float(input("Enter Payment Amount: "))
		if (payment_Amount >= total_with_vat):
			print(get_receipt(names, prices, payment_Amount))
			break;

		while(payment_Amount < total_with_vat):
				print("Please enter Amount that is greater or equal to your Payment Amount")
				payment_Amount = float(input("Enter Payment Amount: "))
				if (payment_Amount >= total_with_vat):
					print(get_receipt(names, prices, payment_Amount))
					break;

		going = False;