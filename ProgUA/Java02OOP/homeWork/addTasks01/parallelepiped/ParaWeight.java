package ProgUA.Java02OOP.homeWork.addTasks01.parallelepiped;

public class ParaWeight extends Parallelepiped {
    private double mass;
    ParaWeight (){
        mass = 100;
    }
    ParaWeight (double mass){
        this.mass=mass;
    }
    ParaWeight(int height, int width, int depth, int mass){
        setHeight(height);
        setWidth(width);
        setDepth(depth);
        this.mass=mass;
    }
    public double getDensity (){
        return (double)mass/this.getVolume();
    }
    public void decreaseMass (int x){
        this.mass = this.mass/x;
    }
    public ParaWeight newObjCreate (ParaWeight pw1, int x){
        ParaWeight newPW = new ParaWeight();
        newPW.setDepth(x);
        newPW.setWidth(x);
        newPW.setHeight(x);
        newPW.setMass(pw1.getMass()+this.getMass());
        newPW.setVolume(this.getVolume()+pw1.getVolume());
        return newPW;
    }



    @Override
    public String toString (){
        return super.toString() + "\n\tmass = " + this.mass + "\n\tdensity = " + String.format("%.2f", this.getDensity());
    }
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
