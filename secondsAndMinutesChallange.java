import java.util.Scanner;

public class secondsAndMinutesChallange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int sec = sc.nextInt();
        System.out.println(getDurationString(sec));

    }

    public static String getDurationString(int sec){

        int minutes = sec / 60;
        return getDurationString(minutes, sec);
    }

    public static String getDurationString(int min, int sec){
        int hours = min / 60;
        int remainingMinutes = min % 60;
        int remainingSeconds = sec % 60;

        return (hours + "h "+ remainingMinutes + "m " + remainingSeconds + "s ");
    }
}
