package codingdojo;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class DiamondCentristIterativeTest {

    @Test
    public void DiamondA() {
        assertEquals("A", Diamond.print('A'));
    }

    @Ignore
    @Test
    public void with_only_spaces() {
        assertEquals(asList(asList(' '))
                , Diamond.diamond('A'));
        assertEquals(asList(
                asList(' ', ' ', ' '),
                asList(' ', ' ', ' '),
                asList(' ', ' ', ' '))
                , Diamond.diamond('B'));
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '))
                , Diamond.diamond('C'));
    }

    @Ignore
    @Test
    public void with_center_marked_with_a_Z() {
        assertEquals(asList(asList('Z'))
                , Diamond.diamond('A'));
        assertEquals(asList(
                asList(' ', ' ', ' '),
                asList(' ', 'Z', ' '),
                asList(' ', ' ', ' '))
                , Diamond.diamond('B'));
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', 'Z', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '))
                , Diamond.diamond('C'));
    }

    @Ignore
    @Test
    public void with_1_0_coordinates_marked_with_a_Z() {
        assertEquals(asList(asList(' '))
                , Diamond.diamond('A'));
        assertEquals(asList(
                asList(' ', ' ', ' '),
                asList(' ', ' ', 'Z'),
                asList(' ', ' ', ' '))
                , Diamond.diamond('B'));
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', 'Z', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '))
                , Diamond.diamond('C'));
    }

    @Ignore
    @Test
    public void with_0_1_coordinates_marked_with_a_Z() {
        assertEquals(asList(asList(' '))
                , Diamond.diamond('A'));
        assertEquals(asList(
                asList(' ', 'Z', ' '),
                asList(' ', ' ', ' '),
                asList(' ', ' ', ' '))
                , Diamond.diamond('B'));
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', 'Z', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '))
                , Diamond.diamond('C'));
    }

    @Ignore
    @Test
    public void with_minus2_1_coordinates_marked_with_a_Z() {
        assertEquals(asList(
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', 'Z'),
                asList(' ', ' ', ' ', ' ', ' '))
                , Diamond.diamond('C'));
    }

    @Ignore
    @Test
    public void plotA() {
        assertEquals(asList(asList('A'))
                , Diamond.diamond('A'));
        assertEquals(asList(
                asList(' ', 'A', ' '),
                asList(' ', ' ', ' '),
                asList(' ', 'A', ' '))
                , Diamond.diamond('B'));
        assertEquals(asList(
                asList(' ', ' ', 'A', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', 'A', ' ', ' '))
                , Diamond.diamond('C'));
    }

    @Ignore
    @Test
    public void plot_A_and_middle_letter() {
        assertEquals(asList(asList('A'))
                , Diamond.diamond('A'));
        assertEquals(asList(
                asList(' ', 'A', ' '),
                asList('B', ' ', 'B'),
                asList(' ', 'A', ' '))
                , Diamond.diamond('B'));
        assertEquals(asList(
                asList(' ', ' ', 'A', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' '),
                asList('C', ' ', ' ', ' ', 'C'),
                asList(' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', 'A', ' ', ' '))
                , Diamond.diamond('C'));
        assertEquals(asList(
                asList(' ', ' ', ' ', 'A', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                asList('D', ' ', ' ', ' ', ' ', ' ', 'D'),
                asList(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', ' ', ' ', ' ', ' '),
                asList(' ', ' ', ' ', 'A', ' ', ' ', ' '))
                , Diamond.diamond('D'));
    }

    @Ignore
    @Test
    public void DiamondB() {
        assertEquals(" A \nB B\n A ", Diamond.print('B'));
    }

    @Ignore
    @Test
    public void plot_all_letters() {
        assertEquals(asList(
                asList(' ', ' ', 'A', ' ', ' '),
                asList(' ', 'B', ' ', 'B', ' '),
                asList('C', ' ', ' ', ' ', 'C'),
                asList(' ', 'B', ' ', 'B', ' '),
                asList(' ', ' ', 'A', ' ', ' '))
                , Diamond.diamond('C'));
        assertEquals(asList(
                asList(' ', ' ', ' ', 'A', ' ', ' ', ' '),
                asList(' ', ' ', 'B', ' ', 'B', ' ', ' '),
                asList(' ', 'C', ' ', ' ', ' ', 'C', ' '),
                asList('D', ' ', ' ', ' ', ' ', ' ', 'D'),
                asList(' ', 'C', ' ', ' ', ' ', 'C', ' '),
                asList(' ', ' ', 'B', ' ', 'B', ' ', ' '),
                asList(' ', ' ', ' ', 'A', ' ', ' ', ' '))
                , Diamond.diamond('D'));
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
