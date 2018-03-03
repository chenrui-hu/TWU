package Assignment_2;

public class FizzBuzzExercise {

    public static void FizzBuzz(int num){
        if(num%3 == 0 & num%5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(num%3 == 0){
            System.out.println("Fizz");
        }
        else if(num%5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }

    }

    public static void main(String[] args){

        int n = 1;
        for(n = 1; n < 20; n++){
            FizzBuzz(n);
        }

    }
}

