package CodingExercise;

public class Main {

    public static void main(String[] args){

        boolean teenNumber = TeenNumberChecker.hasTeen(22, 23, 24);
        System.out.println(teenNumber);

        boolean isTeenValue = TeenNumberChecker.isTeen(9);
        System.out.println(isTeenValue);
    }

}
