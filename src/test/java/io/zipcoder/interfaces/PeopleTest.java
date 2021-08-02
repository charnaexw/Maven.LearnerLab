package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PeopleTest {
    @Before

    @Test
    public void testAdd(){
        //given
        long givenid= 2738;
        String givenName= "YourMom";
        ArrayList<Person> personList= new ArrayList<Person>();
        Person blin = new Person(givenid, givenName);
        int expected=1;
        //when
        People<Person> people=new People<Person>();
        people.addPerson(blin);
        int actual = (int) people.count(personList);
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        //given
        long givenid= 2738;
        String givenName= "YourMom";
        ArrayList<Person> personList= new ArrayList<Person>();
        Person blin = new Person(givenid, givenName);
        int expected=0;
        //when
        People<Person> people=new People<Person>();
        people.addPerson(blin);
        people.remove(blin);
        int actual = (int) people.count(personList);
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        //given
        long givenid= 2738;
        String givenName= "YourMom";
        Person blin = new Person(givenid, givenName);

        //when
        People<Person> people=new People<Person>();
        people.addPerson(blin);
        Person actual=people.findById(givenid);

        //then
        Assert.assertEquals(blin, actual);
    }
}
