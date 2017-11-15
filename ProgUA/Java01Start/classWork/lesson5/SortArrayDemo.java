package ProgUA.Java01Start.classWork.lesson5;

public class SortArrayDemo {
    public static void main(String[] args){
        int i,j,k,s;
        // Создание массива:
        int[] nums={17,1,3,7,2,8,5,9};
        //Отображение содержимого массива:
        System.out.println("До сортировки:");
            for(k=0;k<nums.length;k++){
        System.out.print(nums[k]+" ");
        }
        System.out.println("\nПосле сортировки:");
        //Сортировка элементов в массиве:
        for(i=1;i<nums.length;i++){
            for(j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    s=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=s;
                }
            }
        }
        //Отображение содержимого массива:
        for(k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
        System.out.println("");
    }
}
