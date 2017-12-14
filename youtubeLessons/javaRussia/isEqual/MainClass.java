package youtubeLessons.javaRussia.isEqual;

public class MainClass {
    public static void main(String[] args) {
        Animal a1 = new Animal(5);
        Animal a2 = new Animal(5);

        System.out.print("a1 == a2 ");
        System.out.println(a1 == a2);
        System.out.print("a1.equals(a2) ");
        System.out.println(a1.equals(a2));

        String str1 = "hi";
        String str2 = "hi123";
        System.out.print("str1==str2 ");
        System.out.println(str1==str2);
        System.out.print("str1.equals(str2) ");
        System.out.println(str1.equals(str2));

        String str3 = str2.substring(0,2);
        System.out.print("str3 ");
        System.out.println(str3);
        System.out.print("str1==str3 ");
        System.out.println(str1==str3);
        System.out.print("str1.equals(str3) ");
        System.out.println(str1.equals(str3));
    }
}
