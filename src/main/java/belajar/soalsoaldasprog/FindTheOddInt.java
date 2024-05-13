/*
 * Find the odd Int
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 */
package belajar.soalsoaldasprog;

import java.util.Arrays;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int[] tmp = new int[a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = a.length; j >= 0; j--){
                    tmp[i] = a[i];
                    break;
            }
        }

        for(int value : tmp){
            System.out.println(value);
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(findIt(arr));
    }
}
