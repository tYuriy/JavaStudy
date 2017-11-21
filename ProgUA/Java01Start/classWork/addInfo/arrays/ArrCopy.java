package ProgUA.Java01Start.classWork.addInfo.arrays;

import java.util.Arrays;

public class ArrCopy {
    public static void main(String[] args) {
        char[] a = new char[] {'A', 'B', 'C', 'D', 'E'};
        char[] b = new char[5];
        System.arraycopy(a, 0, b, 0, a.length); // теперь а и b – два разных массива с одинаковым содержимым
        char[] c1 = Arrays.copyOf(a, a.length); // c1 = c
        char[] c2 = Arrays.copyOf(a, 2); // {'A', 'B'}
        char[] c3 = Arrays.copyOfRange(a, 2, 5); // c = {'C', 'D', 'E'}
    }
}
