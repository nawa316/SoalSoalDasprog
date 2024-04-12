/*
 * ReversedStrings
 * https://www.codewars.com/kata/5168bb5dfe9a00b126000018
 */

package belajar.soalsoaldasprog;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("awan"));
    }

    public static String solution(String str) {
        char[] array = str.toCharArray();
        char[] temp = new char[array.length];
        int counter = array.length - 1;
        for(var i = 0; i < array.length; i++){
            if (i == 0){
                temp[array.length - 1] = array[i];
            } else {
                temp[counter - 1] = array[i];
                counter--;
            }
        }
        return String.valueOf(temp);
    }
}
