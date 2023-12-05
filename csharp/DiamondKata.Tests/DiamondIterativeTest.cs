using Xunit;

namespace DiamondKata.Tests.Iterative;

/// <summary>
///     <para>These test cases can be used to test-drive a solution to the diamond kata, in an iterative manner.</para>
///     <para>Enable only one test case at a time.</para>
///     <para>The idea is that you iterate towards a full solution.</para>
///     <para>Instructions:</para>
///     <list type="number">
///         <item>Make the first test (which is failing) pass.</item>
///         <item>Remove the 'Skip' property on the next test case. Make it pass too.</item>
///         <item>
///             Replace the 'Skip' property on that test case, (or delete it), and instead enable the following test case.
///         </item>
///         <item>
///             Keep doing this, always having exactly one enabled test case at a time until you've got to the end of the
///             file.
///         </item>
///     </list>
///     <para>At that point you should have a working implementation.</para>
/// </summary>
public class DiamondShould
{
    [Fact]
    public void Print_smallest_one_with_only_A_character()
        => Assert.Equal("A", Diamond.Print('A'));

    [Fact(Skip = "1. Make it pass 2. Skip it again or delete it and go to next test")]
    public void Give_character_sequence_when_B_is_supplied()
        => Assert.Equal("AB", Diamond.Print('B'));

    [Fact(Skip = "1. Make it pass 2. Skip it again or delete it and go to next test")]
    public void Repeat_characters_when_B_is_supplied()
        => Assert.Equal("ABB", Diamond.Print('B'));

    [Fact(Skip = "1. Make it pass 2. Skip it again or delete it and go to next test")]
    public void Have_separate_lines_when_B_is_supplied()
        => Assert.Equal(
            "A\n" +
            "BB\n",
            Diamond.Print('B'));

    [Fact(Skip = "1. Make it pass 2. Skip it again or delete it and go to next test")]
    public void Indent_characters_when_B_is_supplied()
        => Assert.Equal(
            " A\n" +
            "BB\n",
            Diamond.Print('B'));

    [Fact(Skip = "1. Make it pass 2. Skip it again or delete it and go to next test")]
    public void Separate_characters_with_inter_character_spaces_when_B_is_supplied()
        => Assert.Equal(
            " A\n" +
            "B B\n",
            Diamond.Print('B'));

    [Fact(Skip = "1. Make it pass 2. Skip it again or delete it and go to next test")]
    public void Print_the_bottom_half_by_symmetry()
        => Assert.Equal(
            " A\n" +
            "B B\n" +
            " A",
            Diamond.Print('B'));

    [Fact(Skip = "1. Make it pass 2. Congrats, you have a working solution")]
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