import  unittest
from score_grade import *
class TestScoreGrade(unittest.TestCase):
	def test_that_you_can_save_total_number_of_subject_and_grade(self):
		actual = collectNoOfStudentAndSubject(4,5)
		expected = (4,5)
		self.assertEqual(actual, expected)

	def test_that_a_new_list_that_all_value_is_zero_is_created(self):
		actual = collect_no_of_student_space(3)
		expected = [0,0,0]
		self.assertEqual(actual,expected)

	def test_that_you_can_calculate_total_of__each_student_scores(self):
		scores = [1,2,3]
		actual = calculate_sum_of_scores(scores)
		self.assertEqual(actual, 6)

	def test_that_you_can_calculate_total_of__all_student_scores(self):
		scores = [[1,2,3],[2,34,2],[1,5,6]]
		actual = calculateSumOfInnerList(scores)
		expected = [6,38,12]
		self.assertEqual(actual,expected)

	def test_that_you_can_calculate_average_of__each_student_scores(self):
		scores = [1,2,3]
		actual = calculateAverage(scores)
		self.assertEqual(actual, 2)

	def test_that_you_can_calculate_average_of__all_student_scores(self):
		scores = [[1,2,3],[2,4,2,4],[1,5,6]]
		actual = calculateAverageOfInnerList(scores)
		expected = [2.0,3.0,4.0]
		self.assertEqual(actual,expected)
	
	