package youtubeLessons.javaRussia.anonimousClasses.demo1.withoutAnonumous;

public class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();

    }
    public static void test (Animal animal){
        animal.eat();
    }
}
