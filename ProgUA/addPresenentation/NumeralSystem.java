package ProgUA.addPresenentation;

public class NumeralSystem {
    int i1 = 12;        // переменной i присвоить значение 12 в десятичной системе счисления
    int i2 = 0x12;      // переменной i присвоить значение 12 в шестнадцатеричной системе счисления
    int i3 = 012;       // переменной i присвоить значение 12 в восьмеричной системе счисления
    int i4 = 0b1011;    // переменной i присвоить значение 1011 в двоичной системе счисления (с Java 7)
    static String [] hexArr = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    public static void main(String[] args) {
        int ns = 16; //numeral system
        int num = 15; //target number for transform

        System.out.println(reCalc(ns,num));
        System.out.println(reCalc(ns,666));
        System.out.println(reCalc(ns,1443));
        System.out.println(reCalc(ns,1444444));

    }
    public static String reCalc (int ns, int num){
        String res="";
        int numLeft =0;
        do {
            numLeft = num%ns;
            num = num/ns;
            res = strUpd(numLeft,hexArr) + res;
        } while (num>=ns);
        res = strUpd(num,hexArr) + res;
        return res;
    }
    public static String strUpd (int num, String[] hexArr){
        String res="";
        for (int i=0; i<hexArr.length; i++){
            if (num==i) {
                res = hexArr[i];
            }
        }
        return res;
    }
}
