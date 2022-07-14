package CodingExercise_One;

public class Main {

    public static void main(String[] args){
        long convertedSpeed = SpeedConverter.toMilesPerHour(-10);
        System.out.println("Converted Speed vlaue is: "+convertedSpeed);
        SpeedConverter.printConversion(2);
    }

}
