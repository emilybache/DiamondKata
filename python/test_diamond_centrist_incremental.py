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

from diamond import *


def test_A_Diamond():
    assert "A\n" == Diamond("A").print_diamond()


def ignore_test_size():
    assert size("A") == 1
    # assert size("B") == 3
    # assert size("C") == 5
    # assert size("D") == 7


def ignore_test_diamond_spaces():
    assert diamond_spaces("A") == [[" "]]
    # assert diamond_spaces("B") == [[" ", " ", " "],
    #                               [" ", " ", " "],
    #                               [" ", " ", " "]]
    # assert diamond_spaces("C") == [[" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "]]
    # assert diamond_spaces("D") == [[" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "]]


def ignore_test_center_coordinate():
    assert (0, 0) == center_coordinate("A")
    # assert (1, 1) == center_coordinate("B")
    # assert (2, 2) == center_coordinate("C")
    # assert (3, 3) == center_coordinate("D")


def ignore_test_place_letter_center():
    assert [["A"]] == place_letter("A", {(0, 0)}, middle_letter="A", spaces=diamond_spaces("A"))
    # assert [[" ", " ", " "],
    #         [" ", "A", " "],
    #         [" ", " ", " "]] == place_letter("A", {(0, 0)}, middle_letter="B", spaces=diamond_spaces("B"))
    # assert [[" ", " ", " ", " ", " "],
    #         [" ", " ", " ", " ", " "],
    #         [" ", " ", "A", " ", " "],
    #         [" ", " ", " ", " ", " "],
    #         [" ", " ", " ", " ", " "]] == place_letter("A", {(0, 0)}, middle_letter="C", spaces=diamond_spaces("C"))


def ignore_test_place_letter_off_center():
    assert [["A", " ", " "],
            [" ", " ", " "],
            [" ", " ", " "]] == place_letter("A", {(-1, 1)}, middle_letter="B", spaces=diamond_spaces("B"))
    # assert [[" ", " ", " "],
    #         [" ", " ", " "],
    #         ["A", " ", " "]] == place_letter("A", {(-1, -1)}, middle_letter="B", spaces=diamond_spaces("B"))
    # assert [[" ", "A", " "],
    #         [" ", " ", " "],
    #         [" ", "A", " "]] == place_letter("A", {(0, 1), (0, -1)}, middle_letter="B", spaces=diamond_spaces("B"))
    # assert [[" ", " ", " "],
    #         ["A", " ", "A"],
    #         [" ", " ", " "]] == place_letter("A", {(-1, 0), (1, 0)}, middle_letter="B", spaces=diamond_spaces("B"))


def ignore_test_coordinates_of_A():
    assert {(0, 0)} == coordinates("A", middle_letter="A")
    # assert {(0, 1), (0, -1)} == coordinates("A", middle_letter="B")
    # assert {(0, 2), (0, -2)} == coordinates("A", middle_letter="C")
    # assert {(0, 3), (0, -3)} == coordinates("A", middle_letter="D")


def ignore_test_coordinates_middle_letter():
    assert {(0, 0)} == coordinates("A", middle_letter="A")
    # assert {(-1, 0), (1, 0)} == coordinates("B", middle_letter="B")
    # assert {(-2, 0), (2, 0)} == coordinates("C", middle_letter="C")
    # assert {(-3, 0), (3, 0)} == coordinates("D", middle_letter="D")


def ignore_test_coordinates_of_B():
    assert {(-1, 1), (-1, -1), (1, 1), (1, -1)} == coordinates("B", middle_letter="C")
    # assert {(-1, 2), (-1, -2), (1, 2), (1, -2)} == coordinates("B", middle_letter="D")
    # assert {} == coordinates("B", middle_letter="A")


def ignore_test_coordinates_of_C():
    assert {(-2, 1), (-2, -1), (2, 1), (2, -1)} == coordinates("C", middle_letter="D")
    # assert {} == coordinates("C", middle_letter="A")


def ignore_DiamondC():
    assert Diamond('C').print_diamond() == """\
  A
 B B
C   C
 B B
  A"""


def ignore_DiamondD():
    assert Diamond('D').print_diamond() == """\
   A
  B B
 C   C
D     D
 C   C
  B B
   A"""
