package ProgUA.addPresenentation.arrays;

public class ArrExersize {
    public static void main(String[] args) {
        int a = 0;
        while (true) {
            a++;
            if (a == 5)
                break; //!!!
        }
        for (int i = 0; i < 100; i++) {
            if (i == 10)
                continue; // !!!
            System.out.println(i);
        }
    }
}
