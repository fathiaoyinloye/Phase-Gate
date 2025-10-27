import unittest
from simple_arithmetic_functions import *
class TestSimpleArithmetic(unittest.TestCase):
	def test_that__two_numbers_is_randomly_generated(self):
		actual = type (generate_random_two_numbers())
		expected = tuple
		self.assertEqual(actual,expected)

	def test_that_same_number_are_not_generated_twice(self):
		actual = generate_random_two_numbers()
		expected = actual[0] != actual[1]
		self.assertTrue(actual,expected)

	def test_that_two_numbers_generated_are_subtracted(self):
		number_result = subtract_generated_numbers()
		actual = number_result[2]
		expected = number_result[0] - number_result[1]
		self.assertTrue(actual, expected)