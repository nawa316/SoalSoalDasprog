/*
 * Ten Green Bottles
 * https://www.codewars.com/kata/5838e2978bbc04b7cd000008
 */
package belajar.soalsoaldasprog;

public class TenGreenBottles {
    public static String tenGreenBottles(int n) {
        String[] number = {
                "One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"
        };

        String result = "";
        for (int i =  n-1; i >= 0; i--){
            if (i > 1) {
                result +=
                        number[i] + " green bottles hanging on the wall,\n" +
                                number[i] + " green bottles hanging on the wall,\n" +
                                "And if one green bottle should accidentally fall,\n" +
                                "There'll be " + number[i-1].toLowerCase() + " green bottles hanging on the wall.\n"
                                +"\n";
            } else if (i == 1) {
                result +=
                        number[i] + " green bottles hanging on the wall,\n" +
                                number[i] + " green bottles hanging on the wall,\n" +
                                "And if one green bottle should accidentally fall,\n" +
                                "There'll be " + number[i-1].toLowerCase() + " green bottle hanging on the wall.\n"
                                +"\n";
            } else if (i == 0){
                result +=
                        number[i] + " green bottle hanging on the wall,\n"+
                                number[i] + " green bottle hanging on the wall,\n"+
                                "If that one green bottle should accidentally fall,\n"+
                                "There'll be no green bottles hanging on the wall.\n";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(tenGreenBottles(5));
    }
}
