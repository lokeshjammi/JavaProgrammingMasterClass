package CodingExercise;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barked, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (barked == true && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else {
            return false;
        }
    }
}
