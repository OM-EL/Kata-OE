package strategies;


import model.RollsResult;


/**
 * Represents a scoring strategy for a dice game that follows the rules of scoring based on a specific dice face value.
 * The dice face value to be considered for scoring is specified upon instantiation.
 */
public class NumberCount implements ScoringStrategy {

    private final Integer dice;

    /**
     * Constructs a new NumberCount scoring strategy with a specified dice face value.
     *
     * @param dice The dice face value to be considered for scoring.
     */
    public NumberCount(Integer dice) {
        this.dice = dice;
    }

    /**
     * Scores the result of a dice roll according to the rules of NumberCount scoring.
     * It calculates the score as the product of the dice face value and its count in the dice roll result.
     *
     * @param rolls Result of a dice roll
     * @return The score as the product of the dice face value and its count in the dice roll result.
     */
    @Override
    public int score(RollsResult rolls) {
        return rolls.countDice(dice) * dice;
    }
}
