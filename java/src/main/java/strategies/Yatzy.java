package strategies;


import model.RollsResult;
import java.util.Map;

public class Yatzy implements ScoringStrategy {

    /**
     * Calculates the score based on the 'Yatzy' rule in dice games.
     * If any dice number is repeated exactly 5 times, returns a fixed score of 50.
     * Otherwise, returns 0.
     *
     * @param rolls The result of a dice roll.
     * @return The calculated score based on the 'Yatzy' rule.
     */
    @Override
    public int score(RollsResult rolls) {
        Map<Integer, Long> counts = rolls.getCountMap();
        return counts.values().stream()
            .anyMatch(count -> count == 5) ? 50 : 0;
    }
}
