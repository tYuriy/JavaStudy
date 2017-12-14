package youtubeLessons.javaRussia.polimorphism;


public class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog = new Dog();

        System.out.println("Animal animal1 = new Animal();");
        animal1.eat();
        System.out.println("Dog dog = new Dog();");
        dog.eat();
        System.out.println();
        Animal animal2 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("Animal animal2 = new Dog();");
        animal2.eat();
        //animal2.bark(); //no access
        System.out.println("Dog dog2 = new Dog();");
        dog2.eat();
        dog2.bark();

        System.out.println("\n");

        Animal animal3 = new Animal();
        Dog dog3 = new Dog();
        Cat cat3 = new Cat();

        test(animal3);
        test(dog3);
        test(cat3);
    }
    public static void test (Animal animal){
        animal.eat();
    }
}
