package Other.Examples;

import static java.lang.String.format;
/**
 * Created by user on 10.03.2017.
 */
public class format {
    public static void main(String[] args) {
        int x = 12345;
        //Вывод целого числа
        System.out.printf("%d\n", x);


        //Вывод целого числа с разделением тысяч
        System.out.printf("%,d\n", x); // --> "7 845"

        //Число менее 7 знаков будет «подвинуто» вправо на недостающее количество знаков.
        System.out.printf("%7d\n", x); // --> "   7845"

        //Число менее 7 знаков будет дополнено нулями слева на недостающее количество знаков.
        System.out.printf("%07d\n", x); // --> "0007845"

        //Число будет дополнено знаком + и, если оно менее 7 знаков, то будет дополнено нулями на недостающее количество знаков.
        System.out.printf("%+07d\n", x); //--> "+007845"

        //Число будет выровнено по левому краю и, если оно менее 7 знаков, то будет дополнено пробелами справа на недостающее количество знаков.
        System.out.printf("%-7d\n", x); // --> "7845   "


        //Форматирование чисел с плавающей точкой
        double y = Math.E;

        //Вывод числа e. Автоматическое округление до 6 знаков после запятой.
        System.out.printf("%f\n", y); // --> "2,718282"

        //Число менее 10 знаков будет «подвинуто» вправо на недостающее количество знаков.
        System.out.printf("%10f\n", y); // --> "  2,718282"

        //Число менее 10 знаков будет дополнено нулями слева на недостающее количество знаков.
        System.out.printf("%010f\n", y); // --> "002,718282"

        //Число будет дополнено знаком + и, если оно менее 10 знаков, то будет дополнено нулями на недостающее количество знаков.
        System.out.printf("%+010f\n", y); // --> "+02,718282"

        //Число будет выведено с 15 знаками после запятой.
        System.out.printf("%.15f\n", y); // --> "2,718281828459045"

        //Число будет выведено с  3-мя знаками после запятой и, если оно менее 8 символов, то  будет «подвинуто» вправо на недостающее количество знаков.
        System.out.printf("%8.3f\n", y); // --> "   2,718"

        //Число будет выровнено по левому краю, выведено с  3-мя знаками после запятой и, если оно менее 8 знаков, то будет дополнено пробелами справа на недостающее количество знаков.
        System.out.printf("%-8.3f\n", y); // --> "2,718   "

        String s = "what the fuck";
        //Вывод строки.
        System.out.printf("%s%n", s); // --> "Hello"

        //Если строка содержит менее 10 символов, то «подвинуть » ее вправо на недостающее количество символов.
        System.out.printf("%20s%n", s); // --> "     Hello"

        //Строка будет выровнена по левому краю и, если она менее 10 символов, то будет дополнена справа пробелами на недостающее количество символов.
        System.out.printf("%-10s%n", s); // --> "Hello     "

        //Выведет первые 3 символа строки.
        System.out.printf("%.3s%n", s); // --> "Hel"

        //Выведет первые 3 символа строки и подвинет их вправо на недостающее до 8 количество символов.
        System.out.printf("%8.3s%n", s); // --> "     Hel"

        int a = 15;
        double b = 2.4;
        System.out.println(format("Number N1 is %,d and N2 is %,.2f", a, b));
        //System.out.println(format("%d",a));
    }
}