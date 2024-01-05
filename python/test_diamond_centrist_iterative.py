"""
These test cases can be used to test-drive a solution to the diamond kata, in an interative manner.
The idea is that you iterate towards a full solution, each test cycle you are closer to a full solution 
than in the previous one. The thing with iterating is you may delete stuff that was there before,
or add stuff you know you will need to delete later.

When you have got a test to pass, you will 'recycle' it, ie hide/delete the previous one.
This is counter-intuitive for many people!

to run the tests, use 'py.test' - see http://pytest.org

Instructions:
1. Make the first test for Diamond A (which is failing) pass
2. change the 'ignore_' to 'test_' in the next test case. Make it pass too.
3. Uncomment the next line of the test case. Make it pass
4. When you've got a new test case passing, you may find
you need to COMMENT OUT A PREVIOUS TEST that now fails. 
This is expected. You are 'recycling' tests.
5. When all the 'DiamondX' test cases in this file are uncommented and passing, 
you should have a full working solution.

"""
import diamond

 
def test_DiamondA():
    assert diamond.Diamond('A').print_diamond() == "A"

def ignore_Diamond_with_only_spaces():
    assert diamond.Diamond('A').diamond() == [[" "]]
    # assert diamond.Diamond('B').diamond() == \
    #     [[" ", " ", " "],
    #      [" ", " ", " "],
    #      [" ", " ", " "]]
    # assert diamond.Diamond('C').diamond() == \
    #     [[" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "]]

def ignore_Diamond_with_center_marked_with_a_Z():
    assert diamond.Diamond('A').diamond() == [["Z"]]
    # assert diamond.Diamond('B').diamond() == \
    #     [[" ", " ", " "],
    #      [" ", "Z", " "],
    #      [" ", " ", " "]]
    # assert diamond.Diamond('C').diamond() == \
    #     [[" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", "Z", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "]]

def ignore_Diamond_with_1_0_coordinates_marked_with_a_Z():
    assert diamond.Diamond('A').diamond() == [[" "]]
    # assert diamond.Diamond('B').diamond() == \
    #     [[" ", " ", " "],
    #      [" ", " ", "Z"],
    #      [" ", " ", " "]]

def ignore_Diamond_with_0_1_coordinates_marked_with_a_Z():
    assert diamond.Diamond('B').diamond() == \
        [[" ", "Z", " "],
         [" ", " ", " "],
         [" ", " ", " "]]
    # assert diamond.Diamond('C').diamond() == \
    #     [[" ", " ", " ", " ", " "],
    #      [" ", " ", "Z", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "]]
     
def ignore_Diamond_with_minus2_1_coordinates_marked_with_a_Z():
    assert diamond.Diamond('C').diamond() == \
        [[" ", " ", " ", " ", " "],
         ["Z", " ", " ", " ", " "],
         [" ", " ", " ", " ", " "],
         [" ", " ", " ", " ", " "],
         [" ", " ", " ", " ", " "]]

def ignore_Diamond_plot_As():
    assert diamond.Diamond('B').diamond() == \
        [[" ", "A", " "],
         [" ", " ", " "],
         [" ", "A", " "]]
    # assert diamond.Diamond('C').diamond() == \
    #     [[" ", " ", "A", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", "A", " ", " "]]

def ignore_Diamond_plot_As_and_middle_letter():
    assert diamond.Diamond('B').diamond() == \
        [[" ", "A", " "],
         ["B", " ", "B"],
         [" ", "A", " "]]
    # assert diamond.Diamond('C').diamond() == \
    #     [[" ", " ", "A", " ", " "],
    #      [" ", " ", " ", " ", " "],
    #      ["C", " ", " ", " ", "C"],
    #      [" ", " ", " ", " ", " "],
    #      [" ", " ", "A", " ", " "]]
    # assert diamond.Diamond('D').diamond() == \
    #     [[" ", " ", " ", "A", " ", " ", " "],
    #      [" ", " ", " ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " ", " ", " "],
    #      ["D", " ", " ", " ", " ", " ", "D"],
    #      [" ", " ", " ", " ", " ", " ", " "],
    #      [" ", " ", " ", " ", " ", " ", " "],
    #      [" ", " ", " ", "A", " ", " ", " "]]

def ignore_DiamondB():
    assert diamond.Diamond('B').print_diamond() == " A\nB B\n A"
 
def ignore_Diamond_plot_other_letter():
    assert diamond.Diamond('C').diamond() == \
        [[" ", " ", "A", " ", " "],
         [" ", "B", " ", "B", " "],
         ["C", " ", " ", " ", "C"],
         [" ", "B", " ", "B", " "],
         [" ", " ", "A", " ", " "]]
    # assert diamond.Diamond('D').diamond() == \
    #     [[" ", " ", " ", "A", " ", " ", " "],
    #      [" ", " ", "B", " ", "B", " ", " "],
    #      [" ", "C", " ", " ", " ", "C", " "],
    #      ["D", " ", " ", " ", " ", " ", "D"],
    #      [" ", "C", " ", " ", " ", "C", " "],
    #      [" ", " ", "B", " ", "B", " ", " "],
    #      [" ", " ", " ", "A", " ", " ", " "]]

def ignore_DiamondC():
    assert diamond.Diamond('C').print_diamond() == """\
  A
 B B
C   C
 B B
  A"""

def ignore_DiamondD():
    assert diamond.Diamond('D').print_diamond() == """\
   A
  B B
 C   C
D     D
 C   C
  B B
   A"""
