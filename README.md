# Design pattern 

Strategy.
Every class contains logic, of how we calculate the score.

# Problem in the previous code

-> Consistency: The code style is inconsistent. For instance, some methods use int[] counts, while others use int[] tallies. It is better to stick to a consistent naming convention.

-> Code Duplication: There's a lot of repeated code that could be extracted into helper methods. For example, the counting of dice results is done in almost all methods, so it could be moved to a helper method.

-> Object-Oriented Principles: The object-oriented principles are not used to their full potential. Some methods are static and work with individual dice, others are non-static and use the dice instance variable. It might be better to stick with one approach.

-> Code Readability: Some variable names are not descriptive, like _2, _3, _2_at, _3_at in the fullHouse method, and _1 and _2 in the four_of_a_kind method. It is recommended to use more descriptive variable names.

-> Inconsistent Handling of Dice: The handling of dice is inconsistent. Some methods operate on the individual dice passed as arguments, while others operate on the dice array that's set in the constructor.

-> Magic Numbers: There are magic numbers like 15, 20, and 50 in the code. It's not clear where these numbers come from. It would be better to replace them with named constants.

