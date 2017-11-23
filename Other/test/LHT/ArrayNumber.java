package Other.test.LHT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by user on 13.04.2017.
 */
public class ArrayNumber {
    static ArrayList<Integer> arrNum = new ArrayList<Integer>();

    public static void main(String[] args) {

        getArrNumbers();
//        Collections.sort(arrNum);
        for(int i=0; i<arrNum.size();i++){
            System.out.print(arrNum.get(i)+" ");
        }
    }

    public static int rndVal (){
        int randomVal = (int) (Math.random() * 52) + 1;
        return randomVal;
    }
    public static ArrayList<Integer> getArrNumbers (){
        for (int i=0; i<6; i++){
            int x=checkDoubledVal(rndVal());//rndVal();
            arrNum.add(x);
        }
        return arrNum;
    }
    public static int checkDoubledVal(int x){
        for(int i=0; i<arrNum.size();i++){
            if(arrNum.get(i) == x){
                x=checkDoubledVal(rndVal());
            }
        }
        return x;
    }
}
