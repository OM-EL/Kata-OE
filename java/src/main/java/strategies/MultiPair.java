package strategies;

import model.RollsResult;

import java.util.Map;

/**
 * Represents a scoring strategy for a dice game that follows the rules of scoring multiple pairs.
 * The number of pairs to be considered is specified upon instantiation.
 */
public class MultiPair implements ScoringStrategy {
    private final int numberOfPairs;

    /**
     * Constructs a new MultiPair scoring strategy with a specified number of pairs.
     *
     * @param numberOfPairs the number of pairs to be considered for scoring
     */
    public MultiPair(int numberOfPairs) {
        this.numberOfPairs = numberOfPairs;
    }

    /**
     * Scores the result of a dice roll according to the rules of MultiPair scoring.
     * It first filters out the dice face values that appear in pairs or more, then sorts them in descending order.
     * The sum of the face values of the dice in the highest-valued pairs (up to the specified limit) is calculated and returned.
     *
     * @param rolls Result of a dice roll
     * @return the sum of the face values of the dice in the highest-valued pairs (up to the specified limit)
     */
    @Override
    public int score(RollsResult rolls) {
        Map<Integer, Long> counts = rolls.getCountMap();
        return counts.entrySet().stream()
            .filter(entry -> entry.getValue() >= 2)
            .sorted(Map.Entry.<Integer, Long>comparingByKey().reversed())
            .limit(numberOfPairs)
            .mapToInt(Map.Entry::getKey)
            .reduce(0, (a, b) -> a + 2 * b); // take the value of each dice pair multiplied by 2 into account
    }
}
