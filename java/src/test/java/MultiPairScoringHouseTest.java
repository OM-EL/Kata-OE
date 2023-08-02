import model.RollsResult;
import org.junit.Before;
import org.junit.Test;
import strategies.MultiPair;

import static org.junit.Assert.assertEquals;

public class MultiPairScoringHouseTest {
    private MultiPair onePair;
    private MultiPair twoPairs;

    @Before
    public void setUp() {
        onePair = new MultiPair(1);
        twoPairs = new MultiPair(2);
    }
    @Test
    public void onePair_Test () {

        // Prepare
        int expectedValue1 = 6;
        int expectedValue2 = 10;
        int expectedValue3 = 12;
        RollsResult roll1 = new RollsResult(3,4,3,5,6);
        RollsResult roll2 = new RollsResult(5,3,3,3,5);
        RollsResult roll3 = new RollsResult(5,3,6,6,5);

        // Act
        int actualValue1 = onePair.score(roll1);
        int actualValue2 = onePair.score(roll2);
        int actualValue3 = onePair.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
        assertEquals(expectedValue3, actualValue3);
    }

    @Test
    public void twoPairs_Test () {

        // Prepare
        int expectedValue1 = 16;
        RollsResult roll1 = new RollsResult(3,3,5,4,5);
        RollsResult roll2 = new RollsResult(3,3,5,5,5);

        // Act
        int actualValue1 = twoPairs.score(roll1);
        int actualValue2 = twoPairs.score(roll2);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue1, actualValue2);
    }
}
