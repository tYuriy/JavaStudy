package LearningJava.Head9.TestLifeSupportSim;

import java.util.ArrayList;

/**
 * Created by user on 17.03.2017.
 */

class V2Radiator {
    V2Radiator(){}
    V2Radiator(ArrayList list){
        for (int x=0; x<5; x++){
            list.add(new SimUnit("V2radiator"));
            System.out.println("v2");
        }
    }
}
class V3Radiator extends V2Radiator {
    V3Radiator (ArrayList lglist){
        //System.out.println(lglist.size());
        super(lglist);
        for (int g=0; g<10; g++){
            lglist.add(new SimUnit("V3radiator"));
            System.out.println("v3");
        }
    }
}
class RetentionBot {
    RetentionBot(ArrayList rlist){
        rlist.add(new SimUnit("Warm machine"));
    }
}


public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for (int z=0; z<20; z++){
            RetentionBot ret = new RetentionBot(aList);
        }
    }
}
class SimUnit {
    String botType;
    SimUnit(String type){
        botType = type;
    }
    int powerUse(){
        if ("Warm machine".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }
}
