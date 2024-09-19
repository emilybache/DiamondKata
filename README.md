Diamond Kata
============

This project contains sourcefiles and a skeleton for a solution to the [Diamond Kata](https://sammancoaching.org/kata_descriptions/diamond.html). You can of course just code
this kata from scratch in any way you wish. This repo will help you to explore two different approaches to the
problem - an iterative approach, where you continually revisit the same test case, (test recycling) and an incremental approach, where you drive the implementation from a series of tests for smaller pieces.

For more discussion of 'test recycling' see Seb Rose's [blog post](http://claysnow.co.uk/recycling-tests-in-tdd/)


How to use the code in this repo
--------------------------------

* For an 'incremental' approach, test drive your implementation using 'DiamondIncrementalTest' or 'DiamondIncrementalSpec'.
* For an 'iterative' approach, test drive your implementation using 'DiamondIterativeTest' or 'DiamondIterativeSpec'.

I suggest you try the kata both ways. In a Coding Dojo, you could have half the group do it one way while the other
half does it the other way, then swap. Suggested questions for the retrospective when you compare the approaches:

* Do the tests lead you to solve the problem in small steps?
* How easy is it to pinpoint what is wrong when you make a mistake?
* How easy is it to refactor the implementation?
* The incremental tests define several public methods on Diamond. Should they be public? What would happen if they weren't?
* Which approach (iterative or incremental) should you use when doing TDD in general?