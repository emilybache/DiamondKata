<?php

use PHPUnit\Framework\TestCase;

class DiamondCentristIncrementalTest extends TestCase
{
    /**
     * @test
     */
    public function diamondA()
    {
        $this->assertEquals("A", Diamond::print('A'));
    }

    /**
     * @test
     */
    public function size()
    {
        $this->markTestSkipped();
        $this->assertEquals(1, (new Diamond('A'))->size());
        $this->assertEquals(3, (new Diamond('B'))->size());
        $this->assertEquals(5, (new Diamond('C'))->size());
        $this->assertEquals(7, (new Diamond('D'))->size());
    }

    /**
     * @test
     */
    public function spaceArray()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array(' ')), (new Diamond('A'))->spaceArray());
        $this->assertEquals(array(
                    array(' ', ' ', ' '),
                    array(' ', ' ', ' '),
                    array(' ', ' ', ' ')),
                    (new Diamond('B'))->spaceArray());
        $this->assertEquals(array(
                    array(' ', ' ', ' ', ' ', ' '),
                    array(' ', ' ', ' ', ' ', ' '),
                    array(' ', ' ', ' ', ' ', ' '),
                    array(' ', ' ', ' ', ' ', ' '),
                    array(' ', ' ', ' ', ' ', ' ')),
                    (new Diamond('C'))->spaceArray());
    }

    /**
     * @test
     */
    public function centerCoordinate()
    {
        $this->markTestSkipped();
        $this->assertEquals(new Point(0, 0), (new Diamond('A'))->centerCoordinate());
        $this->assertEquals(new Point(1, 1), (new Diamond('B'))->centerCoordinate());
        $this->assertEquals(new Point(2, 2), (new Diamond('C'))->centerCoordinate());
        $this->assertEquals(new Point(3, 3), (new Diamond('D'))->centerCoordinate());
    }

    /**
     * @test
     */
    public function place_letter_center()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array('A'))
                            , Diamond::placeLetter((new Diamond('A'))->spaceArray(), new Point(0,0), 'Z'));
        $this->assertEquals(array(
                            array(' ', ' ', ' '),
                            array(' ', 'Z', ' '),
                            array(' ', ' ', ' '))
                            , Diamond::placeLetter((new Diamond('B'))->spaceArray(), new Point(0,0), 'Z'));
        $this->assertEquals(array(
                            array(' ', ' ', ' ', ' ', ' '),
                            array(' ', ' ', ' ', ' ', ' '),
                            array(' ', ' ', 'Z', ' ', ' '),
                            array(' ', ' ', ' ', ' ', ' '),
                            array(' ', ' ', ' ', ' ', ' '))
                            , Diamond::placeLetter((new Diamond('C'))->spaceArray(), new Point(0,0), 'Z'));
    }

    /**
     * @test
     */
    public function place_letter_at_other_coordinates()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(array(' '))
                            , Diamond::placeLetter((new Diamond('A'))->spaceArray(), new Point(1,0), 'Z'));
        $this->assertEquals(array(
                            array(' ', ' ', ' '),
                            array(' ', ' ', 'Z'),
                            array(' ', ' ', ' '))
                            , Diamond::placeLetter((new Diamond('B'))->spaceArray(), new Point(1,0), 'Z'));
        $this->assertEquals(array(
                            array(' ', ' ', ' ', ' ', ' '),
                            array(' ', ' ', ' ', ' ', ' '),
                            array(' ', 'Z', ' ', ' ', ' '),
                            array(' ', ' ', ' ', ' ', ' '),
                            array(' ', ' ', ' ', ' ', ' '))
                            , Diamond::placeLetter((new Diamond('C'))->spaceArray(), new Point(-1,0), 'Z'));
    }

    /**
     * @test
     */
    public function coordinatesOfA()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(new Point(0, 0)),
                        (new Diamond('A'))->coordinates('A'));
        $this->assertEquals(array(new Point(0, 1), new Point(0, -1)),
                        (new Diamond('B'))->coordinates('A'));
        $this->assertEquals(array(new Point(0, 2), new Point(0, -2)),
                        (new Diamond('C'))->coordinates('A'));
        $this->assertEquals(array(new Point(0, 3), new Point(0, -3)),
                        (new Diamond('D'))->coordinates('A'));
    }

    /**
     * @test
     */
    public function coordinatesOfMiddleLetter()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(new Point(-1, 0), new Point(1, 0)),
                        (new Diamond('B'))->coordinates('B'));
        $this->assertEquals(array(new Point(-2, 0), new Point(2, 0)),
                        (new Diamond('C'))->coordinates('C'));
        $this->assertEquals(array(new Point(-3, 0), new Point(3, 0)),
                        (new Diamond('D'))->coordinates('D'));
    }

    /**
     * @test
     */
    public function coordinatesOfB()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(new Point(-1, 1), new Point(-1, -1), new Point(1, 1), new Point(1, -1)),
                        (new Diamond('C'))->coordinates('B'));
        $this->assertEquals(array(new Point(-1, 2), new Point(-1, -2), new Point(1, 2), new Point(1, -2)),
                        (new Diamond('D'))->coordinates('B'));
    }

    /**
     * @test
     */
    public function diamondB()
    {
        $this->markTestSkipped();
        $this->assertEquals(" A \nB B\n A ", Diamond::print('B'));
    }

    /**
     * @test
     */
    public function coordinatesOfC()
    {
        $this->markTestSkipped();
        $this->assertEquals(array(new Point(-2, 1), new Point(-2, -1), new Point(2, 1), new Point(2, -1)),
                            (new Diamond('D'))->coordinates('C'));
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
