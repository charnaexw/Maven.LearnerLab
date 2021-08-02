package io.zipcoder.interfaces;

import sun.jvm.hotspot.oops.Instance;

public class Students extends People<Student> {
    final static Students INSTANCE  = new Students();

    private Students() {
        this.addPerson(new Student(11, "Nick", 23));
        this.addPerson(new Student(12, "Dee", 23));
        this.addPerson(new Student(13, "Ray", 23));
        this.addPerson(new Student(14, "Tatiana", 23));
        this.addPerson(new Student(15, "Sitara", 23));this.addPerson(new Student(21, "Aidan", 23));
        this.addPerson(new Student(16, "Dipinti", 23));
        this.addPerson(new Student(17, "Jen", 23));
        this.addPerson(new Student(18, "Nathan", 23));
        this.addPerson(new Student(19, "Jon", 23));this.addPerson(new Student(21, "Aidan", 23));
        this.addPerson(new Student(111, "ZachS", 23));
        this.addPerson(new Student(112, "ZachK", 23));
        this.addPerson(new Student(113, "Emmanuel", 23));
        this.addPerson(new Student(114, "Jeremy", 23));
        this.addPerson(new Student(115, "Charnae", 23));
        this.addPerson(new Student(116, "Bobbi", 23));
        this.addPerson(new Student(117, "Nisha", 23));
        this.addPerson(new Student(118, "Laura", 23));
        this.addPerson(new Student(21, "Aidan", 23));
        this.addPerson(new Student(22, "Chuck", 23));
        this.addPerson(new Student(23, "Nikki", 23));
        this.addPerson(new Student(24, "Sean", 23));
        this.addPerson(new Student(25, "Wes", 23));
    }
    static Students getInstance() {
        return INSTANCE;
    }
    @Override
    public Students[] toArray() {
        return new Students[0];
    }

}
