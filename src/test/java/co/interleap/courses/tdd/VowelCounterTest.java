package co.interleap.courses.tdd;

import org.junit.Test;

import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    // StatementGenerator
    @Test
    public void generateStatementForMultipleJourneysGivenTotalDistanceAndTime(){
        List<Ride> rides = Arrays.asList(new Ride(3,4), new Ride(5,1));
        VowelCounter statement =  new VowelCounter(rides);
        assertEquals(85, statement.getTotalFare(), .01);
        assertEquals(42.5, statement.getAverageFarePerRide(), .01);
        assertEquals(2, statement.getNumberOfRides(), .01);

    }

}