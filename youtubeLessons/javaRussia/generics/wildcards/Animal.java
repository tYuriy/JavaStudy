package youtubeLessons.javaRussia.generics.wildcards;

public class Animal {
    private int id;
    Animal (){}
    Animal (int id){
        this.id = id;
    }
    public void eat(){
        System.out.println("i'm eating");
    }
    public void sleep(){
        System.out.println("i'm sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id= " + id +
                '}';
    }
}
