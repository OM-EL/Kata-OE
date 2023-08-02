package model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Represents the result of rolling five dice.
 */
public final class RollsResult {

    private final List<Integer> dices; // use final to make the list of dices immutable

    /**
     * Constructor that accepts the face values of five dice.
     */
    public RollsResult(int d1 , int d2 , int d3 , int d4, int d5) {
        dices = Arrays.asList(d1 , d2 , d3 , d4 , d5);
        checkRollsResultValidity();
    }

    /**
     * Checks if the dice face values are between 1 and 6.
     * Throws IllegalArgumentException if not.
     */
    private void checkRollsResultValidity() { // should be private since it's an internal validation
        dices.forEach(
            element -> {
                if(element < 1 || element > 6) {
                    throw new IllegalArgumentException("Dice must have face values between 1 and 6");
                }
            }
        );
    }

    /**
     * Returns the face values of the dice.
     */
    public List<Integer> getDices() {
        return dices; // return a direct reference because List<Integer> is immutable
    }

    /**
     * Returns a map that counts the number of occurrences of each dice face value.
     */
    public Map<Integer, Long> getCountMap() {
        return dices.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Returns the sum of the face values of the dice.
     */
    public int getDicesSum() {
        return dices.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Returns the count of a specific dice face value.
     */
    public int countDice(Integer dice) {
        return (int) dices.stream()
            .filter(currentDie -> currentDie.equals(dice)) // use equals directly since we don't need null safety here
            .count();
    }
}
