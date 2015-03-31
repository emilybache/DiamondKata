"""
These test cases can be used to test-drive a solution to the diamond kata, in an incremental manner.

to run the tests, use 'py.test' - see http://pytest.org

Instructions:
1. Make the first test case for Diamond A pass
2. change the 'ignore_' to 'test_' for the next test case. Make it pass.
3. Uncomment the next line of the test case. Make it pass
4. When all the lines of code in the test case are passing, continue to the next test case.
5. When all the test cases in this file are uncommented and passing, you should have a full working solution.
""" 

import diamond

def test_diamondA_has_one_line_containing_a():
	assert diamond.Diamond('A').print_diamond() == "A"

def ignore_letter_sequence_is_list_of_letters_on_each_line_of_the_diamond():
	assert diamond.Diamond('A').letter_sequence == ['A']
    #assert diamond.Diamond('B').letter_sequence == ['A', 'B', 'A']
    #assert diamond.Diamond('C').letter_sequence == ['A', 'B', 'C', 'B', 'A']
    #assert diamond.Diamond('D').letter_sequence == ['A', 'B', 'C', 'D', 'C', 'B', 'A']

def ignore_indents_is_list_of_indentation_for_each_line_of_the_diamond():
	assert diamond.Diamond('A').indents == [0]
	#assert diamond.Diamond('B').indents == [1,0,1]
	#assert diamond.Diamond('C').indents == [2,1,0,1,2]
	#assert diamond.Diamond('D').indents == [3,2,1,0,1,2,3]

def ignore_between_is_list_of_how_many_middle_spaces_between_the_repeated_letter_for_each_line_of_the_diamond():
	assert diamond.Diamond('A').between == [0]
	#assert diamond.Diamond('B').between == [0,1,0]
	#assert diamond.Diamond('C').between == [0,1,3,1,0]
	#assert diamond.Diamond('D').between == [0,1,3,5,3,1,0]

def ignore_one_row_is_a_list_representing_one_diamond_row():
	assert diamond.Diamond('A').one_row('A', indent=0, between=0) == "A"
	#assert diamond.Diamond('B').one_row('A', indent=1, between=0) == " A"
	#assert diamond.Diamond('B').one_row('B', indent=0, between=1) == "B B"
	#assert diamond.Diamond('D').one_row('C', indent=1, between=3) == " C   C"

def ignore_rows_is_a_list_of_all_diamond_rows():
	assert diamond.Diamond('A').rows() == ["A"]
	#assert diamond.Diamond('B').rows() == [" A", "B B", " A"]

def ignore_DiamondC_prints_correctly():
	assert diamond.Diamond('C').print_diamond() == """\
  A
 B B
C   C
 B B
  A"""

def ignore_DiamondD_is_correct():
	assert diamond.Diamond('D').print_diamond() == """\
   A
  B B
 C   C
D     D
 C   C
  B B
   A"""
