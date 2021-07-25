package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;

public class TestInstructor {

    @Test
    public void testImplementationOfTeacher(){
        Instructor instructor= new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testImplementationOfPeerson(){
        Instructor instructor= new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        //given
        double expectedStudy=20;
        Instructor instructor= new Instructor(0, null);
        Student student = new Student(0, null, 0);
        //when
        instructor.teach(student, expectedStudy);
        double actual=student.getNumberOfStudyHours();
        //then
        Assert.assertEquals(expectedStudy, actual);
    }
    @Test
    public void testLecture(){
        //given
        double expectedStudyHours= 203;
        Instructor instructor= new Instructor(0, null);
        Student student = new Student(0, null, 0);
        Student[] students = new Student[2];
        //when
        instructor.lecture(students, expectedStudyHours);
        double actual= student.getNumberOfStudyHours();
        //then
        Assert.assertEquals(expectedStudyHours,actual);
    }
}
