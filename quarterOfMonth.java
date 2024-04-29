import java.util.Scanner;

public class quarterOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        String str = sc.nextLine();

        System.out.println(str + " is in the " + getQuarter(str) + " quarter");
    }

    /*public static String getQuarter(String str){
        switch(str){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return "bad";
    }
    */

    //or let's write the enhanced code for above
    /*
    public static String getQuarter(String str){
        switch(str){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
        }
        return "bad";
    }
     */

    //return switch statement
    public static String getQuarter(String month){
        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st"; // is implicitly translated to {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                yield "bad";
            }
        };
    }
}
