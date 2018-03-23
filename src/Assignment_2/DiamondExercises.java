package Assignment_2;

import java.lang.reflect.Array;
import java.util.Scanner;


public class DiamondExercises{

    public static void isoscelesTriangle(int height){
        for (int i=0; i<height; i++){
            for (int j=0; j<=height-i; j++){//输出空格随着循环是递减的
                System.out.print(" ");
            }
            for (int k=0; k<=i*2; k++){//输出*号随着外循环是递增的,当k<=i时 只打印三角形的一半,首先k是从0开始的
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int size){
        for (int i = 0; i < size-1; i++){
            for (int j = i+1; j < size; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i+1)*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = i; k < 2*size-i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void diamondWName(int size, String name){
        for (int i = 0; i < size-1; i++){
            for (int j = i+1; j < size; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i+1)*2-1; k++){
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println(name);

        for (int i = 0; i < size; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = i; k < 2*size-i-2; k++){
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the height of the triangle:");
        int height = sc.nextInt();
        isoscelesTriangle(height);

        System.out.println("Please Enter the height of the isoscelesTriangle:");
        int d_height = sc.nextInt();
        diamond(d_height);

        System.out.println("Please Enter the height and name of the Diamond, separate with /:");
        String line = "10/amanda";
        String[] input = line.split("/");
        diamondWName(Integer.parseInt(input[0]), input[1]);
    }
}
