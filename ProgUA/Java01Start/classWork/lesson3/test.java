package ProgUA.Java01Start.classWork.lesson3;

public class test {
    public static void main(String[] args) {
        //System.out.println("K".equals("k"));
        //System.out.println("K".equals("K"));
        String a="Kart";
        String b="Kart";
        String c=b;

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

        System.out.println();

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
    }
}
