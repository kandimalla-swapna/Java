import java.util.Scanner;

public class switchChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = sc.nextInt();
        printDayOfWeek(day);
    }

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            case 0 -> "sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }
}
