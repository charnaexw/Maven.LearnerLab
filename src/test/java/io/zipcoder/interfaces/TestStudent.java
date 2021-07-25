package io.zipcoder.interfaces;

import junit.framework.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testStudentImplemetation(){
        Student student = new Student(0, null, 0);
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student student = new Student(0, null, 0);
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        double expectedStudyTime=10;
        double numOfHours=10;
        Student student = new Student(0, null, 0);
        student.learn(numOfHours);
        Assert.assertEquals(expectedStudyTime, student.totalStudyTime);
    }
}
