/*
 * RemoveFIrstandLastCharacter
 * https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
 */
package belajar.soalsoaldasprog;

public class RemoveFirstLastChar {
    public static String remove(String str) {
        return str.substring(1,str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(remove("memakan"));
    }
}
