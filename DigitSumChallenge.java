import java.util.Scanner;

public class DigitSumChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        System.out.println("sum is "+sumDigits(number));
    }

    public static int sumDigits(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while(number > 9){
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
