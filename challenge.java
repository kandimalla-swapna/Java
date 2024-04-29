public class challenge {
    public static void main(String[] args){
        double a = 20.00d;
        double b = 80.00d;
        double result;
        result = a + b *100.00;
        System.out.println("The final result is "+result);
        double rem = result % 40.00d;
        System.out.println("The remainder is "+rem);
        boolean isNoRemainder = (rem == 0)?true:false;
        System.out.println("isNoRemainder "+isNoRemainder);
    }
}
