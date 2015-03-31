package dojo

import org.scalatest.{Matchers, FlatSpec}

/**
 * These test cases can be used to test-drive a solution to the diamond kata, in an incremental manner.
 *
 * Instructions:
 * 1. Make the first test case for Diamond A pass
 * 2. change the 'ignore' to 'in' for the next test case. Make it pass.
 * 3. Uncomment the next line of the test case. Make it pass
 * 4. When all the lines of code in the test case are passing, continue to the next test case.
 * 5. When all the
 * test cases in this file are uncommented and passing, you should have a full working solution.
 */

class DiamondIncrementalSpec extends FlatSpec with Matchers {

  "Diamond A" should "have one line containing A" in {
    Diamond.print('A') should be ("A")
  }

  "letter sequence" should "give the list of letters on each line in the diamond" ignore {
    new Diamond('B').char_sequence should be (Seq('A', 'B', 'A'))
    //new Diamond('C').char_sequence should be (Seq('A', 'B', 'C', 'B', 'A'))
  }

  "indents" should "give a list of indents for each line of the diamond" ignore {
    new Diamond('A').indents should be (Seq(0))
    //new Diamond('B').indents should be (Seq(1,0,1))
    //new Diamond('C').indents should be (Seq(2,1,0,1,2))
    //new Diamond('D').indents should be (Seq(3,2,1,0,1,2,3))
  }

  "between" should "give a list of how many middle spaces between the repeated letter there should be on each line of the diamond" ignore {
    new Diamond('A').between should be (Seq(0))
    //new Diamond('B').between should be (Seq(0,1,0))
    //new Diamond('C').between should be (Seq(0,1,3,1,0))
    //new Diamond('D').between should be (Seq(0,1,3,5,3,1,0))
  }

  "one_row" should "create a sequence representing one diamond row" ignore {
    new Diamond('A').one_row('A', indent=0, between=0) should be (Seq('A'))
    //new Diamond('B').one_row('A', indent=1, between=0) should be (Seq(' ', 'A'))
    //new Diamond('B').one_row('B', indent=0, between=1) should be (Seq('B', ' ', 'B'))
    //new Diamond('C').one_row('C', indent=1, between=2) should be (Seq(' ', 'C', ' ', ' ', 'C'))
  }

  "row" should "create a sequence representing the diamond rows" ignore {
    new Diamond('A').rows should be (Seq(Seq('A')))
    //new Diamond('B').rows should be (Seq(Seq(' ', 'A'), Seq('B', ' ', 'B'), Seq(' ', 'A')))
  }

  "print" should "create a string that can be printed to show a diamond" ignore {
    Diamond.print('B') should be (" A\nB B\n A")
    /*Diamond.print('C') should be (
      """|  A
         | B B
         |C   C
         | B B
         |  A""".stripMargin)*/
  }

  "Diamond D" should "be printed correctly" ignore {
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
