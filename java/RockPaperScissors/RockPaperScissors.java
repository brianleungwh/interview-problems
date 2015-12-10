import java.util.ArrayList;

public class RockPaperScissors {
    /*
    * Write a function that generates every sequence of throws a single
    * player could throw over a three-round game of rock-paper-scissors.
    *
    * Your output should look something like:
    *   [["rock", "rock", "rock"],
    *    ["rock", "rock", "paper"],
    *    ["rock", "rock", "scissors"],
    *    ["rock", "paper", "rock"],
                 ...etc...
         ]
    *
    * Extra credit:
    *   - Make your function return answers for any number of rounds.
    * Example:
    * rockPaperScissors(5); // => [['rock', 'rock', 'rock', 'rock', 'rock'], etc...]
    *
    */
    public static ArrayList<ArrayList<String>> rockPaperScissors(int n) {
        String[] _throws = {"rock", "paper", "scissors"};
        ArrayList<ArrayList<String>> sequences = new ArrayList<ArrayList<String>>();
        generate(_throws, n, sequences, new ArrayList<String>());
        return sequences;
    }

    private static void generate(String[] _throws, int n, 
                          ArrayList<ArrayList<String>> sequences, 
                          ArrayList<String> sequence) {
        if (sequence.size() == n) {
            sequences.add(new ArrayList<String>(sequence));
            return;
        }
        for (int i = 0; i < _throws.length; i += 1) {
            sequence.add(_throws[i]);
            generate(_throws, n, sequences, sequence);
            sequence.remove(sequence.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(rockPaperScissors(3));
    }

}