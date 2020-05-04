package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Angel Manuel Correa Ribera
	DATE: 28/04/2020
	DESCRIPTION: This software count numbers.
	 */
        f_menu();
        int total_digits = 0;
        int numberUser = f_number_user();
        if (numberUser!=0) {
            while (numberUser != 0) {
                numberUser = numberUser / 10;
                total_digits++;
            }
        }else{total_digits=1;}
        System.out.println("The total digits of the number is :"+total_digits);
    }

    public static void f_menu() {
        //This method is the menu of the software
        System.out.println("----------------------------------------");
        System.out.println("--------------DIGITALSOFT---------------");
        System.out.println("-----version:1.0------28/04/2020.-------");
        System.out.println("-----Angel Manuel Correa Rivera---------");
        System.out.println("----------------------------------------");
    }

    public static int f_number_user() {
        //This method return the number input by the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number");
        int number = keyboard.nextInt();
        return number;
    }
}
