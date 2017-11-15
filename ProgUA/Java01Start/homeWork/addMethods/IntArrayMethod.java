package Java01Start.homeWork.addMethods;

/*
Напишите программу со статическим методом, которому аргументом передается целочисленный массив и целое число.
Результатом метод возвращает ссылку на новый массив,
который получается из исходного массива (переданного первым аргументом методу),
если в нем взять несколько начальных элементов. Количество элементов,
которые нужно взять из исходного массива, определяются вторым аргументом метода.
Если второй аргумент метода больше длины массива, переданного первым аргументом,
то методом создается копия исходного массива и возвращается ссылка на эту копию.
 */
public class IntArrayMethod {
    public static void main(String[] args) {
        int size = 15;//размер исходного массива
        int newSize = 8;//размер нового массива
        int [] startArr = new int [size];//инициализация исходного массива
        int val = 1;//переменная, которая отвечает за значения элементов исходного массива

        fillArray(val,  startArr);//заполнение исходного массива
        System.out.println("Исходный массив из " + size + " элементов");
        printArray(startArr);//вывод на экран
        System.out.println("\n");
        //заполнение и вывод нового массива
        System.out.println("Новый массив из " + Math.min(size,newSize) + " элементов");
        printArray(rerangeArray(newSize,startArr));
    }
        //метод для заполнения массива значениями
    static int[] fillArray (int a, int [] nums) {
        for (int i = 0; i<nums.length; i++) {
            nums[i] = a;
            a++;
        }
        return nums;
    }
    static int [] rerangeArray (int a, int [] nums){
        int [] newArr = new int [a];
        if (a>=nums.length){
            newArr=nums;
        } else {
            for (int i=0; i<newArr.length; i++){
                newArr[i] = nums [i];
            }
        }
        return newArr;
    }
    static void printArray (int [] nums){
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
