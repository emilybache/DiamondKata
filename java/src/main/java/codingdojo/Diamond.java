package codingdojo;

public class Diamond {
    private char middleLetter;

    public Diamond(char middleLetter) {
        this.middleLetter = middleLetter;
    }

    public String printDiamond() {
        return "A\n";
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(new Diamond(args[0].charAt(0)).printDiamond());
        } else {
            System.out.println("please supply one argument: the char of the diamond middle");
        }
    }
}
