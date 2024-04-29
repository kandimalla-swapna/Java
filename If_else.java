public class If_else {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //If condition
        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        //If-else condition
        if( score < 5000){
            System.out.println("Your score was less than 5000");
        }
        else{
            System.out.println("Got here");
        }

        //if-else if-else
        if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but also greater than 1000");
        }
        else if(score < 1000){
            System.out.println("Your score was less than 1000");

        }
        else{
            System.out.println("Got here");
        }
    }
}
