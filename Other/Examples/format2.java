package Other.Examples;

/**
 * Created by user on 13.03.2017.
 */
public class format2 {
    public static void main(String[] args) {
        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");

        System.out.println("префикс EAN.UCC: " + isbnParts[0]);
        System.out.println("номер регистрационной группы: " + isbnParts[1]);
        System.out.println("номер регистранта: " + isbnParts[2]);
        System.out.println("номер издания: " + isbnParts[3]);
        System.out.println("контрольная цифра: " + isbnParts[4]);

        String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
//разбиваем строку на несколько подстрок на основании
// встречаемого символа новой строки
        String[]lines=data.split("\n");

//проходим каждую подстроку
        for (String line : lines){
            //находим индекс первого вхождения символа ":" в подстроке
            int pos = line.indexOf(":");
            //вычленяем имя атрибута из подстроки
            String attributeName= line.substring(0,pos);
            //вычленяем значение атрибута
            String value = line.substring(pos+1,line.length());
            //вывод на экран вычлененных значений в нужном нам формате.
            System.out.println(attributeName + " - " + value);
        }
        String str = "1 000 000 000";
        String newStr = str.replace(" ", ".");
        System.out.println(newStr);

        int x = 3, y = 3;
        x = x++ + ++x;
        y = --y - y--;
        System.out.println(x + " " +y);
        /*int z =1;
        //z++;
        System.out.println(z++);
        System.out.println(z);*/

        int h=1;
        //h++;
        System.out.println(h++);
        //h++;
        System.out.println(h++);
    }
}
