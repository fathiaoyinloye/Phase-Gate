import unittest
from parking_system_functions import *
class TestParkingSystem(unittest.TestCase):
	def test_that_a_parking_lot_exist(self):
		my_list = []
		actual = parking_lot(my_list)
		self.assertEqual(actual, my_list)
	
	def test_that_parking_lot_is_empty_at_first(self):
		my_list = []
		actual = len(parking_lot(my_list))
		self.assertEqual(actual,0)

	def test_that_you_can_only_choose_parking_lot_between_One_to_twenty(self):
		actual =give_out_space("g")
		self.assertEqual(actual,"Invalid Input, Our Parking Space only range from 1 - 20")

	def test_that_you_can__choose_from_available_parking_lot_between_One_to_twenty(self):
		actual =  give_out_space("1")
		self.assertEqual(actual, "Your parking_space is 1")

	def test_that_you_can__park_from_a_space_that_have_been_occupied(self):
		give_out_space("1")
		actual = give_out_space("1")
		expected = "The parking space have been taken, you can view available parking space"
		self.assertEqual(actual, expected)

	def test_that_you_cannot_leave_parking_lot_if_the_wrong_slot_is_inpouted(self):
		actual = leave_parking_lot("fgh")
		expected = "Invalid Input, Our Parking Space only range from 1 - 20"
		self.assertEqual(actual, expected)
