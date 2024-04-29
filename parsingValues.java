import java.util.Scanner;

public class parsingValues {
    public static void main(String[] args) {
        int currentYear = 2023;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you birth year:");
        int year = sc.nextInt();

        System.out.println("Your age is "+(currentYear - year));

        String userDOB = "1999";
        int dob = Integer.parseInt(userDOB); //converting the string to int

        System.out.println("Age = "+(currentYear - dob));

        String userAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);

        System.out.println("Age is "+ ageWithPartialYear);

    }
}
