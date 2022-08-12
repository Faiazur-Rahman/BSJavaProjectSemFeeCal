package com.BSJavaTrainingProjectPack;

import java.util.*;

public class PrerequisiteValidator {
    private StudentInformation allInfo;
    public PrerequisiteValidator(StudentInformation allInfo){
        this.allInfo = allInfo;
    }

    public boolean validate(){

        var prerequisites = getPrerequisites();
        var resultHistory = allInfo.getResultHistory();

        Arrays.sort(resultHistory, Comparator.comparing(ResultHistory::getCourseCode));

        var preferredCourses = allInfo.getPreferredCourses();
        for (int i = 0; i<allInfo.getNoOfPreferredCourses(); i++){
            try{
                int courseCode = prerequisites.get(preferredCourses[i].getCourseCode());

                int startPoint = 0;
                int endPoint = allInfo.getResultCount()-1;
                boolean isTrue = false;
                while (startPoint <= endPoint){
                    int mid = (startPoint + endPoint) >> 1;

                    if(resultHistory[mid].getCourseCode() == courseCode){
                        isTrue = true;
                        endPoint = mid-1;
                    }
                    else if(resultHistory[mid].getCourseCode() > courseCode){
                        endPoint = mid-1;
                    }
                    else {
                        startPoint = mid+1;
                    }
                }
                if (!isTrue){
                    return false;
                }
            }
            catch(NullPointerException e){}
        }
        return true;
    }

    private Map<Integer,Integer> getPrerequisites() {
        Map<Integer, Integer> prerequisites = new HashMap<>();
        prerequisites.put(102, 101);
        prerequisites.put(202,201);
        prerequisites.put(203,202);
        return prerequisites;
    }
}
