package strategies;


import model.RollsResult;
import java.util.Map;

/**
 * Represents a scoring strategy for a dice game that follows the rules of scoring based on the number of similar dices
 */
public class OfAKind implements ScoringStrategy {

    private final int count;

    /**
     * Constructs a new OfAKind scoring strategy with a specified dice kind count.
     *
     * @param count The minimum count of a dice face value to be considered for scoring.
     */
    public OfAKind(int count) {
        this.count = count;
    }

    /**
     * Scores the result of a dice roll based on the number of similar dices
     *
     * @param rolls Result of a dice roll
     * @return The maximum score for the dice kind that appears at least 'count' times,
     *         or 0 if no such kind of dice is found.
     */
    @Override
    public int score(RollsResult rolls) {
        Map<Integer, Long> counts = rolls.getCountMap();
        return counts.entrySet().stream()
            .filter(entry -> entry.getValue() >= count)
            .mapToInt(entry -> entry.getKey() * count)
            .max()
            .orElse(0);
    }
}
