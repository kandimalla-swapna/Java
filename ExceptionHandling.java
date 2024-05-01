import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        int currentYear = 2024;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter Your DOB: ");
            int dob = sc.nextInt();
            System.out.println("Your age is "+ (currentYear - dob));
        }catch (Exception e){
            System.out.println("Enter number only");
        }

    }
}
