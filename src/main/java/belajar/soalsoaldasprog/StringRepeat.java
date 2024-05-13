/*
 * String repeat
 * https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
 */

package belajar.soalsoaldasprog;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++){
            result += (string);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(5,"I"));
    }
}
