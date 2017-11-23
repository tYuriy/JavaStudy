package LearningJava.Head7.TestBoats;

/**
 * Created by user on 14.03.2017.
 */
public class Boat {
    private int length;
    public void setLength (int len){
        length = len;
    }
    public int getLength (){
        return length;
    }
    public void move(){
        System.out.print("Drafe ");
    }
}
