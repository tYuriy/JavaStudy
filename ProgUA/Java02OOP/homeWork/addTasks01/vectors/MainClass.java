package ProgUA.Java02OOP.homeWork.addTasks01.vectors;

import static ProgUA.Java02OOP.homeWork.addTasks01.vectors.VectorFlatClass.*;
import static ProgUA.Java02OOP.homeWork.addTasks01.vectors.Vector3dClass.*;

public class MainClass {
    public static void main(String[] args) {
        VectorFlatClass v1 = new VectorFlatClass(2,4);
        VectorFlatClass v2 = new VectorFlatClass(2.5,7.8);

        System.out.println("Вектор 1: " + v1.toString());
        System.out.println("Вектор 2: " + v2.toString());

        VectorFlatClass v3 = sumVectors(v1,v2);
        System.out.println("Вектор 3, результат сложения векторов 1 и 2: " + v3.toString());

        v3 = diffVectors(v1,v2);
        System.out.println("Вектор 3, вычитание векторов 1 и 2: "+ v3.toString());

        v1.multipleByNumber(4);
        System.out.println("Вектор 1, умножение на число (4): "+v1.toString());

        v2.divideByNumber(2);
        System.out.println("Вектор 2, деление на число (2): " + v2.toString());

        System.out.println("Произведение векторов 1 и 2: " + multipleVectors(v1,v2));
        //Вектора в 3хмерном пространстве

        Vector3dClass vc1 = new Vector3dClass();
        Vector3dClass vc2 = new Vector3dClass(2,4,6);
        System.out.println(vc1);
        System.out.println(vc2);
        Vector3dClass vc3 = sumVectors(vc1,vc2);
        System.out.println(vc3);
        System.out.println(vc3.divideByNumber(3));
        System.out.println(multipleVectors(vc2,vc3));



    }
}
