/*
 * Opposite Number
 * https://www.codewars.com/kata/56dec885c54a926dcd001095
 */
package belajar.soalsoaldasprog;

public class OppositeNumber {
    public static int opposite(int number) {
        return 0 - number;
    }

    public static void main(String[] args) {
        System.out.println(opposite(1));
        System.out.println(opposite(-3));
    }
}
