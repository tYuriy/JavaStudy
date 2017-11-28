package ProgUA.addPresenentation.arrays;
/*
int[] x = new int[28];
for (int i = 0; i < x.length; i++) {
x[i] = i * 635;
}
Вывести на экран 0-й, 14-й и 27-й элементы массива.
 */
public class ArrExersize2 {
    public static void main(String[] args) {
        int[] x = new int[28];
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;
            switch (i) {
                case 0:
                    System.out.println(x[i]);
                    break;
                case 14:
                    System.out.println(x[i]);
                    break;
                case 27:
                    System.out.println(x[i]);
                    break;
            }
        }
    }
}
