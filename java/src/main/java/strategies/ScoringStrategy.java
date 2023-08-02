package strategies;

import model.RollsResult;

/**
 * Represents a strategy for scoring in a dice game.
 * Implementing classes will provide their own methods to calculate scores based on the result of a dice roll.
 */
public interface ScoringStrategy {
    /**
     * Calculates and returns a score based on the given dice roll result.
     *
     * @param dice The result of a dice roll.
     * @return An integer score based on the specific scoring strategy implemented.
     */
    int score(RollsResult dice);
}
