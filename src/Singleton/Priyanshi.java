package Singleton;

public class Priyanshi {

    //Eager way of creating object

    private static Priyanshi priyanshi=new Priyanshi();

    public static Priyanshi getPriyanshi(){
        return priyanshi;
    }
}
