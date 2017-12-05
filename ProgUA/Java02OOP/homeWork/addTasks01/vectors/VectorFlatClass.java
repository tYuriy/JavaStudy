package ProgUA.Java02OOP.homeWork.addTasks01.vectors;
/*
4. Напишите программу с классом для реализации векторов в двумерном пространстве.
У класса два поля (координаты вектора). Предусмотреть выполнение базовых операций с векторами
(таких, например, сложение и вычитание векторов, умножение и деление векторов на число,
вычисление скалярного произведения векторов). Путем наследования создать подкласс для реализации
векторов в трехмерном пространстве (у такого вектора три координаты). Напомним, что вектор в трехмерном
пространстве однозначно описывается тремя координатами. Операции с векторами выполняются так: если ⃗ ( ) и ⃗⃗ ( )
векторы, а и - числа, то ⃗ ⃗⃗ ( ), а скалярное произведение ⃗ ⃗⃗ .
 */
public class VectorFlatClass {
    private double x;
    private double y;

    VectorFlatClass(){
        this.x = 2;
        this.y = 3;
    }
    VectorFlatClass(int x, int y){
        this.x = (double) x;
        this.y = (double) y;
    }
    VectorFlatClass(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static VectorFlatClass sumVectors (VectorFlatClass v1, VectorFlatClass v2){
        VectorFlatClass resV = new VectorFlatClass(v1.x + v2.x, v1.y + v2.y);
        return resV;
    }
    public static VectorFlatClass diffVectors (VectorFlatClass v1, VectorFlatClass v2){
        VectorFlatClass resV = new VectorFlatClass(v1.x - v2.x, v1.y - v2.y);
        return resV;
    }
    public static double multipleVectors (VectorFlatClass v1, VectorFlatClass v2){
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }
    public VectorFlatClass multipleByNumber (int x){
        this.x *=x;
        this.y *=x;
        return this;
    }
    public VectorFlatClass divideByNumber (int x){
        this.x /=x;
        this.y /=x;
        return this;
    }
    public String toString (){
        String str = ("X = " + this.x + ", Y = " + this.y);

        return str;
    }
}
