package MethodOverloading;

public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hoursValue = minutes / 60;
            int minutesValue = minutes % 60;
            String hoursString = hoursValue+"h ";
            String minutesString = minutesValue+"m ";
            if (hoursValue < 10) {
                hoursString = "0"+hoursString;
            }
            if (minutesValue < 10) {
                minutesString = "0"+minutesString;
            }
            String secondsString = seconds+"s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            String finalValue = hoursString+" "+minutesString+" "+secondsString;
            return finalValue;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutesValue = seconds / 60;
            //long remainingSeconds = seconds % 60;
            System.out.println(minutesValue);
            return getDurationString(minutesValue, seconds);
        }
    }
}