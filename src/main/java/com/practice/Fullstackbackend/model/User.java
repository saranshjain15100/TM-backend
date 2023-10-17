package com.practice.Fullstackbackend.model;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "sampling_tm")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "CUST_NAME")
    private String name;
    @Column(name = "score")
    private int score;
    @Column(name = "Sampling_type")
    private String samplingType;

    @Column(name = "Case_type")
    private String caseType;

    @Column(name = "Scenario_type")
    private String scenarioType;

    @Column(name = "Date")
    private Date date;

    public User(String name, int score, String samplingType, String caseType, String scenarioType, Date date) {
        this.name = name;
        this.score = score;
        this.samplingType = samplingType;
        this.caseType = caseType;
        this.scenarioType = scenarioType;
        this.date = date;
    }

    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
