package strategies;

import model.RollsResult;
import java.util.Map;

/**
 * Represents a scoring strategy for a dice game that follows the rules of a Full House.
 * In a Full House, the roll is scored based on the sum of dice face values only if it contains a pair and a three of a kind.
 */
public class FullHouse implements ScoringStrategy {

    /**
     * Scores the result of a dice roll according to the rules of a Full House.
     * If the roll contains a pair (two of the same number) and a three of a kind (three of the same number), it returns the sum of the face values of the dice.
     * Otherwise, it returns zero.
     *
     * @param rolls Result of a dice roll
     * @return the sum of the face values of the dice if the roll is a full house, zero otherwise
     */
    @Override
    public int score(RollsResult rolls) {
        Map<Integer, Long> counts = rolls.getCountMap();
        if (counts.containsValue(2L) && counts.containsValue(3L)) {
            return rolls.getDicesSum();
        }
        return 0;
    }
}