package Attempt.One;

public class TrophyApplication {
    public static void main(String[] args) {
        //Fix the errors in the class by working on ONLY the Trophy.java file
        Trophy swimming = new Trophy();
        Trophy marathon = new Trophy("first");

        swimming.place();
        marathon.place();
        Trophy.win();
    }
}

/*
Output:

tenth
first
Here's a trophy!
 */
