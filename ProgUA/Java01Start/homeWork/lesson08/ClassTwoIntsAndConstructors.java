package Java01Start.homeWork.lesson08;

/*
Напишите программу с классом,
в котором есть два числовых поля и конструкторы,
которые позволяют создавать объекты класса без передачи аргументов, с передачей одного или двух аргументов.
*/
class ClassTwoInts{
    int valOne;
    int valTwo;
    ClassTwoInts(){
        valOne = 0;
        valTwo = 0;
    };
    ClassTwoInts(int a){
        valOne = a; valTwo = 0;
    }
    ClassTwoInts(int a,int b){
        valOne = a; valTwo = b;
    }
}
public class ClassTwoIntsAndConstructors {
    public static void main(String[] args) {
        ClassTwoInts newOne = new ClassTwoInts();
        ClassTwoInts newTwo = new ClassTwoInts(5);
        ClassTwoInts newThree = new ClassTwoInts(12,89);

        System.out.println(newOne.valOne + newOne.valTwo);
        System.out.println(newTwo.valOne + newTwo.valTwo);
        System.out.println(newThree.valOne + newThree.valTwo);
    }
}
