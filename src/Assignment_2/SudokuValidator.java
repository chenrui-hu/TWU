package Assignment_2;

import java.util.*;

public class SudokuValidator {

    public static boolean check(int[][] sudoku) {
        //do your magic
        boolean flag = false;
        if (sudoku.length == 9 & sudoku[8].length == 9) {
            // row & column
            int column = 0;
            for (int row=0; row<sudoku.length; row++) {
                if(isOnly(sudoku[row])){
                    int[] col = new int[9];
                    for(int j=0; j<sudoku[row].length; j++) {
                        col[j] = sudoku[row][j];
                    }
                    flag = isOnly(col);
                }
                if(flag){
                    // left corner coordinates
                    int lcori = row / 3 * 3;
                    int lcorj = column / 3 * 3;
                    // compare
                    ArrayList<Integer> sub_grid = new ArrayList<Integer>();
                    for (int i = lcori; i < lcori + 3; i++) {
                        for (int j = lcorj; j < lcorj + 3; j++) {
                            sub_grid.add(sudoku[i][j]);
                        }
                    }
                    int[] sub = sub_grid.stream().mapToInt(i -> i).toArray();
                    flag = isOnly(sub);
                }
                if(!flag){
                    return flag;
                }
                column += 1;
            }
        }
        return flag;
    }


    public static boolean isOnly(int[] region){

        Set temp = new HashSet();
        if (region!= null){
            for(int i=0; i<region.length; i++){
                temp.add(region[i]);
            }
        }
        return (!temp.contains(0)) & temp.toArray().length==region.length ? true : false;
    }

    public static void main(String[] args) {
        //true
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println(SudokuValidator.check(sudoku));

        //false
        sudoku[4][4] = 0;
        System.out.println(SudokuValidator.check(sudoku));

        //false
        sudoku[4][4] = 5;
        System.out.println(SudokuValidator.check(sudoku));
    }
}
