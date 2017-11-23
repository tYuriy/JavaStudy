package Other.javabuddy.hw;

//import java.util.Timer;
import java.util.Scanner;


/**
 * Created by user on 02.02.2017.
 */

class Triangle {// класс треугольник
    public Triangle (double a, double b, double c){//параметры создания объекта (3 стороны)

    }
    void perTriangle (double a, double b, double c) {//метод для расчета периметра
        double d = a + b + c;
        System.out.println("Perimetr of triangle equals " + d);
    }
    void sqTriangle (double a, double b, double c){//методк для расчета площади
        double p = (a+b+c)/2;
        double sq = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Area of triangle equals " + sq);
    }
    void rotateTriangle (){
        System.out.println("Triangle rotates...");
    }
    boolean triangleCheck (double a, double b, double c){
        if (a+b==c || a+c==b || b+c == a){
            System.out.println("Wrong triangle, all dots on one line :(");
            return false;
        }
        return true;
    }
}

class Dots {//класс "точка" с параметрами координат по x & y
    int x;
    int y;
    int getCoordinations (int coordLimit){//метод для ввода данных координат
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while (x){//цикл проверки данных указанному условию
            int xy = sc.nextInt();
            if (xy < coordLimit+1 & xy > -1*(coordLimit+1)){
                System.out.println("It's ok!");
                x = false;
                return xy;
            } else {
                System.out.println("Wrong coordinate value... Try again.");
            }

        }
        return 0;
    }
}
class Side {//класс Side с медотом вычисления отрезка по координатам двух точек
    public static double getLenght (int x1, int y1, int x2, int y2) {
        double aLen = Math.sqrt(Math.abs(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
        return aLen;
    }
}

class TriangleTest{
    public static void main(String[] args) {
        Dots d1 = new Dots();
        Dots d2 = new Dots();
        Dots d3 = new Dots();

        int cBorder = 100;

        System.out.println("Enter x-coord for first dot:");
        d1.x =d1.getCoordinations(cBorder);
        System.out.println("Enter y-coord for first dot:");
        d1.y =d1.getCoordinations(cBorder);
        System.out.println("Enter x-coord for second dot:");
        d2.x =d1.getCoordinations(cBorder);
        System.out.println("Enter y-coord for second dot:");
        d2.y =d1.getCoordinations(cBorder);
        System.out.println("Enter x-coord for third dot:");
        d3.x =d1.getCoordinations(cBorder);
        System.out.println("Enter y-coord for third dot:");
        d3.y =d1.getCoordinations(cBorder);

        double aLen1 = Side.getLenght(d1.x, d1.y, d2.x, d2.y);
        double aLen2 = Side.getLenght(d1.x, d1.y, d3.x, d3.y);
        double aLen3 = Side.getLenght(d3.x, d3.y, d2.x, d2.y);

        System.out.println("Sides of triangle equals " + aLen1 + " " + aLen2 + " " + aLen3);

        Triangle t = new Triangle(aLen1, aLen2, aLen3);
        t.triangleCheck(aLen1, aLen2, aLen3);
        t.perTriangle(aLen1, aLen2, aLen3);
        t.sqTriangle(aLen1, aLen2, aLen3);
        t.rotateTriangle();

    }
}
