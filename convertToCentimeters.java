public class convertToCentimeters {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = "+convertToCentimeters(5, 8)+ "cm");
        System.out.println("68in = "+convertToCentimeters(68)+ "cm");
    }

    public static double convertToCentimeters (int inch){
        return (inch*2.54);
    }

    public static double convertToCentimeters(int feet, int inch) {
        //return ((feet * 12) + inch) * 2.54;     here we didn't call the above method
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inch;
        double result = convertToCentimeters(totalInches);
        return result;
        //or simply write like
        //return convertToCentimeters((feet * 12) + inch);
    }
}
