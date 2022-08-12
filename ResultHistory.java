package com.BSJavaTrainingProjectPack;

public class ResultHistory {

    private int courseCode;
    private int creditCount;
    private float result;

    public ResultHistory(int courseCode, int creditCount, float result){
        this.courseCode = courseCode;
        this.creditCount = creditCount;
        this.result = result;
    }
    public int getCourseCode() {
        return courseCode;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public float getResult() {
        return result;
    }
}
