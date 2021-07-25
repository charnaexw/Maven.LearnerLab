package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numOfHours) {
        this.totalStudyTime=numOfHours;
    }

    public Double getNumberOfStudyHours() {
        return totalStudyTime;
    }
}
