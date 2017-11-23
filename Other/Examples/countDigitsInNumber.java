package Other.Examples;

/**
 * Created by user on 10.03.2017.
 */
public class countDigitsInNumber {
    public static void main(String[] args) {
        //кол-во цифр в числе
        int x = 1243;
        int count = 0;
        int y = 1;
        while (x/y>0) {
            count++;
            y*=10;
        }
        System.out.println(count);
    }
}
