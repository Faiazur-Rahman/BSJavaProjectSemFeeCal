package com.BSJavaTrainingProjectPack;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readNumber(){
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static ResultHistory[] readResultHistory(int resultCount){
        System.out.println("\nEnter Result History\n----------");

        ResultHistory[] resultHistory = new ResultHistory[20];
        for(int i=0;i<resultCount;i++){
            System.out.print("Enter Result Details of Course "+ (i+1) +
                    "\nEnter The Course Code: ");

            int courseCode = (int) readNumber();

            System.out.print("Enter Credit hour: ");
            int creditHour = (int) readNumber();

            System.out.print("Enter Result: ");
            float result = (float) readNumber();
            System.out.println();

            resultHistory[i] = new ResultHistory(courseCode,creditHour,result);
        }
        return resultHistory;
    }

    public static PreferredCourses[] readPreferredCourses(int noOfPreferredCourses){
        System.out.println("Preferred courses to enroll for the new semester\n" +
                "----------");

        PreferredCourses[] preferredCourses = new PreferredCourses[10];
        for (int i=0; i<noOfPreferredCourses; i++){
            System.out.println("Enter Course Details of Course "+(i+1)+".");

            System.out.print("Enter Course Code: ");
            int courseCode = (int) readNumber();

            System.out.print("\nEnter Credit Hour: ");
            int creditHour = (int) readNumber();

            preferredCourses[i] = new PreferredCourses(creditHour, courseCode);
        }
        return preferredCourses;
    }

    public static WaiverCriteria[] readWaiverCriteria(int criteriaCount){
        System.out.println("\nEnter Waiver Criteria\n----------");

        WaiverCriteria[] criteria = new WaiverCriteria[10];
        for (int i=0; i<criteriaCount; i++){
            System.out.println("Enter Criteria "+(i+1));

            System.out.print("Enter CGPA: ");
            float CGPA = (float) readNumber();

            System.out.print("\nEnter Waiver: ");
            int waiver = (int) readNumber();
            System.out.println();

            criteria[i] = new WaiverCriteria(CGPA,waiver);
        }
        return criteria;
    }
}
