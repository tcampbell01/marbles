import java.util.Scanner;

/**
 * This class contains code for converting a integer number of marbles into a
 * word description of the number of marbles.
 *
 * @author Jim Williams
 * @author Teresa Campbell
 */

public class Marbles {

    /** This method returns words describing the number of marbles passed to the
     * method as follows:
     * less than 0 => "owe marbles"
     * 0           => "no marbles"
     * 1           => "a marble"
     * 2           => "two marbles"
     * 3           => "a few marbles"
     * 4 to 7      => "some marbles"
     * more than 7 => "a lot of marbles"
     *
     * @param numberOfMarbles a number of marbles
     * @return Words describing the number of marbles
     */
    public static String getWordsForMarbles(int numberOfMarbles) {
        if (numberOfMarbles < 0) {
            return "owe marbles";
        } else if (numberOfMarbles == 0) {
            return "no marbles";
        } else if (numberOfMarbles == 1) {
            return "a marble";
        } else if (numberOfMarbles == 2) {
            return "two marbles";
        } else if (numberOfMarbles == 3) {
            return "a few marbles";
        } else if (numberOfMarbles >= 4 && numberOfMarbles <= 7) {
            return "some marbles";
        } else {
            return "a lot of marbles";
        }
    }

    /**
     * This method calls the testing method and then prompts the user for a number
     * of marbles and prints out the number in words.
     * @param args unused
     */
    public static void main(String[] args) {
        // Uncomment the line below to run the tests
        // testGetWordsForMarbles();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of marbles:");

        try {
            String userInput = input.next();

            // Check if the input is a valid integer
            if (userInput.matches("-?\\d+")) {
                int numMarbles = Integer.parseInt(userInput);

                if (numMarbles < 0) {
                    System.out.println("You owe marbles!");
                } else if (numMarbles == 0) {
                    System.out.println("There are no marbles");
                } else if (numMarbles == 1) {
                    System.out.println("There is one marble");
                } else {
                    System.out.println("There are " + getWordsForMarbles(numMarbles));
                }
            } else {
                System.out.println("You did not enter a valid number");
            }
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number");
        }
    }

    /** This contains test cases to verify that the wordsForMarbles method
     * is working correctly.
     * returns true when all tests have passed, false otherwise.
     * @return boolean
     */
    public static boolean testGetWordsForMarbles() {
        boolean error = false;

        {  // Test the number of marbles is less than 0 returns "owe marbles"
            int numberOfMarbles = -1;
            String expectedValue = "owe marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 0 returns "no marbles"
            int numberOfMarbles = 0;
            String expectedValue = "no marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 1 returns "a marble"
            int numberOfMarbles = 1;
            String expectedValue = "a marble";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 7 returns "some marbles"
            int numberOfMarbles = 7;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 2 returns "two marbles"
            int numberOfMarbles = 2;
            String expectedValue = "two marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 3 returns "a few marbles"
            int numberOfMarbles = 3;
            String expectedValue = "a few marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 4 returns "some marbles"
            int numberOfMarbles = 4;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 5 returns "some marbles"
            int numberOfMarbles = 5;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 6 returns "some marbles"
            int numberOfMarbles = 6;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        {  // Test the number of marbles is 8 returns "a lot of marbles"
            int numberOfMarbles = 8;
            String expectedValue = "a lot of marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)) {
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "', actual '" + actualValue + "'");
            }
        }

        if (error) {
            System.out.println("testGetWordsForMarbles failed");
        } else {
            System.out.println("testGetWordsForMarbles passed");
        }
        return !error;
    }
}
