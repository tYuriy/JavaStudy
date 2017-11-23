package LearningJava.Head5.SeaBattle;

import LearningJava.Head5.GameHelper;

/**
 * Created by user on 13.03.2017.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses=0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot1 = new SimpleDotCom();
        //System.out.println("Enter a number");
        int randomNum = (int) (Math.random()*5);
        int [] locations = {randomNum,randomNum+1,randomNum+2};
        dot1.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("Enter a number");
            //System.out.println("Enter a number");
            //String userGuess = "2";
            String result =  dot1.checkYourself(guess);
            numOfGuesses++;
            if (result == "Total down!!!"){
                isAlive=false;
                System.out.println("Total number of tries : " + numOfGuesses);
            }
        }

    }
}
