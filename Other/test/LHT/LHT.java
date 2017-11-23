package Other.test.LHT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by user on 20.02.2017.
 */
public class LHT {
    //public ArrayList<Integer> arr1;
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        printArr(getArrayNum(arr1));

    }
    public static int rndVal (){
        int x = (int) (Math.random() * 52) + 1;
        return x;
    }

    public static ArrayList<Integer> getArrayNum (ArrayList<Integer> arr){

            for (int i = 0; i<6; i++){
                arr.add(rndVal());
                Collections.sort(arr);
            }checkDoubleNumbers(arr);
        return arr;
    }
    public static ArrayList<Integer> checkDoubleNumbers (ArrayList<Integer> arrFilled){
        for (int i = 1; i< arrFilled.size(); i++){
            if (arrFilled.get(i) == arrFilled.get(i-1)){
                arrFilled.clear();
                getArrayNum(arrFilled);
            }
        }
        return arrFilled;
    }
    public static void printArr (ArrayList<Integer> arrComplete){
        for (int x: arrComplete){
            System.out.printf("%02d\t\t", x);
        }
        System.out.println();System.out.println();
    }
}
