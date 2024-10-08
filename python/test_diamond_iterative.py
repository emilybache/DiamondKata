"""
These test cases can be used to test-drive a solution to the diamond kata, in an iterative manner.
The idea is that you iterate towards a full solution, each test cycle you are closer to a full solution 
than in the previous one. The thing with iterating is you may delete stuff that was there before,
or add stuff you know you will need to delete later.

Instructions:
* Run the test and look at the output you receive (the '.received.' file)
* Approve the output (rename to '.approved.') if it's closer to what you want than what you had before.
* Repeat until output matches problem description.

The files named '.iteration1.' etc are there as a guide to head towards.
The file named '.iteration6.' matches the problem description.
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
