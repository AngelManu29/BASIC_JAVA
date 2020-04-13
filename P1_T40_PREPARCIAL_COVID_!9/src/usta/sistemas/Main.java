package usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Angel Manuel Correa Rivera
	    DATE: 25/03/2020
	    DESCRIPTION: This program helps people to determine if they have Covid 19.
	 */
        Scanner keyboard = new Scanner(System.in);
        int Cough, Body_ache, Difficulty_breathing, Age;
        double Degrees;

        System.out.println("First, How old are you?");
        Age = keyboard.nextInt();
        System.out.println("Nest you were asked about the different symptoms of Covid19, please answer with 1 for YES and 0 for NO, Do you have a dry cough?");
        Cough = keyboard.nextInt();
        System.out.println("Do you have body pain?");
        Body_ache = keyboard.nextInt();
        System.out.println("Do you have trouble breathing?");
        Difficulty_breathing = keyboard.nextInt();
        System.out.println("What is your temperature? In degrees");
        Degrees = keyboard.nextDouble();

        if (Cough < 0 || Cough > 1 || Body_ache < 0 || Body_ache > 1 || Difficulty_breathing < 0 || Difficulty_breathing > 1){
            System.err.println("ERROR: The answer must be 0 or 1");
        }
        if (Cough == 1 && Body_ache == 1 && Difficulty_breathing == 1 && Degrees >= 38 && Age >= 60){
            System.out.println("Go to the doctor or call your eps");
        }
        if (Cough == 1 && Body_ache == 1 && Difficulty_breathing == 1 && Degrees >= 38 && Age <= 60){
            System.out.println("You have the symptoms, but it is best to stay home and treat yourself");
        }
        if (Cough == 0 && Body_ache == 0 && Difficulty_breathing == 0){
            System.out.println("You don´t have any symptoms, stay home");
        }
        System.out.println("This software was created by Angel Manuel Correa Rivera, please stay home, take care.");
    }
}