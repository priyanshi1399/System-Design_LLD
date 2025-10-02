package Singleton;

import java.io.*;

public class InstanceMain  {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        /*
        Instance instance=Instance.getInstance();
        System.out.println(instance.hashCode());
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(instance);

        System.out.println("serialization done");

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
        Instance s2=(Instance)ois.readObject();
        System.out.println(s2.hashCode());
        */


        Instance instance=Instance.getInstance();
        System.out.println(instance.hashCode());
        Instance s2=(Instance)instance.clone();
        System.out.println(s2.hashCode());
    }

}
