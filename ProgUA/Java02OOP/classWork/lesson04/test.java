package ProgUA.Java02OOP.classWork.lesson04;

public class test {
    public static void main(String[] args) {
        test1 t = new test1();
        t.show();
        System.out.println();
        test2 t2 = new test2();
        t2.show();
        System.out.println();
        test3 t3 = new test3();
        t3.show();
    }

}
class test1 {
    int x =1;
    void show (){
        System.out.println(x);
    }
}
class test2 extends test1{
    int y=2;
    void show(){
        super.show();
        System.out.println(y);
    }
}
class test3 extends test2{
    int z=3;
    void show(){
        super.show();
        System.out.println(z);
    }
}
