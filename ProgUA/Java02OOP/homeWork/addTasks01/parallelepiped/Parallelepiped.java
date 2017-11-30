package ProgUA.Java02OOP.homeWork.addTasks01.parallelepiped;

public class Parallelepiped {
    private int height;
    private int width;
    private int depth;
    private int volume;//добавил переменную, в которую записывается значение объема

    Parallelepiped (){
        this.height=1;
        this.width=2;
        this.depth=3;
        this.setVolume();
    }
    Parallelepiped (int a, int b, int c){
        this.height=a;
        this.width=b;
        this.depth=c;
        this.setVolume();
    }

    @Override //переопределен метод toString
    public String toString (){
        String str = "\thight = " + this.height
                    + "\twidth = " + this.width
                    + "\tdepth = "+ this.depth
                    + "\tvolume = " + this.volume
                    + "\n\t-------------------------- ";
        return str;
    }
    public int getVolume (){
        return volume;
    }
    public void setVolume() {
        this.volume = this.depth*this.width*this.height;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
