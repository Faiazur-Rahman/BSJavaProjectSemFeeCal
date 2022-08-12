package com.BSJavaTrainingProjectPack;

public class StudentInformation {
    private final ResultHistory[] resultHistory;
    private final int resultCount;
    private final WaiverCriteria[] criteria;
    private final int criteriaCount;
    private final int perCreditFee;
    private final PreferredCourses[] preferredCourses;
    private final int noOfPreferredCourses;


    public StudentInformation(
            int resultCount,
            ResultHistory[] resultHistory,
            int noOfPreferredCourses,
            PreferredCourses[] preferredCourses,
            int criteriaCount,
            WaiverCriteria[] criteria,
            int perCreditFee) {

        this.perCreditFee = perCreditFee;
        this.preferredCourses = preferredCourses;
        this.noOfPreferredCourses = noOfPreferredCourses;
        this.resultHistory = resultHistory;
        this.resultCount = resultCount;
        this.criteria = criteria;
        this.criteriaCount = criteriaCount;
    }

    public ResultHistory[] getResultHistory() {
        return resultHistory;
    }

    public int getResultCount() {
        return resultCount;
    }

    public WaiverCriteria[] getCriteria() {
        return criteria;
    }

    public int getCriteriaCount() {
        return criteriaCount;
    }

    public int getPerCreditFee() {
        return perCreditFee;
    }

    public PreferredCourses[] getPreferredCourses() {
        return preferredCourses;
    }

    public int getNoOfPreferredCourses() {
        return noOfPreferredCourses;
    }
}
