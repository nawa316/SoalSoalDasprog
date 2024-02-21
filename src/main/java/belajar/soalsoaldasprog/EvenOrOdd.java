/* 
 * EvenOrOdd
 * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
 */

package belajar.soalsoaldasprog;

/**
 *
 * @author users_gc6i8
 * 
 * Create a function that takes an integer as an argument and
 * returns "Even" for even numbers or "Odd" for odd
 * numbers.
 */

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        if ((number % 2) == 0){
            return "Even";
        } else {
        return "Odd";
        }
    }
    
    public static void main(String[] args) {
        System.out.println(evenOrOdd(9));
    }
}
