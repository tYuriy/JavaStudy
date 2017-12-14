package youtubeLessons.javaRussia.anonimousClasses.demo2.yesAnonim;


public class MainClass {
    public static void main(String[] args) {
        //создание анонимного класса, который наследует интерфейс и в котором переопределяются методы
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("eat eat eat");
            }
        };
        ableToEat.eat();

    }
}
