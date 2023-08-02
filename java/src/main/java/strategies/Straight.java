package strategies;


import model.RollsResult;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Straight implements ScoringStrategy {

    public static final List<Integer> smallStraight = Arrays.asList(1 , 2 , 3 , 4 , 5);
    public static final List<Integer> bigStraight = Arrays.asList(2 , 3 , 4 , 5 , 6);
    private final List<Integer> straight;
    private final int straightSum; // To avoid calculating sum every time

    public Straight(List<Integer> straight) {
        this.straight = straight;
        this.straightSum = straight.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Calculates the score based on the 'straight' rule in dice games.
     * If the sorted list of dice equals the predefined straight list, returns the sum of the straight list.
     * Otherwise, returns 0.
     *
     * @param dice The result of a dice roll.
     * @return The calculated score based on the 'straight' rule.
     */
    @Override
    public int score(RollsResult dice) {
        return dice.getDices().stream().sorted().collect(Collectors.toList()).equals(straight) ?
            straightSum : 0;
    }
}
