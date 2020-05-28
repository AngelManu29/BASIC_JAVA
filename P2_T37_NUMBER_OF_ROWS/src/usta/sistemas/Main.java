package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        /*AUTHOR: Angel Manuel Correa Rivera
            DATE: 19/05/2020
                DESCRIPTION:
         */
        int rows = f_menu_total_rows();
                int columns = f_menu_total_columns();
                Scanner keyboard= new Scanner(System.in);
        int[][] matrix_number= new int[rows][columns];
        matrix_number=f_fill_matrix(matrix_number);
        System.out.println("Input the number of the row");
        int number_row = keyboard.nextInt();
        int sumatory = 0;
        double average =0;
        while (number_row>=0&& number_row<matrix_number.length-1){
            for (int j =0 ;j<matrix_number[0].length;j++){
                sumatory+=matrix_number[number_row][j];

            }
            average=sumatory/matrix_number[0].length;
            System.out.println("by number row "+number_row+", the sum is "+sumatory+" and the average is "+average);
            System.out.println("Input other number of the row");
            number_row=keyboard.nextInt();
        }
        System.out.println("Thanks");


    }

    public static int f_menu_total_rows() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("-----------SOFTROWSNUM-----------");
        System.out.println("--Version 1.0     12/05/2020-----");
        System.out.println("---Angel Manuel Correa Rivera----");
        System.out.println("---------------------------------");
        System.out.println("Input who many rows do you want in the matrix");
        int total_rows = keyboard.nextInt();
        while (total_rows <= 0) {
            System.err.println("ERR: The value mus greater than zero");
            System.out.println("Input again who manu rows do you want in the matrix");
            total_rows = keyboard.nextInt();
        }
        return total_rows;
    }

    public static int f_menu_total_columns() {

        Scanner keyboard = new Scanner(System.in);
        int total_columns = keyboard.nextInt();
        while (total_columns <= 0) {
            System.err.println("ERR: The value mus greater than zero");
            System.out.println("Input again who manu columns do you want in the matrix");
            total_columns = keyboard.nextInt();
        }
        return total_columns;
    }

    public static int[][] f_fill_matrix(int[][] matrix_numbers){
        for (int i =0;i<matrix_numbers.length;i++){
            for (int j=0; j<matrix_numbers[0].length;j++){
                matrix_numbers[i][j]= (int)Math.floor((Math.random()*1000)+1);
            }
        }
        return  matrix_numbers;
    }
}