/*
 * Square(n) Sum
 * https://www.codewars.com/kata/515e271a311df0350d00000f
 */
package belajar.soalsoaldasprog;

public class SquareSum {

    public static int squareSum(int[] n){
        int result = 0;
        for (int value : n){
            result += value * value;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        System.out.println(squareSum(arr));
    }
}
