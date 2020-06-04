<?php


use PHPUnit\Framework\TestCase;

/**
 * These test cases can be used to test-drive a solution to the diamond kata, in an interative manner.
 * Enable only one test case for "Diamond A", one for "Diamond B" and one for "Diamond C" at any one time.
 * The idea is that you iterate towards a full solution.
 *
 * Instructions:
 * 1. Make the first test for Diamond A (which is failing) pass
 * 2. Remove the 'markTestSkipped' on the next test case. Make it pass too.
 * 3. Replace the 'markTestSkipped' on that test case, (or delete it), and instead enable the following test case
 * 4. keep doing this, always having exactly one enabled test case for each diamond, (A, B, and C) until you've got to the end of the file.
 * At that point you should have a working implementation.
 */
class DiamondIterativeTest extends TestCase
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
    public function DiamondB_prints_a_char_sequence_for_the_top_half()
    {
        $this->markTestSkipped();
        $this->assertEquals("AB", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function DiamondB_prints_a_char_sequence_for_the_whole_diamond()
    {
        $this->markTestSkipped();
        $this->assertEquals("ABA", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function DiamondC_prints_a_char_sequence_for_the_whole_diamond()
    {
        $this->markTestSkipped();
        $this->assertEquals("ABCBA", Diamond::print('C'));
    }

    /**
     * @test
     */
    public function DiamondB_has_newlines()
    {
        $this->markTestSkipped();
        $this->assertEquals("A\nB\nA", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function DiamondB_has_indentation_on_first_and_last_rows()
    {
        $this->markTestSkipped();
        $this->assertEquals(" A\nB\n A", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function DiamondC_has_indentation_on_all_rows_except_middle()
    {
        $this->markTestSkipped();
        $this->assertEquals("  A\n" .
                            " B\n" .
                            "C\n" .
                            " B\n" .
                            "  A", Diamond::print('C'));
    }

    /**
     * @test
     */
    public function DiamondB_duplicates_B_on_middle_row()
    {
        $this->markTestSkipped();
        $this->assertEquals(" A\nBB\n A", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function DiamondC_has_duplicates_on_middle_rows()
    {
        $this->markTestSkipped();
        $this->assertEquals("  A\n" .
                            " BB\n" .
                            "CC\n" .
                            " BB\n" .
                            "  A", Diamond::print('C'));
    }

    /**
     * @test
     */
    public function DiamondB_has_a_space_between_the_Bs()
    {
        $this->assertEquals(" A\nB B\n A", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function DiamondC_has_between_spaces_on_all_rows_except_first_and_last()
    {
        $this->assertEquals("  A\n" .
                            " B B\n" .
                            "C   C\n" .
                            " B B\n" .
                            "  A", Diamond::print('C'));
    }

    /**
     * @test
     */
    public function DiamondD_is_correct_in_all_aspects() {
        $this->assertEquals("   A\n" .
                            "  B B\n" .
                            " C   C\n" .
                            "D     D\n" .
                            " C   C\n" .
                            "  B B\n" .
                            "   A", Diamond::print('D'));
    }
}
