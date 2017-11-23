package Other.javabuddy.hw;

/**
 * Created by user on 01.02.2017.
 */
class Dog {
    int size;
    String name;
    String breed;

    void bark(){
        System.out.println("Wouf!!!");

    }
}
class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 39;
        d.name= "Kuzya";
        d.bark();
        System.out.println(d.size + d.name);

        //Dog c = new Dog (36, "Bout")
    }
}