package Singleton;

import java.io.Serializable;

public class Instance extends SuperClass implements Serializable {

    private static Instance instance;
    private Instance(){


    }

    public static Instance getInstance(){

        if(instance==null){

            synchronized (Instance.class){
                if(instance==null){
                   instance =new Instance();
                }
            }

        }
        return instance;

    }


    public Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw  new CloneNotSupportedException();
    }
}
