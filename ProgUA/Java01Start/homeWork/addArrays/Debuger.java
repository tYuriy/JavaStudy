package ProgUA.Java01Start.homeWork.addArrays;

public class Debuger {
    public static void main(String[] args) {
        int[] x = new int[14];
        for (int i = 0; i < x.length; i++) {
            if ((i * 444) % 17 > 0)
                x[i] = i;
            else
                x[i] = -1;
        }
    }
}
