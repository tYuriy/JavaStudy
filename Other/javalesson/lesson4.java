/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other.javalesson;

/**
 *
 * @author Max
 */

class Team {

    Team() {
        team = new Person[5];
        for(Person x : team) {
            x.setName("John Doe");
            x.setSalary(10);
        }
    }
    public void hire(String name, double salary, int i) {

    }

    public void work() {
        for(Person x : team) {
            x.doTask();
        }
    }

    private Person[] team;
}

class Person {

    public Person() {
        this("John Doe", 10.0);
    }
    public Person(String name) {
        this(name, 10.0);
    }
    public Person(double salary) {
        this("John Doe", salary);
    }
    public Person(String name, double salary) { //regular constructor
        this.name = name;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        if(salary >= minSalary && salary < 40) {
            this.salary = salary;
        } else {
            System.out.println("ERROR");
        }
    }
    public double getSalary() {
        return salary;
    }

    public void doTask() {
        System.out.println("Yap yap yap... Working on it.");
    }

    public static void setMinSalary(double d) {
        minSalary = d;
    }


    private static double minSalary = 10.0;

    private String name;
    private double salary;
}

public class lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Person p = new Person("Bob", 10);
        Person p1 = new Person();
        System.out.println(p.getSalary());
        Person.setMinSalary(12);
        Team t = new Team();
        t.hire("John", 15.0, 0);
        t.hire("Bob", 15.0, 0);
        t.hire("Jim", 25.0, 0);
        t.hire("James", 15.0, 0);
        t.hire("Ron", 15.0, 0);
        t.work();

        int[] a = new int[]{9,88,7,6,5,4,3,2,1};
        int[] b = new int[]{1,3,-1,2,4,-5,0,9,10,11,6};
        int[] c = new int[]{6,5,4,3,2,1,2,3,4,5,6};
        double[] d = new double[]{ 1.1, 2.1, -2.5, 9.8, 5.6, 0. , 1.2, -3.14 };


        bubbleSort(a);
        bubbleSort(b);
        bubbleSort(c);
        bubbleSort(d);

        printArray(a);
        printArray(b);
        printArray(c);

        System.out.println(max(2,3));

        double cat1 = 3;
        double cat2 = 4;
        double hypo = hyp(cat1, cat2);

        foo(1,2,3,4,5,6);
        foo();
        foo(1,2,3);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(hypo);
    }

    public static void bubbleSort(int[] a) {
        int temp;
        boolean isSorted = false;

        for(int i = 0; i < a.length-1; ++i) {
            if(!isSorted) {
                isSorted = true;
                for(int j = 0; j < a.length-1-i; ++j) {
                    if(a[j] > a[j+1]) {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                        isSorted = false;
                    }
                }
            } else {
                break;
            }

        }
    }
    public static void bubbleSort(double[] a) {
        double temp;
        boolean isSorted = false;

        for(int i = 0; i < a.length-1; ++i) {
            if(!isSorted) {
                isSorted = true;
                for(int j = 0; j < a.length-1-i; ++j) {
                    if(a[j] > a[j+1]) {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                        isSorted = false;
                    }
                }
            } else {
                break;
            }

        }
    }

    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            System.out.println("a["+i+"]: " + a[i]);
        }
    }
    public static void printArray(double[] a) {
        for(int i = 0; i < a.length; ++i) {
            System.out.println("a["+i+"]: " + a[i]);
        }
    }

    public static int max(int a, int b ) {

        return (a > b) ? a : b;

    }

    public static double hyp(double a, double b) {
        a *= a;
        b *= b;

        return Math.sqrt(a + b);
    }

    public static void foo(int ... a) { // varargs
        System.out.println("foo(int ... a)");
        System.out.println("args: " + a.length);

        for(int x : a) {
            System.out.println(x);
        }

    }

    public static void bar(int x, int y, int...z ) {

    }

}
