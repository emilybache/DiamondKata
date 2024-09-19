"""
These test cases can be used to test-drive a solution to the diamond kata, in an incremental manner.

to run the tests, use 'py.test' - see http://pytest.org

Instructions:
Working from top to bottom, aim to get all the tests passing.
Uncomment one assertion at a time. When a whole test is passing, remove the skip marking on the next one.
The tests should all pass before you uncomment another line or unskip the next test.

For incremental development, it helps to have a good picture of where you're heading. This is a sketch of
the design you're heading towards - you may not end up exactly here but it gives you an idea:

    def print_diamond(self):
        result = ""
        for y in self.xy_coordinates(self.quadrant_dimension()):
            letter = self.letter_for_row(y)
            row = self.row_for_letter(letter)
            result += row + "\n"

        return result

"""
import pytest
from approvaltests import verify

from diamond import *

def test_letter_index():
    assert 0 == Diamond.letter_index("A")
    # assert 1 == Diamond.letter_index("B")
    # assert 2 == Diamond.letter_index("C")
    # assert 3 == Diamond.letter_index("D")
    # assert 4 == Diamond.letter_index("E")

@pytest.mark.skip
def test_quadrant_dimension():
    assert 0 == Diamond("A").quadrant_dimension()
    # assert 1 == Diamond("B").quadrant_dimension()
    # assert Diamond("D").quadrant_dimension() == Diamond("D").letter_index("D")
    # assert 2 == Diamond("C").quadrant_dimension()

@pytest.mark.skip
def test_xy_coordinates():
    assert [0] == list(Diamond("A").xy_coordinates())
    # assert [-1, 0, 1] == list(Diamond("B").xy_coordinates())
    # diamondD = Diamond("D")
    # assert list(diamondD.xy_coordinates())[-1] == diamondD.quadrant_dimension()
    # assert [-2, -1, 0, 1, 2] == list(Diamond("C").xy_coordinates())

@pytest.mark.skip
def test_letter_for_row():
    assert "A" == Diamond("A").letter_for_row(0)
    # assert "B" == Diamond("B").letter_for_row(0)
    # assert "C" == Diamond("C").letter_for_row(0)
    # assert "A" == Diamond("B").letter_for_row(1)
    # assert "A" == Diamond("B").letter_for_row(-1)
    # assert "A" == Diamond("C").letter_for_row(2)
    # diamond = Diamond("C")
    # assert ["A", "B", "C", "B", "A"] == [diamond.letter_for_row(y) for y in diamond.xy_coordinates()]

@pytest.mark.skip
def test_x_indices_for_letter():
    assert {0} == set(Diamond("A").x_indices_for_letter("A"))
    # assert {0} == set(Diamond("B").x_indices_for_letter("A"))
    # assert {-1, 1} == set(Diamond("B").x_indices_for_letter("B"))
    # assert {-1, 1} == set(Diamond("C").x_indices_for_letter("B"))
    # assert {-1, 1} == set(Diamond("D").x_indices_for_letter("B"))
    # assert {-2, 2} == set(Diamond("C").x_indices_for_letter("C"))
    # diamond = Diamond("C")
    # assert [" ", "B", " ", "B", " "] == ["B"
    #                                      if x in diamond.x_indices_for_letter("B")
    #                                      else " "
    #                                      for x in diamond.xy_coordinates()]

@pytest.mark.skip
def test_row_for_letter():
    assert "A" == Diamond("A").row_for_letter("A")
    # assert " A " == Diamond("B").row_for_letter("A")
    # assert "B B" == Diamond("B").row_for_letter("B")
    # assert " B B " == Diamond("C").row_for_letter("B")

@pytest.mark.skip
def test_print_diamond():
    verify(Diamond("D").print_diamond())
