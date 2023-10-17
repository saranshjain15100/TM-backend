package com.practice.Fullstackbackend.UserDTO;


public class UserDTO {
    private int score;
    private String samplingType;
    private String caseType;
    private String scenarioType;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSamplingType() {
        return samplingType;
    }

    public void setSamplingType(String samplingType) {
        this.samplingType = samplingType;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getScenarioType() {
        return scenarioType;
    }

    public void setScenarioType(String scenarioType) {
        this.scenarioType = scenarioType;
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "score=" + score +
                ", samplingType='" + samplingType + '\'' +
                ", caseType='" + caseType + '\'' +
                ", scenarioType='" + scenarioType + '\'' +
                '}';
    }
}
