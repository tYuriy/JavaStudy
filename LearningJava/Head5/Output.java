package LearningJava.Head5;

/**
 * Created by user on 14.03.2017.
 */
public class Output {
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }
    void go(){
        int y = 7;
        for (int x=1; x<8; x++){
            y++;
            //System.out.println("x = " + x + "; y = " + y);
            if (x>4){
                System.out.print(++y + " ");
            }
            if (y>14){
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
