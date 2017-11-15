package ProgUA.Java01Start.homeWork.lesson08;
/*
Напишите программу с классом,
в котором есть два символьных поля и перегруженный метод для присваивания значений полям,
который можно вызывать без аргументов,
с одним аргументом и с двумя аргументами
 */
class ClassTwoFields{
    char fieldOne;
    char fieldTwo;
    static void printValue (char a, char b){
        System.out.println(a + " is the first, and the second is " + b);
    }
    void  setValue (){
        fieldOne ='n';
        fieldTwo = 'm';
    }
    void  setValue (char valOne){
        fieldOne =valOne;
        fieldTwo = 'm';
    }
    void  setValue (char valOne, char valTwo){
        fieldOne =valOne;
        fieldTwo = valTwo;
    }
}
public class ClassTwoFielsdAndOverMethodForFields {
    public static void main(String[] args) {
        ClassTwoFields ctf = new ClassTwoFields();
        ctf.setValue();
        ClassTwoFields.printValue(ctf.fieldOne,ctf.fieldTwo);
        ClassTwoFields ctf1 = new ClassTwoFields();
        ctf1.setValue('a');
        ClassTwoFields.printValue(ctf1.fieldOne,ctf1.fieldTwo);
        ClassTwoFields ctf2 = new ClassTwoFields();
        ctf2.setValue('a','b');
        ClassTwoFields.printValue(ctf2.fieldOne,ctf2.fieldTwo);
    }
}
