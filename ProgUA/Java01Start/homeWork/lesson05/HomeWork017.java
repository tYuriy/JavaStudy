package ProgUA.Java01Start.homeWork.lesson05;

public class HomeWork017 {
    public static void main(String[] args) {
        //создание двумерного массива и построчное заполнение нечетными числами
        int m = 5;
        int n = 8;
        int nums [][] = new int [m][n];
        int val = 0;

        //заполнение и вывод двухмерного массива по строкам
        for (int i=0; i<nums.length;i++){
            for (int j=0; j<nums[0].length;j++){
                nums[i][j] = val*2+1;
                val++;
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
