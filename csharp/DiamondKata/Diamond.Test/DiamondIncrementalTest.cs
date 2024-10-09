namespace Diamond.Test;

/*
 * These test cases can be used to test-drive a solution to the diamond kata, in an incremental manner. 
   Instructions:
   Working from top to bottom, aim to get all the tests passing.
   Uncomment one assertion at a time. When a whole test is passing, remove the skip marking on the next one.
   The tests should all pass before you uncomment another line or unskip the next test.
 */
public class DiamondIncrementalTest
{
    [Fact]
    public void TestLetterIndex()
    {
        // Assert.Equal(0, Diamond.LetterIndex('A'));
        // Assert.Equal(1, Diamond.LetterIndex('B'));
        // Assert.Equal(2, Diamond.LetterIndex('C'));
        // Assert.Equal(3, Diamond.LetterIndex('D'));
        // Assert.Equal(4, Diamond.LetterIndex('E'));
    }

    [Fact(Skip = "Skipping this test")]
    public void TestQuadrantDimension()
    {
        // Assert.Equal(0, new Diamond('A').QuadrantDimension());
        // Assert.Equal(1, new Diamond('B').QuadrantDimension());
        // Assert.Equal(new Diamond('D').QuadrantDimension(), Diamond.LetterIndex('D'));
        // Assert.Equal(2, new Diamond('C').QuadrantDimension());
    }

    [Fact(Skip = "Skipping this test")]
    public void TestXYCoordinates()
    {
        // Assert.Equal(new List<int> { 0 }, new Diamond('A').XYCoordinates());
        // Assert.Equal(new List<int> { -1, 0, 1 }, new Diamond('B').XYCoordinates());
        // var diamondD = new Diamond('D');
        // Assert.Equal(diamondD.QuadrantDimension(), diamondD.XYCoordinates()).Last();
        // Assert.Equal(new List<int> { -2, -1, 0, 1, 2 }, new Diamond('C').XYCoordinates());
    }

    [Fact(Skip = "Skipping this test")]
    public void TestLetterForRow()
    {
        // Assert.Equal('A', new Diamond('A').LetterForRow(0));
        // Assert.Equal('B', new Diamond('B').LetterForRow(0));
        // Assert.Equal('C', new Diamond('C').LetterForRow(0));
        // Assert.Equal('A', new Diamond('B').LetterForRow(1));
        // Assert.Equal('A', new Diamond('B').LetterForRow(-1));
        // Assert.Equal('A', new Diamond('C').LetterForRow(2));
        // var diamond = new Diamond('C');
        // Assert.Equal(new List<char> { 'A', 'B', 'C', 'B', 'A' }, diamond.XYCoordinates().Select(y => diamond.LetterForRow(y)).ToList());
    }

    [Fact(Skip = "Skipping this test")]
    public void TestXIndicesForLetter()
    {
        // Assert.Equal(new HashSet<int> { 0 }, new HashSet<int>(new Diamond('A').XIndicesForLetter('A')));
        // Assert.Equal(new HashSet<int> { 0 }, new HashSet<int>(new Diamond('B').XIndicesForLetter('A')));
        // Assert.Equal(new HashSet<int> { -1, 1 }, new HashSet<int>(new Diamond('B').XIndicesForLetter('B')));
        // Assert.Equal(new HashSet<int> { -1, 1 }, new HashSet<int>(new Diamond('C').XIndicesForLetter('B')));
        // Assert.Equal(new HashSet<int> { -1, 1 }, new HashSet<int>(new Diamond('D').XIndicesForLetter('B')));
        // Assert.Equal(new HashSet<int> { -2, 2 }, new HashSet<int>(new Diamond('C').XIndicesForLetter('C')));
        // var diamond = new Diamond('C');
        // Assert.Equal(new List<string> { " ", "B", " ", "B", " " }, diamond.XIndicesForLetter('B').Select(x => x == 0 ? "B" : " ").ToList());
    }

    [Fact(Skip = "Skipping this test")]
    public void TestRowForLetter()
    {
        // Assert.Equal("A", new Diamond('A').RowForLetter('A'));
        // Assert.Equal(" A ", new Diamond('B').RowForLetter('A'));
        // Assert.Equal("B B", new Diamond('B').RowForLetter('B'));
        // Assert.Equal(" B B ", new Diamond('C').RowForLetter('B'));
    }

    [Fact(Skip = "Skipping this test")]
    public async void TestPrintDiamond()
    {
        var diamond = new Diamond('D');
        var result = diamond.PrintDiamond();
        // Use Verify framework to verify the result
        // await Verifier.Verify(result);
    }
}
