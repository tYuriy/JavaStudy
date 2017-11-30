package ProgUA.Java02OOP.homeWork.addTasks01.vectors;

public class VectorFlatClass {
    private int x;
    private int y;

    VectorFlatClass(){
        this.x = 2;
        this.y = 3;
    }
    VectorFlatClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public VectorFlatClass sumVectors (VectorFlatClass v1, VectorFlatClass v2){
        VectorFlatClass resV = new VectorFlatClass(v1.x + v2.x, v1.y + v2.y);
        return resV;
    }
    public VectorFlatClass diffVectors (VectorFlatClass v1, VectorFlatClass v2){
        VectorFlatClass resV = new VectorFlatClass(v1.x - v2.x, v1.y - v2.y);
        return resV;
    }
    public VectorFlatClass multipleVectors (VectorFlatClass v1, VectorFlatClass v2){
        VectorFlatClass resV = new VectorFlatClass(v1.x + v2.x, v1.y + v2.y);
        return resV;
    }
}
