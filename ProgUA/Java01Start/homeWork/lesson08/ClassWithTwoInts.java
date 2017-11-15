package ProgUA.Java01Start.homeWork.lesson08;
/*
* Напишите программу с классом, у которого есть два целочисленных поля и метод,
* который выводит в консоль значение этих полей.
*/
class SourceClass{
    int a;
    int b;

    void printInts (int x, int y){
        System.out.println(x + " & " + y);
    }

    SourceClass(int a, int b){
        this.a = a;
        this.b = b;
    }
}


public class ClassWithTwoInts {
    public static void main(String[] args) {
        SourceClass sc = new SourceClass(5,8);
        SourceClass sc2 = new SourceClass(12,79);
        //sc.printInts(sc.);
        sc.printInts(sc.a,sc.b);
        sc2.printInts(sc2.a,sc2.b);
    }
}
