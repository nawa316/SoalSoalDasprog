/*
 * SumOfPositive
 * https://www.codewars.com/kata/5715eaedb436cf5606000381
 */

package belajar.soalsoaldasprog;

public class Positive {
    public static int sum(int[] arr){
        int result = 0;
        for(int value : arr){
            if(value >= 0){
                result += value;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,-3, 5};
        System.out.println(sum(arr));
    }
}
