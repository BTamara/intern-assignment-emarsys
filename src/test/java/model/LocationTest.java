package model;

import static org.junit.Assert.*;

/**
 * Created by bt on 2017.03.21..
 */
public class LocationTest {
    Location testLocation1;
    Location testLocation2;

    @org.junit.Before
    public void setUp() throws Exception {
        testLocation1 = new Location("testLocation");
        testLocation2 = new Location("testLocation2");

    }

    @org.junit.Test
    public void setNameTest() throws Exception {
        testLocation1.setName("test");
        assertEquals("test", testLocation1.getName());
    }

    @org.junit.Test
    public void setCounterTest() throws Exception {
        testLocation1.setCounter();
        assertEquals(1, (Object)testLocation1.getCounter());

    }

    @org.junit.Test
    public void setCounterTest2() throws Exception {
        testLocation1.setCounter(2);
        assertEquals(2, (Object)testLocation1.getCounter());
    }


    @org.junit.Test
    public void setRelationTest() throws Exception {
        testLocation2.setName("TestLocation2");
        testLocation1.setRelation(testLocation2);
        assertEquals(testLocation2.getName(), testLocation1.getRelation());

    }

    @org.junit.Test
    public void setRelationTestIfRelationIsNull() throws Exception {
        testLocation1.setRelation(null);
        assertEquals("No relation", testLocation1.getRelation());

    }

}