package Assignment_2;

import javax.lang.model.type.NullType;
import java.util.Arrays;

class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        // your code
        long[] pair = new long[2];
        if(m+g>n){
            return null;
        }
        else{
            for (long i=m; i<n-g; i++){
                if(isPrime(i)&after_gap(i, g)){
                    pair[0] = i;
                    pair[1] = i+g;
                    return pair;
                }else
                    continue;
            }
            return null;
        }
    }

    public static boolean isPrime(long num){ //start

        if(num==2){
            return true;
        }
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean after_gap (long num, long gap) {
        long temp = num + gap;
        if (isPrime(temp)) {
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Fixed Tests");
        GapInPrimes test = new GapInPrimes();
        //[101, 103]
        System.out.println(Arrays.toString(test.gap(2,100,110)));
        //[103, 107]
        System.out.println(Arrays.toString(test.gap(4,100,110)));
        //null
        System.out.println(Arrays.toString(test.gap(6,100,110)));
        //null
        System.out.println(Arrays.toString(test.gap(708, 4356, 1247457)));
        //[359, 367]
        System.out.println(Arrays.toString(test.gap(8,300,400)));
        //[337, 347]
        System.out.println(Arrays.toString(test.gap(10,300,400)));

    }
}
