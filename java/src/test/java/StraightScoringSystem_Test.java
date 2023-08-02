import model.RollsResult;
import org.junit.Before;
import org.junit.Test;
import strategies.ScoringStrategy;
import strategies.Straight;

import static org.junit.Assert.assertEquals;

public class StraightScoringSystem_Test {


    private ScoringStrategy smallStraight;
    private ScoringStrategy bigStraight;

    @Before
    public void setUp() {
        smallStraight = new Straight(Straight.smallStraight);
        bigStraight = new Straight(Straight.bigStraight);
    }


    @Test
    public void smallStraight_Test () {

        // Prepare
        int expectedValue1 = 15;
        int expectedValue2 = 0;
        RollsResult roll1 = new RollsResult(1,2,3,4,5);
        RollsResult roll2 = new RollsResult(2,3,4,5,1);
        RollsResult roll3 = new RollsResult(1,2,2,4,5);

        // Act
        int actualValue1 = smallStraight.score(roll1);
        int actualValue2 = smallStraight.score(roll2);
        int actualValue3 = smallStraight.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue1, actualValue2);
        assertEquals(expectedValue2, actualValue3);
    }


    @Test
    public void bigStraight_Test () {

        // Prepare
        int expectedValue1 = 20;
        int expectedValue2 = 0;
        RollsResult roll1 = new RollsResult(6,2,3,4,5);
        RollsResult roll2 = new RollsResult(2,3,4,5,6);
        RollsResult roll3 = new RollsResult(1,2,2,4,5);

        // Act
        int actualValue1 = bigStraight.score(roll1);
        int actualValue2 = bigStraight.score(roll2);
        int actualValue3 = bigStraight.score(roll3);

        // Assert
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue1, actualValue2);
        assertEquals(expectedValue2, actualValue3);
    }

}
