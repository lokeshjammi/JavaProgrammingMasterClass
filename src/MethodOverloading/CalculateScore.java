package MethodOverloading;

public class CalculateScore {
    public int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score * 1000;
    }

    public int calculateScore(int score){
        System.out.println("Unknown player scored "+score+" points");
        return score * 1000;
    }

    public int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }
}
