/* Return Negative
 * https://www.codewars.com/kata/55685cd7ad70877c23000102
 */

package belajar.soalsoaldasprog;

/**
 *
 * @author users_gc6i8
 */
public class ReturnNegative {
    
      public static int makeNegative(final int x) {
          int result;
          if (x <= 0 ){
              result = x;
          } else {
              result = -x;
          }
    return result; 
  } 
      public static void main(String[] args) {
          System.out.println(makeNegative(-20));
          System.out.println(makeNegative(30));
    }
}
