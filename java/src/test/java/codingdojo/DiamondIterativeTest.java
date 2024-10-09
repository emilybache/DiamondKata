package codingdojo;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class DiamondIterativeTest {

    @Test
    public void testDiamonds() {
        String result =
                "Diamond A:\n" + new Diamond('A').printDiamond() +
                "\n\nDiamond B:\n" + new Diamond('B').printDiamond() +
                "\n\nDiamond C:\n" + new Diamond('C').printDiamond() +
                "\n\nDiamond D:\n" + new Diamond('D').printDiamond() + "\n";
        Approvals.verify(result);
    }
}

