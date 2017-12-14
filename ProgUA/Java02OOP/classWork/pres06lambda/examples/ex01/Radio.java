package ProgUA.Java02OOP.classWork.pres06lambda.examples.ex01;

public class Radio implements ElectricityConsumer
{
    public void playMusic(){
        System.out.println("radio plays");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
