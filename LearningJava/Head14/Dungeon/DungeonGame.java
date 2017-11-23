package LearningJava.Head14.Dungeon;

import java.io.*;

/**
 * Created by superUser on 20.04.2017.
 */
class DungeonGame implements Serializable {
    public  int x = 3;
    transient long y = 4;
    private short z =5;

    short getZ() {return z;}
    int getX(){return  x;}
    long getY(){return y;}
}

class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        System.out.println(d.getX()+d.getY()+d.getZ());
        try {
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(d);
            oos.close();

            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            d=(DungeonGame)ois.readObject();
            ois.close();

        } catch (Exception ex){ex.printStackTrace();}
        System.out.println(d.getX()+d.getY()+d.getZ());
    }
}
