package Java01Start.homeWork;

public class test02 {
    public static void main(String[] args) {
        //Присвоить значения элементам двумерного массива змейкой
        int m=8;//кол-во строк массива
        int n=3;//кол-во столбцов массива
        int val = 1;//начальное значение для первого элемента
        int[][] nums = new int [m][n];

        int i = 0;
        int j = 0;
        int iStart=0, jEnd = nums[0].length-1, jStart=0, iEnd = nums.length-1;

        //System.out.println("Кол-во строк: " + nums.length);
        //System.out.println("Кол-во столбцов: " + nums[0].length);

        int count = 0;//счетчик операций
        int countLimit = m*n;//общее кол-во операций присваивания

        //цикл присваивания значений в массив по змейкой по часовой стрелке
        while (count!=countLimit){
            for (j = jStart; j <= jEnd; j++) {
                if (count==countLimit) break;
                count++;
                nums[i][j] = val;//System.out.println("val = " + val);
                val++;
            }
            j--;
            iStart++;
            for (i = iStart; i <= iEnd; i++) {
                if (count==countLimit) break;
                count++;
                nums[i][j] = val;//System.out.println("val = " + val);
                val++;
            }
            i--;
            jEnd--;
            for (j = jEnd; j >= jStart; j--) {
                if (count==countLimit) break;
                count++;
                nums[i][j] = val;//System.out.println("val = " + val);
                val++;
            }
            j++;
            iEnd--;
            for (i = iEnd; i >= iStart; i--) {
                if (count==countLimit) break;
                count++;
                nums[i][j] = val;//System.out.println("val = " + val);
                val++;
            }
            i++;
            jStart++;
        }

        for (int k=0; k < nums.length;k++) {
            for (int l = 0; l < nums[k].length; l++) {
                System.out.print(nums[k][l]+"\t\t");
            }
            System.out.println();
        }
    }
}