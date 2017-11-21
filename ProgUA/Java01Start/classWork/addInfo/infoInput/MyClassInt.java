package ProgUA.Java01Start.classWork.addInfo.infoInput;

import java.util.Scanner;

/*
1. Прочитать с консоли число 1
2. Прочитать с консоли число 2
3. Вывести результат
4. И так для каждого оператора
 */
public class MyClassInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
