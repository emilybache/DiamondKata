<?php


class Diamond
{
    private $middleLetter;

    public function __construct($middleLetter)
    {
        $this->middleLetter = $middleLetter;
    }

    public function getRows()
    {
        return array(array());
    }


    public static function diamond($middleLetter)
    {
        $diamond = new Diamond($middleLetter);
        return $diamond->getRows();
    }

    public static function print($middleLetter) : string
    {
        $diamond = new Diamond($middleLetter);
        $result = "";
        foreach ($diamond->getRows() as $chars)
        {
            foreach ($chars as $char)
            {
                $result .= $char;
            }
            $result .= "\n";
        }
        return $result;
    }


    public function size() : int
    {
        return 0;
    }

    public function spaceArray() : array
    {
        return null;
    }

    public function centerCoordinate()
    {
        return null;
    }

    public static function placeLetter(array $spaceArray, Point $point, $letter)
    {
        return $spaceArray;
    }

    public function coordinates($letter) : array
    {
        return null;
    }
}