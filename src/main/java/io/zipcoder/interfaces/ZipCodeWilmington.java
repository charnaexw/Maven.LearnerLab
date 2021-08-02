package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    final Students students = Students.getInstance();
    final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.personList.toArray(new Learner[0]), numberOfHours);
    }

    public void hostlecture(long id, double numberOfHours) {
        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public void getStudyMap() {

    }
}
