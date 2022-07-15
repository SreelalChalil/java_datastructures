package basics;

import java.util.Scanner;

public class ConsolePgm {

    public static void main(String args[]){
        int age;
        String name;
        char choice = 'n';
        int sum = 0;
        int marks[] = new int[5]; //continous memory locations
        float avg;
        char grade;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine(); // read a sting
            System.out.print("Enter your score for five subject: ");

            for (int i = 0; i < 5; i++) {
                marks[i] = scanner.nextInt();
            }
            // 80, 70, 60, 89, 90
            for (int k = 0; k < 5; k++) {
                sum = sum + marks[k];
            }

            avg = calculateAverage(sum, 5);
            grade = getGrade(avg);
            printDetails(name, sum, avg, grade);

            System.out.println("Do you want to continue for another student(y/n): ");
            choice = scanner.next().charAt(0);

        }while (choice == 'y');
    }

    public static float calculateAverage(int sum, int n){
        float average = sum/n;
        return average;
    }

    public static void printDetails(String name, int sum, float avg, char grade){
        System.out.println("Student Name: "+ name);
        System.out.println("The sum of marks is: " + sum);
        System.out.println("The average marks is: " + avg);
        System.out.println("Grade is: "+ grade);
        System.out.println( 5 + 6);
    }

    public static char getGrade(float avg){
        char grade;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg < 90 && avg >= 80) {
            grade = 'B';
        } else if (avg < 80 && avg >= 70) {
            grade = 'C';
        } else if (avg < 70 && avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
