package com.BSJavaTrainingProjectPack;

public class CgpaCalculator {
    private StudentInformation allInfo;

    public CgpaCalculator(StudentInformation allInfo) {
        this.allInfo = allInfo;
    }

    public float getCgpa(){

        float sumOfResults = 0F;
        var resultHistory = allInfo.getResultHistory();
        for (int i=0; i<allInfo.getResultCount(); i++){
            sumOfResults += resultHistory[i].getResult();
        }

        float sumOfCredits = 0F;
        for (int i=0; i<allInfo.getResultCount(); i++){
            sumOfCredits += (float) resultHistory[i].getCreditCount();
        }
        return (sumOfResults/sumOfCredits);
    }
}
