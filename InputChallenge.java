import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter number #"+i+":");
                int n = sc.nextInt();
                sum = sum + n;
        }
        System.out.println(sum);
    }
}
