package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Angel Manuel Correa Rivera
	DATE:28/04/2020
	DESCRIPTION:This software calculate the average of number positive and negatives.
	 */
        f_menu();
    }

    public static void f_menu() {
        //This method is the menu of the software
        System.out.println("----------------------------------------");
        System.out.println("--------------OPERATIONSOFT--------------");
        System.out.println("-----version:1.0------28/04/2020.-------");
        System.out.println("-----Angel Manuel Correa Rivera---------");
        System.out.println("----------------------------------------");
    }
    public static void f_operation_number (){
        //This method asked for ten numbers
        int sumatory_positives=0,sumatory_negatives=0,total_zero=0,number;
        for(int i=1;i<=10;i++) {
            number= f_user_number(i);
            if (number<0){
                sumatory_negatives-=number;
        }else if (number>0){
                sumatory_positives+=number;
            }else {
                total_zero++;
            }
        }

        public static int f_user_number(int i){
            //This method return a user number
        Scanner keyboard= new Scanner(System.in);
            System.out.println("Input the number: "+i);
            int number=keyboard.nextInt();
            return number;
        }
    }

}
