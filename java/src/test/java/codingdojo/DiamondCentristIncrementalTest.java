package codingdojo;

import org.junit.Ignore;
import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class DiamondCentristIncrementalTest {

    @Test
    public void DiamondA() {
        assertEquals("A", Diamond.print('A'));
    }

    @Ignore
    @Test
    public void size() {
        assertEquals(1, new Diamond('A').size());
        assertEquals(3, new Diamond('B').size());
        assertEquals(5, new Diamond('C').size());
        assertEquals(7, new Diamond('D').size());
    }

    @Ignore
    @Test
    public void spaceArray() {
        assertEquals(asList(asList(' ')), new Diamond('A').spaceArray());
        assertEquals(asList(
                asList(' ', ' ', ' '),
                asList(' ', ' ', ' '),
                asList(' ', ' ', ' ')),
                new Diamond('B').spaceArray());
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' ')),
                new Diamond('C').spaceArray());
    }

    @Ignore
    @Test
    public void centerCoordinate() {
        assertEquals(new Point(0, 0), new Diamond('A').centerCoordinate());
        assertEquals(new Point(1, 1), new Diamond('B').centerCoordinate());
        assertEquals(new Point(2, 2), new Diamond('C').centerCoordinate());
        assertEquals(new Point(3, 3), new Diamond('D').centerCoordinate());
    }

    @Ignore
    @Test
    public void place_letter_center() {
        assertEquals(asList(asList('A'))
                , Diamond.placeLetter(new Diamond('A').spaceArray(), new Point(0,0), 'Z'));
        assertEquals(asList(
                asList(' ', ' ', ' '),
                asList(' ', 'Z', ' '),
                asList(' ', ' ', ' '))
                , Diamond.placeLetter(new Diamond('B').spaceArray(), new Point(0,0), 'Z'));
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', 'Z', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '))
                , Diamond.placeLetter(new Diamond('C').spaceArray(), new Point(0,0), 'Z'));
    }

    @Ignore
    @Test
    public void place_letter_at_other_coordinates() {
        assertEquals(asList(asList(' '))
                , Diamond.placeLetter(new Diamond('A').spaceArray(), new Point(1,0), 'Z'));
        assertEquals(asList(
                asList(' ', ' ', ' '),
                asList(' ', ' ', 'Z'),
                asList(' ', ' ', ' '))
                , Diamond.placeLetter(new Diamond('B').spaceArray(), new Point(1,0), 'Z'));
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', 'Z', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '))
                , Diamond.placeLetter(new Diamond('C').spaceArray(), new Point(-1,0), 'Z'));
    }

    @Ignore
    @Test
    public void coordinatesOfA() {
        assertEquals(asSet(new Point(0, 0)),
                new Diamond('A').coordinates('A'));
        assertEquals(asSet(new Point(0, 1), new Point(0, -1)),
                new Diamond('B').coordinates('A'));
        assertEquals(asSet(new Point(0, 2), new Point(0, -2)),
                new Diamond('C').coordinates('A'));
        assertEquals(asSet(new Point(0, 3), new Point(0, -3)),
                new Diamond('D').coordinates('A'));
    }

    @Ignore
    @Test
    public void coordinatesOfMiddleLetter() {
        assertEquals(asSet(new Point(-1, 0), new Point(1, 0)),
                new Diamond('B').coordinates('B'));
        assertEquals(asSet(new Point(-2, 0), new Point(2, 0)),
                new Diamond('C').coordinates('C'));
        assertEquals(asSet(new Point(-3, 0), new Point(3, 0)),
                new Diamond('D').coordinates('D'));
    }

    @Ignore
    @Test
    public void coordinatesOfB() {
        assertEquals(asSet(new Point(-1, 1), new Point(-1, -1),
                new Point(1, 1), new Point(1, -1)),
                new Diamond('C').coordinates('B'));
        assertEquals(asSet(new Point(-1, 2), new Point(-1, -2),
                new Point(1, 2), new Point(1, -2)),
                new Diamond('D').coordinates('B'));
    }

    @Ignore
    @Test
    public void DiamondB() {
        assertEquals(" A \nB B\n A ", Diamond.print('B'));
    }

    @Ignore
    @Test
    public void coordinatesOfC() {
        assertEquals(asSet(new Point(-2, 1), new Point(-2, -1),
                new Point(2, 1), new Point(2, -1)),
                new Diamond('D').coordinates('C'));
    }


    private Set<Point> asSet(Point... points) {
        return new HashSet<Point>(asList(points));
    }

    @Ignore
    @Test
    public void print_DiamondC() {
        assertEquals(
                "  A  \n" +
                        " B B \n" +
                        "C   C\n" +
                        " B B \n" +
                        "  A  ", Diamond.print('C'));
    }

    @Ignore
    @Test
    public void print_DiamondD() {
        assertEquals(
                "   A   \n" +
                        "  B B  \n" +
                        " C   C \n" +
                        "D     D\n" +
                        " C   C \n" +
                        "  B B  \n" +
                        "   A   ", Diamond.print('D'));
    }

}
