namespace Diamond.Test;

using System;
using System.Text;
using VerifyTests;
using VerifyXunit;
using Xunit;

/*
 * These test cases can be used to test-drive a solution to the diamond kata, in an iterative manner.
   The idea is that you iterate towards a full solution, each test cycle you are closer to a full solution 
   than in the previous one. The thing with iterating is you may delete stuff that was there before,
   or add stuff you know you will need to delete later.
   
   Instructions:
   * Run the test and look at the output you receive (the '.received.' file)
   * Approve the output (rename to '.approved.') if it's closer to what you want than what you had before.
   * Repeat until output matches problem description.
   
   The files named '.iteration1.' etc are there as a guide to head towards.
   The file named '.iteration6.' matches the problem description.
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
