package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        //given
        long expectedId = 283299;
        String expectedName="Superfluous";
        Person person= new Person(expectedId, expectedName);
        //when
        String actual = person.getName();
        long actualId = person.getId();
        //then
        Assert.assertEquals(expectedName, actual);
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void setNameTest() {
        //given
        String expectedName = "Charmander";
        Person person = new Person(0, null);
        //then
        person.setName(expectedName);
        String actual= person.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

}
