package ProgUA.Java01Start.classWork.lesson8;

public class test {
    public static void main(String[] args) {
        System.out.println("HeLLo".charAt(2));
        Obj o1 = new Obj();
        Obj o2 = new Obj();
        System.out.println((Obj.count));
    }
}
class Obj{
    static int count;
    static void getCount (int x){
        count++;
        System.out.println(x);
    }
}
