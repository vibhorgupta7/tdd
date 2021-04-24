package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    // StatementGenerator
    @Test
    public void shouldCalculateFareGivenAtTime(){
        VowelCounter statementGenerator = new VowelCounter();
        List<Ride> rides = Collections.singletonList(new Ride(0,1));
        double totalFare = statementGenerator.create(rides);
        assertEquals(1, totalFare, .01);
    }

    @Test
    public void shouldCalculateFareGivenADistanceAndTime(){
        VowelCounter statementGenerator = new VowelCounter();
        List<Ride> rides = Collections.singletonList(new Ride(3,2));
        double totalFare = statementGenerator.create(rides);
        assertEquals(32, totalFare, .01);
    }

    @Test
    public void generateStatementForMultipleJourneysGivenTotalDistanceAndTime(){
        VowelCounter statementGenerator = new VowelCounter();
        List<Ride> rides = Arrays.asList(new Ride(3,4), new Ride(5,1));
        double totalFare = statementGenerator.create(rides);
        assertEquals(85, totalFare, .01);
    }


}