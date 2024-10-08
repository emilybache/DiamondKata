namespace Diamond;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length > 0)
        {
            Console.WriteLine(Main(args[0][0]));
        }
        else
        {
            Console.WriteLine("please supply one argument: the char of the diamond middle");
        }
    }

    static string Main(char middleLetter)
    {
        return new Diamond(middleLetter).PrintDiamond();
    }
}