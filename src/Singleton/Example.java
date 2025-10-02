package Singleton;

import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception {

        /*
       DB db=DB.getDBC();
        System.out.println(db.hashCode());

        DB db1=DB.getDBC();
        System.out.println(db1.hashCode());


        System.out.println(Priyanshi.getPriyanshi().hashCode());
        System.out.println(Priyanshi.getPriyanshi().hashCode());

*/

        //DB db1=DB.getDBC();
        DB db1=DB.INSTANCE;
        System.out.println(db1.hashCode());

        Constructor<DB> constructor=DB.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DB db2=constructor.newInstance();
        System.out.println(db2.hashCode());

    }
}

/*
1. Relection API to break Singleton pattern


Solution1: if already prsesent object then throw exception

2. enum

2.Serialize /Deserialize
implementing readResolve method


3.Cloning

 */