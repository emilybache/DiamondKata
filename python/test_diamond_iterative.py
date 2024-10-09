"""
These test cases can be used to test-drive a solution to the diamond kata, in an iterative manner.
There are more detailed instructions in the top level README in this repo ../README.md
"""
from approvaltests import verify

import diamond

def test_diamonds():
    result = f"""\
Diamond A:
{diamond.Diamond('A').print_diamond()}

Diamond B:
{diamond.Diamond('B').print_diamond()}

Diamond C:
{diamond.Diamond('C').print_diamond()}

Diamond D:
{diamond.Diamond('D').print_diamond()}
"""
    verify(result)
