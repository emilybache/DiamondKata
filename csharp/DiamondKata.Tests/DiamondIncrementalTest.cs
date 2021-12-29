using Xunit;

namespace DiamondKata.Tests.Incremental;

/// <summary>
///     <para>These test cases can be used to test-drive a solution to the diamond kata, in an incremental manner.</para>
///     <para>Instructions:</para>
///     <list type="number">
///         <item>Make the first test case pass.</item>
///         <item>Remove the 'Skip' property and enable the next test case.</item>
///         <item>Uncomment the one line of the test case. Make it pass. Repeat until all lines are uncommented.</item>
///         <item>When all the lines of code in the test case are passing, enable the next test case.</item>
///     </list>
///     <para>When all the test cases in this file are uncommented and passing, you should have a full working solution.</para>
/// </summary>
public class DiamondShould
{
    [Fact]
    public void Print_smallest_one_with_only_A_character_when_A_is_supplied()
        => Assert.Equal("A", Diamond.Print('A'));


    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_one_space_on_left_side_of_A_when_B_is_supplied()
    {
        // Assert.Equal(" A", Diamond.PrintLines('B')[0]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_two_spaces_on_left_side_of_A_when_C_is_supplied()
    {
        // Assert.Equal("  A", Diamond.PrintLines('C')[0]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_B_in_the_second_line_when_B_is_supplied()
    {
        // Assert.Equal("B B", Diamond.PrintLines('B')[1]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_C_in_the_third_line_when_C_is_supplied()
    {
        // Assert.Equal("C   C", Diamond.PrintLines('C')[2]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_D_in_the_fourth_line_when_D_is_supplied()
    {
        // Assert.Equal("D     D", Diamond.PrintLines('D')[3]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_B_line_when_C_is_supplied()
    {
        // Assert.Equal(" B B", Diamond.PrintLines('C')[1]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_B_line_when_D_is_supplied()
    {
        // Assert.Equal("  B B", Diamond.PrintLines('D')[1]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_C_line_when_D_is_supplied()
    {
        // Assert.Equal(" C   C", Diamond.PrintLines('D')[2]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_lines_from_A_to_D_when_D_is_supplied()
    {
        // string[] diamondLines = Diamond.PrintLines('D');

        // Assert.Equal("   A", diamondLines[0]);
        // Assert.Equal("  B B", diamondLines[1]);
        // Assert.Equal(" C   C", diamondLines[2]);
        // Assert.Equal("D     D", diamondLines[3]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Have_mirrored_lines_at_the_bottom_when_D_is_supplied()
    {
        // string[] diamondLines = Diamond.PrintLines('D');

        // Assert.Equal("   A", diamondLines[0]);
        // Assert.Equal("  B B", diamondLines[1]);
        // Assert.Equal(" C   C", diamondLines[2]);
        // Assert.Equal("D     D", diamondLines[3]);
        // Assert.Equal(" C   C", diamondLines[4]);
        // Assert.Equal("  B B", diamondLines[5]);
        // Assert.Equal("   A", diamondLines[6]);
    }

    [Fact(Skip = "1. Remove the 'Skip' property 2. Uncomment test lines and make it pass 3. Go to next test")]
    public void Print_with_supplied_letter_at_the_widest_point()
        => Assert.Equal(
            "    A\n" +
            "   B B\n" +
            "  C   C\n" +
            " D     D\n" +
            "E       E\n" +
            " D     D\n" +
            "  C   C\n" +
            "   B B\n" +
            "    A",
            Diamond.Print('E'));
}