/* 
 * Wrong End Head
 * https://www.codewars.com/kata/56f699cd9400f5b7d8000b55
 */
package belajar.soalsoaldasprog;

/**
 *
 * @author users_gc6i8
 */
public class WrongEndHead {
    public static void main(String[] args) {
        String[] array = new String[]{
            "Kepala", "Pundak", "Lutut", "Kaki"};
        var result = fixTheMeerkat(array);
        for (var i = 0; i < result.length; i++){
            if (i < result.length - 1){
            System.out.print(result[i] + ", ");
            } else if(i == result.length - 1){
                System.out.println(result[i]);
            }
        }  
    }
    
    public static String[] fixTheMeerkat(String[] arr) {
        var result = new String[3];
        int counter = arr.length-1;
        for (var i = 0; i < arr.length; i++){
            result[i] = arr[counter];
            counter--;
        }
        return result;  
  }
}

