package ProgUA.Java02OOP.homeWork.addTasks01.auto;

public class Car {
    private String name;
    private String color;
    private double tankVol;
    private double gasRate;
    Car(){
        this.setName("ZAZ");
        this.setColor("green");
        this.setTankVol(50);
        this.setGasRate(9.8);
    };
    Car(String name, String color, double tankVol,double gasRate){
        this.name=name;
        this.color = color;
        this.tankVol = tankVol;
        this.gasRate = gasRate;
    };
    public double calcTripLength (){
        return this.tankVol*100/this.gasRate;
    }
    public String toString (){
        return "Car: " + this.getName() + ", color: " + this.getColor()
                        + ",\n\t tank volume = "+ this.getTankVol()
                        + " litres, gas consumption per 100km = "
                        + this.gasRate + " litres, trip length = "
                        + String.format("%.2f",this.calcTripLength())+ " km";
    }

    public double getGasRate() {
        return gasRate;
    }

    public double getTankVol() {
        return tankVol;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGasRate(double gasRate) {
        this.gasRate = gasRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTankVol(double tankVol) {
        this.tankVol = tankVol;
    }
}

