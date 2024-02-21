/* 
 * HighAndLow
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 */
package belajar.soalsoaldasprog;

/**
 *
 * @author users_gc6i8
 */

public class highAndLow {
     public static String highAndLow(String numbers) {
         
         String[] array = numbers.split(" ");
         int[] arrayNumbers = new int[array.length];
         //convert array
         for (var i = 0; i < array.length; i++){
             arrayNumbers[i] = Integer.parseInt(array[i]);
         }
         
         int max = arrayNumbers[0];
         int min = arrayNumbers[0];
         for(var i = 0; i < arrayNumbers.length - 1; i++){
            if (arrayNumbers[i] >= arrayNumbers[i+1] && arrayNumbers[i] >= max){
                 max = arrayNumbers[i];
             } else if (arrayNumbers[arrayNumbers.length - 1] >= max){
                 max = arrayNumbers[arrayNumbers.length - 1];
             } 
            }
         
         
        for(var i = 0; i < arrayNumbers.length - 1; i++){
             if (arrayNumbers[i] <= arrayNumbers[i+1] && arrayNumbers[i] <= min){
                 min = arrayNumbers[i];
             } else if (arrayNumbers[arrayNumbers.length-1] <= min){
                 min = arrayNumbers[arrayNumbers.length - 1];
             }
            }   
      
        return(max + " " + min);
        }
        
     
     public static void main(String[] args) {
         String result = highAndLow("8 3 -5 -1 42 0 0 -9 4 7 4 -4");
         System.out.println(result);
    }
}
     
     
