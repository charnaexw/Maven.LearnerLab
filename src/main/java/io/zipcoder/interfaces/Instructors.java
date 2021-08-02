package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

        private Instructors(){
            this.addPerson(new Instructor(1l,"Dolio"));
            this.addPerson(new Instructor(2l,"Leon"));
            this.addPerson(new Instructor(3l,"Other Dolio"));
        }


        public static Instructors getInstance(){
            return INSTANCE;
        }

        @Override
        public Instructor[] toArray() {
            return new Instructor[0];
        }
    }

