package MethodOverloading;

public class Main {
    public static void main(String[] args){
        //CalculateScore cs = new CalculateScore();
        //Method with single parameter
        //int finalScore = cs.calculateScore(75);
        //System.out.println(finalScore);
        //Method with no parameters
        //cs.calculateScore();
        //Method with two parameters
        //int finalScore_Main = cs.calculateScore("Lokesh Jammi", 100);
        //System.out.println(finalScore_Main);
        //double returnValue = OverloadingChallenge.calcFeetAndInchesToCentimeters(5, 13);
        //System.out.println(returnValue);
        //OverloadingChallenge.calcFeetAndInchesToCentimeters(12);
        String finalString = SecondsAndMinutesChallenge.getDurationString(1000, 45 );
        System.out.println(finalString);
        //SecondsAndMinutesChallenge.getDurationString(100);
    }
}
