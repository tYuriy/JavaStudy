package youtubeLessons.javaRussia.polimorphism;

public class Dog extends Animal {
    public void bark (){
        System.out.println("dog is barking");
    }
    @Override
    public void eat (){
        System.out.println("dog is eating meet");
    }
}
