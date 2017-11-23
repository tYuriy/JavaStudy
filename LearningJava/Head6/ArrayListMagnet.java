package LearningJava.Head6;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

/**
 * Created by user on 14.03.2017.
 */
public class ArrayListMagnet {
    public static void printAL(ArrayList<String> al){
        for (String element:al){
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add(0,"zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        printAL(a);

        a.remove(2);

        if(a.contains("three")){
            a.add("four");
        }
        printAL(a);


        if (a.contains("two")){
            a.add("2.2");
        }

        if(a.indexOf("four")!=4){
            a.add(4,"4.2");
        }

        printAL(a);
        printAL(a);


    }
}