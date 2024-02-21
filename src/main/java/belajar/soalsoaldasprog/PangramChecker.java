/* 
 * PangramChecker
 * https://www.codewars.com/kata/545cedaa9943f7fe7b000048
 */
package belajar.soalsoaldasprog;

/**
 *
 * @author users_gc6i8
 */
public class PangramChecker {
  public static boolean check(String sentence){
    String problem = sentence.replaceAll(".! ", "");
    char[] array = problem.toCharArray();
    char[] alphabet = new char[]{
            'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z', '.', '!' 
            };
    boolean result = false;
    
    //checking
    boolean[] check = new boolean[26];
    for(var i = 0; i < array.length; i++){
        switch(array[i]){
            case 'a','A' -> check[0] = true;
            case 'b','B' -> check[1] = true;
            case 'c','C' -> check[2] = true;
            case 'd','D' -> check[3] = true;
            case 'e','E' -> check[4] = true;
            case 'f','F' -> check[5] = true;
            case 'g','G' -> check[6] = true;
            case 'h','H' -> check[7] = true;
            case 'j','J' -> check[8] = true;
            case 'k','K' -> check[9] = true;
            case 'l','L' -> check[10] = true;
            case 'm','M' -> check[11] = true;
            case 'n','N' -> check[12] = true;
            case 'o','O' -> check[13] = true;
            case 'p','P' -> check[14] = true;
            case 'q','Q' -> check[15] = true;
            case 'r','R' -> check[16] = true;
            case 's','S' -> check[17] = true;
            case 't','T' -> check[18] = true;
            case 'u','U' -> check[19] = true;
            case 'v','V' -> check[20] = true;
            case 'w','W' -> check[21] = true;
            case 'x','X' -> check[22] = true;
            case 'y','Y' -> check[23] = true;
            case 'z','Z' -> check[24] = true;
            case 'i','I' -> check[25] = true;
        }  
    }

    //Scan Result
    for(var i = 0; i < check.length; i++){
        if(check[i] == true){
            result = true;     
        } else {
            result = false;
            break;
        }     
    }
    
    return result;
  }
  
    public static void main(String[] args){
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }
}