package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Angel Manuel Correa Rivera
	  DATE: 19 March, 2020
	  DESCRIPTION: This software calculate the volume of a cylinder
	 */
	Scanner keyboard = new Scanner(System.in);
	double height, radius, volume;

	    System.out.println("This software calculate the volume of a cylinder in cm, please, input the height(cm): ");
        height = keyboard.nextDouble();
        System.out.println("Please enter the radius(cm): ");
        radius = keyboard.nextDouble();
        volume = 3.1416* Math.pow(radius, 2)* height;
        System.out.println("The volume of the cylinder is (cm): " + volume);
    }
}
