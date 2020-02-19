<?php


use PHPUnit\Framework\TestCase;

class DiamondCentristIterativeTest extends TestCase
{
    /**
     * @test
     */
    public function DiamondA()
    {
        $this->assertEquals("A", Diamond::print('A'));
    }

    /**
     * @test
     */
    public function with_only_spaces()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array(' '))
            , Diamond::diamond('A'));
        $this->assertEquals(array(
                array(' ', ' ', ' '),
                array(' ', ' ', ' '),
                array(' ', ' ', ' '))
            , Diamond::diamond('B'));
        $this->assertEquals(array(
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '))
            , Diamond::diamond('C'));
    }

    /**
     * @test
     */
    public function with_center_marked_with_a_Z()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array('Z'))
            , Diamond::diamond('A'));
        $this->assertEquals(array(
                array(' ', ' ', ' '),
                array(' ', 'Z', ' '),
                array(' ', ' ', ' '))
            , Diamond::diamond('B'));
        $this->assertEquals(array(
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', 'Z', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '))
            , Diamond::diamond('C'));
    }

    /**
     * @test
     */
    public function with_1_0_coordinates_marked_with_a_Z()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array(' '))
            , Diamond::diamond('A'));
        $this->assertEquals(array(
                array(' ', ' ', ' '),
                array(' ', ' ', 'Z'),
                array(' ', ' ', ' '))
            , Diamond::diamond('B'));
        $this->assertEquals(array(
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', 'Z', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '))
            , Diamond::diamond('C'));
    }

    /**
     * @test
     */
    public function with_0_1_coordinates_marked_with_a_Z()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array(' '))
            , Diamond::diamond('A'));
        $this->assertEquals(array(
                array(' ', 'Z', ' '),
                array(' ', ' ', ' '),
                array(' ', ' ', ' '))
            , Diamond::diamond('B'));
        $this->assertEquals(array(
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', 'Z', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '))
            , Diamond::diamond('C'));
    }

    /**
     * @test
     */
    public function with_minus2_1_coordinates_marked_with_a_Z()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(
            array(' ', ' ', ' ', ' ', ' '),
            array(' ', ' ', ' ', ' ', ' '),
            array(' ', ' ', ' ', ' ', ' '),
            array(' ', ' ', ' ', ' ', 'Z'),
            array(' ', ' ', ' ', ' ', ' '))
            , Diamond::diamond('C'));
    }

    /**
     * @test
     */
    public function plotA()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array('A'))
            , Diamond::diamond('A'));
        $this->assertEquals(array(
                array(' ', 'A', ' '),
                array(' ', ' ', ' '),
                array(' ', 'A', ' '))
            , Diamond::diamond('B'));
        $this->assertEquals(array(
                array(' ', ' ', 'A', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', 'A', ' ', ' '))
            , Diamond::diamond('C'));
    }

    /**
     * @test
     */
    public function plot_A_and_middle_letter()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array('A'))
            , Diamond.diamond('A'));
        $this->assertEquals(array(
                array(' ', 'A', ' '),
                array('B', ' ', 'B'),
                array(' ', 'A', ' '))
            , Diamond::diamond('B'));
        $this->assertEquals(array(
                array(' ', ' ', 'A', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' '),
                array('C', ' ', ' ', ' ', 'C'),
                array(' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', 'A', ' ', ' '))
            , Diamond::diamond('C'));
        $this->assertEquals(array(
                array(' ', ' ', ' ', 'A', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                array('D', ' ', ' ', ' ', ' ', ' ', 'D'),
                array(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                array(' ', ' ', ' ', 'A', ' ', ' ', ' '))
            , Diamond::diamond('D'));
    }

    /**
     * @test
     */
    public function DiamondB()
    {
        $this->markTestSkipped();
        $this->assertEquals(" A \nB B\n A ", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function plot_all_letters()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(
            array(' ', ' ', 'A', ' ', ' '),
            array(' ', 'B', ' ', 'B', ' '),
            array('C', ' ', ' ', ' ', 'C'),
            array(' ', 'B', ' ', 'B', ' '),
            array(' ', ' ', 'A', ' ', ' '))
        , Diamond::diamond('C'));
        $this->assertEquals(array(
                array(' ', ' ', ' ', 'A', ' ', ' ', ' '),
                array(' ', ' ', 'B', ' ', 'B', ' ', ' '),
                array(' ', 'C', ' ', ' ', ' ', 'C', ' '),
                array('D', ' ', ' ', ' ', ' ', ' ', 'D'),
                array(' ', 'C', ' ', ' ', ' ', 'C', ' '),
                array(' ', ' ', 'B', ' ', 'B', ' ', ' '),
                array(' ', ' ', ' ', 'A', ' ', ' ', ' '))
            , Diamond::diamond('D'));
    }

    /**
     * @test
     */
    public function print_DiamondC()
    {
        $this->markTestSkipped();
        $this->assertEquals(
        "  A  \n" .
            " B B \n" .
            "C   C\n" .
            " B B \n" .
            "  A  ", Diamond::print('C'));
    }

    /**
     * @test
     */
    public function print_DiamondD()
    {
        $this->markTestSkipped();
        $this->assertEquals(
            "   A   \n" .
                "  B B  \n" .
                " C   C \n" .
                "D     D\n" .
                " C   C \n" .
                "  B B  \n" .
                "   A   ", Diamond::print('D'));
    }
}
