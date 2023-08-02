import model.RollsResult;
import org.junit.Before;
import org.junit.Test;
import strategies.MultiPair;
import strategies.NumberCount;

import static org.junit.Assert.assertEquals;

public class NumberCountScoringHouseTest {

    private NumberCount countOnes;
    private NumberCount countTwos;
    private NumberCount countThrees;
    private NumberCount countFours;
    private NumberCount countFives;
    private NumberCount countSixes;

    @Before
    public void setUp() {
        countOnes = new NumberCount(1);
        countTwos = new NumberCount(2);
        countThrees = new NumberCount(3);
        countFours = new NumberCount(4);
        countFives = new NumberCount(5);
        countSixes = new NumberCount(6);
    }
    @Test
    public void countOnesScore_Test () {

        // Prepare
        int expectedValue1 = 1;
        int expectedValue2 = 2;
        int expectedValue3 = 0;
        int expectedValue4 = 4;
        RollsResult roll1 = new RollsResult(1,2,3,4,5);
        RollsResult roll2 = new RollsResult(1,2,1,4,5);
        RollsResult roll3 = new RollsResult(6,2,2,4,5);
        RollsResult roll4 = new RollsResult(1,2,1,1,1);

        // Act
        int actualValue1 = countOnes.score(roll1);
        int actualValue2 = countOnes.score(roll2);
        int actualValue3 = countOnes.score(roll3);
        int actualValue4 = countOnes.score(roll4);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
        assertEquals(expectedValue3, actualValue3);
        assertEquals(expectedValue4, actualValue4);
    }

    @Test
    public void countTwosScore_Test () {

        // Prepare
        int expectedValue1 = 4;
        int expectedValue2 = 10;
        RollsResult roll1 = new RollsResult(1,2,3,2,6);
        RollsResult roll2 = new RollsResult(2,2,2,2,2);

        // Act
        int actualValue1 = countTwos.score(roll1);
        int actualValue2 = countTwos.score(roll2);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }

    @Test
    public void countThreesScore_Test () {

        // Prepare
        int expectedValue1 = 6;
        int expectedValue2 = 12;
        RollsResult roll1 = new RollsResult(1,2,3,2,3);
        RollsResult roll2 = new RollsResult(2,3,3,3,3);

        // Act
        int actualValue1 = countThrees.score(roll1);
        int actualValue2 = countThrees.score(roll2);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }

    @Test
    public void countFoursScore_Test () {

        // Prepare
        int expectedValue1 = 12;
        int expectedValue2 = 8;
        int expectedValue3 = 4;
        RollsResult roll1 = new RollsResult(4,4,4,5,5);
        RollsResult roll2 = new RollsResult(4,4,5,5,5);
        RollsResult roll3 = new RollsResult(4,5,5,5,5);

        // Act
        int actualValue1 = countFours.score(roll1);
        int actualValue2 = countFours.score(roll2);
        int actualValue3 = countFours.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
        assertEquals(expectedValue3, actualValue3);
    }

    @Test
    public void countFivesScore_Test () {

        // Prepare
        int expectedValue1 = 10;
        int expectedValue2 = 15;
        int expectedValue3 = 20;
        RollsResult roll1 = new RollsResult(4,4,4,5,5);
        RollsResult roll2 = new RollsResult(4,4,5,5,5);
        RollsResult roll3 = new RollsResult(4,5,5,5,5);

        // Act
        int actualValue1 = countFives.score(roll1);
        int actualValue2 = countFives.score(roll2);
        int actualValue3 = countFives.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
        assertEquals(expectedValue3, actualValue3);
    }


    @Test
    public void countSixesScore_Test () {

        // Prepare
        int expectedValue1 = 0;
        int expectedValue2 = 6;
        int expectedValue3 = 18;
        RollsResult roll1 = new RollsResult(4,4,4,5,5);
        RollsResult roll2 = new RollsResult(4,4,6,5,5);
        RollsResult roll3 = new RollsResult(6,5,6,6,5);

        // Act
        int actualValue1 = countSixes.score(roll1);
        int actualValue2 = countSixes.score(roll2);
        int actualValue3 = countSixes.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
        assertEquals(expectedValue3, actualValue3);
    }

}
