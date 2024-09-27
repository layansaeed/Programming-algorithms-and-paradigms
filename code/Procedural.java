package com.company;

import java.util.Scanner;

public class Procedural {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int number_of_students = 3;
        final int number_of_marks = 4;
        String[] students_name = new String[number_of_students];
        String[] students_birth_date = new String[number_of_students];
        String[] students_school_name = new String[number_of_students];
        double[] students_gpa = new double[number_of_students];
        int[][] students_marks = new int[number_of_students][number_of_marks]; // [student_number][mark_number]

        for(int i=0;i<number_of_students;i++) // Enter students information
        {
            System.out.println("Enter student " + (i+1));
            System.out.print("Student name:  ");
            students_name[i] = scanner.next();
            System.out.print("Student birth date :  ");
            students_birth_date[i] = scanner.next();
            System.out.print("Student school name:  ");
            students_school_name[i] = scanner.next();
            System.out.println("Student Marks: ");
            for(int j=0;j<number_of_marks;j++) {
                students_marks[i][j] = scanner.nextInt();
            }
            System.out.println("##############################");
        }

        for(int i=0;i<number_of_students;i++) // Calculate the students gpa
        {
            students_gpa[i] = calculate_gpa(students_marks[i]);
        }

        for(int i=0;i<number_of_students;i++) // Print students information
        {
            System.out.println("\n**************************");
            System.out.println("Name: " + students_name[i]);
            System.out.println("Birth date: " + students_birth_date[i]);
            System.out.println("School Name: " + students_school_name[i]);
            for(int j=0;j<number_of_marks;j++) {
                System.out.print("Marks: " + students_marks[i][j] + " ");
            }
            System.out.println("\nGPA: " + students_gpa[i]);
            System.out.println("\n**************************");
        }



    }
    static double calculate_gpa(int[] marks){
        int sum=0;
        int len = marks.length;
        for(int i=0;i<len;i++){
            sum += marks[i];
        }
        return (double) sum/len;
    }
}
