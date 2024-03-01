/*
 * Square Every Digit
 * https://www.codewars.com/kata/546e2562b03326a88e000020
 */

package main.java.belajar.soalsoaldasprog;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;

public class SquareEveryDigit {
    public static int squareDigits(int n) {
        int result;
        String temp = Integer.toString(n);
        String[] arrayTemp = temp.split("");
        int[] arrayNumbers = new int[arrayTemp.length];
        //convert array
        for (var i = 0; i < arrayTemp.length; i++) {
            arrayNumbers[i] = Integer.parseInt(arrayTemp[i]);
            arrayNumbers[i] = arrayNumbers[i] * arrayNumbers[i];
        }

        for (var i = 0; i < arrayNumbers.length; i++) {
            arrayTemp[i] = String.valueOf(arrayNumbers[i]);
        }

        temp = String.join("", arrayTemp);
        result = Integer.valueOf(temp);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(123));
        System.out.println(squareDigits(12382));
    }
}
