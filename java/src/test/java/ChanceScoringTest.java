import model.RollsResult;
import org.junit.Before;
import org.junit.Test;
import strategies.*;

import static org.junit.Assert.assertEquals;

public class ChanceScoringTest {

    private ScoringStrategy chance;

    @Before
    public void setUp() {
        chance = new Chance();
    }
    @Test
    public void chance_Test () {

        // Prepare
        int expectedValue1 = 15;
        int expectedValue2 = 16;
        RollsResult roll1 = new RollsResult(2,3,4,5,1);
        RollsResult roll2 = new RollsResult(3,3,4,5,1);

        // Act
        int actualValue1 = chance.score(roll1);
        int actualValue2 = chance.score(roll2);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }

}
