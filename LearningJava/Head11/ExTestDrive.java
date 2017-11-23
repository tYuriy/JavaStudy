package LearningJava.Head11;

/**
 * Created by user on 06.04.2017.
 */
class  MyEx extends Exception{}


public class ExTestDrive {
    static void doRiski(String t) throws MyEx{

        if ("yes".equals(t)){
            throw new MyEx();

        }
    }
    public static void main(String[] args) {

        String test = "yes";
        //String test = "no";

        System.out.print("t");
        System.out.print("h");
        try {

            doRiski(test);
            System.out.print("r");
            System.out.print("o");
        } catch (MyEx e){
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.print("s");
        }


    }
}
