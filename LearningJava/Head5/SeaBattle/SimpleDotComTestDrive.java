package LearningJava.Head5.SeaBattle;

/**
 * Created by user on 13.03.2017.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        /*String testResult = "Unluck";
        if (result.equals("Hit")){
            testResult = "Passed";
        }
        System.out.println(testResult);*/


    }

}

