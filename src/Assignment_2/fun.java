package Assignment_2;

import javax.swing.text.html.StyleSheet;
import java.util.*;
import java.util.stream.*;


public class fun {

    public static int digital_root(int n) {
        int dRoot = 0;
        String str = Integer.toString(n);
        String[] strArr = str.split("");
        while (strArr.length > 1) {
            for (int i = 0; i < strArr.length; i++) {
                //System.out.println(intArr[i]);
                dRoot += Integer.valueOf(strArr[i]);
                //System.out.println(dRoot);
            }
            strArr = Integer.toString(dRoot).split("");
        }
        return dRoot;
    }

    public static int solution(int number) {

        int sum3 = (3 + (number - 1) / 3 * 3) * ((number - 1) / 3) / 2;
        int sum5 = (5 + (number - 1) / 5 * 5) * ((number - 1) / 5) / 2;
        int repeat = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                repeat += i;
            }
        }
        return sum3 + sum5 - repeat;
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String str = new String();
        if (numbers.length == 10) {
            String[] phone = new String[numbers.length + 4];
            for (int i=0; i<numbers.length; i++) {
                if (i<3){
                phone[i+1] = Integer.toString(numbers[i]);
                }
                else if (i<6){
                    phone[i+3] = Integer.toString(numbers[i]);
                }
                else
                    phone[i+4] = Integer.toString(numbers[i]);
            }
            phone[0] = "(";
            phone[4] = ")";
            phone[5] = " ";
            phone[9] = "-";
            for(int i=0; i<phone.length; i++) {
                str += phone[i];
            }
            return str;
        }
        else
            return "Wrong length!";
    }

    public static char findMissingLetter(char[] array){

        int ascii = 0;
        for(int i=1; i<array.length; i++){
            if ((int)array[i]-(int)array[i-1]>1){
                ascii = (byte)array[i]-1;
            }
        }
        System.out.println((char)ascii);
        return (char)ascii;
    }

    public static String Tickets(int[] peopleInLine)
    {
        //Your code is here...
        int cash25 = 0;
        int cash50 = 0;
        for(int takein : peopleInLine){
            if(takein==25){
                cash25 += 1;
            }
            else if(takein==50){
                cash25 -= 1;
                cash50 += 1;
            }
            else if(takein==100){
                if(cash50>0){
                    cash50 -= 1;
                    cash25 -= 1;
                }
                else cash25 -= 3;
            }
        }
        return cash25>=0 & cash50>=0 ? "YES" : "NO";
    }

    public static String decompose(long n) {

        ArrayList<String> result = new ArrayList<>();
        String required = new String();
        long expected = n * n;
        long last = 1;
        long diff = expected;
        for (long i = n-1; i > 0; i--) {
            if (diff==1) {
                result.add(String.valueOf(last)+" ");
                Collections.reverse(result);
                for(int j=0; j<result.toArray().length; j++){
                     required += result.toArray()[j];
                }
                return required;
            }
            else if (i * i <= diff) {
                diff -= i*i;
                result.add(String.valueOf(i)+" ");
            }
        }
        return null;
    }

    public static void main(String[] args) {
        long n = 11231;
        //"1 2 4 10"
        System.out.println(decompose(n));
        //System.out.println("[1, 2, 4, 10]".equals(decompose(n)));
        System.out.println(13735*13735);
        System.out.println(13734*13734+166*165+169+49+25+1);
    }

}
