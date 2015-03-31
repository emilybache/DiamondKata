package dojo

import org.scalatest._

/**
 * These test cases can be used to test-drive a solution to the diamond kata, in an interative manner.
 * Enable only one test case for "Diamond A", one for "Diamond B" and one for "Diamond C" at any one time.
 * The idea is that you iterate towards a full solution.
 *
 * Instructions:
 * 1. Make the first test for Diamond A (which is failing) pass
 * 2. change the 'ignore' to 'in' in the next test case. Make it pass too.
 * 3. change the 'in' back to 'ignore' in that test case, and instead use the following test case
 * 4. keep doing this until you have exactly one test case for each diamond, and you've got to the end of the file.
 * At that point you should have a working implementation.
 */
class DiamondIterativeSpec extends FlatSpec with Matchers {

  "Diamond A" should "have one line containing A" in {
    Diamond.print('A') should be ("A")
  }

  "Diamond B" should "print a char sequence for the top half" ignore {
    Diamond.print('B') should be ("AB")
  }

  "Diamond B" should "print a char sequence for the top and bottom halves" ignore {
    Diamond.print('B') should be ("ABA")
  }

  "Diamond C" should "print a char sequence for the top and bottom halves" ignore {
    Diamond.print('C') should be ("ABCBA")
  }

  "Diamond B" should "have newlines" ignore {
    Diamond.print('B') should be ("A\nB\nA")
  }

  "Diamond B" should "indent first and last rows" ignore {
    Diamond.print('B') should be (" A\nB\n A")
  }

  "Diamond C" should "have indentation on all rows except middle" ignore {
    Diamond.print('C') should be (
      """|  A
         | B
         |C
         | B
         |  A""".stripMargin)
  }

  "Diamond B" should "duplicate the B in the middle row" ignore {
    Diamond.print('B') should be (" A\nBB\n A")
  }

  "Diamond C" should "duplicate letters on rows except first and last" ignore {
    Diamond.print('C') should be (
      """|  A
         | BB
         |CC
         | BB
         |  A""".stripMargin)
  }


  "Diamond B" should "have spaces between the two 'B's" ignore {
    Diamond.print('B') should be (" A\nB B\n A")
  }

  "Diamond C" should "have between spaces on all rows except first and last" ignore {
    Diamond.print('C') should be (
      """|  A
         | B B
         |C   C
         | B B
         |  A""".stripMargin)
  }

  "Diamond D" should "be correct in all aspects" ignore {
    Diamond.print('D') should be (
      """|   A
         |  B B
         | C   C
         |D     D
         | C   C
         |  B B
         |   A""".stripMargin)
  }

}