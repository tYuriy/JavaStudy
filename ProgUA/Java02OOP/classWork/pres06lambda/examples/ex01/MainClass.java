package ProgUA.Java02OOP.classWork.pres06lambda.examples.ex01;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //event subscribe
        //sw.consumer = lamp;
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        sw.addElectricityListener(
                new ElectricityConsumer()
                {
                    @Override
                    public void electricityOn() {
                        System.out.println("fire");
                    }
                }
        );

        sw.addElectricityListener(() -> {System.out.println("fire");});

        sw.switchOn();
    }
}
