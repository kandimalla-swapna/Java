public class Keywords {
    public static void main(String[] args){
        //converting miles into km
        double kilometer = (100 * 1.609344);

        int highscore = 50;

        if(highscore > 25){
            highscore = 1000 + highscore;   //1050
        }

        int health = 100;
        if((health < 25 ) && (highscore > 1000)){
            highscore = highscore - 1000;   //do not exceutes
        }
    }
}
