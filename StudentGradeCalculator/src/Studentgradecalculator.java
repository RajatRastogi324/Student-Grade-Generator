import java.util.Scanner;

public class Studentgradecalculator {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        //Enter total no of students to calculate their marks
        System.out.println("Enter Total number of subject: ");
        int numSubjects = scan.nextInt();
        int totalMarks = 0;
        for(int i=1; i<=numSubjects; i++){
            System.out.println("Enter Marks For Subject " + i +" out of 100");
            int marks = scan.nextInt();
            //input validation
            while(marks <0 || marks > 100){
                System.out.println("Invalid marks. please enter marks between 0 & 100.");
                System.out.println("Enter marks for Subject " + i  + " out of 100");
                marks = scan.nextInt();

            }
            totalMarks +=marks ;
        }
       System.out.println("Student Result: ");
        System.out.println("total marks obtained in all subject; "+ totalMarks);
        // calculate Average percentage : divide the total marks by the total number of subject
        int AveragePercentage = totalMarks / numSubjects;
        System.out.println("Average Percentage: "+ AveragePercentage);
        if (AveragePercentage >= 90) {
            System.out.println("Your grade: A+");
        } else if (AveragePercentage>=80) {
            System.out.println("Your grade: A");
        } else if (AveragePercentage>=70) {
            System.out.println("Your grade: B+ ");
        } else if (AveragePercentage>=60) {
            System.out.println("Your grade: B");
        } else if (AveragePercentage>=50) {
            System.out.println("Your grade: C+");
        } else if (AveragePercentage>=40) {
            System.out.println("Your grade: C");
        } else if (AveragePercentage>=30) {
            System.out.println("Your grade: D");

        } else {
            System.out.println("Your grade: E");
        }
        scan.close();
    }
}
