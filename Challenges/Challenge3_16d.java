
import java.util.Scanner;

/*
Voting in the elections.

There are elections to the president of the country. There are 3 political parties: A “the cool party”, B “the angry party” and C “the supercrazy party”.

To vote, the user should enter (A, B or C) and we have to print “You have voted for the XXXX party” (where XXXX is the name of the corresponding party).

If the user enter an invalid option, print “invalid option” and ask again to the user for the vote.

Example of execution:

What party do you want to vote for?
E
Invalid option.
What party do you want to vote for?
F
Invalid option.
What party do you want to vote for?
B
You have voted for the angry party
 */
public class Challenge3_16d {

    public static void main(String[] args) {
        System.out.println("Vote: A “the cool party”, B “the angry party” or C “the supercrazy party”");
        Scanner keyboard = new Scanner(System.in);
        String vote = keyboard.nextLine();
        vote = vote.toUpperCase();
        while (!(vote.equals("A") || vote.equals("B") || vote.equals("C"))) {
            System.out.println("Invalid option, Try again: ");
            vote = keyboard.nextLine();
            vote = vote.toUpperCase();
        }
        String nameOfParty = "";
        if (vote.equals("A")) {
            nameOfParty = "cool";
        } else if (vote.equals("B")) {
            nameOfParty = "angry";
        } else {
            nameOfParty = "supercrazy";
        }
        System.out.println("You have voted for the " + nameOfParty + " party.");
    }
}
