package Other.Examples;

import java.util.Scanner;

/**
 * Created by user on 10.03.2017.
 */
public class knowFigureInNumber {
    public static void main(String[] args) {
        //узнать цифру в числе,
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        int z=1;//указать порядковый номер цифры в числе (справа налево)
        int y = (int)Math.pow(10,z-1);
        int z3 = x%(y*10)/y;
        System.out.println(z3);
    }
}
