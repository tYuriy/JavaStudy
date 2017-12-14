package youtubeLessons.javaRussia.nestedClasses;

public class Electrocar {
    private int id;
    private static int test;

    //нестатический вложенный класс (для сложных комплексных объектов
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting");
        }
    }
    //static inner class для использования из вне. Для обозначения объектов, которые не связаны непостредственно с объектами внешнего класса.
    public static class Battery {
        public void charge (){
            System.out.println("battery is charging " + test);
        }
    }

    public Electrocar (int id){
        this.id = id;
    }
    public  void start(){
        Motor motor = new Motor();
        motor.startMotor();
        int x = 1;
        //нестатический класс внутри метода
        class SomeClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObj = new SomeClass();
        test(someObj);

        System.out.println("Electrocar " + id + " is starting");
    }
    private void test(Object obj){

    }
}
