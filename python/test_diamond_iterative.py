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
from approvaltests import verify

import diamond

# instructions - get this output to look like the file named iteration1 then iteration2 etc
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
