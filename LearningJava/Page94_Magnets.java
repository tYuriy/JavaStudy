package LearningJava;

/**
 * Created by user on 13.03.2017.
 */
public class Page94_Magnets {
    public static void main(String[] args) {
        int y = 0;

        String[] islands = new String[4];

        islands[0] = "Bermudas";
        islands[1] = "Fiji";
        islands[2] = "Azor islands";
        islands[3] = "Kosumel";

        int [] index = new int[4];

        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;

        int ref;
        while (y<4) {

            ref = index[y];

            System.out.print("islands = ");

            System.out.println(islands[ref]);

            y = y + 1;
        }
    }
}
