/*
 * Multiple 3 or 5
 * https://www.codewars.com/kata/514b92a657cdc65150000006
 */

package belajar.soalsoaldasprog;

public class Multiple3or5 {
    public static int solution(int number) {
        int number3 = number;
        int number5 = number;
        int result = 0;
        int counter3;
        int counter5;

        for (counter3 = 0; ; counter3++){
            if(number3 > 3) {
                number3 = number3 - 3;
            } else {
                break;
            }
        }

        for (counter5 = 0; ; counter5++){
            if(number5 > 5) {
                number5 = number5 - 5;
            } else {
                break;
            }
        }

        int[] data3 = new int[counter3];
        int[] data5 = new int[counter5];

        for (var i = 0; i < counter3; i++){
            data3[i] = (i+1) * 3;
        }

        for(var i = 0; i < counter5; i++){
            data5[i] = (i+1) * 5;
        }

        //check kesamaan data
        for (var i= 0; i < data3.length; i++) {
            for (var j = 0; j < data5.length; j++){
                if (data3[i] == data5[j]){
                    data5[j] = 0;
                    break;
                }
            }
        }

        for (var i= 0; i < data3.length; i++) {
            result += data3[i];
        }

        for (var i = 0; i < data5.length; i++) {
            result += data5[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
        System.out.println(solution(20));
    }
}

