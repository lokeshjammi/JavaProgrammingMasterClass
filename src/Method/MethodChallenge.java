package Method;

public class MethodChallenge {

    public static void displayHighScorePosition(String playerName, int positionInScoreTable){
        System.out.println(playerName+" manage to get into position "+positionInScoreTable+" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        } else if (playerScore > 500 && playerScore < 1000){
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args){
        String playerName = "Lokesh Jammi";
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, position);
    }
}
