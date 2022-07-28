package MethodOverloading;

public class OverloadingChallenge {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double finalCM;
            //Converting feet into inches
            double feetToInches = feet * 12;
            double totalInchesCount = feetToInches + inches;
            finalCM = totalInchesCount * 2.54;
            return finalCM;
        } else {
            System.out.println("Invalid feet or Inches provided");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            System.out.println("Invalid Inches value is provided");
            return -1;
        } else {
            double feetsInInches = Math.round(inches * 0.083);
            System.out.println(inches+" inches has "+feetsInInches+" foot");
            return feetsInInches;
        }
    }
}
