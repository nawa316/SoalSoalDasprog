/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar.soalsoaldasprog;

/**
 *
 * @author users_gc6i8
 */
public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        char[] array = str.toCharArray();
        
        String result = "";
        for (var i = 0; i < array.length; i++){
            switch(array[i]){
                case 'a', 'A', 'i', 'I', 'u', 'U', 'e', 'E', 'o', 'O' -> result += "";
                default ->{
                    result += array[i];
                }
            }
        }
        return result;
    }
    
    public static String disemvowel2(String str){
        return str.replaceAll("[aAiIuUeEoO]", "[]");
    }
    
    public static void main(String[] args) {
        System.out.println(disemvowel("Belajar bersama daniel"));
        System.out.println(disemvowel("Belajar bersama daniel"));
    }
}
