import model.RollsResult;
import org.junit.Before;
import org.junit.Test;
import strategies.Chance;
import strategies.OfAKind;
import strategies.ScoringStrategy;

import static org.junit.Assert.assertEquals;

public class OfAKindScoringTest {

    private ScoringStrategy threeOfAKind;
    private ScoringStrategy fourOfAKind;

    @Before
    public void setUp() {
        threeOfAKind = new OfAKind(3);
        fourOfAKind = new OfAKind(4);
    }
    @Test
    public void threeOfAKind_Test () {

        // Prepare
        int expectedValue1 = 9;
        int expectedValue2 = 15;
        RollsResult roll1 = new RollsResult(3,3,3,4,5);
        RollsResult roll2 = new RollsResult(5,3,5,4,5);
        RollsResult roll3 = new RollsResult(3,3,3,3,5);

        // Act
        int actualValue1 = threeOfAKind.score(roll1);
        int actualValue2 = threeOfAKind.score(roll2);
        int actualValue3 = threeOfAKind.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
        assertEquals(expectedValue1, actualValue3);
    }

    @Test
    public void FourOfAKind_Test () {

        // Prepare
        int expectedValue1 = 12;
        int expectedValue2 = 20;
        int expectedValue3 = 9;
        RollsResult roll1 = new RollsResult(3,3,3,3,5);
        RollsResult roll2 = new RollsResult(5,5,5,4,5);
        RollsResult roll3 = new RollsResult(3,3,3,3,3);

        // Act
        int actualValue1 = fourOfAKind.score(roll1);
        int actualValue2 = fourOfAKind.score(roll2);
        int actualValue3 = fourOfAKind.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
        assertEquals(expectedValue1, actualValue3);
    }

}
