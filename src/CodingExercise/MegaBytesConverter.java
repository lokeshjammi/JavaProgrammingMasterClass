package CodingExercise;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBitesValue = kiloBytes / 1024;
            int remainedKiloByteValue = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megaBitesValue+" MB and "+remainedKiloByteValue+" KB");
        }
    }
}
