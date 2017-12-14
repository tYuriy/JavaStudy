package ProgUA.Java02OOP.classWork.pres02inheritance.MoreOverridingDemo;

class MoreOverridingDemo{
    public static void main(String[] args){
        Alpha objA=new Alpha("objA");
        Bravo objB=new Bravo("objB",123);
        objA.show();
        objB.show();
    }
}