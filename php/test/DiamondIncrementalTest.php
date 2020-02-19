<?php


use PHPUnit\Framework\TestCase;
/**
 * These test cases can be used to test-drive a solution to the diamond kata, in an incremental manner.
 *
 * Instructions:
 * 1. Make the first test case for Diamond A pass
 * 2. remove the 'markTestSkipped' and enable the next test case.
 * 3. Uncomment the one line of the test case. Make it pass. Repeat until all lines are uncommented
 * 4. When all the lines of code in the test case are passing, enable the next test case.
 * 5. When all the test cases in this file are uncommented and passing, you should have a full working solution.
 */

class DiamondIncrementalTest extends TestCase
{
    /**
     * @test
     */
    public function DiamondA_has_one_line_containing_A()
    {
        $this->assertEquals("A", Diamond::print('A'));
    }

    /**
     * @test
     */
    public function LetterSequence_is_list_of_letters_on_each_line_of_the_diamond()
    {
        $this->markTestSkipped();
        //assertCharacterSequence((new Diamond('A'))->getLetterSequence(), array('A'));
        //assertCharacterSequence((new Diamond('B'))->getLetterSequence(), array('A', 'B', 'A'));
        //assertCharacterSequence((new Diamond('C'))->getLetterSequence(), array('A', 'B', 'C', 'B', 'A'));
        //assertCharacterSequence((new Diamond('D'))->getLetterSequence(), array('A', 'B', 'C', 'D', 'C', 'B', 'A'));
    }

    /**
     * @test
     */
    public function IndentationSequence_is_a_list_of_indents_for_each_line_of_the_diamond()
    {
        $this->markTestSkipped();
        assertIntegerSequence((new Diamond('A'))->getIndentationSequence(), array(0));
        assertIntegerSequence((new Diamond('B'))->getIndentationSequence(), array(1,0,1));
        assertIntegerSequence((new Diamond('C'))->getIndentationSequence(), array(2,1,0,1,2));
        assertIntegerSequence((new Diamond('D'))->getIndentationSequence(), array(3,2,1,0,1,2,3));
    }

    /**
     * @test
     */
    public function BetweenSequence_is_a_list_of_how_many_spaces_there_are_between_repeated_letters_on_each_line_of_the_diamond()
    {
        $this->markTestSkipped();
        //assertIntegerSequence((new Diamond('A'))->getBetweenSequence(), array(0));
        //assertIntegerSequence((new Diamond('B'))->getBetweenSequence(), array(0,1,0));
        //assertIntegerSequence((new Diamond('C'))->getBetweenSequence(), array(0,1,3,1,0));
        //assertIntegerSequence((new Diamond('D'))->getBetweenSequence(), array(0,1,3,5,3,1,0));
    }

    /**
     * @test
     */
    public function OneRow_is_a_list_of_chars_in_one_diamond_row()
    {
        $this->markTestSkipped();
        //assertCharacterSequence((new Diamond('A'))->getOneRow('A', 0, 0), array('A'));
        //assertCharacterSequence((new Diamond('B'))->getOneRow('A', 1, 0), array(' ', 'A'));
        //assertCharacterSequence((new Diamond('B'))->getOneRow('B', 0, 1), array('B', ' ', 'B'));
        //assertCharacterSequence((new Diamond('D'))->getOneRow('C', 1, 3), array(' ', 'C', ' ', ' ', ' ', 'C'));
    }

    /**
     * @test
     */
    public function Rows_is_a_list_of_diamond_rows()
    {
        $this->markTestSkipped();
        $rows = (new Diamond('B'))->getRows();
        assertCharacterSequence($rows[0], array(' ', 'A'));
        assertCharacterSequence($rows[1], array('B', ' ', 'B'));
        assertCharacterSequence($rows[2], array(' ', 'A'));
    }

    /**
     * @test
     */
    public function print_DiamondC()
    {
        $this->markTestSkipped();
        $this->assertEquals( "  A\n" .
                            " B B\n" .
                            "C   C\n" .
                            " B B\n" .
                            "  A", Diamond::print('C'));
    }

    /**
     * @test
     */
    public function print_DiamondD()
    {
        $this->markTestSkipped();
        $this->assertEquals("   A\n" .
                            "  B B\n" .
                            " C   C\n" .
                            "D     D\n" .
                            " C   C\n" .
                            "  B B\n" .
                            "   A", Diamond::print('D'));
    }


    public function assertCharacterSequence($sequence, $expectedChars)
    {
        $this->assertEquals($expectedChars, $sequence);
    }

    public function assertIntegerSequence($sequence, $expectedInts)
    {
        $this->assertEquals($expectedInts, $sequence);
    }
}
