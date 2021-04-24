package co.interleap.courses.tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    // StatementGenerator
    @Test
    public void shouldCalculateFareGivenAtTime(){
        VowelCounter statementGenerator = new VowelCounter();
        double totalFare =  statementGenerator.create(0,1);

        assertEquals(1,totalFare, .01);
    }

    @Test
    public void shouldCalculateFareGivenADistanceAndTime(){
        VowelCounter statementGenerator = new VowelCounter();
        double totalFare =  statementGenerator.create(3,2);

        assertEquals(32,totalFare, .01);
    }
// VowelCounter
//    @Test
//    public void distanceAndTimeZero(){
//        assertEquals(0, new VowelCounter().count(""));
//    }
//
//    @Test
//    public void onlyDistanceZero(){
//        assertEquals(1, new VowelCounter().count("u"));
//    }
//
//    @Test
//    public void onlyTimeZero(){
//        assertEquals(5, new VowelCounter().count("aeiou"));
//    }
//
//    @Test
//    public void distanceAndTimeNonZero(){
//        assertEquals(6, new VowelCounter().count("bbghmn"));
//    }

}