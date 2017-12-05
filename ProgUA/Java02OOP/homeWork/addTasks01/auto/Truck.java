package ProgUA.Java02OOP.homeWork.addTasks01.auto;

public class Truck extends Car{
    private int maxCapacity; //tons
    Truck(String name, String color, double tankVol, double gasRate, int maxCapacity){
        this.setName(name);
        this.setColor(color);
        this.setTankVol(tankVol);
        this.setGasRate(gasRate);
        this.setMaxCapacity(maxCapacity);
    }
    public double calcCost(double gasPrice){
        return getGasRate()/100*gasPrice/maxCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n\tmax cargo capacity is " + getMaxCapacity()+ " tons";
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
