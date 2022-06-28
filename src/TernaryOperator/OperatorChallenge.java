package TernaryOperator;

public class OperatorChallenge {

    public static void main(String[] args){
        double doubleVar = 20.00d;
        double doubleVar1 = 80.00d;
        double doubleResult = 100.00d * (doubleVar + doubleVar1);
        System.out.println("Double value result is: "+doubleResult);
        double remainderResult = doubleResult % (40.00d);
        System.out.println("The remainder value is: "+remainderResult);
        boolean isRemainderTrue = (remainderResult == 0) ? true : false;
        System.out.println(isRemainderTrue);
        if(isRemainderTrue){
            System.out.println("Got no remainder");
        } else {
            System.out.println("Got some remainder");
        }
    }

}
