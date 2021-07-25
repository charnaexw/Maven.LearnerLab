package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable{
    ArrayList<Person> personList= new ArrayList<Person>();

    public void addPerson(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        for(Person person: personList){
            if(person.getId()==id){
                return person;
            }
        }return null;
    }
    public Boolean containsPerson(Person person){
        for(Person person1: personList){
            if(person1==person){
                return true;
            }
        }
        return false;
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void removeById(long id){
        personList.remove(findById(id));
    }
    public void removeAll(){
        personList.removeAll(personList);
    }
    public double count(ArrayList<Person> personList){
        double numOfPersons= this.personList.size();
        return numOfPersons;
    }
    public Object[] toArray(){
        Person[] person;
        return personList.toArray();
    }

    public Iterator iterator() {
        return personList.listIterator();
    }
}
