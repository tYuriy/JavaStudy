package ProgUA.Java02OOP.classWork.pres06lambda.examples.ex01;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    //private ElectricityConsumer consumer;
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener (ElectricityConsumer listerner){
        listeners.add(listerner);
    }
    public void removeElectricityListener (ElectricityConsumer listerner){
        listeners.remove(listerner);
    }

    public void switchOn (){
        System.out.println("switcher is on");
//        if(consumer !=null) consumer.electricityOn();
        for (ElectricityConsumer c: listeners)
        {
            c.electricityOn();
        }
    }
}
