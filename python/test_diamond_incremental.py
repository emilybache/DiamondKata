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
    assert Diamond("A").size() == 1
    # assert Diamond("B").size() == 3
    # assert Diamond("C").size() == 5
    # assert Diamond("D").size() == 7


def ignore_test_diamond_spaces():
    assert Diamond("A.diamond_spaces()") == [[" "]]
    # assert Diamond("B").diamond_spaces() ==
    #                              [[" ", " ", " "],
    #                               [" ", " ", " "],
    #                               [" ", " ", " "]]
    # assert Diamond("C").diamond_spaces() ==
    #                              [[" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " "]]
    # assert Diamond("D").diamond_spaces() ==
    #                              [[" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "],
    #                               [" ", " ", " ", " ", " ", " ", " "]]


def ignore_test_center_coordinate():
    assert (0, 0) == Diamond("A").center_coordinate()
    # assert (1, 1) == Diamond("B").center_coordinate()
    # assert (2, 2) == Diamond("C").center_coordinate()
    # assert (3, 3) == Diamond("D").center_coordinate()


def ignore_test_place_letter_center():
    assert [["Z"]] == Diamond("A").place_letter("Z", {(0,0)})
    # assert [[" ", " ", " "],
    #         [" ", "Z", " "],
    #         [" ", " ", " "]] ==
    #         Diamond("B").place_letter("Z", {(0,0)})
    # assert [[" ", " ", " ", " ", " "],
    #         [" ", " ", " ", " ", " "],
    #         [" ", " ", "Z", " ", " "],
    #         [" ", " ", " ", " ", " "],
    #         [" ", " ", " ", " ", " "]] ==
    #         Diamond("C").place_letter("Z", {(0,0)})

def ignore_test_place_letter_off_center():
    assert [["Z", " ", " "],
            [" ", " ", " "],
            [" ", " ", " "]] == Diamond("B").place_letter("A", {(-1, 1)})
    # assert [[" ", " ", " "],
    #         [" ", " ", " "],
    #         ["Z", " ", " "]] == Diamond("B").place_letter("A", {(-1, -1)})
    # assert [[" ", "Z", " "],
    #         [" ", " ", " "],
    #         [" ", "Z", " "]] == Diamond("B").place_letter("A", {(0, 1), (0, -1)})
    # assert [[" ", " ", " "],
    #         ["Z", " ", "Z"],
    #         [" ", " ", " "]] == Diamond("B").place_letter("A", {(-1, 0), (1, 0)})


def ignore_test_coordinates_of_A():
    assert {(0, 0)} == Diamond("A").coordinates("A")
    # assert {(0, 1), (0, -1)} == Diamond("B").coordinates("A")
    # assert {(0, 2), (0, -2)} == Diamond("C").coordinates("A")
    # assert {(0, 3), (0, -3)} == Diamond("D").coordinates("A")


def ignore_test_coordinates_middle_letter():
    assert {(0, 0)} == Diamond("A").coordinates("A")
    # assert {(-1, 0), (1, 0)} == Diamond("B").coordinates("B")
    # assert {(-2, 0), (2, 0)} == Diamond("C").coordinates("C")
    # assert {(-3, 0), (3, 0)} == Diamond("D").coordinates("D")


def ignore_test_coordinates_of_B():
    assert {(-1, 1), (-1, -1), (1, 1), (1, -1)} == Diamond("C").coordinates("B")
    # assert {(-1, 2), (-1, -2), (1, 2), (1, -2)} == Diamond("D").coordinates("B")
    # assert {} == Diamond("A").coordinates("B")


def ignore_test_coordinates_of_C():
    assert {(-2, 1), (-2, -1), (2, 1), (2, -1)} == Diamond("D").coordinates("C")
    # assert {} == Diamond("A").coordinates("C")


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
