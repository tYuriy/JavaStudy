package LearningJava.Head11;

/**
 * Created by user on 06.04.2017.
 */
public class TestExceptions {
    public static void main(String[] args) {
        //String test = "no";
        String test = "yes";
        try {
            System.out.println("start of try");
            doRisdky(test);
            System.out.println("end of try");
        } catch (NullPointerException se){
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
    static void doRisdky(String test) throws NullPointerException{
        System.out.println("Start of dangerous method");
        if("yes".equals(test)){
            throw new NullPointerException();
        }
        System.out.println("End of dangerous method");
        return;
    }
}
