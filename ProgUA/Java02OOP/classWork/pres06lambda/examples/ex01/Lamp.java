package ProgUA.Java02OOP.classWork.pres06lambda.examples.ex01;

public class Lamp implements ElectricityConsumer {

    public void lightOn()
    {
        System.out.println("lamp lights");
    }
    @Override
    public void electricityOn()
    {
        lightOn();
    }
}
