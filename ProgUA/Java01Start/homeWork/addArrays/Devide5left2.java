package ProgUA.Java01Start.homeWork.addArrays;


import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, в которой создается одномерный числовой массив и заполняется числами,
которые при делении на 5 дают в остатке 2(числа 2,7,12,17 и т.д.).
Р-р массива вводит пользователь. Предусмотреть обработку ошибки при вводе некорректного значения.
 */
public class Devide5left2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number:");

        try{
            n = sc.nextInt();
            if (n<=0){
                System.out.println("Wrong number data.\nEnd of program!");
                System.exit(0);

            }
            int [] nums = new int [n];
            System.out.println(Arrays.toString(fillArray(nums)));
        }catch (Exception ex) {
            System.out.println("Wrong data type.\nEnd of program!");
        }
    }

    static int [] fillArray (int [] nums){
        int j=0;
        for (int i=0; i<nums.length; i++){
            while (j%5!=2){
                j++;
            }
            nums[i]=j;
            j++;
        }
        return nums;
    }
}
