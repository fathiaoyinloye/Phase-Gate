import unittest
from checkout_system import *
class TestCheckOutSystem(unittest.TestCase):
	def test_that_prices_can_be_more_than_one(self):
		prices = [1, 2, 3, 4]
		actual = type(get_price(prices))
		self.assertEqual(actual,list )
	def test_that_prices_inputed_are_totaled_currently(self):
		prices = [1, 2, 3, 4]
		actual = total_price(prices)
		self.assertEqual(actual,10 )
	
	def test_that_prices_takes_floaty_point(self):
		prices = [1.4, 2.2, 3.2, 4.5]
		actual = total_price(prices)
		self.assertEqual(actual,11.3)
	


	def test_that_prices_vat_is_computed_fairly(self):
		prices = [1, 2, 3, 4.6]
		total = total_price(prices)
		actual = calculate_vat(total)
		self.assertEqual(actual,0.795 )
	


	def test_that_vat_is_added_to_total_price(self):
		prices = [1, 2, 3, 4.6]
		total = total_price(prices)
		vat = calculate_vat(total)
		actual = calculate_sum_after_vat(total, vat)
		self.assertEqual(actual,11.395 )

	
	
	def test_that_calculate_balance_subtract_payment_from_total_amount(self):
		actual = calculate_balance(67, 80)
		self.assertEqual(actual, 13)

