import model.RollsResult;
import org.junit.Before;
import org.junit.Test;
import strategies.Chance;
import strategies.ScoringStrategy;
import strategies.Yatzy;

import static org.junit.Assert.assertEquals;

public class YatzyScoringTest {
    private ScoringStrategy yatzy;

    @Before
    public void setUp() {
        yatzy = new Yatzy();
    }
    @Test
    public void yatzy_Test () {

        // Prepare
        int expectedValue1 = 50;
        int expectedValue2 = 0;
        RollsResult roll1 = new RollsResult(4,4,4,4,4);
        RollsResult roll2 = new RollsResult(6,6,6,6,6);
        RollsResult roll3 = new RollsResult(6,6,6,6,3);


        // Act
        int actualValue1 = yatzy.score(roll1);
        int actualValue2 = yatzy.score(roll2);
        int actualValue3 = yatzy.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue1, actualValue2);
        assertEquals(expectedValue2, actualValue3);
    }
}
