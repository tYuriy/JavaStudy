package ProgUA.Java01Start.homeWork.addTask.slide109;

public class MyClass {
    private static int sizeof(byte[] a) {
        return a.length;
    }

    private static int sizeof(int[] a) {
        return a.length * 4;
    }

    public static void main(String[] args) {
        byte[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3, 4};

        System.out.println(sizeof(a1) + ", " + sizeof(a2));
    }
}