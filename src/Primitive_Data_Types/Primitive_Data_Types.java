package Primitive_Data_Types;

public class Primitive_Data_Types {
    public static void main(String[] args){
        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Min value is: "+myByteMinValue);
        System.out.println("Byte Max value is: "+myByteMaxValue);

        Short myShortMinValue = Short.MIN_VALUE;
        Short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Min value is: "+myShortMinValue);
        System.out.println("Short Max value is: "+myShortMaxValue);

        int myIntegerMinValue = Integer.MIN_VALUE;
        int myIntegerMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Min value is: "+myIntegerMinValue);
        System.out.println("Integer Max value is: "+myIntegerMaxValue);

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Min value is: "+myLongMinValue);
        System.out.println("Long Max value is: "+myLongMaxValue);

        //Challenge Task
        byte byteVar = 125;
        short shortVar = 30000;
        int intVar = 2099461;
        long longVar = 50000L + 10L * (byteVar + shortVar + intVar);
        System.out.println("Total value is: "+longVar);

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Min value is: "+myFloatMinValue);
        System.out.println("Float Max value is: "+myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Min value is: "+myDoubleMinValue);
        System.out.println("Double Max value is: "+myLongMaxValue);

        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5.25d;

        //Challenge Task
        int poundsTobeConverted = 5;
        double oneKgToPoundValue = 0.45359237D;
        double result = (poundsTobeConverted * oneKgToPoundValue);
        System.out.println("The Converted value is: "+result+"KG");
    }
}
