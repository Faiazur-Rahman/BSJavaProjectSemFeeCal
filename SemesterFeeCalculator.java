package com.BSJavaTrainingProjectPack;

public class SemesterFeeCalculator {
    private StudentInformation allInfo;
    public SemesterFeeCalculator(StudentInformation allInfo) {
        this.allInfo = allInfo;
    }

    public float getSemesterFee(){
        return totalCostWithoutWaiver() * (100F-availableWaiver()) / 100F;
    }

    private float availableWaiver(){
        var cgpa = new CgpaCalculator(allInfo);
        var criteria = allInfo.getCriteria();
        for (int i=0; i<allInfo.getCriteriaCount(); i++){
            if(criteria[i].getCgpa() <= cgpa.getCgpa()){
                return criteria[i].getWaiver();
            }
        }
        return 0F;
    }

    private int totalCostWithoutWaiver(){

        int noOfPreferredCourses = allInfo.getNoOfPreferredCourses();
        var preferredCourses = allInfo.getPreferredCourses();
        int preferredCoursesTotalCredit = 0;
        for (int i=0; i<noOfPreferredCourses; i++){
            preferredCoursesTotalCredit += preferredCourses[i].getCreditHour();
        }

        int perCreditFee = allInfo.getPerCreditFee();

        return perCreditFee * preferredCoursesTotalCredit;
    }

}
