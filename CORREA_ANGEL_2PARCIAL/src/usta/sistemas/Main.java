package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Angel Manuel Correa Rivera
	    DATE: 26/05/2020
	        DESCRIPTION: Calculate the highest salary of N employees and the total value of wages and the average that were paid in the year.
	 */
	int N_Employees;
	f_menu();
	N_Employees=f_employees();
    int [][] Matrix = new int[N_Employees][12];
    int [] N_total_Salary_employee = new int [N_Employees];
    f_Salary_employee(f_fill_matrix(Matrix), N_total_Salary_employee);

    }
    public static void f_menu(){
        //This Method generate the menu of the software.
        System.out.println("Hello!, This software Calculate the highest salary of N employees and the total value of wages and the average that were paid in the year. ");
        System.out.println("---------------SALARYSOFTAVERGARE---------------");
        System.out.println("--Version:Pre Beta 0.1--------26/05/2020--------");
        System.out.println("-----Created by: Angel Manuel Correa Rivera-----");
        System.out.println("------------------------------------------------");
    }
    public static int f_employees(){
        //This method return the number of employees for calculate the 12 salaries.
        Scanner keyboard = new Scanner(System.in);
        int Employees = 0;
        System.out.println("Please, Input the number of employees that you need calculate the 12 Salaries of the year.");
        Employees = keyboard.nextInt();
        if (Employees <= 0){
            System.err.println("ERR: The number of employees must be greater than 0.");
            System.out.println("Please, Input again the number of employees that you need calculate the 12 Salaries of the year.");
            Employees= keyboard.nextInt();
        }
            return Employees;
    }
    public static int[][] f_fill_matrix(int[][]matrix){
        //Description: This method return the fill matrix.
            for (int i = 0; 1 < matrix.length; i++){
                for (int y = 0; y <12; y ++){
                    matrix[i][y] = (int) Math.floor((Math.random()*4905000)+981000);
                }
            }
            return matrix;
    }
    public static void f_Salary_employee(int[][] fill_matrix, int[] n_total_Salary_employee){
        //This method return the salary of one employed.
        int count = 0, high_salary = 0, average = 0, higher_Salary_employee=0;
        for (int i= 0 ; i < fill_matrix.length; i++){
            for (int y = 0; y < 12; y++ ){
                count += fill_matrix[i][y];
                if (fill_matrix[i][y] > high_salary){
                    high_salary = fill_matrix[i][y];
                    higher_Salary_employee +=1;
                }
            }
        }
        average = count/(fill_matrix.length*12);
        System.out.println("The employee with the most higher salary is the number: "+higher_Salary_employee+" with the salary: "+high_salary);
        System.out.println("The total of the salaries of employees are: "+count);
        System.out.println("The average of the salaries are: "+ average);
    }
}
