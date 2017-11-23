package LearningJava.Head5.SeaBattle;

/**
 * Created by user on 13.03.2017.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells (int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Missed";
        for (int cell: locationCells){
            if (guess == cell){
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Total down!!!";
        }
        System.out.println(result);
        return result;
    }

}
