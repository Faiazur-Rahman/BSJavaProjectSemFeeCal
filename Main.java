package com.BSJavaTrainingProjectPack;


public class Main {
    public static void main(String[] args) {

        int resultCount= 5;
        var resultHistory= Console.readResultHistory(resultCount);

        int noOfPreferredCourses=(int)Console.readNumber("Enter Number of Preferred Courses\n----------");
        var preferredCourses= Console.readPreferredCourses(noOfPreferredCourses);

        int waiverCriteriaCount = 4;
        var waiverCriteria = Console.readWaiverCriteria(waiverCriteriaCount);

        int perCreditFee = (int)Console.readNumber("\nEnter Per Credit Fee\n----------");

        var studentInformation = new StudentInformation(
                resultCount,
                resultHistory,
                noOfPreferredCourses,
                preferredCourses,
                waiverCriteriaCount,
                waiverCriteria,
                perCreditFee);

        var prerequisiteValidator = new PrerequisiteValidator(studentInformation);
        boolean isEligible = prerequisiteValidator.validate();

        if (!isEligible){
            System.out.println("Some of the chosen courses have prerequisites \n" +
                    "which should been completed first");
        }
        else {
            var semesterFeeCalculator = new SemesterFeeCalculator(studentInformation);

            float semesterFee = semesterFeeCalculator.getSemesterFee();
            System.out.println("Semester Fee to be Paid:\n" + semesterFee);
        }
    }
}
