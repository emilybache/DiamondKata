package codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Diamond {

    private final char middleLetter;

    public Diamond(char middleLetter) {
        this.middleLetter = middleLetter;
    }

    public List<List<Character>> getRows() {
        return new ArrayList<List<Character>>();
    }


    public static List<List<Character>> diamond(char middleLetter) {
        Diamond diamond = new Diamond(middleLetter);
        return diamond.getRows();
    }

    public static String print(char middleLetter) {
        Diamond diamond = new Diamond(middleLetter);
        StringBuffer result = new StringBuffer();
        for (List<Character> chars : diamond.getRows()) {
            for (Character c: chars) {
                result.append(c);
            }
            result.append("\n");
        }
        return result.toString();
    }



    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(Diamond.print(args[0].charAt(0)));
        } else {
            System.out.println("please supply one argument: the char of the diamond middle");
        }

    }

}
