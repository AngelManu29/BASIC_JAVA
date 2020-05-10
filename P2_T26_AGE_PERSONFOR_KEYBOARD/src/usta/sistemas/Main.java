package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Angel Manuel Correa Rivera
	    DATE: 5/05/2020
	        DESCRIPTION: This software calculate who age is the less and the grater.
	 */
	int total_number=f_menu_total_numbers();
	int[]numbers=f_fill_vector_numbers(total_number);
	f_show_bigger_number(numbers);
	f_show_minor_number(numbers);
    }
    public static int f_menu_total_numbers() {
        //Description: This method return the total number
        System.out.println("------------------------------");
        System.out.println("--------AGEKEYBOARDSOFT-------");
        System.out.println("---Version: 1.0  5/05/2020----");
        System.out.println("---Angel Manuel Correa Rivera-");
        System.out.println("------------------------------");
        System.out.println("Input the total number");
        Scanner keyboard = new Scanner (System.in);
        int total_number= keyboard.nextInt();
        while (total_number<=0){
            System.err.println("ERR: The value can't be minor or same zero");
            System.out.println("Input again the total number");
            total_number=keyboard.nextInt();
        }
        return total_number;
    }
    public static int[] f_fill_vector_numbers(int total_number) {
        //Description: This method save N numbers in a vector
        Scanner keyboard= new Scanner(System.in);
        int[] vector = new int[total_number];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Input the integer number ("+(i+1)+")");
            vector[i]=keyboard.nextInt();
        }
        return vector;
    }
    public static void f_show_bigger_number(int[] vector_number){
        //Show the bigger number
        int bigger_number=0;
        for (int i=0;i<vector_number.length;i++){
            if (i==0){
                bigger_number=vector_number[i];
            }else{
                if (bigger_number<vector_number[1]){
                    bigger_number=vector_number[i];
                }
            }

        }
        System.out.println("The bigger number is: "+bigger_number);
    }
    public static void f_show_minor_number(int[] vector_number) {
        //Show the bigger number
        int minor_number = 0;
        for (int i = 0; i < vector_number.length; i++) {
            if (i == 0) {
                minor_number = vector_number[i];
            } else {
                if (minor_number > vector_number[1]) {
                    minor_number = vector_number[i];
                }
            }
            System.out.println("The vector ["+i+"]"+ vector_number[i]);
        }
        System.out.println("The minor number is : "+minor_number);
    }
}

