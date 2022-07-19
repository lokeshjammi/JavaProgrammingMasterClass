package CodingExercise;

public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        int twoNumbersSum = firstNumber + secondNumber;
        if (twoNumbersSum == thirdNumber){
            return true;
        } else {
            return false;
        }
    }

}
