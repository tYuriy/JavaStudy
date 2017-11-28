package ProgUA.Java02OOP.homeWork.addTasks01.parallelepiped;

public class Parallelepiped {
    private int height;
    private int width;
    private int depth;
    private int volume;

    Parallelepiped (){
        this.height=1;
        this.width=2;
        this.depth=3;
    }
    Parallelepiped (int a, int b, int c){
        this.height=a;
        this.width=b;
        this.depth=c;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume (){
        return this.depth*this.width*this.height;
    }
    public int getVolume (ParaWeight pw1, ParaWeight pw2){
        return pw1.getVolume() + pw2.getVolume();
    }

    public String toString (){
        String str = "Parameters: \n\thight = " + this.height +
                                 "\n\twidth = " + this.width +
                                 "\n\tdepth = "+ this.depth +
                                 "\n\tvolume = " + this.getVolume();
        return str;
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
