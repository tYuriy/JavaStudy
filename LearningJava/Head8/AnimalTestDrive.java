package LearningJava.Head8;

/**
 * Created by user on 15.03.2017.
 */
public class AnimalTestDrive{
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);
        //сообщает являются ли два объекта идентичными
        if (a.equals(c)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //возвращаяет класс, экземпляром которого является объект
        System.out.println(c.getClass());
        //выводи на экран хэш-код
        System.out.println(c.hashCode());
        //выводит сообщение с именем класса и числами, на которые обычно можно не обращать внимание
        System.out.println(c.toString());

        Object o = new Dog();
        System.out.println(o instanceof Dog);
        Dog d = (Dog)o;
    }
}
