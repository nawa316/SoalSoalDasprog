/*
 * Spin Words
 * https://www.codewars.com/kata/5264d2b162488dc400000001
 */

package belajar.soalsoaldasprog;


public class SpinWords {
    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        char[] wordTemp;
        char[] temp;
        int counter = 0;

        for (var i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                temp = words[i].toCharArray();
                wordTemp = new char[temp.length];
                for (var j = temp.length-1; j >= 0; j--) {
                    if (counter == temp.length-1){
                        wordTemp[counter] = temp[j];
                        counter = 0;
                    } else {
                        wordTemp[counter] = temp[j];
                        counter++;
                    }
                }
                words[i] = String.valueOf(wordTemp);
            }
        }
        return String.join(" ",words);
    }


    public static void main(String[] args) {
        System.out.println(spinWords("aku suka sukaaa sukaaa"));
    }
}
