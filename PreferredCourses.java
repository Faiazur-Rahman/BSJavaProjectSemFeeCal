package com.BSJavaTrainingProjectPack;

public class PreferredCourses {
    private int courseCode;
    private int creditHour;

    public PreferredCourses(int creditHour, int courseCode) {
        this.courseCode = courseCode;
        this.creditHour = creditHour;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public int getCreditHour() {
        return creditHour;
    }
}
