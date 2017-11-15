package Java01Start.homeWork.addMethods;

/*
Напишите программу со статическим методом, аргументом которому передается символьный массив,
а результатом возвращается ссылка на целочисленный массив, состоящий из кодов символов из массива-аргумента.
 */
public class CharCodeArray {
    public static void main(String[] args) {
        char [] arrChar = new char[]{'a','A','g','5','x','%'};
        System.out.println("Исходный массив: ");
        printArray(arrChar);
        System.out.println("\n\nМассив с кодами элементов исходного массива:");
        printArray(doIntChar(arrChar));
    }
    static int[] doIntChar (char [] c){
        int [] arrInt = new int[c.length];
        for (int i=0; i<c.length; i++){
            arrInt[i]=(int)c[i];
        }
        return arrInt;
    }
    static void printArray (int [] nums){
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\t");
        }
    }
    static void printArray (char [] nums){
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
