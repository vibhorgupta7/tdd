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
        VowelCounter statementGenerator = new VowelCounter();
        List<Ride> rides = Arrays.asList(new Ride(3,4), new Ride(5,1));
        Statement statement =  statementGenerator.create(rides);
        assertEquals(85, ((co.interleap.courses.tdd.Statement) statement).getTotalFare(), .01);
        assertEquals(42.5, ((co.interleap.courses.tdd.Statement) statement).getAverageFairPerRide(), .01);
        assertEquals(2, ((co.interleap.courses.tdd.Statement) statement).getNumberOfRides(), .01);

    }

}