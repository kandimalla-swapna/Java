public class WhileLoopChallenge {
    public static void main(String[] args){
        int i = 5;
        int countEven = 0;
        int countOdd = 0;
        while(i <= 20){
            if(isEvenNumber(i)) {
                System.out.println(i);
                countEven++;
                if(countEven == 5){
                    break;
                }
            }
            else{
                countOdd++;
            }
            i++;
        }
        System.out.println("Count of even numbers : "+countEven);
        System.out.println("Count of odd numbers : "+countOdd);
    }

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
