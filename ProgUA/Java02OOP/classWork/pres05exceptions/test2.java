package ProgUA.Java02OOP.classWork.pres05exceptions;

public class test2 {
    public static void main(String[] args){
        System.out.println("starts");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){}
        System.out.println("ends");
    }
}
