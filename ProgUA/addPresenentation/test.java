package ProgUA.addPresenentation;

public class test {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(r. availableProcessors());
// total amount of memory in the Java virtual machine.
        System.out.println(r. totalMemory());
        System.out.println(Integer.toString(1443,16));
        System.out.println(Integer.parseInt("0F",16));
        String s  = "15+6";
        //System.out.println(Integer.parseInt(s));
        ;
    }
}