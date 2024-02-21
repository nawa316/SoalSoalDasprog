/* 
 * Vowels
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3
 */
package belajar.soalsoaldasprog;

/**
 *
 * @author users_gc6i8
 */
public class Vowels {
    public static int getCount(String str) {
        char[] array = str.toCharArray();
        int result = 0;
        for(var i = 0; i < array.length; i++){
            switch(array[i]){
                case 'a','A' -> result += 1;
                case 'i','I' -> result += 1;
                case 'u','U' -> result += 1;
                case 'e','E' -> result += 1;
                case 'o','O' -> result += 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int count = getCount("Awan");
        System.out.println(count);
        
    }     
}
