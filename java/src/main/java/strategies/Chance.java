package strategies;


import model.RollsResult;

/**
 * Represents a scoring strategy for a dice game that scores based on the sum of dice face values.
 */
public class Chance implements ScoringStrategy {

    /**
     * Scores the result of a dice roll by returning the sum of the face values of the dice.
     *
     * @param rolls Result of a dice roll
     * @return the sum of the face values of the dice in the given roll
     */
    @Override
    public int score(RollsResult rolls) {
        return rolls.getDicesSum();
    }
}