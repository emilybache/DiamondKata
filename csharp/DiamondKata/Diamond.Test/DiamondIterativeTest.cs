namespace Diamond.Test;

using System;
using System.Text;
using VerifyTests;
using VerifyXunit;
using Xunit;

/*
 * These test cases can be used to test-drive a solution to the diamond kata, in an iterative manner. 
 * There are more detailed instructions in the top level README in this repo.
 */
public class DiamondIterativeTest
{
    [Fact]
    public async void TestDiamonds()
    {
        var result = new StringBuilder();
        result.AppendLine("Diamond A:");
        result.AppendLine(new Diamond('A').PrintDiamond());
        result.AppendLine("Diamond B:");
        result.AppendLine(new Diamond('B').PrintDiamond());
        result.AppendLine("Diamond C:");
        result.AppendLine(new Diamond('C').PrintDiamond());
        result.AppendLine("Diamond D:");
        result.AppendLine(new Diamond('D').PrintDiamond());

        await Verifier.Verify(result.ToString());
    }
}
