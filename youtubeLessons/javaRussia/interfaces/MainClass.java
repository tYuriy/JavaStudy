package youtubeLessons.javaRussia.interfaces;

public class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Joe");
        animal1.sleep();
        person1.say();
        animal1.showInfo();
        person1.showInfo();

        System.out.println();

        //Объект класса животные рассматривается как нечто, реализующее интерфейс инфо
        Info info1 = new Animal(12);
        Info info2 = new Person("Nick");
        info1.showInfo();
        info2.showInfo();

        System.out.println();

        outputInfo(info1);
        outputInfo(info2);

        System.out.println();

        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo (Info info){
        info.showInfo();
    }
}
