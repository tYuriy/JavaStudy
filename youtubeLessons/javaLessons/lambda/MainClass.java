package youtubeLessons.javaLessons.lambda;

public class MainClass {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        Runnable runnable1 = () -> System.out.println("hello2");

        runnable.run();
        runnable1.run();

        TestLambda tl = new TestLambda() {
            @Override
            public int calc(int x, int y) {
                System.out.println(x+y);
                return x;
            }
        };
        tl.calc(5,9);

        TestLambda t2 = (x, y) -> {System.out.println(x+y);
        return x*y;};
        System.out.println(t2.calc(5,12));

    }
}
