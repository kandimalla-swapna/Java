import java.util.Scanner;

public class ThePrimeNumberChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        //System.out.println(num+" is "+(isPrime(num)?"":"not ")+"prime");
        isPrime(num);
    }

    public static void isPrime(int number){
        int c = 0;
        if(number <= 1){
            System.out.println(number+" is not prime");
        }
        else{
            for(int i=2;i<=number;i++){
                if(number%i==0){
                    //return false;
                    c++;
                }
            }
            if(c==1){
                System.out.println(number+" is prime");
            }
            else{
                System.out.println(number+" is not prime");
            }
        }
        //return true;
    }
}
