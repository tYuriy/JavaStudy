package ProgUA.Java02OOP.homeWork.addTasks01.parallelepiped;

public class ParaWeight extends Parallelepiped {
    private double mass;//переменная, для отображения массы
    ParaWeight (){
        mass = 100;
    }
    ParaWeight(int height, int width, int depth, int mass){
        setHeight(height);
        setWidth(width);
        setDepth(depth);
        this.mass=mass;
        this.setVolume();
    }
    public double getDensity (){
        return mass/getVolume();
    }
    //метод для уменьшения массы объекта
    public void decreaseMass (int x){
        this.mass = this.mass/x;
    }
    //метод для создания объекта
    public ParaWeight newObjCreate (ParaWeight pw1, int x){
        ParaWeight newPW = new ParaWeight();
        newPW.setDepth(x);
        newPW.setWidth(x);
        newPW.setHeight(x);
        newPW.setMass(pw1.getMass()+this.getMass());
        newPW.setVolume(pw1.getVolume()+this.getVolume());
        return newPW;
    }
    @Override
    public String toString (){
        return super.toString() + "\n\tmass = " + this.mass
                                + "\tdensity = " + String.format("%.2f", this.getDensity())
                                + "\n\t-------------------------- ";
    }
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
