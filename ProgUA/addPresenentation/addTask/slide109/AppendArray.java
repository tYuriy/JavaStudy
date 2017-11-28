package ProgUA.addPresenentation.addTask.slide109;

public class AppendArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] b = {11,22,33,44,55};
        plusArray(a,b);
        //plusArray(b,a);

    }
    public static int [] plusArray (int [] a, int []b){
        int [] c = new int[a.length+b.length];
        int j=0;
        for (int i=0; i<c.length; i++){
            if (i>a.length-1) {
                c[i] = b[j];
                j++;
            } else {
                c[i]= a[i];
            }
            System.out.println(c[i]);
        }

        return c;
    }
}
