/*
 * Convert boolean values to strings 'Yes' or 'No'.
 * https://www.codewars.com/kata/53369039d7ab3ac506000467
 */
package belajar.soalsoaldasprog;

public class YesOrNo {
    public static String boolToWord(boolean b)
    {
        return b ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(true));
    }
}
