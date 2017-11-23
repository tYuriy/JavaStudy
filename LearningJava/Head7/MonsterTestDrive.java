package LearningJava.Head7;

/**
 * Created by user on 14.03.2017.
 */
public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int x = 0; x<3; x++){
            ma[x].frighten(x);
        }
    }
}
class Monster{

    boolean frighten (int d){
        System.out.println("Arrrrrrgh");
        return false;
    }

    /*boolean frighten (int x){
        System.out.println("Arrrrrrgh");
        return true;
    }*/

    /*boolean frighten (int x){
        System.out.println("Arrrrrrgh");
        return false;
    }*/

    /*boolean frighten (int z){
        System.out.println("Arrrrrrgh");
        return true;
    }*/
}
class Vampire extends Monster{
    boolean frighten (int x){
        System.out.println("bite?");
        return false;
    }

    /*int frighten (int f){
        System.out.println("bite?");
        return l;
    }*/

    /*boolean frighten (int x){
        System.out.println("bite?");
        return true;
    }*/

    /*boolean frighten (byte b){
        System.out.println("bite?");
        return true;
    }*/

}
class Dragon extends Monster {
    boolean frighten (int degree){
        System.out.println("Fire breath");
        return true;
    }
}