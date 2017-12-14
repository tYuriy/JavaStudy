package youtubeLessons.javaRussia.isEqual;

public class Animal {
    private int id;
    Animal (int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal)obj;
        return this.id == otherAnimal.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
