package LearningJava.Head9.SonOfBoo;

/**
 * Created by user on 16.03.2017.
 */
public class Boo {
    public Boo (int i){}
    public Boo (String s){}
    public Boo (String s, int i){}
}
class SonOfBoo  extends Boo {
    public SonOfBoo(){super("boo");}
    public SonOfBoo (int i){super("Fred");}
    public SonOfBoo (String s){super(42);}
    //public SonOfBoo (int i, String s){}
    //public SonOfBoo (String a, String b, String c){super(a,b);}
    public SonOfBoo (int i, int j){super("man",j);}
    //public SonOfBoo (int i, int x, int y){super(i,"star");}


}