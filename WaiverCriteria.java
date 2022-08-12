package com.BSJavaTrainingProjectPack;

public class WaiverCriteria {
    private float cgpa;
    private int waiver;

    public WaiverCriteria(float cgpa, int waiver) {
        this.cgpa = cgpa;
        this.waiver = waiver;
    }

    public float getCgpa() {
        return cgpa;
    }

    public int getWaiver() {
        return waiver;
    }
}
