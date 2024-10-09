Diamond Kata
============

This project contains sourcefiles and a skeleton for a solution to the [Diamond Kata](https://sammancoaching.org/kata_descriptions/diamond.html). You can of course just code
this kata from scratch in any way you wish. This repo will help you to explore two different approaches to the
problem - an iterative approach, where you continually revisit the same test case, (test recycling) and an incremental approach, where you drive the implementation from a series of tests for smaller pieces.

For more discussion of 'test recycling' see Seb Rose's [blog post](http://claysnow.co.uk/recycling-tests-in-tdd/)


How to use the code in this repo
--------------------------------

I suggest you try the kata both iteratively and incrementally on different occasions. There is more information below on the details of how to use the Iterative and Incremental tests respectively. 

In a Coding Dojo, you could have half the group do it one way while the other half does it the other way, then compare notes. Suggested questions for the retrospective when you compare the approaches:

* Do the tests lead you to solve the problem in small steps?
* How easy is it to pinpoint what is wrong when you make a mistake?
* How easy is it to refactor the implementation?
* The incremental tests define several public methods on Diamond. Should they be public? What would happen if they weren't?
* Which approach (iterative or incremental) should you use when doing TDD in general?

Instructions for the Iterative approach
----------------------------------------

The idea is that you iterate towards a full solution, each test cycle you are closer to a full solution than in the previous one. The thing with iterating is you may delete stuff that was there before, or add stuff you know you will need to delete later.

Instructions:
* Run the test and look at the output you receive (the '.received.' file)
* Approve the output (rename to '.approved.') if it's closer to what you want than what you had before. Compare with the 'iteration*.txt' files in this folder
* Repeat until output matches problem description.

The files named 'iteration1.txt' etc are there as a guide to head towards in each iteration.
The file named 'iteration6.txt' matches the problem description.

Instructions for the Incremental approach
-----------------------------------------

Working from top to bottom, aim to get all the tests passing.
Uncomment one assertion at a time. When a whole test is passing, enable the next one. The tests should all pass before you uncomment another line or enable the next test.

For incremental development, it helps to have a good picture of where you're heading. This is a sketch of
the design you're heading towards in python - you will probably not end up exactly here but it gives you an idea:

    def print_diamond(self):
        result = ""
        for y in self.xy_coordinates(self.quadrant_dimension()):
            letter = self.letter_for_row(y)
            row = self.row_for_letter(letter)
            result += row + "\n"

        return result


