package ProgUA.Java02OOP.homeWork.addTasks01.classWithArrayField;
//import static java.lang.Math;

public class NewClass {
    private int [] arr;
    NewClass (){
        this.arr= new int [] {1,2,3};
    }
    NewClass(NewClass nc){
        this.arr = nc.arr;
    }
    NewClass(int x){
        arr=new int[x];
        for (int i=0; i<arr.length; i++){
            arr[i]=(i+1)*3;
        }
    }
    public static NewClass createNewObj (NewClass nc1, NewClass nc2){
        NewClass nc3 = new NewClass();
        int x = Math.max(nc1.arr.length,nc2.arr.length);
        nc3.arr = new int [x];
        for (int i=0; i<nc3.arr.length; i++){
            if (i>=nc1.arr.length) {
                nc3.arr[i]=(nc2.arr[i])/2;
            } else if (i>=nc2.arr.length) {
                nc3.arr[i]=(nc1.arr[i])/2;
            } else nc3.arr[i]=(nc1.arr[i]+nc2.arr[i])/2;
        }
        return nc3;
    }
    public double calcAverageOfArr () {
        double res=0;
        for (int s:arr){
            res+=s;
        }
        res = res/arr.length;
        return res;
    }
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        String str="";
        for (int s:this.arr){
            str += (s + " ");
        }
        return str;
    }
}
