public class methodChallenge {
    public static void main(String[] args){

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

    }

        public static void displayHighScorePosition(String playerName, int playerPosition) {
            System.out.println(playerName + "managed to get into position "+ playerPosition +" on the high score list");
        }

        public static int calculateHighScorePosition(int pScore){
            if(pScore >= 1000){
                return 1;
            }
            else if(pScore >= 500 && pScore < 1000){    //we can remove <1000 condition as it is already checked above
                return 2;
            }
            else if(pScore >= 100 && pScore < 500){     //we can remove <500 condition as it is already checked above
                return 3;
            }
            else{           //
                return 4;   //instead of else block we can directly write return 4, gives the same result
            }               //
        }

}
