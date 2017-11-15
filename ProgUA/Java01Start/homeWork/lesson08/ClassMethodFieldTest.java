package Java01Start.homeWork.lesson08;

import java.util.Scanner;

class Test {
    char a;
    public void printA (char x){
        System.out.println(x);
    }
}
public class ClassMethodFieldTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test tst = new Test();
        tst.a= scanner.nextLine().charAt(0);
        //tst.a = Character.getType()
        tst.printA(tst.a);
    }
}
