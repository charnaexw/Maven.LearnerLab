package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numOfHours) {
        Student student=new Student(0, null,0);
        learner.learn(numOfHours);
    }
    public void lecture(Learner[] learners, double numOfHours) {
        double learner =learners.length;
        double numberOfHoursPerLearner = numOfHours / learner;
        for(int i=0; i< learners.length; i++){
            learners[i].learn(numberOfHoursPerLearner);
        }

    }
}
