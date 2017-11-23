package LearningJava.Head8;

/**
 * Created by user on 15.03.2017.
 */
public abstract class Animal {
    abstract void eat();
}
interface Pet {
    void beFriendly();
}
abstract class Feline extends Animal{
    public void eat(){}
}
abstract class Canine extends Animal{
    public void eat(){}
}
class Lion extends Feline{}
class Cat extends Feline implements Pet{
    public void beFriendly(){
        System.out.println("true");
    }
}
class Tiger extends Feline{}
class Hippo extends Animal{
    public void eat(){}
}
class Wolf extends Canine{}
class Dog extends Canine implements Pet{
    public void beFriendly(){
        System.out.println("true");
    }
}