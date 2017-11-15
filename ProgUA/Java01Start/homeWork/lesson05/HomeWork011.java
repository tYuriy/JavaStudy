package ProgUA.Java01Start.homeWork.lesson05;

public class HomeWork011 {
    public static void main(String[] args) {
        //реализовать заполнение двухмерного массива по строками и по столбцам

        int m = 5;
        int n = 8;
        int nums [][] = new int [m][n];
        int val = 1;

        //заполнение и вывод двухмерного массива по строкам
        for (int i=0; i<nums.length;i++){
            for (int j=0; j<nums[0].length;j++){
                nums[i][j] = val;
                val++;
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        val=1;
        //заполнение двухмерного массива по столбцам
        for (int j=0; j<nums[0].length;j++){
            for (int i=0; i<nums.length;i++){
                nums[i][j] = val;
                val++;
            }
        }

        //вывод заполненного массива
        for (int i=0; i<nums.length;i++){
            for (int j=0; j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
