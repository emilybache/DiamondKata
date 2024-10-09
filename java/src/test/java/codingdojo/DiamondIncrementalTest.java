package codingdojo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

import org.approvaltests.Approvals;


public class DiamondIncrementalTest {

    @Test
    public void testLetterIndex() {
        // assertEquals(0, Diamond.letterIndex('A'));
        // assertEquals(1, Diamond.letterIndex('B'));
        // assertEquals(2, Diamond.letterIndex('C'));
        // assertEquals(3, Diamond.letterIndex('D'));
        // assertEquals(4, Diamond.letterIndex('E'));
    }

    @Disabled
    @Test
    public void testQuadrantDimension() {
        // assertEquals(0, new Diamond('A').quadrantDimension());
        // assertEquals(1, new Diamond('B').quadrantDimension());
        // assertEquals(new Diamond('D').quadrantDimension(), Diamond.letterIndex('D'));
        // assertEquals(2, new Diamond('C').quadrantDimension());
    }

    @Disabled
    @Test
    public void testXyCoordinates() {
        // assertArrayEquals(new int[]{0}, new Diamond('A').xyCoordinates());
        // assertArrayEquals(new int[]{-1, 0, 1}, new Diamond('B').xyCoordinates());
        // Diamond diamondD = new Diamond('D');
        // assertEquals(diamondD.quadrantDimension(), diamondD.xyCoordinates()[diamondD.xyCoordinates().length - 1]);
        // assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, new Diamond('C').xyCoordinates());
    }

    @Disabled
    @Test
    public void testLetterForRow() {
        // assertEquals('A', new Diamond('A').letterForRow(0));
        // assertEquals('B', new Diamond('B').letterForRow(0));
        // assertEquals('C', new Diamond('C').letterForRow(0));
        // assertEquals('A', new Diamond('B').letterForRow(1));
        // assertEquals('A', new Diamond('B').letterForRow(-1));
        // assertEquals('A', new Diamond('C').letterForRow(2));
        // Diamond diamond = new Diamond('C');
        // assertArrayEquals(new char[]{'A', 'B', 'C', 'B', 'A'}, diamond.lettersForRows(diamond.xyCoordinates()));
    }

    @Disabled
    @Test
    public void testXIndicesForLetter() {
        // assertEquals(Set.of(0), new HashSet<>(new Diamond('A').xIndicesForLetter('A')));
        // assertEquals(Set.of(0), new HashSet<>(new Diamond('B').xIndicesForLetter('A')));
        // assertEquals(Set.of(-1, 1), new HashSet<>(new Diamond('B').xIndicesForLetter('B')));
        // assertEquals(Set.of(-1, 1), new HashSet<>(new Diamond('C').xIndicesForLetter('B')));
        // assertEquals(Set.of(-1, 1), new HashSet<>(new Diamond('D').xIndicesForLetter('B')));
        // assertEquals(Set.of(-2, 2), new HashSet<>(new Diamond('C').xIndicesForLetter('C')));
        // Diamond diamond = new Diamond('C');
        // assertEquals(List.of(" ", "B", " ", "B", " "),
        //     diamond.xyCoordinates().stream()
        //         .map(x -> diamond.xIndicesForLetter('B').contains(x) ? "B" : " ")
        //         .collect(Collectors.toList()));
    }

    @Disabled
    @Test
    public void testRowForLetter() {
        // assertEquals("A", new Diamond('A').rowForLetter('A'));
        // assertEquals(" A ", new Diamond('B').rowForLetter('A'));
        // assertEquals("B B", new Diamond('B').rowForLetter('B'));
        // assertEquals(" B B ", new Diamond('C').rowForLetter('B'));
    }

    @Disabled
    @Test
    public void testPrintDiamond() {
        Approvals.verify(new Diamond('D').printDiamond());
    }
}

