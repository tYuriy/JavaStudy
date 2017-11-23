package LearningJava.Head14;

/**
 * Created by user on 11.04.2017.
 */
import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50,"Elf", new String[]{"bow", "sword", "kastet"});
        GameCharacter two = new GameCharacter(200,"Troll", new String[]{"fist", "big axe"});
        GameCharacter three = new GameCharacter(120, "Wizard", new String[]{"spell","invisibility"});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (Exception ex){ex.printStackTrace();}
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter)is.readObject();
            GameCharacter twoRestore = (GameCharacter)is.readObject();
            GameCharacter threeRestore = (GameCharacter)is.readObject();

            System.out.println("first type: " + oneRestore.getType());
            System.out.println("second type: " + twoRestore.getType());
            System.out.println("third type: " + threeRestore.getType());
        } catch (Exception ex){ex.printStackTrace();}

    }

}
