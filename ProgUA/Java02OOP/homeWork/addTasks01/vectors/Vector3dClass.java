package ProgUA.Java02OOP.homeWork.addTasks01.vectors;

public class Vector3dClass extends VectorFlatClass{
    private double z;
    public void setZ(double z) {
        this.z = z;
    }
    public double getZ() {
        return z;
    }
    Vector3dClass (){
        this.setX(1);
        this.setY(2);
        this.setZ(3);
    }
    Vector3dClass (double x, double y, double z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public static Vector3dClass sumVectors (Vector3dClass v1, Vector3dClass v2){
        Vector3dClass resV = new Vector3dClass(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ()+v2.getZ());
        return resV;
    }
    public static Vector3dClass diffVectors (Vector3dClass v1, Vector3dClass v2){
        Vector3dClass resV = new Vector3dClass(v1.getX()-v2.getX(), v1.getY()-v2.getY(), v1.getZ()-v2.getZ());
        return resV;
    }
    public static double multipleVectors (Vector3dClass v1, Vector3dClass v2){
        return v1.getX() * v2.getX() + v1.getY() * v2.getY()+v1.getZ()*v2.getZ();
    }
    public Vector3dClass multipleByNumber (int x){
        this.setX(this.getX()*x);
        this.setY(this.getY()*x);
        this.setZ(this.getZ()*x);
        return this;
    }
    public Vector3dClass divideByNumber (int x){
        this.setX(this.getX()/x);
        this.setY(this.getY()/x);
        this.setZ(this.getZ()/x);
        return this;
    }
    public String toString (){
        String str = ("X = " + this.getX() + ", Y = " + this.getY() + ", Z = " + this.getZ());

        return str;
    }
    
    
    
    
}
