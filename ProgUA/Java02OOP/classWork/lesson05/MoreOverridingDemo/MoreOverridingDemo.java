package ProgUA.Java02OOP.classWork.lesson05.MoreOverridingDemo;

class MoreOverridingDemo{
    public static void main(String[] args){
        Alpha objA=new Alpha("objA");
        Bravo objB=new Bravo("objB",123);
        objA.show();
        objB.show();
    }
}